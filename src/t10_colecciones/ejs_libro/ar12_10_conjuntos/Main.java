package t12_colecciones.ejs_libro.ar12_10_conjuntos;

import java.util.*;

public class Main {
    static Random r = new Random();

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(obtenerUnNumero(1, 10));
        }

        // Ordenar la lista con un comparator para compararla más fácil
        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);

        System.out.println("Lista original: " + lista);

        // Conjunto con los elementos sin repetir
        Set<Integer> listaSinRepetidos = new TreeSet<>();
        listaSinRepetidos.addAll(lista);
        System.out.println("Sin los repetidos: " + listaSinRepetidos);

        // Solo los repetidos
        Set<Integer> repetidos = new TreeSet<>();
        for (Integer e : listaSinRepetidos) {
            lista.remove(e); // Al quitar uno de cada de lista, si un número solo está una vez, se quita del todo.
        }
        repetidos.addAll(lista); // Todos los números que quedan en lista se repetían.
        System.out.println("Repetidos: " + repetidos);

        // Únicos
        Set<Integer> unicos = new TreeSet<>();
        unicos.addAll(listaSinRepetidos); // Se añaden todos los elementos sin repetidos
        unicos.removeAll(repetidos); // Se quitan los que se repetían y solo quedan los únicos
        System.out.println("Elementos no repetidos: " + unicos);
    }

    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo - minimo) + minimo;
        return num;
    }

}