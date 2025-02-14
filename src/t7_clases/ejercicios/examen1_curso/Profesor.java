package t7_clases.ejercicios.examen1_curso;

public class Profesor {
    private String nombre;
    private String asignaturaImpartida;
    private String dni;
    private String fechaAlta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignaturaImpartida() {
        return asignaturaImpartida;
    }

    public void setAsignaturaImpartida(String asignaturaImpartida) {
        this.asignaturaImpartida = asignaturaImpartida;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    Profesor(String nombre, String asignaturaImpartida, String dni, String fechaAlta) {
        this.nombre = nombre;
        this.asignaturaImpartida = asignaturaImpartida;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
    }

    public void mostrarDatos(){
        System.out.println("El profesor de nombre " + nombre + " con DNI " + dni + " imparte la asignatura " + asignaturaImpartida + " desde " + fechaAlta + ".");
    }
}