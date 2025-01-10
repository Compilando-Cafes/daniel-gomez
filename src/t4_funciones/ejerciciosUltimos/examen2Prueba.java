package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class examen2Prueba {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("""
					Bienvenido al programa de ejercicios.
					Por favor, selecciona una opción:
					1. Agregar productos
					2. Dibujar pirámides huecas repetidas
					3. Tabla de multiplicar personalizada
					4. Salir
					=============================================
					""");
			int eleccion = pedirNumeroEntero("Tu opción: ", 1, 4);

			switch (eleccion) {
			case 1 -> agregarProductos();
			case 2 -> dibujarPiramides();
			case 3 -> tablaMultiplicarPersonalizada();
			case 4 -> {
				System.out.println("Adios.");
				return;
			}
			}
		}

	}

	private static void agregarProductos() {
		String productosAgregados = "";
		double totalAcumulado = 0;
		int contador = 0;
		System.out.println("¡Bienvenido al juego de productos!");
		while (true) {
			System.out.print("Introduce el nombre del producto o 0 para salir: ");
			String nombre = sc.nextLine();
			if (nombre.equals("0")) {
				System.out.println();
				break;
			}
			double precio = pedirNumero("Introduce el precio del producto: ", 1);

			System.out.printf("Producto agregado: %s - Precio: %,.2f €%n", nombre, precio);
			totalAcumulado += precio;
			System.out.printf("Total acumulado: %,.2f €%n", totalAcumulado);
			contador++;
			if (contador == 1) {
				productosAgregados = productosAgregados + nombre;
			} else {
				productosAgregados = productosAgregados + ", " + nombre;

			}
			System.out.println();
		}
		System.out.println("Fin del juego. Aquí tienes tu resumen:");
		System.out.println("Número de productos: " + contador);
		System.out.printf("Total final: %,.2f%n", totalAcumulado);
		System.out.println("Productos agregados: " + productosAgregados);

	}

	private static void dibujarPiramides() {
		while (true) {
			int numFilas = pedirNumeroEntero("Introduce el número de filas para la pirámide: ", 0);
			if (numFilas == 0) {
				System.out.println();
				return;
			}
			int numTriangulos = pedirNumeroEntero("Introduce cuantas veces quieres que se repita a la derecha: ", 0);
			if (numTriangulos == 0) {
				System.out.println();
				return;
			}

			// Filas del dibujo
			for (int fila = 1; fila <= numFilas; fila++) {

				// Control de número de triángulos
				for (int triangulo = 1; triangulo <= numTriangulos; triangulo++) {

					// Pintar espacios al principio
					for (int i = 0; i < numFilas - fila; i++) {
						System.out.print(" ");
					}

					// Pintar asteriscos del triángulo
					for (int i = 0; i < 2 * fila - 1; i++) {
						if (i == 0 || i == 2 * fila - 2 || fila == numFilas) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}

					// Pintar espacios entre triángulos
					for (int i = 0; i < numFilas - fila; i++) {
						System.out.print(" ");
					}
				}

				// Salto de línea
				System.out.println();
			}
		}

	}

	private static void tablaMultiplicarPersonalizada() {
		while (true) {
			int resultadoTotal = 0;
			int numero = pedirNumeroEntero("Introduce un número para la tabla de multiplicar: ", 0);
			if (numero == 0) {
				System.out.println();
				return;
			}
			int limite = pedirNumeroEntero("Introduce el límite (hasta qué número quieres multiplicar): ", 1);
			System.out.println("Aquí está la tabla de multiplicar:");

			for (int i = 1; i <= limite; i++) {
				int resultado = numero * i;
				resultadoTotal += resultado;
				System.out.println(numero + " x " + i + " = " + resultado);
			}
			System.out.println();
			System.out.printf("La suma de todas las multiplicaciones es: %,d. ", resultadoTotal);

		}

	}

	public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
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

	public static int pedirNumeroEntero(String mensaje, int minimo) {
		while (true) {
			System.out.print(mensaje);
			try {
				int numero = sc.nextInt();
				if (numero >= minimo) {
					sc.nextLine();
					return numero;
				}
				System.out.println("Introduce un número mayor que " + minimo + ". ");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}

	public static double pedirNumero(String mensaje, int minimo) {
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
