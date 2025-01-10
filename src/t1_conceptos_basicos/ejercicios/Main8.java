package t1_conceptos_basicos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// Realizar una aplicación que solicite al usuario su edad y le indique si es
		// mayor de edad
		// (mediante un literal booleano: true o false).

		boolean mayoriaEdad;
		boolean inputEdad = false;
		int edad = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora de mayoría de edad");

		while (!inputEdad) {
			try {
				System.out.println("Dime tu edad:");
				edad = sc.nextInt();
				inputEdad = true;
			} catch (InputMismatchException e) {
				System.out.println("Introduce una edad correcta");
				sc.next();
			}
		}
		System.out.println("Tu edad es " + edad);
		mayoriaEdad = edad >= 18;
		System.out.println("Mayoría de edad: " + mayoriaEdad);

		sc.close();

	}

}
