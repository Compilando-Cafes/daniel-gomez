package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_aplicacion3_16 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.print("Intruduce un número: ");
		n = sc.nextInt();
		sc.nextLine();

		// Filas
		int espacios = n;
		for (int i = 1; i <= n; i++) {

			// Columnas, cada posición
			// Espacios en blanco del principio
			for (int k = espacios; k > 0; k--) {
				System.out.print(" ");
			}

			// Los asteriscos
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			
			// Salto de línea
			System.out.println();
			espacios--;

		}

	}

}
