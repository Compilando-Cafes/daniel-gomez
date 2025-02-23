package t8_herencia.entregas.ej1_profesores;

public class ProfesorInterino extends Profesor{
    private Fecha fechaFinContrato;
    private Fecha fechaInicioContrato;

    public ProfesorInterino(String nombre, String especialidad, String nombreCentro, int agnosConsolidados, Fecha fechaFinContrato, Fecha fechaInicioContrato) {
        super(nombre, especialidad, nombreCentro, agnosConsolidados);
        this.fechaFinContrato = fechaFinContrato;
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public ProfesorInterino(){
        this.fechaFinContrato = new Fecha(1,1,1);
        this.fechaFinContrato = new Fecha(1,1,1);
    }

    public Fecha getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Fecha fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public Fecha getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Fecha fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    @Override
    public String toString() {
        return "============================" +
                "\nProfesor/a interino/a: " + nombre +
                "\n\tFecha inicio de contrato: " + fechaInicioContrato +
                "\n\tFecha fin de contrato: " + fechaFinContrato +
                "\n\tCentro: " + nombreCentro +
                "\n\tEspecialidad: " + especialidad +
                "\n\tSalario: " + obtenerSalarioBase();
    }
}