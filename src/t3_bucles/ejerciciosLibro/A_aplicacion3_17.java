package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_aplicacion3_17 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Máximo común divisor
		// Desde el menor de a y b, ir buscando, de forma decreciente, el primer número
		// que divide a ambos simultáneamente.

		int a, b, resultado = 0;

		System.out.print("Dime a: ");
		a = sc.nextInt();
		sc.nextLine();

		System.out.print("Dime b: ");
		b = sc.nextInt();
		sc.nextLine();

		// Comprobar cual es el menor
		int menor = a > b ? a : b;

		for (int i = menor; i > 0; i--) {
			if ((a % i == 0) && (b % i == 0)) {
				resultado = i;
				break;
			}
		}
		System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + resultado);
	}

}
