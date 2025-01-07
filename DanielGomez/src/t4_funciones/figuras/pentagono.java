package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pentagono {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int altura = pedirNumero("Altura (0 para salir): ", 0);
			if (altura == 0) {
				System.out.println("Adios.");
				break;
			}
			pintarPentagono(altura);
		}

	}

	public static void pintarPentagono(int altura) {

		// Parte superior un tercio de la altura
		for (int i = 1; i <= altura / 3; i++) {

			// Pintar espacios
			for (int j = i; j <= altura / 3; j++) {
				System.out.print(" ");
			}

			// Pintar pentágono
			for (int j = 1; j <= 2 * i +1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Parte intermedia
		for (int i= 1; i<=altura/3; i++) {
			
			// Pintar pentágono
			for (int j = 1; j<= altura; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Parte inferior
		for (int i= 1; i<=altura/3; i++) {
			
			// Pintar espacios
			for (int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			
			// Pintar pentágono
			for (int j = 1; j <= altura - 2 * i; j++) {
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
