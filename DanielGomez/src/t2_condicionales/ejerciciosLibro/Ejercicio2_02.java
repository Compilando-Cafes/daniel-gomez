package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_02 {

	public static void main(String[] args) {
		// Pedir dos números enteros y decir si son iguales o no.
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Dime un número entero: ");
		a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Dime otro número entero: ");
		b = sc.nextInt();
		sc.nextLine();
		
		if (a == b) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("Son distintos.");
		}
		sc.close();
	}

}
