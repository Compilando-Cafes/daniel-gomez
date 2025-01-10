package t5_arrays.ejercicios_libro;

import java.util.Arrays;
import java.util.Random;

public class A5_13_Desordenar2 {
    public static void main(String[] args) {
        // Escribe una función que cambia de forma aleatoria los elementos contenidos en la tabla t.
        // Si la tabla estuviera ordenada, dejaría de estarlo.
        int[] tabla = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        desordenar(tabla);

    }

    public static void desordenar(int[] t) {
        Random rand = new Random();
        int [] tablaDesordenada = Arrays.copyOf(t, t.length);
        int tamanoTabla = 0;
        int[] tablaIndicesUsados = new int[tamanoTabla];

        for (int i = 0; i < tablaDesordenada.length; i++) {
            int indiceAleatorio = rand.nextInt(tablaDesordenada.length);
            while (Arrays.binarySearch(tablaIndicesUsados, indiceAleatorio) < 0) {
                tamanoTabla++;
                tablaIndicesUsados = Arrays.copyOf(tablaIndicesUsados, tamanoTabla);
                tablaIndicesUsados[tamanoTabla - 1] = indiceAleatorio;
                int aux = tablaDesordenada[i];
                tablaDesordenada[i] = tablaDesordenada[indiceAleatorio];
                tablaDesordenada[indiceAleatorio] = aux;
            }
        }
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(tablaDesordenada));
    }
}