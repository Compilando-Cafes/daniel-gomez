package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables generales y que se usan al final
		int numeroAlumnos = 0;
		String resultados = "";
		String nombreAlumnoNotaMediaMaxima = "", nombreAlumnoNotaMediaMinima = "";
		double notaMediaTotalMaxima = Double.MIN_NORMAL, notaMediaTotalMinima = Double.MAX_VALUE;

		// Bucle que controla la petición de número de alumnos
		while (numeroAlumnos <= 0) {

			// Introducción número de alumnos
			System.out.print("NÚMERO DE ALUMNOS A LEER: ");
			try {
				numeroAlumnos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce una cantidad correcta.");
			}
			sc.nextLine();
		}

		// Variables alumnos
		String nombreAlumno = "", nombreAsignatura = "";

		// Bucle para ir iterando por los alumnos
		for (int i = 1; i <= numeroAlumnos; i++) {
			int sumaNotas = 0;
			double notaMedia = 0;
			int numeroAsignaturas = 0;
			int notaMaximaCadaAlumno = Integer.MIN_VALUE;
			String nombreNotaMasAlta = "";

			System.out.println("ENTRADA DE DATOS PARA ALUMNO " + i + ":");

			// Nombre alumno
			System.out.print("\tNombre de alumno: ");
			nombreAlumno = sc.nextLine();

			// Número de asignaturas que tiene (entre 1 y 6, si no se cumple se lee de
			// nuevo)
			while (numeroAsignaturas < 1 || numeroAsignaturas > 6) {
				System.out.print("\tNúmero de asignaturas (entre 1 y 6): ");
				try {
					numeroAsignaturas = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Introduce una cantidad correcta.");
				}
				sc.nextLine();
			}

			for (int j = 1; j <= numeroAsignaturas; j++) {
				int notaAsignatura = 0;

				// Leer el nombre de la asignatura
				System.out.print("\t\tNombre de asignatura: ");
				nombreAsignatura = sc.nextLine();

				// Nota de la asignatura (entre 1 y 10, si no se cumple se lee de nuevo)
				while (notaAsignatura < 1 || notaAsignatura > 10) {
					System.out.print("\t\tNota (entre 1 y 10): ");
					try {
						notaAsignatura = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Introduce una cantidad correcta.");
					}
					sc.nextLine();
				}

				// Cálculo nota más alta de las introducidas
				if (notaMaximaCadaAlumno < notaAsignatura) {
					notaMaximaCadaAlumno = notaAsignatura;
					nombreNotaMasAlta = nombreAsignatura;
				}

				System.out.println("\t\t--");
				sumaNotas += notaAsignatura;

			}

			// Cálculo nota media
			notaMedia = (double) sumaNotas / numeroAsignaturas;

			// Resultados individuales de cada alumno

			// Nota media
			System.out.printf("\tNota media: %,.2f%n", notaMedia);

			// Asignatura con más nota
			System.out.println("\tAsignatura con más nota: " + nombreNotaMasAlta);
			System.out.println("========================================================");

			// Cálculo notas máximas y mínimas finales
			if (notaMedia > notaMediaTotalMaxima) {
				notaMediaTotalMaxima = notaMedia;
				nombreAlumnoNotaMediaMaxima = nombreAlumno;
			}

			if (notaMedia < notaMediaTotalMinima) {
				notaMediaTotalMinima = notaMedia;
				nombreAlumnoNotaMediaMinima = nombreAlumno;
			}

			// String que mostrará los resultados finales
			resultados += String.format("%-14s%-14d%-14s%n", nombreAlumno, numeroAsignaturas, nombreNotaMasAlta);

		}

		// Resultados finales
		System.out.print("""
				NOMBRE      Nº ASIG        ASIG MAS NOTA
				=========== ============== =============
				""");
		System.out.print(resultados);
		System.out.println("========================================================");
		System.out.println("Alumno con > nota media: " + nombreAlumnoNotaMediaMaxima);
		System.out.printf("\tNota media: %,.2f%n", notaMediaTotalMaxima);
		System.out.println("Alumno con < nota media: " + nombreAlumnoNotaMediaMinima);
		System.out.printf("\tNota media: %,.2f%n", notaMediaTotalMinima);

	}
}
