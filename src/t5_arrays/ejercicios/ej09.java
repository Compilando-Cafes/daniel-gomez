package t5_arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej09 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Crea un programa en el que el usuario pueda decidir que tipo de tabla quiere
		// (int, double o booleano), y de qué longitud. Despues pide que rellene la
		// tabla con los valores que desee (Extra: comprueba que sean correctos [no
		// aceptar un int al pedir un booleano]) Muestra la tabla por pantalla. Muestra
		// la posición de memoria donde están cada una de las celdas de la tabla.

		while (true) {
			System.out.println("""
					Elige el tipo de dato para la tabla:
					1) Int
					2) Double
					3) Booleano
					0) Salir""");
			int eleccion = pedirNumero("Elección: ", 0, 3);
			System.out.println();
			switch (eleccion) {
			case 1 -> tablaInt();
			case 2 -> tablaDouble();
			case 3 -> tablaBooleano();
			case 0 -> {
				System.out.println("Adios.");
				return;
			}
			}
		}
	}

	private static void tablaInt() {
		System.out.println("Tabla de tipo entero");
		int longitud = pedirNumero("Elige longitud: ", 1);
		int tabla[] = new int[longitud];

		// Introducir los valores de la tabla
		for (int i = 0; i < longitud; i++) {
			int valor = pedirNumero("Dime el valor número " + (i + 1) + ": ");
			tabla[i] = valor;
		}

		// Mostrar la tabla
		System.out.print("La tabla es: {");
		for (int i = 0; i < longitud; i++) {
			System.out.print(i == 0 ? tabla[i] : ", " + tabla[i]);
		}
		System.out.println("}");

		// Posiciones en memoria
		System.out.println("La tabla ocupa la siguiente posicion en memoria: ");
		System.out.println(tabla);
		System.out.println();
	}

	private static void tablaDouble() {
		System.out.println("Tabla de tipo double");
		int longitud = pedirNumero("Elige longitud: ", 1);
		double tabla[] = new double[longitud];

		// Introducir los valores de la tabla
		for (int i = 0; i < longitud; i++) {
			double valor = pedirNumeroDouble("Dime el valor número " + (i + 1) + ": ");
			tabla[i] = valor;
		}

		// Mostrar la tabla
		System.out.print("La tabla es: {");
		for (int i = 0; i < longitud; i++) {
			System.out.print(i == 0 ? tabla[i] : ", " + tabla[i]);
		}
		System.out.println("}");

		// Posiciones en memoria
		System.out.println("La tabla ocupa la siguiente posicion en memoria: ");
		System.out.println(tabla);
		System.out.println();
		
	}

	private static void tablaBooleano() {
		System.out.println("Tabla de tipo booleano");
		int longitud = pedirNumero("Elige longitud: ", 1);
		boolean tabla[] = new boolean[longitud];

		// Introducir los valores de la tabla
		for (int i = 0; i < longitud; i++) {
			boolean valor = pedirBooleano("Dime el valor número " + (i + 1) + ": ");
			tabla[i] = valor;
		}

		// Mostrar la tabla
		System.out.print("La tabla es: {");
		for (int i = 0; i < longitud; i++) {
			System.out.print(i == 0 ? tabla[i] : ", " + tabla[i]);
		}
		System.out.println("}");

		// Posiciones en memoria
		System.out.println("La tabla ocupa la siguiente posicion en memoria: ");
		System.out.println(tabla);
		System.out.println();
	}

	public static int pedirNumero(String mensaje, int minimo, int maximo) {
		while (true) {
			System.out.print(mensaje);
			try {
				int numero = sc.nextInt();
				if (numero >= minimo && numero <= maximo) {
					sc.nextLine();
					return numero;
				}
				System.out.println("Introduce un número entre " + minimo + " y " + maximo + ".");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
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
				System.out.println("Introduce un número mayor que " + (minimo) + ". ");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}

	public static int pedirNumero(String mensaje) {
		while (true) {
			System.out.print(mensaje);
			try {
				int numero = sc.nextInt();
				sc.nextLine();
				return numero;
			} catch (InputMismatchException e) {
				System.out.print("Introduce un valor correcto. ");
			}
			sc.nextLine();
		}
	}
	
	public static double pedirNumeroDouble(String mensaje) {
		while (true) {
			System.out.print(mensaje);
			try {
				double numero = sc.nextDouble();
				sc.nextLine();
				return numero;
			} catch (InputMismatchException e) {
				System.out.print("Introduce un valor correcto. ");
			}
			sc.nextLine();
		}
	}
	
	public static boolean pedirBooleano(String mensaje) {
		while (true) {
			System.out.print(mensaje);
			try {
				boolean numero = sc.nextBoolean();
				sc.nextLine();
				return numero;
			} catch (InputMismatchException e) {
				System.out.print("Introduce un valor correcto. ");
			}
			sc.nextLine();
		}
	}

}
