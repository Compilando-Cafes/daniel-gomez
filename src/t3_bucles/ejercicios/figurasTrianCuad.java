package t3_bucles.ejercicios;

import java.util.Scanner;

public class figurasTrianCuad {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = 4, ast1 = 1;
		
		System.out.println("Primer triángulo");
		System.out.println();

		// Primer triángulo
		for (int i = n; i >= 0; i--) {
			
			for (int j = i; j > 0; j--) {
				System.out.print("  ");
			}
			
			for (int k = 1; k <= ast1; k++) {
				System.out.print(" " + i);
			}
			
			ast1++;
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Segundo triángulo");
		System.out.println();
		
		// Segundo triángulo
		int ast2 = 1;
		
		for (int i = n; i > 0; i--) {
			
			for (int j = i; j > 0; j--) {
				System.out.print(" -");
			}
			
			for (int k = 1; k <= ast2; k++) {
				System.out.printf(" *");
			}
			
			for (int j = i; j > 0; j--) {
				System.out.print(" -");
			}

			ast2 += 2;
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Tercer triángulo");
		System.out.println();
		
		// Tercer triángulo
		for (int i = n; i > 0; i--) {
			
			for (int k = 1; k <= n; k++) {
				System.out.print(" *");
			}
			
			ast1++;
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Cuarto triángulo");
		System.out.println();

		// Cuarto triángulo
		int ast3 = 1;
				for (int i = 1; i < n; i++) {
					
					for (int j = n; j> 0; j--) {
						System.out.print("  ");
					}
					
					for (int k = 1; k <= ast3; k++) {
						System.out.print(" " + i);
					}
					
					ast3++;
					System.out.println();
				}
	}

}
