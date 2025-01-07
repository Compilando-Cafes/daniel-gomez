package t4_funciones.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta04_05_Booleano_Vocal {

	public static void main(String[] args) {
		// Funcion que con booleano indique si un carácter que se pasa es una vocal
		Scanner sc = new Scanner(System.in);
		boolean resultado;
		char c = ' ';
		String fin = "";

		System.out.print("Introduce un carácter: ");
		c = sc.nextLine().charAt(0);

		System.out.println("¿La " + c + " es una vocal? " + (vocal(c) == true ? "Si" : "No"));

	}

	public static boolean vocal(char caracter) {
		boolean resultado;
		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
				|| caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

}
