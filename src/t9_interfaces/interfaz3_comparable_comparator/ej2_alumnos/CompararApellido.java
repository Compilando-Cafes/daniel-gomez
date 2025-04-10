package t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos;

import java.util.Comparator;

public class CompararApellido implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}