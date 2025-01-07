package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_11 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Dime un número del día de la semana (1 a 7): ");
		n = sc.nextInt();
		sc.nextLine();
		
		System.out.println(n);

		sc.close();
	}
}
