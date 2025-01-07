package t2_condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioDiasMeses {

	public static void main(String[] args) {
		// Leer un nombre de mes de teclado y Mostrar el número de días que
		// tiene. Si el mes es Febrero suponer que tiene 28 dias.
		// 31: 1,3,5,7,8,10,12
		// 30: 4,6,9,11
		// 29: 2

		Scanner sc = new Scanner(System.in);
		String mes;
		int dias;

		System.out.print("Nombre del mes: ");
		mes = sc.next();

		switch (mes) {
		case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre":
			dias = 31;
			break;
		case "Febrero":
			dias = 29;
			break;
		case "Abril", "Junio", "Septiembre", "Noviembre":
			dias = 30;
		default:
			dias = 0;
		}

		switch (mes) {
		case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre" -> {
			dias = 31;
		}
		case "Febrero" -> {
			dias = 29;
		}
		case "Abril", "Junio", "Septiembre", "Noviembre" -> {
			dias = 30;
		}
		default -> {
			dias = 0;
		}
		}

		System.out.println(mes + " tiene " + dias + " días.");
		sc.close();
	}

}
