package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class examenPrueba2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		pintarPiramide(pedirNumero("Introduce el número de niveles (mayor que 0): ", 1));
	}

	private static void pintarPiramide(int niveles) {
		int arbol = 1;
		System.out.print("Introduce un carácter para la pirámide: ");
		char c = sc.next().charAt(0);
		System.out.println("Resultado: ");
		// Bucle para recorrer cada fila
		for (int i = niveles; i > 0; i--) {

			// Bucles para cada posición
			// Espacios
			for (int f = i; f > 0; f--) {
				System.out.print(" ");
			}

			// árbol
			for (int f = 1; f <= arbol; f++) {
				System.out.print(c);
			}
			arbol += 2;

			// Salto de línea
			System.out.println();
		}
		

	}

	public static int pedirNumero(String mensaje, int minimo) {
		while (true) {
			System.out.print(mensaje);
			try {
				int numero = sc.nextInt();
				if (numero >= minimo) {
					sc.nextLine();
					return numero;
				}
				System.out.print("Introduce un número mayor o igual que " + minimo + ". ");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}

}
