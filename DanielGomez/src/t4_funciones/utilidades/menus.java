package t4_funciones.utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menus {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("""
					=============================================
					MENÚ
					Elige:
					1. ----
					2. ----
					3. ----
					4. Salir
					=============================================
					""");
			int eleccion = pedirNumero("Elige de 1 a 3: ", 1, 4);

			switch (eleccion) {
			case 1 -> System.out.println("Lo que haga el 1");
			case 2 -> System.out.println("Lo que haga el 2");
			case 3 -> System.out.println("Lo que haga el 3");
			case 4 -> {
				System.out.println("Adios.");
				return;
			}
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
	
	public static int pedirNumero(String mensaje, int minimo) {
		while (true) {
			System.out.print(mensaje);
			try {
				int numero = sc.nextInt();
				if (numero >= minimo) {
					sc.nextLine();
					return numero;
				}
				System.out.println("Introduce un número mayor que " + (minimo) +". ");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}

}
