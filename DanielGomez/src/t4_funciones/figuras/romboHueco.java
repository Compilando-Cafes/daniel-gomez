package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class romboHueco {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {

			int altura = pedirNumero("Altura del diamante: ", 0);

			// Salida del bucle
			if (altura == 0) {
				System.out.println("Adios.");
				break;
			}

			pintarDiamanteHueco(altura / 2 + 1);
		}

	}

	private static void pintarDiamanteHueco(int altura) {
		// Dibujar la parte superior del diamante (incluyendo la fila del medio)
		for (int fila = 1; fila <= altura; fila++) {
			// Espacios iniciales
			dibujarEspacios(altura - fila);

			// Contorno del diamante
			if (fila == 1) {
				System.out.print("*");
			} else {
				// Asteriscos a la izquierda
				System.out.print("*");
				dibujarEspacios(2 * (fila - 1) - 1);
				// Asteriscos a la derecha
				System.out.print("*"); // Borde derecho
			}

			// Salto de línea
			System.out.println();
		}

		// Parte inferior del diamante
		for (int fila = altura - 1; fila >= 1; fila--) {
			// Espacios iniciales
			dibujarEspacios(altura - fila);

			// Contorno del diamante
			if (fila == 1) {
				System.out.print("*");
			} else {
				// Asteriscos a la izquierda
				System.out.print("*");
				dibujarEspacios(2 * (fila - 1) - 1);
				// Asteriscos a la derecha
				System.out.print("*");
			}

			// Salto de línea
			System.out.println();
		}

	}

	private static void dibujarEspacios(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			System.out.print(" ");
		}
	}

	public static int pedirNumero(String mensaje, int minimo) {
		int numero;

		// Ciclo repetitivo hasta que sea un número correcto.
		while (true) {
			System.out.print(mensaje);
			try {
				numero = sc.nextInt();

				// Si es correcto termina a continuación
				if (numero >= minimo && numero % 2 != 0 || numero == 0)
					return numero;

				// Si no es correcto muestra mensaje y repite proceso
				System.out.println("El número debe ser mayor o igual a " + minimo + " e impar.");
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número válido.");
			}
			sc.nextLine();
		}
	}
}
