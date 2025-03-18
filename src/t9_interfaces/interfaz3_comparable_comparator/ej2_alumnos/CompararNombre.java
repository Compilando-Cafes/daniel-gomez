package t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos;

import java.util.Comparator;

public class CompararNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;
        return a1.getNombre().compareTo(a2.getNombre());
    }
}