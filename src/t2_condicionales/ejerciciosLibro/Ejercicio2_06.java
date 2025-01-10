package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;

		System.out.print("Introduce un número entero: ");
		n1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Introduce otro número entero: ");
		n2 = sc.nextInt();
		sc.nextLine();

		if (n1 > n2) {
			System.out.println("Orden decreciente: " + n1 + " y " + n2);
		} else {
			if (n1 == n2) {
				System.out.println("Son iguales.");
			} else {
				System.out.println("Orden decreciente: " + n2 + " y " + n1);
			}
		}
		sc.close();
	}

}
