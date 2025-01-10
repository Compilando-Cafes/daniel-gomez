package t3_bucles.ejerciciosLibro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta3_09_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 0;

		do {
			System.out.print("Hasta que número quieres ver tablas de multiplicar (Mayor que cero): ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir los datos.");
				System.exit(0);
			}
		} while (n < 0);

		for (int i = 1; i <= n; i++) {
			
			System.out.println("Tabla de multiplicar del: "+ i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
	
			System.out.println();
		}
	}
}
