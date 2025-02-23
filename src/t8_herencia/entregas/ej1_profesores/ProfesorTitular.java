package t8_herencia.entregas.ej1_profesores;

public class ProfesorTitular extends Profesor {
    private Fecha fechaAlta;
    private int numeroAgnos;

    public ProfesorTitular(String nombre, String especialidad, String nombreCentro, int agnosConsolidados, Fecha fechaAlta, int numeroAgnos) {
        super(nombre, especialidad, nombreCentro, agnosConsolidados);
        this.fechaAlta = fechaAlta;
        this.numeroAgnos = numeroAgnos;
    }

    public ProfesorTitular() {
        this.fechaAlta = new Fecha(1, 1, 1);
        this.numeroAgnos = 0;
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Fecha fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getNumeroAgnos() {
        return numeroAgnos;
    }

    public void setNumeroAgnos(int numeroAgnos) {
        this.numeroAgnos = numeroAgnos;
    }

    @Override
    public String obtenerSalarioBase() {
        double resultado = (725 + (agnosConsolidados * 33.25)) + (47.8 * numeroAgnos);
        return String.format("%,.2f€", resultado);
    }

    @Override
    public String toString() {
        return "============================" +
                "\nProfesor/a: " + nombre +
                "\n\tFecha de alta: " + fechaAlta +
                "\n\tCentro: " + nombreCentro +
                "\n\tEspecialidad: " + especialidad +
                "\n\tSalario: " + obtenerSalarioBase();
    }
}