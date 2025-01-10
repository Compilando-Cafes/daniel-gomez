package t4_funciones.ejerciciosLibro;

import java.util.Scanner;

public class A_aplicacion04_16_Divisores_Primos {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		divisoresPrimos(5);
		divisoresPrimos(17);
		divisoresPrimos(100);
		divisoresPrimos(2345);
		divisoresPrimos(54);

	}

	public static void divisoresPrimos(int n) {
		System.out.println("Divisores de " + n + ":");

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (esPrimo(i))
					System.out.println(i + " es primo");
			}
		}
		System.out.println();
	}

	public static boolean esPrimo(int n) {
		boolean b = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				b = false;
				break;
			}
		}
		return b;
	}
}
