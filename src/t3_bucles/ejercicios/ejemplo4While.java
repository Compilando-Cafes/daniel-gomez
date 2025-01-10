package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemplo4While {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Proceso repetitivo donde se leerán N números de teclado. N también se leerá y
		 * debe ser mayor que 0. Visualizar después de la lectura el máximo y el mínimo
		 * valor introducido por teclado
		 */
		int numero, n, contador = 0, maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;

		try {
			numero = 0;

			while (numero <= 0) {
				System.out.print("Dime el número de números que vas a introducir: ");
				n = sc.nextInt();
				sc.nextLine();

				while (contador < n) {
					System.out.print("Número mayor que cero: ");
					numero = sc.nextInt();
					sc.nextLine();

					if (numero > maximo) {
						maximo = numero;
					}
					if (numero < minimo) {
						minimo = numero;
					}
					contador++;
				}
			}
			System.out.println("Número máximo: " + maximo);
			System.out.println("Número máximo: " + minimo);
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Error.");
		}

	}

}
