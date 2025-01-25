package t6_cadenas_caracteres.examenes_prueba.examen2;

import java.util.Scanner;

public class OperacionesAvanzadasArraysBidimensionales {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Programa que permite trabajar con una matriz (filas y columnas)
        // Permitir al usuario ingresar el tamaño de la matriz (filas y columnas).
        System.out.println("Introduce el tamaño de la matriz (filas y columnas): ");
        int filas = pedirNumeroEntero("Filas: ", 1);
        int columnas = pedirNumeroEntero("Columnas: ", 1);
        int[][] matriz = new int[filas][columnas];

        // 2.	Rellenar la matriz con valores ingresados por el usuario.
        rellenarMatriz(matriz);

        // 3.	Calcular la suma de todos los elementos de la matriz con una función y mostrarla
        sumaMatriz(matriz);

        // 4.	Encontrar el mayor y el menor valor en la matriz con una función
        mayorMenorMatriz(matriz);

        // 5.	Generar una nueva matriz transpuesta (intercambiando filas por columnas) y mostrarla con una función
        int[][] matrizTranspuesta = transponerMatriz(matriz);

        // 6. Mostrar la matriz original y la matriz transpuesta
        System.out.println("Matriz original: ");
        mostrarMatriz(matriz);
        System.out.println("Matriz transpuesta: ");
        mostrarMatriz(matrizTranspuesta);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = pedirNumeroEntero("Introduce un número para la posición [" + i + "][" + j + "]: ", 0);
            }
        }
    }

    public static void sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }

    public static void mayorMenorMatriz(int[][] matriz) {
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("El mayor valor de la matriz es: " + mayor);
        System.out.println("El menor valor de la matriz es: " + menor);
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        return matrizTranspuesta;
    }

    public static int pedirNumeroEntero(String mensaje, int minimo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo) {
                    return numero;
                } else {
                    System.out.println("El número debe ser mayor que " + minimo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }

}