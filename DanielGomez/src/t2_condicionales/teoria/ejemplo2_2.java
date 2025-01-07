package t2_condicionales.teoria;

import java.util.Scanner;

public class ejemplo2_2 {

	public static void main(String[] args) {
		// Pedir un número entero por teclado y visualizar si el número es mayor, menor
		// o igual que cero

		Scanner sc = new Scanner(System.in);
		int n1;

		System.out.print("Dime un número: ");
		n1 = sc.nextInt();
		sc.nextLine();

		if (n1 > 0) {
			System.out.println("Mayor que 0");
		} else {
			if (n1 == 0) {
				System.out.println("Es cero");
			} else {
				System.out.println("Menor que 0");
			}
		}

		sc.close();

	}

}
