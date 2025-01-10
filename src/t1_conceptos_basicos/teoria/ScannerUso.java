package t1_conceptos_basicos.teoria;

import java.util.Scanner;

public class ScannerUso {

	public static void main(String[] args) {
		// Clase Scannerç
		// Crear la clase con new
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		
		// Crear una variable del tipo que se quiera
		// que use la clase Scanner para obtener la información.
		String nombre = teclado.nextLine();
		System.out.println("Ingrese su Edad: \n");
		
		// Otra variable para un número
		int edad = teclado.nextInt();
		System.out.println("Ingrese un caracter: ");
		
		// Otra para un caracter. RECORDAR NEXT() + CHARAT(0)
		char c = teclado.next().charAt(0);
		System.out.println("Ingrese una palabra: ");
		
		
		String palabra = teclado.next();
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Valor de Char: " + c);
		System.out.println("Valor de palabra: " + palabra);
		
		teclado.close();
	}

}
