package t5_arrays.ejercicios;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edades[];
		int longitud;

//		while (longitud <= 0) {
//			System.out.print("Introduce la longitud de la cadena: ");
//			longitud = sc.nextInt();
//			sc.nextLine();
//		}

		do {
			System.out.print("Introduce la longitud de la cadena: ");
			longitud = sc.nextInt();
			sc.nextLine();
		} while (longitud <= 0);

		edades = new int[longitud];

		System.out.println("Longitud de la cadena: " + longitud);

		for (int i = 0; i < longitud; i++) {
			System.out.print("Introduce un número: ");
			edades[i] = sc.nextInt();
			sc.nextLine();
		}

		for (int i = 0; i < longitud; i++) {
			System.out.println(edades[i]);
		}

	}

}
