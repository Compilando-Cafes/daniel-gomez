package t3_bucles.ejerciciosLibro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta3_08 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Pedir 10 números enteros por teclado y mostrar la media.
		int n, suma = 0, i;
		double media;

		for (i = 1; i <= 10; i++) {
			System.out.print("Número " + i + ": ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error de datos.");
				break;
			}
			sc.nextLine();
			suma += n;
			media = (double) suma / i;
			System.out.printf("Media: %,d / %,d = %,.2f", suma, i, media);

		}

	}
}
