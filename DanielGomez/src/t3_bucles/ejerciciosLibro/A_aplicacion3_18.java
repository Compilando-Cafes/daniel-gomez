package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_aplicacion3_18 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Mínimo común múltiplo

		int a, b, resultado = 0;

		System.out.print("Dime a: ");
		a = sc.nextInt();
		sc.nextLine();

		System.out.print("Dime b: ");
		b = sc.nextInt();
		sc.nextLine();

		// Comprobar cual es el menor
		resultado = (a > b) ? a : b;

		while (true) {
			if (resultado % a == 0 && resultado % b == 0) {
				break;
			}
			resultado++;
		}
		System.out.println("El mínimo común multiplo de " + a + " y " + b + " es: " + resultado);
	}


}
