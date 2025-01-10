package t5_arrays.actividades;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class gomez_delgado_daniel_juego_ahorcado {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Tabla con las palabras a buscar
		String palabras[] = { "jabalina", "labrador", "obelisco", "quebrado", "sabatico", "nacional", "habitual",
				"fabuloso", "fabricar", "caballos", "calabaza" };

		while (true) {
			System.out.print("""
					
					============================================
					|    	   EL JUEGO DEL AHORCADO           |
					============================================

					1-> Comenzar a jugar
					2-> Jugar haciendo trampas
					3-> Salir
					""");
			boolean trampas = false;
			int opcion = pedirNumero("Elección: ", 1, 3);
			switch (opcion) {
			case 1 -> ahorcado(palabras, trampas);
			case 2 -> {
				trampas = true;
				System.out.print("""
						
						========================================
						|	MODO TRAMPOSO ACTIVADO	       |
						========================================
						""");
				ahorcado(palabras, trampas);
			}
			case 3 -> {
				System.out.println("¡Hasta pronto!");
				System.exit(0);
			}
			}
		}

	}

	private static void ahorcado(String tabla[], boolean trampas) {
		System.out.println("""

				¡Juguemos!
				""");

		// Palabra de la tabla elegida al azar
		Random rand = new Random();
		int posicionPalabraAzar = rand.nextInt(tabla.length);

		// Convertir la palabra elegida a un array de caracteres
		char objetivo[] = tabla[posicionPalabraAzar].toCharArray();

		if (trampas) {
			System.out.println("La palabra elegida es la número: " + posicionPalabraAzar);
			System.out.println("Y es: " + tabla[posicionPalabraAzar]);
		}

		// Tabla con los resultados
		char progreso[] = new char[8];
		Arrays.fill(progreso, '_');

		// Control de los 15 intentos
		int intentos = 15;

		if (trampas) {
			System.out.println("Tienes intentos casi casi infinitos... (1000 intentos)");
			intentos = 1000;
		} else {
			System.out.println("Tienes " + intentos + " intentos.");
		}

		// Tabla con las letras incorrectas
		char incorrectas[] = new char[intentos];
		int contadorIncorrectas = 0;

		for (int i = 1; i <= intentos; i++) {
			// Mostrar intento
			System.out.println("Intento número: " + i);
			
			// Mostrar el progreso
			System.out.println("Palabra: " + Arrays.toString(progreso));

			// Petición letras
			System.out.print("Letra: ");
			char letra = sc.next().charAt(0);
			System.out.println();

			// Controlador de letras erroneas
			int contador = 0;

			// Si la letra está la añade a la tabla progreso
			for (int j = 0; j < 8; j++) {
				if (letra == objetivo[j]) {
					progreso[j] = letra;
					contador++;
				}
			}

			// Tabla con las incorrectas
			if (contador == 0) {
				incorrectas[contadorIncorrectas] = letra;
				contadorIncorrectas++;
			}
			// Mostrar de la tabla de las incorrectas solo lo que esté rellenado
			System.out.print("Letras incorrectas: ");
			for (int j = 0; j < contadorIncorrectas; j++) {
				System.out.print(j == 0 ? incorrectas[j] : ", " + incorrectas[j]);
			}
			System.out.println();

			if (Arrays.equals(progreso, objetivo)) {
				System.out.println("¡CORRECTO! La palabra era: " + tabla[posicionPalabraAzar]);
				if (trampas)
					System.out.println("Claro... haciendo trampas cualquiera acierta...");
				break;
			}
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
}
