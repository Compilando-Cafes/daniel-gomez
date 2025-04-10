package t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos;

import java.util.Comparator;

public class CompararEdad implements Comparator<Alumno> {

    @Override
    public int compare(Alumno a1, Alumno a2) {
        return Integer.compare(a1.getEdad(), a2.getEdad());
    }
}