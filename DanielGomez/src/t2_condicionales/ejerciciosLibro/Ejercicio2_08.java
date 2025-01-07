package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_08 {

	public static void main(String[] args) {
		// Ecuación de segundo grado, a, b y c se introducen por teclado.
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		double res1, res2, interiorRaizCuadrada;
		
		System.out.println("Ecuación de segundo grado");
		System.out.print("Dime el valor de a: ");
		a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Dime el valor de b: ");
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Dime el valor de c: ");
		c = sc.nextInt();
		sc.nextLine();
		
		interiorRaizCuadrada = Math.pow(b, 2) - 4 * a * c;
		if (interiorRaizCuadrada < 0) {
			System.out.println("No existen soluciónes reales.");
		} else {
			if (a==0) {
				System.out.println("No es una ecuación de segundo grado.");
			} else {
			res1 = (-b+Math.sqrt(interiorRaizCuadrada))/(2*a); 
			res2 = (-b-Math.sqrt(interiorRaizCuadrada))/(2*a);
			System.out.printf("Solución 1: %,.2f%n", res1);
			System.out.printf("Solución 2: %,.2f", res2);
			}
		}
		sc.close();
	}
}
