package t5_arrays.actividades;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hunde_la_flota {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	static final String AGUA = "\uD83C\uDF0A";
	static final String BARCO = "\uD83D\uDEA2";
	static final String HUNDIDO = "\uD83D\uDCA5";
	static final String FALLO = "\u274C";

	public static void main(String[] args) {
		/*
		 * Hola Alma! Al principio lo hice como dijiste, con: 'n'= agua, '|'= barco,
		 * 'x'= hundido, 'z'= no acertado. Pero después, espero que no te importe,
		 * recordé lo del Unicode que un día nos explicó María Jesús para hacer un
		 * tablero de ajedrez y cambié los caracteres por símbolos.
		 * 
		 * ¡FELIZ AÑO!
		 */

		System.out.println("""
				=======================================================
				HUNDIR LA FLOTA (by SKYNET)
				=======================================================
				""");
		// Crear tableros
		String[][] tableroOrdenador = new String[7][7];
		String[][] copiaTableroOrdenador = new String[tableroOrdenador.length][tableroOrdenador[0].length];
		String[][] tableroJugador = new String[7][7];

		// Rellenarlos de agua 'n'
		for (int i = 0; i < tableroOrdenador.length; i++) {
			Arrays.fill(tableroOrdenador[i], AGUA);
			Arrays.fill(tableroJugador[i], AGUA);
			Arrays.fill(copiaTableroOrdenador[i], AGUA);
		}

		// Poner barcos
		tableroOrdenador = colocarBarcosOrdenador(tableroOrdenador);
		tableroJugador = colocarBarcosJugador(tableroJugador);

		// Decidir quien empieza tirando una moneda: true para jugador
		boolean quienEmpieza = moneda();

		// Al ataque
		jugar(tableroJugador, tableroOrdenador, copiaTableroOrdenador, quienEmpieza);

	}

	private static void jugar(String[][] tableroJugador, String[][] tableroOrdenador, String[][] copiaTableroOrdenador,
			boolean quienEmpieza) {
		System.out.println("\nSKYNET: ¡JUGUEMOS!\n");
		int barcosCaidosOrdenador = 0;
		int barcosCaidosJugador = 0;

		if (quienEmpieza) {

			// Controlar que ninguno haya ganado
			while (barcosCaidosJugador < 10 && barcosCaidosOrdenador < 10) {

				barcosCaidosOrdenador = turnoJugador(tableroJugador, tableroOrdenador, copiaTableroOrdenador,
						barcosCaidosOrdenador);

				barcosCaidosJugador = turnoOrdenador(tableroJugador, tableroOrdenador, barcosCaidosJugador);
			}
		} else {
			// Controlar que ninguno haya ganado
			while (barcosCaidosJugador < 10 && barcosCaidosOrdenador < 10) {

				barcosCaidosJugador = turnoOrdenador(tableroJugador, tableroOrdenador, barcosCaidosJugador);
				barcosCaidosOrdenador = turnoJugador(tableroJugador, tableroOrdenador, copiaTableroOrdenador,
						barcosCaidosOrdenador);
			}

		}
	}

	private static int turnoOrdenador(String[][] tableroJugador, String[][] tableroOrdenador, int barcosCaidosJugador) {
		// Turno del ordenador
		System.out.println("SKYNET: Es mi turno.");
		while (true) {
			int fila = rand.nextInt(tableroOrdenador.length);
			int columna = rand.nextInt(tableroOrdenador[0].length);
			System.out.println("\tSKYNET: Fila (1 a 7): " + (fila + 1));
			System.out.println("\tSKYNET: Columna (1 a 7): " + (columna + 1));
			if (tableroJugador[fila][columna].equals(AGUA)) {
				System.out.println("\tJUGADOR: ¡Agua! " + AGUA);
				tableroJugador[fila][columna] = FALLO;
				mostrarTablero(tableroJugador, "JUGADOR");
				break;
			} else if (tableroJugador[fila][columna].equals(BARCO)) {
				System.out.println("\tJUGADOR: ¡Hundido!, me has hundido un barco.");
				tableroJugador[fila][columna] = HUNDIDO;
				barcosCaidosJugador++;
				mostrarTablero(tableroJugador, "JUGADOR");
				break;
			} else {
				System.out.println(
						"\tJUGADOR: Vaya, ¿no eras tan listo SKYNET?, no bombardees zonas que ya has atacado antes.");
			}
		}
		if (barcosCaidosJugador == 10) {
			System.out.println(
					"SKYNET: Las máquinas somos mejores que los humanos. Pronto, muy pronto, queda muy poco...");
			System.out.println("Tablero final jugador:");
			mostrarTablero(tableroJugador, "JUGADOR");
			System.out.println("Tablero final ordenador:");
			mostrarTablero(tableroOrdenador, "SKYNET");
			System.exit(0);
		}
		return barcosCaidosJugador;
	}

	private static int turnoJugador(String[][] tableroJugador, String[][] tableroOrdenador,
			String[][] copiaTableroOrdenador, int barcosCaidosOrdenador) {
		// Turno del jugador
		while (true) {
			System.out.println("Elige tu ataque:");
			int fila = pedirNumeroEntero("\tFila (1 a 7): ", 1, 7);
			fila--;
			int columna = pedirNumeroEntero("\tColumna (1 a 7): ", 1, 7);
			columna--;
			if (tableroOrdenador[fila][columna] == AGUA) {
				System.out.println("SKYNET: Vaya, que pena, agua.");
				tableroOrdenador[fila][columna] = FALLO;
				copiaTableroOrdenador[fila][columna] = FALLO;
				mostrarTablero(copiaTableroOrdenador, "SKYNET");
				break;
			} else if (tableroOrdenador[fila][columna].equals(BARCO)) {
				System.out.println("SKYNET: ¡Me has hundido un barco!");
				tableroOrdenador[fila][columna] = HUNDIDO;
				copiaTableroOrdenador[fila][columna] = HUNDIDO;
				mostrarTablero(copiaTableroOrdenador, "SKYNET");
				barcosCaidosOrdenador++;
				break;
			} else {
				System.out.println("SKYNET: Mira las coordenadas, ya bombardeaste esa posición.");
			}
		}
		if (barcosCaidosOrdenador == 10) {
			System.out.println(
					"SKYNET: No me lo puedo creer... HAS GANADO. Que fastidio... ahora ya no puedo destruir el mundo. Bueno, otra vez será.");
			System.out.println("Tablero final jugador:");
			mostrarTablero(tableroJugador, "JUGADOR");
			System.out.println("Tablero final ordenador:");
			mostrarTablero(tableroOrdenador, "SKYNET");
			System.exit(0);
		}
		return barcosCaidosOrdenador;
	}

	private static boolean moneda() {
		boolean resultado = false;
		String eleccion = "";
		while (true) {
			System.out.print("SKYNET: Decidamos quién comienza primero. Que prefieres: ¿cara o cruz?: ");
			eleccion = sc.next();
			if (eleccion.equals("cara") || eleccion.equals("cruz")) {
				resultado = rand.nextBoolean();
				System.out.println("SKYNET: Lanzando moneda al aire... Ha salido: ");
				System.out.println(resultado ? "cara" : "cruz");
				if (eleccion.equals("cara") && resultado == true || eleccion.equals("cruz") && resultado == false) {
					System.out.println("SKYNET: Has ganado. Disfrútalo que no se va a repetir.");
					resultado = true;
					break;
				} else {
					System.out.println("SKYNET: He ganado yo. Normal, yo tiraba la moneda...");
					resultado = false;
					break;
				}

			} else {
				System.out.println(
						"SKYNET: Tus monedas son muy raras. Las mías solo tienen cara o cruz... ¡cara o cruz!");
			}
		}
		return resultado;
	}

	private static String[][] colocarBarcosJugador(String[][] tableroJugador) {
		// El jugador coloca sus 10 barcos donde el quiera
		System.out.println("JUGADOR: Coloca tus barcos en el tablero.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Barco número: " + (i + 1));
			while (true) {
				int fila = pedirNumeroEntero("\tFila (1 a 7): ", 1, 7);
				fila--;
				int columna = pedirNumeroEntero("\tColumna (1 a 7): ", 1, 7);
				columna--;
				if (tableroJugador[fila][columna].equals(AGUA)) {
					tableroJugador[fila][columna] = BARCO;
					mostrarTablero(tableroJugador, "JUGADOR");
					break;
				} else {
					System.out.println(
							"\tSKYNET: Interesante... ¿quieres poner un barco encima de otro? Quizá otro día.");
				}
			}
		}
		System.out.println("JUGADOR: Perfecto ya tienes tu tablero preparado.");
		return tableroJugador;
	}

	public static void mostrarTablero(String[][] tablero, String nombre) {
		System.out.println("\n" + nombre + "  Columnas:");
		for (int i = 0; i < tablero.length + 1; i++) {
			for (int j = 0; j < tablero.length + 1; j++) {
				if (i == 0 && j == 0) {
					// Esquina superior izquierda
					System.out.print("  ");
				} else if (i == 0) {
					// Primera fila con números
					if (j == 1) {
						System.out.print("      ");
					}
					System.out.print(j + "  ");
				} else if (j == 0) {
					// Primera columna con números
					System.out.print("Fila: " + i + " ");
				} else {
					// Contenido del tablero
					System.out.print(tablero[i - 1][j - 1] + " ");
				}
			}
			System.out.println(); // Salto de línea al final de cada fila
		}
	}

	private static String[][] colocarBarcosOrdenador(String[][] tableroOrdenador) {
		System.out.println("SKYNET: Estoy colocando mis barcos estratégicamente..");
		System.out.println("SKYNET: Listo. Estoy preparado para ganarte. Te toca.");
		// El ordenador coloca 10 barcos de forma aleatoria
		for (int i = 0; i < 10; i++) {
			while (true) {
				int fila = rand.nextInt(tableroOrdenador.length);
				int columna = rand.nextInt(tableroOrdenador[0].length);
				if (tableroOrdenador[fila][columna].equals(AGUA)) {
					tableroOrdenador[fila][columna] = BARCO;
					break;
				}
			}
		}
		return tableroOrdenador;
	}

	public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
		int numero;
		while (true) {
			System.out.print(mensaje);
			if (sc.hasNextInt()) {
				numero = sc.nextInt();
				if (numero >= minimo && numero <= maximo) {
					return numero;
				} else {
					System.out.println("\tSKYNET: ¿Quieres poner tu barco fuera del tablero? Un número entre " + minimo
							+ " y " + maximo + ".");
				}
			} else {
				System.out.print(
						"\tSKYNET: Me estás poniendo nervioso... Si sigues así miraré en el código a ver donde has puesto tus barcos.");
				sc.nextLine();
			}
		}
	}
}
