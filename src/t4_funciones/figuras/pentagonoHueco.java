package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pentagonoHueco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int altura = pedirNumero("Altura (impar)(0 para salir): ", 0);
            if (altura == 0) {
                System.out.println("Adios.");
                break;
            }
            pintarPentagonoHueco(altura);
        }
    }

    public static void pintarPentagonoHueco(int altura) {

        // Parte superior (techo del pentágono)
        for (int i = 1; i <= altura / 3; i++) {

            // Pintar espacios
            for (int j = i; j <= altura / 3; j++) {
                System.out.print(" ");
            }

            // Pintar bordes del techo
            for (int j = 1; j <= 2 * i + 1; j++) {
                if (j == 1 || j == 2 * i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Parte intermedia (rectángulo del cuerpo)
        for (int i = 1; i <= altura / 3; i++) {

            // Pintar bordes del cuerpo
            for (int j = 1; j <= altura; j++) {
                if (j == 1 || j == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Parte inferior (base invertida del pentágono)
        for (int i = 1; i <= altura / 3; i++) {

            // Pintar espacios
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Pintar bordes de la base
            for (int j = 1; j <= altura - 2 * i; j++) {
                if (j == 1 || j == altura - 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int pedirNumero(String mensaje, int minimo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            try {
                numero = sc.nextInt();
                if (numero >= minimo && numero%2 != 0) {
                    return numero;
                }
                System.out.println("Introduce un número mayor que " + minimo + " e impar.");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número correcto.");
            }
            sc.nextLine();
        }
    }
}
