package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_8 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 1;
		int numero;

		
		do {
			numero = 1;
			System.out.print("Introduce un número: ");
			try {
			n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce la cifra correcta");
			}
			sc.nextLine();
			
			if (n==0)
				break;
		
			// Primera parte
			for (int i = 1; i<=n; i++) {
				for (int j = 1; j<=numero; j++) {
					System.out.print(numero);
				}
				
				numero++;
				System.out.println();
			}
			numero -= 2;
			
			// Segunda parte
			for (int i = n; i>=1; i--) {
				for (int j = numero; j>=1; j--) {
					System.out.print(numero);
				}
				
				numero--;
				System.out.println();
			}
		
		} while (n > 0 && n < 10);
		System.out.println("Adios.");
		
	}
}
