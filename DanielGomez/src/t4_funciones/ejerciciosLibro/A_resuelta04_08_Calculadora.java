package t4_funciones.ejerciciosLibro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta04_08_Calculadora {

	public static void main(String[] args) {
		// Diseñar la función calculadora a la que se le pasan dos números reales
		// (operandos) y qué operación se desea realizar con ellos. Las operaciones
		// disponibles con un número son: 1: sumar, 2: restar, 3: multiplicar o 4:
		// dividir. La función devolverá el resultado de la operación mediante un número
		// real.
		
		

		Scanner sc = new Scanner(System.in);
		int opcion = 1;
		double num1 = 0, num2 = 0;

		while (opcion >= 1 && opcion <= 4) {

			// Petición número 1
			System.out.println("===================");
			System.out.print("| Número 1: ");
			try {
				num1 = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error.");
			}

			// Petición número 2
			System.out.print("| Número 2: ");
			try {
				num2 = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error.");
			}

			System.out.println("====================================================================");
			// Petición opciones
			System.out.println("| 1: Sumar | 2: Restar | 3: Multiplicar | 4: Dividir | Otro: Salir |");
			System.out.print("| Elección: ");

			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error.");
			}
			sc.nextLine();
			if (opcion >= 1 && opcion <= 4) {
				double resultado = calculadora(num1, num2, opcion);
				System.out.printf("Resultado: %,.2f%n", resultado);
			}
		}
		sc.close();
	}

	public static double calculadora(double num1, double num2, int opcion) {
		double resultado = 0;
		switch (opcion) {
		case 1 -> {
			resultado = suma(num1, num2);
		}
		case 2 -> {
			resultado = resta(num1, num2);
		}
		case 3 -> {
			resultado = multiplicacion(num1, num2);
		}
		case 4 -> {
			if (num2 == 0)
				resultado = 0;
			resultado = division(num1, num2);
		}
		}

		return resultado;
	}

	// Función Suma
	public static double suma(double num1, double num2) {
		return (num1 + num2);
	}

	// Función Resta
	public static double resta(double num1, double num2) {
		return (num1 - num2);
	}

	// Función Multiplicación
	public static double multiplicacion(double num1, double num2) {
		return (num1 * num2);
	}

	// Función División
	public static double division(double num1, double num2) {
		return (num1 / num2);
	}
}
