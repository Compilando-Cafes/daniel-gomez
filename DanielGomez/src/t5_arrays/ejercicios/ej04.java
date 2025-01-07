package t5_arrays.ejercicios;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		/*
		 * Leer un número por teclado e introducir el número en una tabla por digitos
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			int tabla[];

			System.out.print("Introduce un número (0 salir): ");
			int num = sc.nextInt();
			sc.nextLine();

			if (num <= 0) {
				System.out.println("Adios!");
				break;
			}
			int numDigitos = 0;
			for (int i = num; i > 0; i /= 10) {
				numDigitos++;
			}

			tabla = new int[numDigitos];

			for (int i = numDigitos - 1; i >= 0; i--) {
				tabla[i] = num % 10;
				num /= 10;
			}

			for (int i = 0; i < numDigitos; i++) {
				System.out.println(tabla[i]);
			}
		}

	}

}
