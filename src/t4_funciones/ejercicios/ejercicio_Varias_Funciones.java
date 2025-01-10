package t4_funciones.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio_Varias_Funciones {

	public static void main(String[] args) {

		// Llamada a función uno
		System.out.println("El producto de los dos números es: " + producto(3, 2));

		// Llamada a función dos
		mostrarProducto(3, 2);

		// Llamada a función tres
		int num = 3;
		System.out.println("¿El número era correcto? " + entre1Y12((short)num));

		// Llamada a función cuatro
		System.out.println(diaSemana((short)4));
		
		// Llamada a función cinco
		System.out.println("Correcto. El " + rangoNumeros("Dame un número entre ", 10, 2) + " está entre esos dos números.");
		System.out.println(rangoNumeros("Dime un número", 100, 1)  );
		System.out.println(rangoNumeros("Dime el número", 50, 25)  );
		
		}

	// Realiza una función que reciba dos números y devuelva el producto.
	public static double producto(double n1, double n2) {
		return n1 * n2;
	}

	// Realiza una función que reciba dos números y muestre en pantalla el producto.
	public static void mostrarProducto(double n1, double n2) {
		System.out.println("El producto de " + n1 + " * " + n2 + " es: " + (n1 * n2));
	}

	// Realiza una función que reciba una variable short y devuelva true si la
	// variable está comprendida entre entre 1 y 12; y false si no lo está.
	public static boolean entre1Y12(short n) {
		return (n >= 1 && n <= 12);
	}

	// Realiza una función que reciba una variable short y devuelva el nombre del
	// díade la semana: “Lunes” si la variable vale 1, “Martes” si la variable vale
	// 2,“Miércoles” si la variable vale 3, y asi hasta 7. Si el día no está
	// comprendido entre 1 y 7 debe devolver “INCORRECTO”.
	public static String diaSemana(short n) {
		String dia = switch (n) {
		case 1 -> "Lunes";
		case 2 -> "Martes";
		case 3 -> "Miércoles";
		case 4 -> "Jueves";
		case 5 -> "Viernes";
		case 6 -> "Sábado";
		case 7 -> "Domingo";
		default -> "Número no válido.";
		};
		return dia;
	}

	/*
	 * Realiza una función que lea un número por teclado en un rango de valores. La
	 * función recibirá un String , similar a la función LeerNumero(String m) del
	 * ejemplo anterior, y los valores máximo y mínimo que debe tener el entero (de
	 * tipo int). La función devolverá el valor entero (tipo int) que se debe
	 * ajustar al rango. Dentro de la función si el número leído no está en el rango
	 * se debe leer de nuevo.
	 */
	public static int rangoNumeros(String s, int maximo, int minimo) {
		int n = maximo + 1;
		Scanner sc = new Scanner(System.in);

		while (n < minimo || n > maximo) {
			System.out.print(s + maximo + " y " + minimo + ": ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error");
			}
			sc.nextLine();
		}
		sc.close();
		return n;
		
	}

}
