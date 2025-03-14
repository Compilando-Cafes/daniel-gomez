package t8_herencia.entregas.ej4_informatica;

public class Empleado {
    enum Clasificacion {JUNIOR, MID, SENIOR}

    protected String nombre;
    protected String apellido;
    protected String domicilio;
    protected int edad;
    protected boolean casado;
    protected double salarioBase;
    protected Clasificacion clasificacion;

    public Empleado(String nombre, String apellido, String domicilio, int edad, boolean casado, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.edad = edad;
        this.casado = casado;
        this.salarioBase = salarioBase;
        if (edad <= 25)
            this.clasificacion = Clasificacion.JUNIOR;
        if (edad >= 26 && edad <= 35)
            this.clasificacion = Clasificacion.MID;
        if (edad >= 35)
            this.clasificacion = Clasificacion.SENIOR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public double salarioFinal() {
        double salarioFinal = 0;
        switch (clasificacion) {
            case Clasificacion.JUNIOR -> salarioFinal = salarioBase + 150;
            case Clasificacion.MID -> salarioFinal = salarioBase + 300;
            case Clasificacion.SENIOR -> salarioFinal = salarioBase + 600;
        }
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
                Salario Final: %,.2f €
                """, nombre, apellido, domicilio, edad, casado, salarioBase, clasificacion.name(), salarioFinal());
    }
}