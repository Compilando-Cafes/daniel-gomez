package Tema3.ejerciciosLibro;

import java.util.Scanner;

public class A_aplicacion3_12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// De binario a decimal: multiplicar el dígito (0 ó 1) por la potencia de 2 correspondiente a su
		// posición.
		
		int binario;
		String decimal = "";

		System.out.print("Número binario: ");
		binario = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; binario>0; i++) {
			
			int digito = binario%10;
			decimal = decimal + (i * (digito * digito));
			binario /=10;
		}
		System.out.println(decimal);
		
	}

}
