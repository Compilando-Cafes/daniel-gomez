package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_09 {

	public static void main(String[] args) {
		// Cuantas cifras tiene un entero introducido por teclado que
		// estará comprendido entre 0 y 99999.
		Scanner sc = new Scanner(System.in);
		int a, digitos;

		System.out.print("Introduce un entero entre 0 y 99999: ");
		a = sc.nextInt();

		if (a >= 0 && a <= 99999) {
			if (a <= 9)
				digitos = 1;
			else if (a <= 99)
				digitos = 2;
			else if (a <= 999)
				digitos = 3;
			else if (a <= 9999)
				digitos = 4;
			else
				digitos = 5;
			System.out.println("El número tiene " + digitos + " dígitos.");
		} else {
			System.out.println("El número no está entre 0 y 99999.");
		}

		sc.close();
	}

}
