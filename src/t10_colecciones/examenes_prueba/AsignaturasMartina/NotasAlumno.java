package t10_colecciones.examenes_prueba.AsignaturasMartina;

public class NotasAlumno {
    // Atributos
    protected Asignatura asignatura;
    protected int nota;

    // Constructor
    public NotasAlumno(Asignatura asignatura, int nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    // Getters y Setters
    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
