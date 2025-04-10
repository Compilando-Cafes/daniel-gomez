package t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos;

import java.util.Comparator;

public class CompararNombre implements Comparator<Alumno> {

    @Override
    public int compare(Alumno a1, Alumno a2) {
        return a1.getNombre().compareTo(a2.getNombre());
    }
}