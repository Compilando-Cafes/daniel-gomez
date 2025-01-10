package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta3_15 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.print("Número: ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = n; i>0; i--) {
			for (int j = i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
