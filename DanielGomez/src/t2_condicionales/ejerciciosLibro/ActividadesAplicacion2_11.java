package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class ActividadesAplicacion2_11 {
	public static void main(String[] args) {
		// Escribe una aplicacion al usuario un número comprendido entre 0 y 9999. la
		// aplicación tendrá que indicar si el
		// numero introducido es capicua

		Scanner sc = new Scanner(System.in);
		int n1, primerDigito, segundoDigito, tercerDigito, cuartoDigito;

		System.out.print("Introduce un número entre 0 y 9999: ");
		n1 = sc.nextInt();
		sc.nextLine();

		// Comprueba si el número está en el rango correcto
		if (n1 <= 0 || n1 >= 9999) {
			System.out.println("Número fuera del rango.");
			System.exit(0); // Sirve para finalizar un programa.
		} else {

			// Divide el número en partes para compararlas
			primerDigito = n1 / 1000;
			segundoDigito = n1 % 1000 / 100;
			tercerDigito = n1 % 100 / 10;
			cuartoDigito = n1 % 10;

			// Comprueba si tiene un dígito
			if (n1 >= 0 && n1 <= 9) {
				System.out.println("Es capicúa.");
			} else {

				// Comprueba si tiene dos dígitos
				if (n1 >= 10 && n1 <= 99) {
					if (tercerDigito == cuartoDigito) {
						System.out.println("Es capicúa.");
					} else {
						System.out.println("No es capicúa.");
					}
				} else {

					// Comprueba si tiene tres dígitos
					if (n1 >= 100 && n1 <= 999) {
						if (cuartoDigito == segundoDigito) {
							System.out.println("Es capicúa.");
						} else {
							System.out.println("No es capicúa.");
						}
					}

					// Comprueba si tiene cuatro dígitos
					if (n1 >= 1000 && n1 <= 9999) {
						if ((primerDigito == cuartoDigito) && (segundoDigito == tercerDigito)) {
							System.out.println("Es capicúa.");
						} else {
							System.out.println("No es capicúa.");
						}
					}
				}
			}
		}
		sc.close();
	}
}
