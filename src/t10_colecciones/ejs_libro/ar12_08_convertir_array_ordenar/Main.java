package t12_colecciones.ejs_libro.ar12_08_convertir_array_ordenar;

import java.util.*;

public class Main {
    static Random r = new Random();

    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            coleccion.add(obtenerUnNumero(1, 10));
        }
        System.out.println(coleccion);

        Integer[] ordenado = coleccion.toArray(new Integer[0]);
        // Ordenarla de forma creciente
        Arrays.sort(ordenado);
        Collection<Integer> coleccionCreciente = new ArrayList<>();
        coleccionCreciente.addAll(Arrays.asList(ordenado));
        System.out.println(coleccionCreciente);

        // Ordenarla de forma decreciente
        Arrays.sort(ordenado, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        Collection<Integer> coleccionDecreciente = new ArrayList<>();
        coleccionDecreciente.addAll(Arrays.asList(ordenado));
        System.out.println(coleccionDecreciente);
    }
    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo-minimo)+minimo;
        return  num;
    }
}