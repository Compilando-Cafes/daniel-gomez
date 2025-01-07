package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioRepetido {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		while (true) {
			System.out.println("""
					=============================================
					MENÚ DE EJERCICIOS:
					1. EJERCICIO1. LECTURA PRODUCTOS.
					2. FIN.
					=============================================
					""");
			int eleccion = pedirNumero("Opción de menú (1 a 2): ", 1, 2);

			switch (eleccion) {
			case 1 -> {
				lecturaProductos();
			}
			case 2 -> {
				System.out.println("Adios.");
				return;
			}
			}
		}

	}

	private static void lecturaProductos() {
		System.out.println("""
				=============================================
				EJERCICIO 1
				=============================================
				""");

		System.out.println("Entrada de datos:");
		while (true) {
			String nombreIva = "";
			System.out.println("--------------------------------------------");
			System.out.print("Introduce el Producto: ");
			String nombreProducto = sc.nextLine();

			int cantidad = pedirNumero("Introduce la cantidad: ", 0, 999);
			if (cantidad == 0) {
				return;
			}
			int pvp = pedirNumero("Introduce el PVP: ", 0, 9999);
			if (pvp == 0) {
				return;
			}
			int iva = pedirNumero("Introduce IVA: ", 0, 3);
			if (iva == 0) {
				return;
			}
			double porcentajeIva = 0;
			switch (iva) {
			case 1 -> {
				nombreIva = "IVA General 21%";
				porcentajeIva = 0.21;
			}
			case 2 -> {
				nombreIva = "IVA Reducido 10%";
				porcentajeIva = 0.10;
			}
			case 3 -> {
				nombreIva = "IVA Superreducido 4%";
				porcentajeIva = 0.04;
			}
			}
			double importeTotal = cantidad * pvp + (cantidad * pvp) * porcentajeIva;
			// Resultados
			System.out.print("\t"+ nombreIva);
			System.out.printf("\tImporte total: %,.2f%n%n", importeTotal);
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

}
