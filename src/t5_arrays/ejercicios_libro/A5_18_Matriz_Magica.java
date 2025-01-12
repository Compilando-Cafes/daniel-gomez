package t5_arrays.ejercicios_libro;

import java.util.Scanner;

public class A5_18_Matriz_Magica {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        System.out.println("Rellenemos una matriz de 4x4 con números enteros.");
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println("Fila número " + fila + ":");
            for (int columna = 0; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = pedirNumeroEntero("Columna número " + columna + ": ");
            }
        }

        if (matrizMagica(matriz)) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");
        }
    }

    // Crea una función que diga si una matriz de 4x4 es una matriz mágica en la que se compruebe si la suma de elementos de cualquier fila o de cualquier columna valen lo mismo
    public static boolean matrizMagica(int[][] matriz) {
        int n = matriz.length;

        // Suma de la primera fila como referencia
        int sumaReferencia = 0;
        for (int j = 0; j < n; j++) {
            sumaReferencia += matriz[0][j];
        }

        // Verificar suma de filas
        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaReferencia) {
                return false; // Fila no coincide con la suma de referencia
            }
        }

        // Verificar suma de columnas
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaReferencia) {
                return false; // Columna no coincide con la suma de referencia
            }
        }

        // Si llega aquí, filas y columnas coinciden
        return true;
    }

    public static int pedirNumeroEntero(String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                return numero;
            } else {
                System.out.print("Introduce un número válido.");
                sc.nextLine();
            }
        }
    }

}