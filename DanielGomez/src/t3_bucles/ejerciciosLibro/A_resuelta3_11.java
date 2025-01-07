package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta3_11 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		long factorial = 1;
		
		System.out.print("Introduce un número entero: ");
		n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		
		System.out.println(n + "!" + " = " + factorial);
	
	}
}
