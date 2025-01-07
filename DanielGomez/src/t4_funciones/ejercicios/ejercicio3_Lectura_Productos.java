package t4_funciones.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3_Lectura_Productos {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		lecturaProductos();

	}

	public static void lecturaProductos() {
		String producto;
		int cantidad = 1, pvp, tipoIva;
		double importeTotal = 0, iva = 0;
		while (cantidad > 0) {
			System.out.println("*****************************************");
			System.out.print("Introduce el nombre del producto: ");
			producto = sc.nextLine();
			System.out.println();
			cantidad = teclado(9999, "Introduce la cantidad (0 para finalizar programa): ");
			if (cantidad <= 0) {
				System.out.println("Programa finalizado.");
				System.exit(0);
			}
			System.out.println();
			pvp = teclado(1, 99999, "Introduce el PVP: ");
			System.out.println();
			tipoIva = teclado(1, 3, """
					1 => IVA General 21%
					2 => IVA Reducido 10%
					3 => IVA Superreducido 4%
					IVA:  """);

			switch (tipoIva) {
			case 1 -> {
				iva = 0.21;
			}
			case 2 -> {
				iva = 0.10;
			}
			case 3 -> {
				iva = 0.04;
			}
			}

			importeTotal = cantidad * pvp + (cantidad * pvp * iva);

			System.out.println();
			System.out.println("DATOS INTRODUCIDOS:");
			System.out.println("Producto: " + producto);
			System.out.println("Cantidad: " + cantidad);
			System.out.println("PVP: " + pvp);
			System.out.println("IVA seleccionado: " + tipoIva);
			System.out.println("_________________");
			System.out.printf("Importe total: %,.2f%n", importeTotal);
			System.out.println();
		}

	}

	public static int teclado(int min, int max, String mensaje) {
		int n = min - 1;

		while (n < min || n > max) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce una cantidad correcta.");
			}
			sc.nextLine();
		}

		return n;
	}

	public static int teclado(int max, String mensaje) {
		int n = max + 1;

		while (n > max) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce una cantidad correcta.");
			}
			sc.nextLine();
		}

		return n;
	}
}
