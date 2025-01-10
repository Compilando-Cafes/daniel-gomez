package t3_bucles.ejercicios;

import java.util.Scanner;

public class ejercicio7_12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			char letra = 97;
		
			for (int j = 1; j <= i; j++) {
				System.out.print(letra);
				letra++;
			}
			
			System.out.println();
		}
	}
}
