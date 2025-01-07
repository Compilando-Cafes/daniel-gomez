package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class examen3Prueba {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("""
					=============================================
					Bienvenido al programa de ejercicios.
					Por favor, selecciona una opción:
					1. Calculadora de interés compuesto
					2. Convertidor a números romanos
					3. Generador de cuadrados concéntricos
					4. Salir
					=============================================
					""");
			int eleccion = pedirNumero("Tu opción: ", 0, 3);

			switch (eleccion) {
			case 1 -> calculadoraInteresCompuesto();
			case 2 -> convertidorNumerosRomanos();
			case 3 -> cuadradosConcentricos();
			case 4 -> {
				System.out.println("Adios.");
				return;
			}
			}
		}
	}

	private static void calculadoraInteresCompuesto() {
		while (true) {

			System.out.println();
			System.out.println("CALCULADORA DE INTERÉS COMPUESTO");
			double capitalInicial = pedirNumeroDouble("Introduce el capital inicial: ", 0);
			if (capitalInicial == 0) {
				return;
			}
			double tasaInteresAnual = pedirNumeroDouble("Introduce la tasa de interés anual (%): ", 0);
			if (tasaInteresAnual == 0) {
				return;
			}
			int numeroAgnos = pedirNumero("Introduce el número de años: ", 0);
			if (numeroAgnos == 0) {
				return;
			}

			System.out.println();

			System.out.println("Resultados:");
			for (int i = 1; i <= numeroAgnos; i++) {

				capitalInicial += capitalInicial * (tasaInteresAnual / 100);
				System.out.printf("Año %d: Monto = %,.2f €%n", i, capitalInicial);
			}
			System.out.println();
			System.out.printf("El monto total después de %d años es: %,.2f%n", numeroAgnos, capitalInicial);
			System.out.println();
		}
	}

	private static void convertidorNumerosRomanos() {
		String resultado = "";
		int n = pedirNumero("Introduce un número entero entre 1 y 3999: ", 1, 3999);

		int factor = 1; // Para determinar la posición (unidades, decenas, centenas, millares)
		while (n > 0) {
			int decimal = n % 10;

			switch (factor) {
			case 1 -> { // Unidades
				switch (decimal) {
				case 1 -> resultado = "I" + resultado;
				case 2 -> resultado = "II" + resultado;
				case 3 -> resultado = "III" + resultado;
				case 4 -> resultado = "IV" + resultado;
				case 5 -> resultado = "V" + resultado;
				case 6 -> resultado = "VI" + resultado;
				case 7 -> resultado = "VII" + resultado;
				case 8 -> resultado = "VIII" + resultado;
				case 9 -> resultado = "IX" + resultado;
				}
			}
			case 10 -> { // Decenas
				switch (decimal) {
				case 1 -> resultado = "X" + resultado;
				case 2 -> resultado = "XX" + resultado;
				case 3 -> resultado = "XXX" + resultado;
				case 4 -> resultado = "XL" + resultado;
				case 5 -> resultado = "L" + resultado;
				case 6 -> resultado = "LX" + resultado;
				case 7 -> resultado = "LXX" + resultado;
				case 8 -> resultado = "LXXX" + resultado;
				case 9 -> resultado = "XC" + resultado;
				}
			}
			case 100 -> { // Centenas
				switch (decimal) {
				case 1 -> resultado = "C" + resultado;
				case 2 -> resultado = "CC" + resultado;
				case 3 -> resultado = "CCC" + resultado;
				case 4 -> resultado = "CD" + resultado;
				case 5 -> resultado = "D" + resultado;
				case 6 -> resultado = "DC" + resultado;
				case 7 -> resultado = "DCC" + resultado;
				case 8 -> resultado = "DCCC" + resultado;
				case 9 -> resultado = "CM" + resultado;
				}
			}
			case 1000 -> { // Millares
				switch (decimal) {
				case 1 -> resultado = "M" + resultado;
				case 2 -> resultado = "MM" + resultado;
				case 3 -> resultado = "MMM" + resultado;
				}
			}
			}

			n /= 10; // Avanzar al siguiente dígito
			factor *= 10; // Mover a la siguiente posición (decenas, centenas, millares)
		}

		System.out.println("El número en romano es: " + resultado);
	}

	private static void generadorCuadradosConcentricos() {
		while (true) {
			int n = pedirNumero("Introduce el tamaño del cuadrado más pequeño (0 para salir): ", 0);
			if (n == 0) {
				System.out.println("Volviendo al menú principal...\n");
				return;
			}

			int tamañoGrande = n + 2; // El cuadrado más grande es dos unidades mayor
			int tamañoTotal = tamañoGrande; // Definir el tamaño total del cuadrado grande

			// Generar filas del cuadrado
			for (int fila = 1; fila <= tamañoTotal; fila++) {
				for (int columna = 1; columna <= tamañoTotal; columna++) {

					// Condiciones para los bordes exteriores (cuadrado grande)
					if (fila == 1 || fila == tamañoTotal || columna == 1 || columna == tamañoTotal) {
						System.out.print("*");
					}
					// Condiciones para los bordes interiores (cuadrado pequeño)
					else if (fila == 2 || fila == tamañoTotal - 1 || columna == 2 || columna == tamañoTotal - 1) {
						System.out.print(" ");
					}
					// Interior del cuadrado pequeño
					else {
						System.out.print("*");
					}
				}
				System.out.println(); // Salto de línea después de cada fila
			}

			System.out.println();
		}
	}

	private static void cuadradosConcentricos() {
		while (true) {
			int n = pedirNumero("Introduce el tamaño del cuadrado más pequeño (0 para salir): ", 0);
			if (n == 0) {
				System.out.println("Volviendo al menú principal...\n");
				return;
			}

			int tamañoGrande = n + 2; // El cuadrado grande es 2 unidades mayor que el pequeño

			// Generar filas
			for (int fila = 1; fila <= tamañoGrande; fila++) {
				for (int columna = 1; columna <= tamañoGrande; columna++) {
					// Condiciones para el borde exterior (cuadrado grande)
					if (fila == 1 || fila == tamañoGrande || columna == 1 || columna == tamañoGrande) {
						System.out.print("* ");
					}
					// Condiciones para el borde interior (cuadrado pequeño)
					else if (fila == 3 || fila == tamañoGrande - 2 || columna == 3 || columna == tamañoGrande - 2) {
						System.out.print("* ");
					}
					// Espacios vacíos
					else {
						System.out.print("  ");
					}
				}
				System.out.println(); // Salto de línea después de cada fila
			}
			System.out.println(); // Separación entre ejecuciones
		}
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

	public static double pedirNumeroDouble(String mensaje, int minimo) {
		while (true) {
			System.out.print(mensaje);
			try {
				double numero = sc.nextDouble();
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

}
