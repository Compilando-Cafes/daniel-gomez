package t3_bucles.ejercicios;

import java.util.Scanner;

public class relojArena {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Reloj de arena
		int n = 0;

		// Petición de tamaño de altura
		System.out.print("Dime la altura del reloj de arena: ");
		n = sc.nextInt();
		sc.nextLine();

		// Filas
		for (int i = 1; i <= n; i++) {

			// Espacios parte alta
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// Parte alta del reloj
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}

			// Salto de línea
			System.out.println();

		}

		for (int i = 2; i <= n; i++) {

			// Espacios parte baja
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			// Parte baja del reloj
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// Salto de línea
			System.out.println();
		}

	}

}
