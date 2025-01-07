package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trianguloRepetidoDerecha {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bucle repetitivo del programa
        while (true) {

            int numFilas = pedirNumero("Número de filas: ", 0);

            // Salida del bucle
            if (numFilas == 0) {
                System.out.println("Adiós.");
                break;
            }

            int numTriangulos = pedirNumero("Número de triángulos: ", 0);

            dibujarTriangulos(numFilas, numTriangulos);
        }
    }

    private static void dibujarTriangulos(int numFilas, int numTriangulos) {

        // Filas del dibujo
        for (int fila = 1; fila <= numFilas; fila++) {

            // Control de número de triángulos
            for (int triangulo = 1; triangulo <= numTriangulos; triangulo++) {

                // Pintar espacios al principio
                for (int i = 0; i < numFilas - fila; i++) {
                    System.out.print(" ");
                }

                // Pintar asteriscos del triángulo
                for (int i = 0; i < 2 * fila - 1; i++) {
                    System.out.print("*");
                }

                // Pintar espacios entre triángulos
                for (int i = 0; i < numFilas - fila; i++) {
                    System.out.print(" ");
                }
            }

            // Salto de línea
            System.out.println();
        }
    }

    public static int pedirNumero(String mensaje, int minimo) {
        int numero;

        // Ciclo repetitivo hasta que sea un número correcto.
        while (true) {
            System.out.print(mensaje);
            try {
                numero = sc.nextInt();

                // Si es correcto termina a continuación
                if (numero >= minimo)
                    return numero;

                // Si no es correcto muestra mensaje y repite proceso
                System.out.println("El número debe ser mayor o igual a " + minimo + ".");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número válido.");
            }
            sc.nextLine();
        }
    }
}
