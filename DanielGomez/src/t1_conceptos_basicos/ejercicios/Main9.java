package t1_conceptos_basicos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// Escribir un programa que pida un número al usuario e indique mediante un literal booleano
		// (true o false) si el número es par.
		
		boolean inputNumero = false;
		int numero = 0;
		boolean resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número y te diré si es par o impar");
		while (!inputNumero) {
			try {
				System.out.println("Introduce un número: ");
				numero = sc.nextInt();
				inputNumero = true;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número correcto");
				sc.next();
			}
		}
		sc.nextLine();
		
		System.out.println("Tu número es: " + numero);
		resultado = numero % 2 == 0;
		System.out.println("¿Es par tu número? " + resultado);
		
		sc.close();
	}

}
