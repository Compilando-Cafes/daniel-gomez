package t5_arrays.actividades;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class numero_de_la_suerte {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("""
				=============================================
				EL NÚMERO DE LA SUERTE
				=============================================
				""");

		int resultado = numeroSuerte();
		System.out.println("Conseguido. Tu número de la suerte es: " + resultado);

	}

	// Función que calcula el número de la suerte
	public static int numeroSuerte() {

		int tabla[] = pedirNumerosFavoritos();

		// Objeto para el control de los aleatorios
		Random rand = new Random();
		System.out.println("La tabla comienza así: " + Arrays.toString(tabla));


		// Controlar que la tabla no llegue al mínimo
		while (tabla.length > 1) {
			// Crear dos números distintos al azar para las posiciones
			int indice1 = rand.nextInt(tabla.length);
			int indice2;
			do {
				indice2 = rand.nextInt(tabla.length);
			} while (indice2 == indice1);
			
			// Mostrar la tabla inicial

			// Calcular la media
			int media = (tabla[indice1] + tabla[indice2]) / 2;
			
			System.out.println("\nSelecciono -> Posición " + indice1 + " con el número " +tabla[indice1] + " y posición " + indice2 + " con el número: " + tabla[indice2]);

			// Eliminarlos de la tabla controlando que primero elimina el mayor y luego el
			// menor
			tabla = eliminarPosicionTabla(tabla, Math.max(indice1, indice2));
			tabla = eliminarPosicionTabla(tabla, Math.min(indice1, indice2));

			// Añadir el número a la nueva tabla
			tabla = añadirNumeroATabla(tabla, media);
			
			// Mostrar como va la tabla
			System.out.println("Media de los dos: " + media + ". Y lo añado.");
			System.out.println("La tabla va así: " + Arrays.toString(tabla));
		}

		// Cuando finaliza solo queda la posición 0
		return tabla[0];
	}

	private static int[] añadirNumeroATabla(int[] tabla, int numero) {
		// Crear una tabla nueva con un espacio más que la original
		int nuevaTabla[] = Arrays.copyOf(tabla, tabla.length + 1);

		// Copiar el número al final
		nuevaTabla[nuevaTabla.length - 1] = numero;

		// Ordenar y devolver
		Arrays.sort(nuevaTabla);
		return nuevaTabla;
	}

	public static int[] eliminarPosicionTabla(int[] tabla, int indice) {
		// Hacer una tabla para copiar la original
		int nuevaTabla[] = new int[tabla.length - 1];
		System.arraycopy(tabla, 0, nuevaTabla, 0, indice);
		System.arraycopy(tabla, indice + 1, nuevaTabla, indice, tabla.length - indice - 1);
		return nuevaTabla;
	}

	public static int[] pedirNumerosFavoritos() {
		int numero = 0;
		int tablaNumerosFavoritos[] = new int[0];
		while (true) {
			numero = pedirNumeroEntero("Dime tus números favoritos (mínimo 2 y después -1 para terminar): ", -1);
			if (numero < 0) {
				if (tablaNumerosFavoritos.length < 2) {
					System.out.println("La tabla debe tener al menos 2 números");
				} else {
					break;
				}
			} else {
				tablaNumerosFavoritos = Arrays.copyOf(tablaNumerosFavoritos, tablaNumerosFavoritos.length + 1);
				tablaNumerosFavoritos[tablaNumerosFavoritos.length - 1] = numero;
			}
		}

		Arrays.sort(tablaNumerosFavoritos);
		return tablaNumerosFavoritos;
	}

	// Función para controlar que el número sea correcto
	public static int pedirNumeroEntero(String mensaje, int minimo) {
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
				System.out.print("Introduce un número correcto. ");
			}
			sc.nextLine();
		}
	}
}
