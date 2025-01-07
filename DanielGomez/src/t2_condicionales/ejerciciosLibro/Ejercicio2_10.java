package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String resultado;

		System.out.print("Dime un nota entre 0 y 10: ");
		a = sc.nextInt();

		if (a >= 0 && a <= 4)
			resultado = "insuficiente";
		else if (a == 5)
			resultado = "suficiente";
		else if (a == 6)
			resultado = "bien";
		else if (a == 7 || a == 8)
			resultado = "notable";
		else if (a == 8 || a == 10)
			resultado = "sobresaliente";
		else
			resultado = "Error: nota no válida";
		
		System.out.println("Resultado: " + resultado);
		sc.close();

	}

}
