package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemplo3While {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Proceso repetitivo en el que se pinta un menú, por ejemplo: 1. Sumar Números
		 * 2. Restar Números 3. Multiplicar Números 4. Dividir Números. 5. Fin A
		 * continuación, se leen dos números enteros y la operación a realizar con ellos
		 * (1, para sumar, 2 para restar, 3 para multiplicar, 4 para dividir y 5 para
		 * terminar). Se realiza la operación y se muestra el resultado. Si la operación
		 * es la división y el denominador es 0, mostrar un mensaje y no realizar la
		 * división, asignarla valor 0. Si la operación es 5 el programa finaliza. ¿Qué
		 * condición tenemos que poner en el bucle para que el proceso se realice
		 * siempre y cuando la operación introducida no sea 5?
		 */

		int n1, n2, operacion = 0;
		double resultado;

		while (operacion != 5) {
			System.out.println("1. Sumar Números");
			System.out.println("2. Restar Números");
			System.out.println("3. Multiplicar Números");
			System.out.println("4. Dividir Números");
			System.out.println("5. Fin");

			try {
				System.out.print("Introduce un número entero: ");
				n1 = sc.nextInt();
				sc.nextLine();

				System.out.print("Introduce otro número entero: ");
				n2 = sc.nextInt();
				sc.nextLine();

				System.out.print("Ahora la operación a realizar: ");
				operacion = sc.nextInt();
				sc.nextLine();

				switch (operacion) {
				case 1 -> resultado = n1 + n2;
				case 2 -> resultado = n1 - n2;
				case 3 -> resultado = n1 * n2;
				case 4 -> {
					if (n2 == 0) {
						System.out.println("Dividir por cero es imposible.");
						resultado = 0;
					} else {
						resultado = (double) n1 / n2;
					}
				}
				default -> {
					resultado = 0;
					operacion = 5;
				}
				}
				if (operacion == 5) {
					
				} else {
					if (operacion != 4) {
						System.out.printf("Resultado: %,.0f%n%n", resultado);
					} else {
						System.out.printf("Resultado: %,.2f%n%n", resultado);
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del texto.");
				break;
			}
		}
		System.out.println("Fin del programa.");
		sc.close();
	}

}
