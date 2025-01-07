package t4_funciones.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta04_07_Divisores_Primos {

	public static void main(String[] args) {
		// Función a la que se le pasa un número entero y devuelve el número de
		// divisores primos que tiene

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número entero: ");
		n = sc.nextInt();
		sc.nextLine();

		System.out.println("Número de divisores primos: " + divisoresPrimos(n));

	}

	public static int divisoresPrimos(int n) {
		int contador = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0 && esPrimo(i)) {
				contador++;
			}
		}
		return contador;
	}

	public static boolean esPrimo(int n) {
		boolean resultado = true;

		if (n < 2) {
			resultado = false;
		}
		int i = 2;
		while (i < n && resultado == true) {
			if (n % i == 0) {
				resultado = false;
			}
			i++;
		}
		return resultado;
	}

}
