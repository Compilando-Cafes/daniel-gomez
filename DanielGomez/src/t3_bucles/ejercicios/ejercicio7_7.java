package t3_bucles.ejercicios;

import java.util.Scanner;

public class ejercicio7_7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char uno, dos;
		int n = 1;

		while (n > 0) {
			// Que usuario elija los caracteres para formar el rombo
			// Primer caracter
			System.out.print("Introduce el primer caracter: ");
			uno = sc.next().charAt(0);
			sc.nextLine();

			// Segundo caracter
			System.out.print("Introduce el segundo caracter: ");
			dos = sc.next().charAt(0);
			sc.nextLine();

			// Solicitud de número de caracteres
			System.out.print("Número de caracteres: ");
			n = sc.nextInt();
			sc.nextLine();

			int ast2 = 1;

			// Bucle para las filas del primer triángulo
			for (int i = n; i > 0; i--) {

				// Columnas
				// Primera posición. Primer carácter
				for (int f = i; f > 0; f--) {
					System.out.print(" " + uno);
				}

				// Segunda posición: Segundo carácter
				for (int f = 1; f <= ast2; f++) {
					System.out.printf(" " + dos);
				}

				// Tercera posición: Primer carácter
				for (int f = i; f > 0; f--) {
					System.out.print(" " + uno);
				}

				ast2 += 2;
				System.out.println();
			}
			n++;
			for (int i = 1; i <= n; i++) {

				for (int f = 1; f < i; f++) {
					System.out.print(" " + uno);
				}

				for (int f = 1; f <= ast2; f++) {
					System.out.printf(" " + dos);
				}

				for (int f = 1; f < i; f++) {
					System.out.print(" " + uno);
				}

				ast2 -= 2;
				System.out.println();
			}
			System.out.println();
		}
	}

}
