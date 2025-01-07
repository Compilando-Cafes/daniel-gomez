package t1_conceptos_basicos.ejercicios;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		// Escribir un programa que pida un número al usuario y muestre su valor absoluto
		Scanner sc = new Scanner(System.in);
		int numero;
		int resultado;
		
		System.out.println("Dime un número:");
		numero = sc.nextInt();
		sc.nextLine();
		
		resultado = numero > 0 ? numero : numero * -1;
		System.out.println("El valor absoluto es: " + resultado);

	}

}
