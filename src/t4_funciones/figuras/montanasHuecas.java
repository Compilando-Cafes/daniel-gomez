package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class montanasHuecas {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Bucle repetitivo del programa
		while (true) {

			int numFilas = pedirNumero("Número de filas: ", 0);

			// Salida del bucle
			if (numFilas == 0) {
				System.out.println("Adios.");
				break;
			}

			int numMontanas = pedirNumero("Número de montañas: ", 0);

			dibujarMontanas(numFilas, numMontanas);
		}
	}

	private static void dibujarMontanas(int numFilas, int numMontanas) {

		// Filas del dibujo
		for (int fila = 1; fila <= numFilas; fila++) {

			// Control de número de montañas
			for (int montana = 1; montana <= numMontanas; montana++) {

				// Pintar espacios del principio
				pintarEspacios(numFilas - fila);

				// Pintar asteriscos
				pintarMontana(fila);

				// Pintar espacios entre montañas
				pintarEspacios(numFilas - fila);

			}

			// Salto de linea
			System.out.println();
		}

	}

	private static void pintarEspacios(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			System.out.print(" ");
		}
	}

	private static void pintarMontana(int fila) {
		System.out.print("*");
		
		// Evitar que pinte espacios en la cumbre de la montaña
		if (fila > 1) {
			
			// Hacer que aumente siempre a números impares
			pintarEspacios(2 * (fila - 1)-1);
			System.out.print("*");
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
				if (numero >= minimo)
					return numero;

				// Si no es correcto muestra mensaje y repite proceso
				System.out.println("El número debe ser mayor o igual a " + minimo + ".");
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número válido.");
			}
			sc.nextLine();
		}
	}

}
