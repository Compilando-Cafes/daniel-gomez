package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class paralelogramo {
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
			pintarParalelogramo(altura, ancho);
			
		}

	}
	
	public static void pintarParalelogramo(int altura, int ancho) {
		
		// Control de las filas
		for (int fila = 1; fila <= altura; fila++) {
			
			// Pintar triángulo de espacios en blanco
			for (int i = fila; i<altura; i++) {
				System.out.print(" ");
			}
			
			// Pintar paralelogramo que es un rectángulo del ancho que se indique.
			for (int i = 1; i<= ancho; i++) {
				System.out.print("*");
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
