package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioDia18 {


	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
		
		sc.close();
	}

	// Método que pinta el menú
	public static void menu() {
		int opcion = 1;
		while (opcion >= 1 && opcion <= 5) {
			System.out.println("""
					***********************************************************
					MENÚ DE EJERCICIOS
					1 - EJERCICIO1. LECTURA PRODUCTOS.
					2 - EJERCICIO2. TRIANGULO.
					3 - FIN.
					***********************************************************
					""");
			opcion = leerEntero("Introduce opción (1 a 3): ", 1, 3);

			switch (opcion) {
			case 1 -> lecturaProductos();
			case 2 -> triangulo();
			case 3 -> {
				// Cabecera
				System.out.println("""
						========================================================
						HASTA OTRA
						========================================================



												""");
				System.exit(0);
			}
			}
		}
	}

	public static void lecturaProductos() {
		// Cabecera
		System.out.println("""
				========================================================
				EJERCICIO 1
				========================================================
								""");
		System.out.println("Entrada de datos:");

		String producto;
		int cantidad = 1, pvp, tipoIva;
		double importeTotal = 0, iva = 0;
		while (cantidad > 0) {
			System.out.println("--------------------------------------------------------------");
			System.out.print("Introduce el Producto: ");
			producto = sc.nextLine();
			cantidad = leerEntero("Introduce la cantidad: ", 0, 999);
			if (cantidad <= 0) {
				System.out.println("Programa finalizado.");
				break;
			}
			pvp = leerEntero("Introduce el PVP: ", 1, 9999);
			tipoIva = leerEntero("Introduce IVA (1 a 3): ", 1, 3);
			
			switch (tipoIva) {
			case 1 -> {
				System.out.print("\tIVA General 21%.");
				iva = 0.21;
			}
			case 2 -> {
				System.out.print("\tIVA General 10%.");
				iva = 0.10;
			}
			case 3 -> {
				System.out.print("\tIVA General 4%.");
				iva = 0.04;
			}
			}

			importeTotal = cantidad * pvp + (cantidad * pvp * iva);
			
			System.out.printf("\tImporte total: %,.2f%n", importeTotal);
		}

	}

	public static void triangulo() {

		// Cabecera
		System.out.println("""
				========================================================
				EJERCICIO 2
				========================================================
								""");

		int n = leerEntero("Introduce un nº > 0: ", 0);
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

	public static int leerEntero(String mensaje, int min, int max) {
		int n = max + 1;
		while (n < min || n > max) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\tIncorrecto. ");
			}
			sc.nextLine();
			
			if (n < min || n > max) {
				System.out.printf("\tIncorrecto. ");
			}
		}
		return n;
	}

	public static int leerEntero(String mensaje, int min) {
		int n = min -1;
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

