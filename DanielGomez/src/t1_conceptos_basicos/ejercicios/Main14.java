package t1_conceptos_basicos.ejercicios;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		// Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al
		// entero más próximo.
		Scanner sc = new Scanner(System.in);
		double numeroDecimal;
		int resultado;
		
		System.out.print("Introduce un número decimal: ");
		numeroDecimal = sc.nextDouble();
		sc.nextLine();
		
		resultado = (int)(numeroDecimal + 0.5);
		System.out.print("Redondeado al número entero más próximo: " + resultado);
		
		sc.close();

	}

}
