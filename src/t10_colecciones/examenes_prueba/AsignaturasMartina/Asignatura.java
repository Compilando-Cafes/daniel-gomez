package t10_colecciones.examenes_prueba.AsignaturasMartina;

public class Asignatura {
    // Atributos
    protected int idasignatura;
    protected String nombreasig;

    // Constructor
    public Asignatura(int idasignatura, String nombreasig) {
        this.idasignatura = idasignatura;
        this.nombreasig = nombreasig;
    }

    // Getters y Setters
    public int getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(int idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getNombreasig() {
        return nombreasig;
    }

    public void setNombreasig(String nombreasig) {
        this.nombreasig = nombreasig;
    }
}
