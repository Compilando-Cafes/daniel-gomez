package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta3_01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Programa que muestre para cada número introducido por teclado si es par, si
		// es positivo y su cuadrado. Se repite hasta que el número introducido sea 0.

		int n = 1;

		while (n != 0) {
			System.out.print("Introduce un número (0 para salir): ");
			n = sc.nextInt();
			sc.nextLine();
			if (n != 0) {
				if (n % 2 == 0)
					System.out.println("Número par.");
				else
					System.out.println("Número impar.");
				if (n > 0)
					System.out.println("Es positivo.");
				else
					System.out.println("Es negativo.");
				System.out.println("Su cuadrado es: " + (Math.pow(n, 2)));
			} else
				System.out.println("¡Adios!");
		}
	}
}
