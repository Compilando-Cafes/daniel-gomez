package t3_bucles.ejercicios;

import java.util.Scanner;

public class ejemplo1While {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Proceso repetitivo donde se leerá un número de teclado, el proceso finalizará
		// cuando el número sea > de 0. Este tipo de bucle se puede usar para validar la
		// entrada por teclado
		// de un número que cumpla una condición, en este caso que sea > que 0.

		int n = 0;
		
		System.out.print("Dame un número: ");
		n = sc.nextInt();
		sc.nextLine();

		while (n <= 0) {
			System.out.print("Dame un número: ");
			n = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
		
		System.out.println("Valor de n: " + n);
		System.out.println("Fin");
		
	}
}
