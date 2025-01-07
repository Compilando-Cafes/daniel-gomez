package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class paralelogramosHueco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int altura = pedirNumero("Altura (0 para salir): ", 0);
            if (altura == 0) {
                System.out.println("Adios.");
                break;
            }
            int ancho = pedirNumero("Ancho (0 para salir): ", 0);
            if (ancho == 0) {
                System.out.println("Adios.");
                break;
            }
            pintarParalelogramoHueco(altura, ancho);
        }
    }

    public static void pintarParalelogramoHueco(int altura, int ancho) {

        // Control de las filas
        for (int fila = 1; fila <= altura; fila++) {

            // Pintar triángulo de espacios en blanco
            for (int i = fila; i < altura; i++) {
                System.out.print(" ");
            }

            // Pintar el paralelogramo hueco
            for (int i = 1; i <= ancho; i++) {
                // Pintar los bordes (primera/última fila o primera/última columna)
                if (i == 1 || i == ancho || fila == 1 || fila == altura) {
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
                if (numero >= minimo) {
                    return numero;
                }
                System.out.println("Introduce un número mayor que " + minimo + ".");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número correcto.");
            }
            sc.nextLine();
        }
    }
}

