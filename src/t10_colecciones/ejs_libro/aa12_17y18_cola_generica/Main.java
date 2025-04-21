package t10_colecciones.ejs_libro.aa12_17y18_cola_generica;

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

        System.out.println("\nProbando ColaArrayList:");
        ColaArrayList<Integer> cola = new ColaArrayList<>();
        for (int i = 0; i < 10; i++) {
            cola.encolar(new Random().nextInt(10) + 1);
        }
        System.out.println("Cola después de encolar elementos:");
        System.out.println(cola);

        System.out.println("Desencolando elementos:");
        while (true) {
            Integer desencolado = cola.desencolar();
            if (desencolado == null) break;
            System.out.println("Desencolado: " + desencolado);
        }

        System.out.println("\nProbando PilaArrayList:");
        PilaArrayList<Integer> pila = new PilaArrayList<>();
        for (int i = 0; i < 10; i++) {
            pila.apilar(new Random().nextInt(10) + 1);
        }
        System.out.println("Pila después de apilar elementos:");
        System.out.println(pila);

        System.out.println("Desapilando elementos:");
        while (true) {
            Integer desapilado = pila.desapilar();
            if (desapilado == null) break;
            System.out.println("Desapilado: " + desapilado);
        }
    }

}
