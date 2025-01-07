package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trianguloRepetidoDebajoHueco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        triangulo();
    }

    public static void triangulo() {

        int n = leerEntero("Introduce un nº > 0: ", 0);
        char c;
        System.out.print("Introduce un carácter: ");
        c = sc.next().charAt(0);

        System.out.println();

        // Control del número de triángulos a mostrar
        int espacios = 0;
        for (int i = 1; i <= n; i++) {

            // Pintar cada triángulo
            for (int j = 1; j <= n; j++) {

                // Pintar los espacios iniciales
                for (int k = 1; k <= espacios; k++) {
                    System.out.print(" ");
                }

                // Pintar el triángulo hueco
                for (int k = 1; k <= j; k++) {
                    // Si es el primer o último carácter de la fila o la última fila
                    if (k == 1 || k == j || i == n) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // Aumentar los espacios para la siguiente fila
            espacios += n;
        }

        // Base del triángulo
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static int leerEntero(String mensaje, int min) {
        int n = min - 1;
        while (n < min) {
            System.out.print(mensaje);
            try {
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.printf("\tIncorrecto. ");
            }
            sc.nextLine();
        }
        return n;
    }
}

