package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_19 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0, h = 0;

		while (n <= 0) {
			System.out.print("Dame el número de triángulos (Mayor que 0): ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir el número.");
			}
			sc.nextLine();
		}

		h = pedirH(h);

		// Pintar tres triángulos
		String asterisco = "*";
		String espacio = " ";

		int huecos = h;

		for (int i = 1; i <= h; i++) {

			// Primeros espacios que se muestran siempre
			for (int j = huecos; j >= 0; j--) {
				System.out.print(espacio);
			}

			// Control de número de triángulos a mostrar

			for (int k = 1; k <= n; k++) {

				// Primer triángulo
				int impares1 = i * 2 - 1;
				for (int l = 1; l <= impares1; l++) {
					System.out.print(asterisco);
				}

				// Segundos espacios
				int impares2 = huecos * 2 - 1;
				for (int m = impares2; m >= 1; m--) {
					System.out.print(espacio);
				}
			}

			// Salto de línea
			System.out.println("");

			huecos--;
		}
	}

	private static int pedirH(int h) {
		while (h <= 0) {
			System.out.print("Dame la altura (filas) del triángulo (mayor que 0): ");
			try {
				h = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir el número.");
			}
			sc.nextLine();
		}
		return h;
	}
}
