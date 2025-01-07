package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class relojArenaHueco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bucle repetitivo del programa
        while (true) {

            int altura = pedirNumero("Altura (impar): ", 0);

            // Salida del bucle
            if (altura == 0) {
                System.out.println("Adios.");
                break;
            }

            pintarRelojArena(altura / 2 + 1);
        }
    }

    public static void pintarRelojArena(int altura) {
        // Tapa superior del reloj de arena
        for (int i = 1; i <= altura; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Parte superior del reloj de arena (mitad superior)
        for (int i = 1; i <= altura; i++) {

            // Espacios antes de los asteriscos
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Parte hueca superior
            for (int j = altura; j >= i; j--) {
                if (j == altura || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacios huecos
                }
            }

            // Salto de línea
            System.out.println();
        }

        // Parte inferior del reloj de arena (mitad inferior)
        for (int i = 2; i <= altura; i++) {

            // Espacios antes de los asteriscos
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }

            // Parte hueca inferior
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacios huecos
                }
            }

            // Salto de línea
            System.out.println();
        }

        // Base inferior del reloj de arena
        for (int i = 1; i <= altura; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static int pedirNumero(String mensaje, int minimo) {
        int numero;

        // Ciclo repetitivo hasta que sea un número correcto.
        while (true) {
            System.out.print(mensaje);
            try {
                numero = sc.nextInt();

                // Si es correcto termina a continuación
                if (numero >= minimo && numero % 2 != 0 || numero == 0)
                    return numero;

                // Si no es correcto muestra mensaje y repite proceso
                System.out.println("El número debe ser mayor o igual a " + minimo + " e impar.");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número válido.");
            }
            sc.nextLine();
        }
    }
}

