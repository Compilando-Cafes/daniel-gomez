package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Introduce un número entero: ");
		a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduce otro número entero diferente: ");
		b = sc.nextInt();
		sc.nextLine();
		
		if (a>b) {
			System.out.println(a + " es mayor que " + b);
		} else {
			System.out.println(b + " es mayor que " + a);
		}
		
		sc.close();

	}

}
