package t1_conceptos_basicos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// Diseñar una aplicación que calcule la longitud y el area de una circunferencia.
		// Para ello, el usuario debe introducir el radio (que puede contener decimales).
		// Longitud = 2pi * radio
		// Área = pi * radio al cuadrado
		System.out.println("Calculadora de longitud y área de una circunferencia");
		
		boolean entradaCorrecta = false;
		double radio = 0.0;
		double longitud;
		double area;
		Scanner sc = new Scanner(System.in);
		
		while (!entradaCorrecta) {
			try {
				System.out.println("Dime el radio:");
				radio = sc.nextDouble();
				entradaCorrecta = true;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un valor correcto");
				sc.next();
			}
		}
		
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		System.out.printf("La longitud de la circunferencia es: %,.2f%n", longitud);
		System.out.printf("El área de la circunferencia es: %,.2f%n", area);
		sc.close();

	}

}
