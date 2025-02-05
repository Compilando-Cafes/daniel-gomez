package t6_cadenas_caracteres.examen;

import java.util.Arrays;

public class cuenta_1 {
    public static void main(String[] args) {
        llenarMatriz(3);
        llenarMatriz(5);
        llenarMatriz(7);
        llenarMatriz(10);
        llenarMatriz(12);
    }

    public static void llenarMatriz(int n) {
        // Mensaje de introducción
        System.out.println("CUENTA ATRÁS: " + n + "X" + n);

        // Crear la matriz
        int[][] matriz = new int[n][n];

        // Rellenar la matriz
        // Filas
        for (int i = 0; i < matriz.length; i++) {
            // Columnas
            for (int j = 0; j < matriz.length; j++) {

                // Rellenar la diagonal
                if (i == j) {
                    matriz[i][j] = n;
                } else {
                    // Con este ejercicio hicimos uno parecido con los triángulos y he copiado como lo hice
                    // con la clase Math que devuelve la diferencia entre i y j en absoluto, de ahí lo abs.
                    matriz[i][j] = n - Math.abs(i - j);
                }
            }
        }
        mostrarArrayBidimensional(matriz);
    }



    public static void mostrarArrayBidimensional(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
    }
}