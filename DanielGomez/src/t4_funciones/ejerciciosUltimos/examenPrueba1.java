package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class examenPrueba1 {
	static Scanner sc = new Scanner(System.in);
	static int precio, cantidad;
	static String nombre;

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		while (true) {
			System.out.println("""
					=============================================
					MENÚ DE INVENTARIO:
					1. Registrar un producto
					2. Mostrar último producto registrado
					3. Salir
					=============================================
					""");
			int eleccion = pedirNumero("Opción: ", 1, 3);

			switch (eleccion) {
			case 1 -> registrarProducto();
			case 2 -> mostrarUltimoProductoRegistrado();
			case 3 -> {
				System.out.println("Fin del programa.");
				return;
			}
			}
		}

	}

	private static void mostrarUltimoProductoRegistrado() {
		if (precio==0 && cantidad == 0) {
			System.out.println("No hay registros.");
		} else {
			System.out.println("Último producto registrado: ");
			System.out.println("Nombre: " + nombre);
			System.out.println("Precio: " + precio);
			System.out.println("Cantidad: " + cantidad);
		}

	}

	private static void registrarProducto() {
		// Nombre
		System.out.print("Introduce el nombre del producto: ");
		nombre = sc.nextLine();

		// Precio
		precio = pedirNumero("Introduce el precio: ", 1);

		// Introduce la cantidad
		cantidad = pedirNumero("Introduce la cantidad: ", 1);

		System.out.println("Producto registrado correctamente.");
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
				System.out.print("Introduce un número entre " + minimo + " y " + maximo + ". ");
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
				System.out.print("Introduce un número mayor que " + minimo + ". ");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}

}
