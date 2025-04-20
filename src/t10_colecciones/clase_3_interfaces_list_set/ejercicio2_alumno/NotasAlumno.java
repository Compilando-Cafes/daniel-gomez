package t10_colecciones.clase_3_interfaces_list_set.ejercicio2_alumno;

public class NotasAlumno {
    private Asignatura asignatura;
    private int nota;

    public NotasAlumno(Asignatura asignatura, int nota) {
        this.asignatura = asignatura;
        setNota(nota);
    }

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
        if (nota>=0 && nota <= 10)
            this.nota = nota;
        else
            System.out.println("La nota debe estar entre 0 y 10. Nota no actualizada.");
    }

}