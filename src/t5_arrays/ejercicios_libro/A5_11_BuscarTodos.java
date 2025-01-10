package t5_arrays.ejercicios_libro;

import java.util.Arrays;

public class A5_11_BuscarTodos {
    public static void main(String[] args) {
        // Hacer una función que crea y devuelve una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda.
        // En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
        int[] tabla1 = {1,2,3,4,5,6,7,5,4,3,2,1};
        System.out.println(Arrays.toString(buscarTodos(tabla1, 1)));

        int[] tabla2 = {1,2,3,4,5,6,7,5,4,3,2,1};
        System.out.println(Arrays.toString(buscarTodos(tabla1, 9)));

    }

    public static int[] buscarTodos(int[] t, int clave) {
        int tamanoTablaIndices = 0;
        int[] indices = new int[tamanoTablaIndices];
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                tamanoTablaIndices++;
                indices = Arrays.copyOf(indices, tamanoTablaIndices);
                indices[tamanoTablaIndices-1] = i;
            }
        }
        return indices;
    }
}