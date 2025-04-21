package t10_colecciones.ejs_libro.aa12_11a15_contenedor_cola_pila_ordenado;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> contenedor = new Contenedor<>(new Integer[0]);
        for (int i = 0; i < 30; i++) {
            contenedor.apilar(new Random().nextInt(10) + 1);
        }
        System.out.println("Sin ordenar:");
        System.out.println(contenedor);

        contenedor.ordenar();
        System.out.println("Ordenado de menor a mayor:");
        System.out.println(contenedor);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        contenedor.ordenar(c);
        System.out.println("Ordenado de menor a mayor:");
        System.out.println(contenedor);

    }

}