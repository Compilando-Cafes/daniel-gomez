package t4_funciones.figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cuadrados {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int alto = pedirNumero("Altura: ", 0);
			if (alto == 0) {
				System.out.println("Adios.");
				break;
			}
			int ancho = pedirNumero("Ancho: ", 0);
			if (ancho == 0) {
				System.out.println("Adios.");
				break;
			}
			pintarCuadrado(alto, ancho);
		}
		
	}

	private static void pintarCuadrado(int alto, int ancho) {
		// Controlar filas
		for (int fila = 1; fila<= alto; fila++) {
			
			// Pintar linea
			for (int cuadrado = 1; cuadrado<= ancho; cuadrado++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static int pedirNumero(String mensaje, int minimo) {
		int n;
		while (true) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
				if (n >= minimo) {
					return n;
				}
				System.out.println("Introduce un número mayor que " + minimo + ".");
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número correcto.");
			}
			sc.nextLine();
		}

	}

}
