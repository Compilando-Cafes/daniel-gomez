package t10_colecciones.clase_3_interfaces_list_set.ejercicio1_conjuntos_datos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Colección con 20 números menores de 100 sin duplicados y ordenados automáticamente de menor a mayor.
        Set<Integer> numeros = new HashSet<>();
        while (numeros.size()< 20){
            numeros.add(new Random().nextInt(99)+1);
        }
        System.out.println("Tamaño total de la colección: " + numeros.size());
        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(numeros);

        // Colección con nombres de animales que respeta orden de inserción y con repetidos
        Collection<String> nombresAnimales = new ArrayList<>();
        nombresAnimales.add("Gallina");
        nombresAnimales.add("León");
        nombresAnimales.add("Águila");
        nombresAnimales.add("León");
        nombresAnimales.add("Tigre");
        nombresAnimales.add("Jabalí");
        nombresAnimales.add("Zebra");
        nombresAnimales.add("Hipopótamo");
        nombresAnimales.add("Anguila");
        nombresAnimales.add("Tigre");

        System.out.println();
        System.out.println("Lista de nombres de animales:");
        System.out.println(nombresAnimales);

    }

}