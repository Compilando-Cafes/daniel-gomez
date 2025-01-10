package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class escaleraAMedida {

	public static void main(String[] args) {
		// Escalera a medida
		// Que ponga el piso de abajo a arriba
		int n = 0, piso = 0;
		Scanner sc = new Scanner(System.in);

		// Petición de altura
		// Número mayor que cero
		n = inicio(n, sc);
		
		System.out.println();
		
		// Variable que controla los pisos de abajo a arriba
		piso = n;

		// Pintar el tejado de la casa
		// Filas del tejado
		for (int i = 1; i <= n; i++) {

			// Espacios vacíos a la izquierda
			for (int j = n; j > i; j--)
				System.out.print(" ");

			// Tejas
			for (int j = 2; j <= i * 2; j++)
				System.out.print("*");

			// Salto de línea
			System.out.println();
		}

		// Pintar techo
		for (int i = 1; i <= n; i++)
			System.out.print("==");

		// Salto de línea
		System.out.println();

		// Filas
		for (int i = 1; i <= n; i++) {

			// Pared izquierda
			System.out.print("|");

			// Espacios a la izquierda de la escalera
			for (int j = 1; j < i; j++)
				System.out.print("  ");

			// Escalera
			System.out.print(i != n ? "|_" : "");

			// Espacios a la derecha de la escalera
			for (int j = i; j < n-1; j++)
				System.out.print("  ");
			
			// Pared derecha
			System.out.println("|  Piso: " + piso);
			piso--;
			
		}

		// Pintar suelo necesario
		for (int i = 1; i <= n; i++)
			System.out.print("''");

		sc.close();
	}

	private static int inicio(int n, Scanner sc) {
		while (n <= 0) {
			System.out.print("Hasta donde quieres que llegue la escalera: ");
			try { // Control de errores
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número correcto.");
			}
			sc.nextLine();
		}
		return n;
	}

}
