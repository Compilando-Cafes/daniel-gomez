package t10_colecciones.clase_3_interfaces_list_set.ejercicio2_alumno;

public class Asignatura {
    private int idAsignatura;
    private String nombreAsignatura;

    public Asignatura(int idAsignatura, String nombreAsignatura) {
        setIdAsignatura(idAsignatura);
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        if (idAsignatura>0)
            this.idAsignatura = idAsignatura;
        else
            System.out.println("Pon un id superior a cero. Id sin actualizar.");
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
}