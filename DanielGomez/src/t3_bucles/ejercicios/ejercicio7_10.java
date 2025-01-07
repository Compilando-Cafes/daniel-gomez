package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_10 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 1;

		// Control de entrada y salida
		while (n > 0) {
			System.out.print("Introduce un número mayor que cero: ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir el número.");
			}
			sc.nextLine();

			// Bucle para controlar cuantos bloques se pintarán
			for (int i = 1; i <= n; i++) {

				// Bucle para pintar cada bloque
				for (int j = 1; j <= i; j++) {
					System.out.print("A");
				}

				// Separación entre bloques con control de último sin coma
				System.out.print(i + (i == n ? "" : ", "));
			}
			
			// Salto de línea cuando termina
			System.out.println();
		}
		
		System.out.println("¡Hasta otro día!");
	}

}
