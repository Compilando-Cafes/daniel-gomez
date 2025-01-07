package t4_funciones.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio_Cuadrados {

	public static void main(String[] args) {
		// Método que reciba un número leído por teclado y muestre en pantalla mediante
		// un carácter que se leerá por teclado un cuadrado.
		int n = 1;
		char c;

		Scanner sc = new Scanner(System.in);

		while (n > 0) { 
			System.out.print("Dame un número: ");
			try {
			n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error.");
			}
			sc.nextLine();
			
			System.out.print("Dame un carácter: ");
			c = sc.nextLine().charAt(0);			

			cuadrados(n, c);
			sc.close();
		}
		
	}

	public static void cuadrados(int n, char c) {

		// Filas
		for (int i = 0; i < n; i++) {
			// Posiciones
			for (int j = 1; j <= n; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
