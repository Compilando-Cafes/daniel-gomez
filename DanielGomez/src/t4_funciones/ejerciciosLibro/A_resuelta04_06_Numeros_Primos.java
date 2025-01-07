package t4_funciones.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta04_06_Numeros_Primos {

	public static void main(String[] args) {
		// Funcion con el prototipo boolean esPrimo(int n) Devolverá true si n es primo
		// y false si no.

		// Un número primo lo es si es divisible solo por el mismo y por uno.
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		sc.nextLine();

		System.out.println("¿Es primo? " + esPrimo(n));

	}

	public static boolean esPrimo(int n) {
		boolean result = true;

		if (n < 2) {
			result = false;
		}

		int i = 2;
		while (i < n && result == true) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return result;
	}

}
