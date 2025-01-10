package t4_funciones.ActividadesResueltas;

import java.util.Scanner;

public class Main4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primer numero: ");
		int a = sc.nextInt();
		System.out.print("Introduzca segundo numero: ");
		int b = sc.nextInt();

		mostrar(a, b);
		sc.close();
	}
	
	static void mostrar(int a, int b) {
		int mayor = a > b ? a : b;
		int menor = a < b ? a : b;

		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
}
