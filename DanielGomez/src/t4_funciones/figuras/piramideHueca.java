package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class piramideHueca {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Pedir el número de niveles
        int niveles = pedirNumero("Introduce el número de niveles (mayor que 0): ", 1);

        // Pedir el carácter para la pirámide
        System.out.print("Introduce un carácter para la pirámide: ");
        char c = sc.next().charAt(0);

        // Dibujar la pirámide hueca
        System.out.println("Resultado:");
        pintarPiramideHueca(niveles, c);
    }

    private static void pintarPiramideHueca(int niveles, char c) {
        // Bucle para cada nivel de la pirámide
        for (int i = 1; i <= niveles; i++) {
            // Espacios iniciales para alineación
            for (int j = 1; j <= niveles - i; j++) {
                System.out.print(" ");
            }

            // Contenido de la fila
            for (int j = 1; j <= (2 * i - 1); j++) {
                // Primera o última fila de la pirámide
                if (i == 1 || i == niveles || j == 1 || j == (2 * i - 1)) {
                    System.out.print(c); // Bordes de la pirámide
                } else {
                    System.out.print(" "); // Espacios huecos
                }
            }

            // Salto de línea después de cada nivel
            System.out.println();
        }
    }

    public static int pedirNumero(String mensaje, int minimo) {
        while (true) {
            System.out.print(mensaje);
            try {
                int numero = sc.nextInt();
                if (numero >= minimo) {
                    sc.nextLine();
                    return numero;
                }
                System.out.println("Introduce un número mayor o igual que " + minimo + ".");
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un número válido.");
                sc.nextLine(); // Limpiar buffer
            }
        }
    }
}
