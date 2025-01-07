package t3_bucles.ejerciciosLibro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta3_03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Número secreto
		int numAleatorio = (int) (Math.random() * 100) + 1;
		int n =0;
		
		do {
			
			System.out.print("¿En qué número entre 1 y 100 estoy pensando?: ");
			try {
			n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error.");
				break;
			}
			sc.nextLine();
			
			if (n > numAleatorio)
				System.out.println("Menor");
			else if (n < numAleatorio)
				System.out.println("Mayor");
			else
				System.out.println("¡Acertaste!");
		} while (n != numAleatorio);
	}

}
