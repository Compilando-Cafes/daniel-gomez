package t6_cadenas_caracteres.examenes_prueba.examen4;

import java.util.Scanner;

public class DescubrePatronNumerico {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear matriz de 5x5
        int[][] matriz = new int[5][5];

        // Rellenar matriz con valores del 1 al 25
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                contador++;
                matriz[i][j] = contador;
            }
        }

        // Mostrar matriz
        System.out.println("Matriz inicial:");
        mostrarArrayBidimensional(matriz);

        while (true) {
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Invertir fila.");
            System.out.println("2. Invertir columna.");
            System.out.println("0. Salir.");
            int opcion = pedirNumeroEntero("Elección: ", 0, 3);

            if (opcion == 0) {
                System.out.println("Adios.");
                break;
            }
            switch (opcion) {
                case 1 -> invertirFilaArrayBidimensional(matriz);
                case 2 -> invertirColumnaArrayBidimensional(matriz);
            }
        }
    }

    public static void invertirFilaArrayBidimensional(int[][] array) {
        int fila = pedirNumeroEntero("Introduce el número de fila (0-4): ", 0, 4);
        for (int i = 0; i < array[fila].length / 2; i++) {
            int aux = array[fila][i];
            array[fila][i] = array[fila][array[fila].length - 1 - i];
            array[fila][array[fila].length - 1 - i] = aux;
        }
        mostrarArrayBidimensional(array);

    }

    public static void invertirColumnaArrayBidimensional(int[][] array) {
        int columna = pedirNumeroEntero("Introduce el número de columna (0-4): ", 0, 4);
        for (int i = 0; i < array.length / 2; i++) {
            int aux = array[i][columna];
            array[i][columna] = array[array.length - 1 - i][columna];
            array[array.length - 1 - i][columna] = aux;
        }
        mostrarArrayBidimensional(array);
    }

    public static void mostrarArrayBidimensional(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%-3d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}