package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class diamanteHueco {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Hacer un diamante hueco
		int n = 2;

		// Petición de tamaño
		while (n % 2 == 0) {
			System.out.print("Altura del diamante (número impar): ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número correcto.");
			}
			sc.nextLine();
		}

		// Filas rombo arriba
		for (int i = 1; i <= n / 2 + 1; i++) {

			// Espacios arriba izquierda
			for (int j = i; j <= n / 2; j++) {
				System.out.print(" ");
			}

			// Línea izquierda del rombo arriba
			System.out.print("* ");

			// Espacios huecos centro rombo arriba diamante
			for (int j = 3; j <= i; j++) {
				System.out.print("  ");
			}

			// Línea derecha del rombo arriba
			// Con salto de línea
			System.out.println(i == 1 ? "" : "* ");

		}

		// Filas rombo abajo
		for (int i = 2; i <= n / 2; i++) {

			// Espacios abajo izquierda
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}

			// Línea izquierda del rombo arriba
			System.out.print("* ");

			// Espacios huecos abajo diamante
			for (int j = i; j <= n / 4; j++) {
				System.out.print("  ");
			}

			// Línea derecha del rombo arriba
			// Con salto de línea
			System.out.println("* ");

		}
	}
}
