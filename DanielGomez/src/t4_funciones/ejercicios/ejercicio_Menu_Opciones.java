package t4_funciones.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio_Menu_Opciones {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	// Método que pinta el menú
	public static void menu() {
		int opcion = 1;
		while (opcion >= 1 && opcion <= 5) {
			System.out.println("""
					***********************************************************
					MENÚ DE EJERCICIOS
					1 - NUMEROS PRIMOS.
					2 - DIBUJO DEL ROMBO.
					3 - TABLA DE MULTIPLICAR.
					4 - DIBUJO DEL TABLERO DE AJEDREZ.
					5 - FIN.
					***********************************************************
					""");
			opcion = leerEntero("Introduce opción (1 a 5): ", 1, 5);

			switch (opcion) {
			case 1 -> numerosPrimos();
			case 2 -> dibujoDelRombo();
			case 3 -> tablaMultiplicar();
			case 4 -> dibujoTableroAjedrez();
			case 5 -> {
				// Cabecera
				System.out.println("""
						___________________________________________________________
						|                                                          |
						|                     ¡HASTA OTRA!                         |
						|__________________________________________________________|



						""");
				System.exit(0);
			}
			}
		}
	}

	// Método que calcule y visualice los N primeros números primos. N es un valor
	// entero que se leerá por teclado. Deberá ser > 0
	public static void numerosPrimos() {
		// Cabecera
		System.out.println("""
				___________________________________________________________
				|                                                          |
				|                     NÚMEROS PRIMOS                       |
				|__________________________________________________________|
				|                                                          |
				| Instrucciones:                                           |
				| Introduce un número y te diré cuantos números primos hay |
				| hasta tu número.                                         |
				| Un número primo es aquel que solo se puede dividir entre |
				| 1 y si mismo.                                            |
				|__________________________________________________________|

				""");

		int n = leerEntero("Dime un número mayor que cero: ", 0);
		
		System.out.println();
		for (int i = 1; i <= n; i++) {
			int contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				System.out.println("Número primo: " + i);
			}
		}
		System.out.println();
	}

	// Método que haga el ejercicio del rombo donde, los caracteres del rombo se
	// piden por teclado.
	public static void dibujoDelRombo() {

		// Cabecera
		System.out.println("""
				___________________________________________________________
				|                                                          |
				|                     DIBUJO DEL ROMBO                     |
				|__________________________________________________________|
				|                                                          |
				| Instrucciones:                                           |
				| Introduce un carácter y pintaré un rombo para ti con él. |
				|__________________________________________________________|

				""");

		char c;
		System.out.print("Dime un caracter para pintar un rombo: ");
		c = sc.next().charAt(0);
		System.out.println();
		int altura = 5;
		for (int i = 1; i <= altura; i++) {
			for (int j = altura; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(c);
			}
			System.out.println();
		}

		for (int i = altura - 1; i >= 1; i--) {
			for (int j = altura; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}

	// Método que lea un número entero de teclado y muestre su tabla de multiplicar
	public static void tablaMultiplicar() {
		
		// Cabecera
		System.out.println("""
				___________________________________________________________
				|                                                          |
				|                 TABLA DE MULTIPLICAR                     |
				|__________________________________________________________|
				|                                                          |
				| Instrucciones:                                           |
				| Introduce un número y te mostraré la tabla de            |
				| multiplicar de ese número del 1 al 10                    |
				|__________________________________________________________|

				""");
		int n = leerEntero("Dime un número del uno al 10: ", 1, 10);
		
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		System.out.println();
	}

	// Método que pinte un tablero de ajedrez. Carácter negro para el tablero: char
	// negro = '\u2588'; Para que al ejecutar salga ese carácter en consola acceder
	// a las propiedades del fichero Java: Properties -> Resource -> en "Text file
	// encoding" de la lista Other seleccionar: UTF-8 y click en OK
	public static void dibujoTableroAjedrez() {
		
		// Cabecera
		System.out.println("""
				___________________________________________________________
				|                                                          |
				|                  TABLERO DE AJEDREZ                      |
				|__________________________________________________________|

				""");
		
		char negro = '\u2588';
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if (i % 2 != 0 && j % 2 != 0 || i % 2 == 0 && j % 2 == 0) {
					System.out.print("  ");
				} else {
					System.out.print(negro);
					System.out.print(negro);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int leerEntero(String mensaje, int min, int max) {
		int n = max + 1;
		while (n < min || n > max) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error.");
			}
			sc.nextLine();
		}
		return n;
	}

	public static int leerEntero(String mensaje, int min) {
		int n = min - 1;
		while (n < min) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error.");
			}
			sc.nextLine();
		}
		return n;
	}

}
