package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_15 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Proceso repetitivo lea número por teclado
		int n = 1;

		// Control de entrada
		do {

			// Petición de número
			System.out.print("Introduce un número: ");

			// Control de fallos en la petición
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir los datos.");
			}
			sc.nextLine();

			// Cambio del número a positivo si es negativo
			if (n < 0) {
				n = -n;
				System.out.println("Número cambiado a positivo");
			}

			// Obtención del número de cifras que tiene
			// Necesaria una variable que se resetee cada vez que se repìta el programa
			int contador = 0;

			for (int i = n; i > 0; i /= 10) {
				contador++;
			}

			System.out.println("Tiene " + contador + " cifras.");
			
			// Finaliza si se introduce un 0
		} while (n != 0);

		System.out.println("Fin programa.");

	}

}
