package t2_condicionales.teoria;

import java.util.Scanner;

public class condicionalDobleElse {

	public static void main(String[] args) {
		// Else
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Dime un número: ");
		n = sc.nextInt();
		sc.nextLine();
		if (n % 2 == 0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");

		sc.close();

	}

}
