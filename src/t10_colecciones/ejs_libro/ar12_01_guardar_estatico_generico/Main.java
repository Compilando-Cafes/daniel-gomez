package t10_colecciones.ejs_libro.ar12_01_guardar_estatico_generico;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cadenas = {};
        Integer[] cadenas2 = {};
        Double[] cadenas3 = {};
        Character[] cadenas4 = {};

        cadenas = guardar("coche", cadenas);
        cadenas = guardar("avión", cadenas);
        cadenas2 = guardar(2, cadenas2);
        cadenas2 = guardar(6, cadenas2);
        cadenas3 = guardar(3.14, cadenas3);
        cadenas3 = guardar(5.14, cadenas3);
        cadenas4 = guardar('R', cadenas4);
        cadenas4 = guardar('a', cadenas4);
        System.out.println(Arrays.toString(cadenas));
        System.out.println(Arrays.toString(cadenas2));
        System.out.println(Arrays.toString(cadenas3));
        System.out.println(Arrays.toString(cadenas4));
    }

    static <E> E[] guardar(E elem, E[] tabla) {
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length - 1] = elem;
        return nuevaTabla;
    }
}