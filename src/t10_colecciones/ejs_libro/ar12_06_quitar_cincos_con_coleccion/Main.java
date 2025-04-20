package t10_colecciones.ejs_libro.ar12_06_quitar_cincos_con_coleccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Main {
    static Random r = new Random();
    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            coleccion.add(obtenerUnNumero(1, 10));
        }
        System.out.println("Colección completa: ");
        System.out.println(coleccion);

        while (coleccion.remove(5)){
            coleccion.remove(5);
        }
        // También se puede sin cuerpo en el while
        // while (coleccion.remove(5));

        System.out.println("Colección sin cincos: ");
        System.out.println(coleccion);
    }
    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo-minimo)+minimo;
        return  num;
    }

}