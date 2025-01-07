package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trianguloRepetidoDebajoConEspacios {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		triangulo();

	}

	public static void triangulo() {

		int n = leerEntero("Introduce un nº > 0: ", 1);
		char c;
		System.out.print("Introduce un carácter: ");
		c = sc.next().charAt(0);

		System.out.println();

		// Control del número de triangulos a mostrar
		int espacios = 0;
		for (int i = 1; i <= n; i++) {

			// Pintar cada triángulo
			for (int j = 1; j <= n; j++) {

				// Pintar los cuadrados de espacios que empiezan en cero espacios
				for (int k = 1; k <= espacios; k++) {
					System.out.print(" ");
				}

				// Pintar el triángulo
				for (int k = 1; k <= j; k++) {
					System.out.print(c);
				}
				System.out.println();

			}
			espacios += n;
		}

	}

	public static int leerEntero(String mensaje, int min) {
		int n = min - 1;
		while (n < min) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("\tIncorrecto. ");
			}
			sc.nextLine();
		}
		return n;
	}

}
