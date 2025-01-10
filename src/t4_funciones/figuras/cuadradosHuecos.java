package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cuadradosHuecos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int alto = pedirNumero("Altura: ", 0);
            if (alto == 0) {
                System.out.println("Adios.");
                break;
            }
            int ancho = pedirNumero("Ancho: ", 0);
            if (ancho == 0) {
                System.out.println("Adios.");
                break;
            }
            pintarCuadradoHueco(alto, ancho);
        }
    }

    private static void pintarCuadradoHueco(int alto, int ancho) {
        // Controlar filas
        for (int fila = 1; fila <= alto; fila++) {
            // Pintar línea
            for (int columna = 1; columna <= ancho; columna++) {
                if (fila == 1 || fila == alto || columna == 1 || columna == ancho) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static int pedirNumero(String mensaje, int minimo) {
        int n;
        while (true) {
            System.out.print(mensaje);
            try {
                n = sc.nextInt();
                if (n >= minimo) {
                    return n;
                }
                System.out.println("Introduce un número mayor que " + minimo + ".");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número correcto.");
            }
            sc.nextLine();
        }
    }
}