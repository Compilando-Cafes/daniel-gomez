package t4_funciones.ActividadesResueltas;

import java.util.Scanner;

public class Main4_2_pares {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = leerEntero("Introduzca primer numero: ");
		int b = leerEntero("Introduzca segundo numero: ");
		mostrarPares(a, b);
	}

	private static int leerEntero(String cadena) {
		System.out.print(cadena);
		int x = sc.nextInt();
		sc.nextLine();
		return x;
	}

	static void mostrarPares(int a, int b) {
		int mayor = a > b ? a : b;
		int menor = a < b ? a : b;

		for (int i = menor; i <= mayor; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
}