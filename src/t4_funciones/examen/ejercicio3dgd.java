package t4_funciones.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3dgd {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Daniel Gómez Delgado");
		alumnos();
	}

	public static void alumnos() {
		System.out.println("==========================================");
		System.out.println("ENTRADA DE DATOS DE ASIGNATURAS");
		int codigoAsignatura = pedirNumero("COD ASIGNATURA: ", 1);

		System.out.print("NOMBRE ASIGNATURA: ");
		String nombreAsignatura = sc.nextLine();
		int numeroAlumnos = pedirNumero("Número de alumnos: ", 0);

		System.out.println("\t===========================================");
		System.out.println("\tENTRADA DE DATOS DE NOTAS:");

		int notaTemaUno = 0;
		int notaTemaDos = 0;
		int notaTemaTres = 0;
		int notaTemaCuatro = 0;
		String nombreAlumnoMax = "";
		double notaMaxima = Integer.MIN_VALUE;
		double totalNotasMedia = 0;
		for (int i = 1; i <= numeroAlumnos; i++) {
			System.out.println("\tAlumno: " + i);
			System.out.print("\tNOMBRE ALUMNO: ");
			String nombreAlumno = sc.nextLine();

			notaTemaUno = pedirNumero("\tNota Tema 1 (25%) (1 y 10): ", 1, 10);
			notaTemaDos = pedirNumero("\tNota Tema 2 (35%) (1 y 10): ", 1, 10);
			notaTemaTres = pedirNumero("\tNota Tema 3 (16%) (1 y 10): ", 1, 10);
			notaTemaCuatro = pedirNumero("\tNota Tema 4 (24%) (1 y 10): ", 1, 10);

			// Nota total
			double notaTotal = ((notaTemaUno * 0.25) + (notaTemaDos * 0.35) + (notaTemaTres * 0.16)
					+ (notaTemaCuatro * 0.24));

			System.out.printf("\t\tNota Total:\t%,.2f%n", notaTotal);
			System.out.println();

			if (notaTotal > notaMaxima) {
				notaMaxima = notaTotal;
				nombreAlumnoMax = nombreAlumno;
			}

			totalNotasMedia += notaTotal;
		}

		totalNotasMedia /= numeroAlumnos;
		System.out.println("\t===========================================");
		System.out.printf("\tNota media en la asignatura: %,.2f%n", totalNotasMedia);
		System.out.printf("\tAlumno con más Nota Total : %s, Nota: %,.2f%n", nombreAlumnoMax, notaMaxima);
		System.out.println("\t===========================================");
		
		System.out.println("==========================================");
		System.out.println("ENTRADA DE DATOS DE ASIGNATURAS");
		System.out.println("COD ASIGNATURA: " + codigoAsignatura);
		System.out.println("==========================================");
		System.out.println("Asignatura con más alumnos: (" + codigoAsignatura + ", " + nombreAsignatura + "), Nº alumnos: " + numeroAlumnos);
		System.out.println("Nº de asignaturas leidas por teclado: " + numeroAlumnos);
		System.out.printf("Nota Media Total\t\t: %,.2f", totalNotasMedia);
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
				System.out.println("Introduce un número mayor que " + (minimo) + ". ");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}

}
