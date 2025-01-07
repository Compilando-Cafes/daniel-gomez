package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3_Montanas {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			montanas(pedirTeclado("Número de filas de la montaña: ", 0), pedirTeclado("Número de montañas: ", 0));
		}
	}

	public static void montanas(int filas, int numMontanas) {
		if (filas == 0) {
			System.out.println("Adios.");
			System.exit(0);
		}
		
		// Control de número de filas
		for (int fila = 1; fila <= filas; fila++) {
			
			// Control de número de montañas
			for (int montana = 1; montana <=numMontanas; montana++) {
				
				// Pintar triangulo de espacios al principio
				for (int j = filas; j > fila; j--) {
					System.out.print(" ");
				}

				// Pintar asteriscos
				System.out.print("*");

				// Pintar triángulo central de espacios 0 - 1 - 3 - 5 ...
				for (int j = 1; j < 2 * (fila - 1); j++) {
					System.out.print(" ");
				}

				// Pintar asteriscos
				if (fila>1)
					System.out.print("*");

				// Pintar espacios hasta siguiente montaña
				for (int j = filas; j > fila; j--) {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static int pedirTeclado(String mensaje, int min) {
		int n;
		while (true) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
				if (n>=min) {
					return n;
				}
				System.out.println("Introduce un número mayor que " + n + ".");
			} catch (InputMismatchException e) {
				System.out.print("Error.");
			}
			sc.nextLine();
		}
	}

}
