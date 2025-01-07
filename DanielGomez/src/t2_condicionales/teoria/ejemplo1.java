package t2_condicionales.teoria;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		// Lee un número entero y si es > que 0 muestra en pantalla un mensaje
		// indicando que el número leído por teclado es mayor que 0
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Dime un número: ");
		n = sc.nextInt();
		sc.nextLine();

		if (n > 0)
			System.out.println("Número leído mayor que 0");

		// Variante: si es mayor que 0 pintar mensaje y pedir un segundo número
		// y mostrar la suma de los dos.

		if (n > 0) {
			System.out.println("(2) Variante - Número leido mayor que 0");
			int n2;
			System.out.print("Dame otro número: ");
			n2 = sc.nextInt();
			sc.nextLine();
			System.out.println("La suma de los dos números es: " + (n + n2));
		}
		
		sc.close();
	}

}
