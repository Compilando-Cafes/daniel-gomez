package t3_bucles.ejerciciosLibro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta3_09 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 0;

		do {
			System.out.print("Introduce un número entre 1 y 10: ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir los datos.");
				System.exit(0);
			}
		} while (n < 1 || n > 10);

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

}
