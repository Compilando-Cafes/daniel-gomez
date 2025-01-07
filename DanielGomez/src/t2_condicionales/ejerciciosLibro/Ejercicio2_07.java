package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("Introduce un número entero: ");
		a = sc.nextInt();
		sc.nextLine();

		System.out.print("Introduce otro número entero: ");
		b = sc.nextInt();
		sc.nextLine();

		System.out.print("Introduce un tercer número entero: ");
		c = sc.nextInt();
		sc.nextLine();

		if (a > b && b > c) {
			System.out.println("Mayor: " + a + ", medio: " + b + ", menor: " + c);
		} else if (a > c && c > b) {
			System.out.println("Mayor: " + a + ", medio: " + c + ", menor: " + b);
		} else if (b > a && a > c) {
			System.out.println("Mayor: " + b + ", medio: " + a + ", menor: " + c);
		} else if (b > c && c > a) {
			System.out.println("Mayor: " + b + ", medio: " + c + ", menor: " + a);
		} else if (c > a && a > b) {
			System.out.println("Mayor: " + c + ", medio: " + a + ", menor: " + b);
		} else {
			System.out.println("Mayor: " + c + ", medio: " + b + ", menor: " + a);
		}

		sc.close();

	}

}
