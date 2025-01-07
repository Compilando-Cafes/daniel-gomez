package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class examenPrueba3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		calculoSalarios();
	}

	public static void calculoSalarios() {
		int horas = 0, tarifaHora = 0, horasExtras = 0;
		String nombre;
		double salarioTotal;
		
		// Nombre
		System.out.print("Introduce el nombre del empleado: ");
		nombre = sc.nextLine();

		// Horas
		horas = pedirNumero("Introduce las horas trabajadas: ", 1);

		// Tarifa por hora
		tarifaHora = pedirNumero("Introduce la tarifa por hora: ", 1);

		System.out.println();

		// Cálculos finales
		if (horas > 40) {
			horasExtras = horas - 40;
		}

		System.out.println("Cálculo del salario: ");
		System.out.println("Empleado: " + nombre);
		if (horas <= 40) {
			System.out.println("Horas regulares: " + horas);
		} else {
			System.out.println("Horas regulares: 40");
		}
		
		System.out.println("Horas extras: " + horasExtras);
		
		if (horasExtras == 0) {
			salarioTotal = (double)horas * tarifaHora;
		} else {
			salarioTotal = (double)(40 * tarifaHora) + (horasExtras * (tarifaHora * 1.5)); 
		}
		System.out.printf("Salario total: %,.2f", salarioTotal);

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
				System.out.print("Introduce un número entre " + minimo + " y " + maximo + ". ");
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
				System.out.print("Introduce un número mayor que " + (minimo - 1) + ". ");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}
}
