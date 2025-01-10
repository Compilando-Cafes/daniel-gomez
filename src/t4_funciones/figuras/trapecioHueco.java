package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trapecioHueco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int altura = pedirNumero("Altura (0 para salir): ", 0);
            if (altura == 0){
                System.out.println("Adios.");
                break;
            }
            
            int ancho = pedirNumero("Ancho (0 para salir): ", 0);
            if (ancho == 0) {
                System.out.println("Adios.");
                break;
            }
            
            dibujarTrapecioHueco(altura, ancho);
        }
        
    }
    
    static public void dibujarTrapecioHueco(int altura, int ancho) {

        // Lineas del trapecio
        for (int i = 1; i <= altura; i++) {

            // Espacios antes del trapecio
            for (int j = i; j < ancho; j++) {
                System.out.print(" ");
            }

            // Trapecio (dibujo hueco)
            for (int j = 1; j <= 2 * i + 3; j++) {
                // Pintar bordes
                if (j == 1 || j == 2 * i + 3 || i == 1 || i == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Salto de línea
            System.out.println();
        }
    }

    static public int pedirNumero(String mensaje, int minimo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            try {
                numero = sc.nextInt();
                if (numero >= minimo) {
                    return numero;
                }
                System.out.println("Introduce un número entre " + minimo + ".");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número correcto.");
            }
            sc.nextLine();
        }
    }
}

