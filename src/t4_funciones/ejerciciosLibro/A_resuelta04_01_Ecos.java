package t4_funciones.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta04_01_Ecos {

	public static void main(String[] args) {
		// Diseñar la función eco() a la que se le pasa como parámetro un número n, y
		// muestra por pantalla n veces el mensaje Eco...
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = sc.nextInt();
		
		ecos(n);
		sc.close();
	}
	
	public static void ecos(int n) {
		for (int i = 1; i<=n; i++) {
			System.out.println("Eco...");
		}
	}
}
