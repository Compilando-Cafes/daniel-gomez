package t10_colecciones.ejs_libro.ar12_05_quitar_repetidos_coleccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Main {
    static Random r = new Random();

    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            coleccion.add(obtenerUnNumero(1, 10));
        }

        Collection<Integer> coleccionSinRepetidos = new ArrayList<>();
        for (Integer numero : coleccion) {
            if (!coleccionSinRepetidos.contains(numero)){
                coleccionSinRepetidos.add(numero);
            }
        }
        System.out.println(coleccion);
        System.out.println(coleccionSinRepetidos);
    }
    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo-minimo)+minimo;
        return  num;
    }
}