package t8_herencia.entregas.ej4_informatica;

public class Programador extends Empleado {
    private int lineasCodigoHora;
    private String lenguajeProgramacion;

    public Programador(String nombre, String apellido, String domicilio, int edad, boolean casado, double salarioBase, int lineasCodigoHora, String lenguajeProgramacion) {
        super(nombre, apellido, domicilio, edad, casado, salarioBase);
        this.lineasCodigoHora = lineasCodigoHora;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getLineasCodigoHora() {
        return lineasCodigoHora;
    }

    public void setLineasCodigoHora(int lineasCodigoHora) {
        this.lineasCodigoHora = lineasCodigoHora;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public double salarioFinal() {
        double salarioFinal = 0;
        switch (clasificacion) {
            case Clasificacion.JUNIOR -> salarioFinal = salarioBase + 150;
            case Clasificacion.MID -> salarioFinal = salarioBase + 300;
            case Clasificacion.SENIOR -> salarioFinal = salarioBase + 600;
        }
        if (lineasCodigoHora < 3000)
            salarioFinal += 100;
        if (lineasCodigoHora >= 3000 && lineasCodigoHora <= 6000)
            salarioFinal += 120;
        if (lineasCodigoHora > 6000)
            salarioFinal += 150;
        return salarioFinal;
    }

    @Override
    public String toString() {
        String casado = this.casado ? "Si" : "No";
        return String.format("""
                =========================================
                Nombre: %s
                Apellido: %s
                Domicilio: %s
                Edad: %,d años
                Casado: %s
                Salario Base: %,.2f €
                Clasificación: %s
                Líneas de código por hora: %,d
                Lenguaje de programación: %s
                Salario Final: %,.2f €
                """, nombre, apellido, domicilio, edad, casado, salarioBase, clasificacion.name(), lineasCodigoHora, lenguajeProgramacion, salarioFinal());
    }
}