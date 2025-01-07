package t5_arrays.ejercicios;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		// Dividir un string en sus letras
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un texto: ");
		String texto = sc.nextLine();

		char[] resultado = new char[texto.length()];

		texto.isEmpty();
		for (int i = 0; i < texto.length(); i++) {
			resultado[i] = texto.charAt(i);
		}

		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
		
		sc.close();
	}
}
