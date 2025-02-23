package t8_herencia.entregas.ej1_profesores;

public class Profesor {
    protected String nombre;
    protected String especialidad;
    protected String nombreCentro;
    protected int agnosConsolidados;

    public Profesor(String nombre, String especialidad, String nombreCentro, int agnosConsolidados) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.nombreCentro = nombreCentro;
        this.agnosConsolidados = agnosConsolidados;
    }

    public Profesor() {
        this.nombre = "";
        this.especialidad = "";
        this.nombreCentro = "";
        this.agnosConsolidados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public int getAgnosConsolidados() {
        return agnosConsolidados;
    }

    public void setAgnosConsolidados(int agnosConsolidados) {
        this.agnosConsolidados = agnosConsolidados;
    }

    public String obtenerSalarioBase(){
        double resultado = 725 + (agnosConsolidados * 33.25);
        return String.format("%,.2f€", resultado);
    }
}