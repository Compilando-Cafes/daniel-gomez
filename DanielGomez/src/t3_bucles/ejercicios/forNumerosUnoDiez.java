package t3_bucles.ejercicios;

import java.util.Scanner;

public class forNumerosUnoDiez {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int x = 1, suma = 0;

		for (;x != 0;) {

			System.out.print("Introduce un número (0 para salir): ");
			x = sc.nextInt();
			sc.nextLine();

			if (x < 0)
				x *= -1;
			for (int n = 1; n <= x; n++) {
				System.out.print(n == x ? n : n + " + ");
				suma += n;
			}
			if (x!= 0)
				System.out.print(" = " + suma + "\n");
		}
		System.out.println("Adios!");

	}
}
