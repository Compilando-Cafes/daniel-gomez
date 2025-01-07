package t3_bucles.ejercicios;

import java.util.Scanner;

public class ejercicio7_5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Introduciendo el número de filas por teclado
		System.out.print("Introduce el número de filas del triángulo: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		// For que recorre de arriba a abajo
		for (int i = 1; i <= n; i++) {

			// Para los ceros a la izquierda del uno
			for (int j = 1; j < i; j++) {
				System.out.print(" 0");
			}

			// Para los unos
			System.out.print(" 1");

			// Para los ceros a la derecha del uno
			for (int k = n; k > i; k--) {
				System.out.print(" 0");
			}

			// Salto de línea
			System.out.println();
		}

	}

}
