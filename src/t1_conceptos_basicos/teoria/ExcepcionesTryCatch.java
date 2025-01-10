package t1_conceptos_basicos.teoria;

/*
 * USAMOS LA CLASE Scanner PARA LEER DATOS POR TECLADO
 * CONTROLAMOS EXCEPCIONES EN LAS ENTRADAS NUMÉRICAS
 */

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExcepcionesTryCatch {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);

		// LECTURA DE UNA CADENA DE CARACTERES
		System.out.print("Introduce una cadena: ");
		String cadena = teclado.nextLine();

		// LECTURA DE UN NÚMERO ENTERO
		int n = 0;
		try {

			System.out.print("Introduce un entero: ");
			n = teclado.nextInt();
			teclado.nextLine(); //Es importante mencionar que al utilizar el método nextInt() se consume el
					    //caracter de salto de línea, por lo cual es recomendable utilizar el método nextLine()
					   //inmediatamente después para consumirlo y evitar problemas con la lectura de los siguientes campos

		} catch (InputMismatchException ex) {
			System.out.println("\tNO ES UN VALOR ENTERO VÁLIDO");
			teclado.nextLine();
		}

		// LECTURA DE UN DECIMAL Double (poner decimal en español, con la coma)
		double d = 0;
		try {			
			System.out.print("Introduce un decimal (usando punto): ");
			d = teclado.nextDouble();
			teclado.nextLine();
			
		} catch (InputMismatchException ex) {
			System.out.println("\tNO ES UN VALOR DECIMAL VÁLIDO");
			teclado.nextLine();
		}

		// lectura de un carácter
		System.out.print("Introduce un CARACTER: ");
		char c = teclado.nextLine().charAt(0);

		// SE MUESTRAN LOS DATOS
		System.out.println("\tCadena introducida: " + cadena);
		System.out.println("\tEntero introducida: " + n);
		System.out.println("\tDecimal introducido: " + d);
		System.out.println("\tCaracter leido:" + c);

		teclado.close();

	}// FIN del método main

}// FIN DE LA CLASE

