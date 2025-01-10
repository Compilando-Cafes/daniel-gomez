package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		digitoEnNumero();
	}

	static public void digitoEnNumero() {
		while (true) {

			int posiciones = 0, contador = 0;
			String numerosPosiciones = "";

			// Pedir número
			long numero = pedirLong("Introduzca un número: ", 0);
			if (numero == 0) {
				System.out.println("Adios.");
				return;
			}
			
			long numeroAlReves = invertirNumero(numero);
			
			// Pedir cifra
			short digito = pedirShort("Introduzca el dígito a buscar (0 a 9): ", 0, 9);

			// For para ir buscando y guadando resultados
			for (long i = numeroAlReves; i > 0; i /= 10) {
				posiciones++;
				if (i % 10 == digito) {
					contador++;
					if (contador == 1)
						numerosPosiciones = numerosPosiciones + posiciones;
					else
						numerosPosiciones = numerosPosiciones + ", " + posiciones;
				}
			}

			// Mostrar resultados
			System.out.println("Posiciones en las que se encuentra el dígito " + digito + ", en el número " + numero);
			if (contador == 0) {
				System.out.println("NO SE ENCUENTRA EL DÍGITO " + digito);
			} else {
				System.out.println(
						posiciones == 1 ? "\tPosicion: " + numerosPosiciones : "\tPosiciones: " + numerosPosiciones);
			}
			System.out.println("===============================================");
		}
	}

	static public double numeroCifras(long numero) {
		double contador = 0;
		for (long i = numero; i > 0; i /= 10) {
			contador++;
		}
		return contador;
	}

	static public long pedirLong(String mensaje, int minimo) {
		long numero;
		while (true) {
			System.out.print(mensaje);
			try {
				numero = sc.nextLong();
				if (numero >= minimo) {
					return numero;
				}
				System.out.println("Introduce un número mayor que " + minimo + ".");
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número correcto.");
			}
			sc.nextLine();
		}
	}

	static public short pedirShort(String mensaje, int minimo, int maximo) {
		short numero;
		while (true) {
			System.out.print(mensaje);
			try {
				numero = sc.nextShort();
				// Comprobación
				if (numero >= minimo && numero <= maximo) {
					return numero;
				}
				System.out.println("Introduce un número mayor que " + minimo + " y menor de " + maximo + ".");
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número correcto.");
			}
			sc.nextLine();
		}
	}

	public static long invertirNumero(long numero) {
		long numeroInvertido = 0;
		while (numero != 0) {
			long digito = numero % 10;
			numeroInvertido = numeroInvertido * 10 + digito;
			numero /= 10;
		}
		return numeroInvertido;
	}

}