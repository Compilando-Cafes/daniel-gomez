package t4_funciones.ejercicios;

import java.util.Scanner;

public class ejercicioFechas {
	// 1) Escribe una función que reciba un número (int) y devuelva el nombre del
	// mes. Por ejemplo, si recibe un 3 debe devolver Marzo.
	public static String nombreMes(int n) {
		String mes = switch (n) {
		case 1 -> "Enero";
		case 2 -> "Febrero";
		case 3 -> "Marzo";
		case 4 -> "Abril";
		case 5 -> "Mayo";
		case 6 -> "Junio";
		case 7 -> "Julio";
		case 8 -> "Agosto";
		case 9 -> "Septiembre";
		case 10 -> "Octubre";
		case 11 -> "Noviembre";
		case 12 -> "Diciembre";
		default -> "Número no válido";
		};

		return mes;
	}

	/*
	 * 2) Función que recibe un día del mes, un mes y un año (int) y devuelva true o
	 * false indicando si la fecha es correcta o no. Debe considerarse el caso de
	 * año bisiesto. Año válido desde 1900 Hasta 2030.
	 */
	public static boolean fechaValida(int dia, int mes, int agno) {
		boolean resultado = false;

		if (agno >= 1900 && agno <= 2030) {
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 1, 3, 5, 7, 8, 10, 12 -> {
					if (dia >= 1 && dia <= 31)
						resultado = true;
				}
				case 4, 6, 9, 11 -> {
					if (dia >= 1 && dia <= 30)
						resultado = true;
				}
				case 2 -> {
					if (esBisiesto(agno) && dia >= 1 && dia <= 29)
						resultado = true;
					if (!esBisiesto(agno) && dia >= 1 && dia <= 28)
						resultado = true;
				}
				default -> resultado = false;
				}
			}
		}

		return resultado;
	}

	/*
	 * Un año es bisiesto si es:
	 * 
	 * Divisible por 4. No divisible por 100. Salvo si es divisible por 400. (2000 y
	 * 2400 son bisiestos pues aún siendo divisibles por 100 lo son también por 400.
	 * Pero los años 1800, 1900, 2100, 2200 y 2300 no lo son porque solo son
	 * divisibles por 100).
	 */
	// Hacer función para controlar si un año es bisiesto
	public static boolean esBisiesto(int n) {
		boolean resultado = false;
		if (n % 4 == 0) {
			if (n % 100 != 0 || n % 400 == 0) {
				resultado = true;
			}
		}
		return resultado;
	}

	/*
	 * 3) Escribe una función a la que le pasamos un mes y un año (de tipo int) y
	 * nos devuelva el número de días que tiene ese mes de tipo int. Año válido
	 * desde 1900 Hasta 2030. Considera los años bisiestos. En un año bisiesto el
	 * mes de Febrero tiene 29 días en lugar de 28. Si el año no es válido devuelve
	 * 0.
	 */

	public static int numeroDias(int mes, int agno) {
		int dias = 0;

		if (agno >= 1900 && agno <= 2030) {
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 1, 3, 5, 7, 8, 10, 12 -> {
					dias = 31;
				}
				case 4, 6, 9, 11 -> {
					dias = 30;
				}
				case 2 -> {
					if (esBisiesto(agno))
						dias = 29;
					else
						dias = 28;
				}
				default -> dias = 0;
				}
			}
		}
		return dias;
	}

	public static void main(String[] args) {
		// 4) Escribe la función main() que haga uso de las funciones anteriores.
		Scanner sc = new Scanner(System.in);

		System.out.println("========================================================");
		// Primera función
		int n;

		System.out.print("Introduce el número de un mes: ");
		n = sc.nextInt();
		sc.nextLine();
		System.out.println("El mes número " + n + " es: " + nombreMes(n));

		System.out.println("========================================================");
		// Segunda función
		int dia, mes, agno;

		System.out.print("Dime un día: ");
		dia = sc.nextInt();
		sc.nextLine();

		System.out.print("Dime un mes: ");
		mes = sc.nextInt();
		sc.nextLine();

		System.out.print("Dime un año entre 1900 y 2030: ");
		agno = sc.nextInt();
		sc.nextLine();

		System.out.println("¿Es correcta la fecha? " + fechaValida(dia, mes, agno));

		System.out.println("========================================================");
		// Tercera función
		int mes2, agno2;

		System.out.print("Dime un mes: ");
		mes2 = sc.nextInt();
		sc.nextLine();

		System.out.print("Dime un año entre 1900 y 2030: ");
		agno2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Número de días que tiene ese mes: " + numeroDias(mes2, agno2));
		System.out.println("========================================================");

		sc.close();
	}

}
