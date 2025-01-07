package t1_conceptos_basicos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// Crear una aplicación que calcule la media aritmética de dos notas enteras.
		// Hay que tener en cuenta que la media puede contener decimales.

		System.out.println("Calculadora de media de dos notas");
		int nota1 = 0;
		int nota2 = 0;
		boolean inputNota1 = false;
		boolean inputNota2 = false;
		double media = 0.0;
		Scanner sc = new Scanner(System.in);

		while (!inputNota1) {
			System.out.println("Dime la primera nota: ");
			try {
				nota1 = sc.nextInt();
				inputNota1 = true;
			} catch (InputMismatchException errorNota1) {
				System.out.println("Introduce una primera nota correcta");
				sc.next();
			}
		}
		sc.nextLine();
		
		while (!inputNota2) {
			System.out.println("Dime la segunda nota: ");
			try {
				nota2 = sc.nextInt();
				inputNota2 = true;
			} catch (InputMismatchException errorNota2) {
				System.out.println("Introduce una segunda nota correcta");
				sc.next();
			}
		}
		sc.nextLine();

		media = (nota1 + nota2)/2.0; // Hay que poner el 2.0 para que sea double el resultado
		System.out.println("La media entre las dos notas es: " + media);
		
		sc.close();

	}

}
