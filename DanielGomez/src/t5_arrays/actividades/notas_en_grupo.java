package t5_arrays.actividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class notas_en_grupo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Debes desarrollar una aplicación que ayude a gestionar las notas de un centro
		 * educativo. Los alumnos se organizan en grupos compuestos por 5 personas. Leer
		 * las notas (números enteros) del primer, segundo y tercer trimestre de un
		 * grupo. Debes mostrar al final la nota media del grupo en cada trimestre y la
		 * media del alumno que se encuentra en una posición dada (que el usuario
		 * introduce por teclado)
		 */
		gestionNotas();

	}

	public static void gestionNotas() {
		System.out.println("""
				=============================================
				GESTIÓN DE NOTAS
				Introduce las notas de los 5 alumnos
				para cada uno de los tres trimestres
				=============================================
				""");

		// Crear una tabla de dos dimensiones: 5 alumnos y 3 trimestres
		int notasAlumnos[][] = new int[5][3];

		// Leer las notas
		for (int i = 0; i < notasAlumnos.length; i++) {
			System.out.println("Alumno número: " + (i + 1));
			for (int j = 0; j < notasAlumnos[i].length; j++) {
				System.out.print(j == 0 ? "\tPrimer " : j == 1 ? "\tSegundo " : "\tTercer ");
				System.out.println("trimestre.");
				notasAlumnos[i][j] = pedirNumero("\tNota (0 a 10): ", 0, 10);
			}
			System.out.println();
		}

		// Mostrar la nota media del grupo en cada trimestre
		System.out.println();
		System.out.println("NOTAS MEDIAS POR TRIMESTRE");
		for (int i = 0; i < notasAlumnos[0].length; i++) {
			double mediaTrimestre = 0.0;
			for (int j = 0; j < notasAlumnos.length; j++) {
				mediaTrimestre += notasAlumnos[j][i];
			}
			System.out.print(i == 0 ? "Primer " : i == 1 ? "Segundo " : "Tercer ");
			System.out.println("trimestre: " + (mediaTrimestre / notasAlumnos.length));
		}

		// Mostrar media del alumno que está en una posición dada
		System.out.println();
		System.out.println("NOTA MEDIA DE UN ALUMNO");
		int alumno = pedirNumero("\tDime de que alumno quieres saber su nota media (1, 2, 3, 4 o 5): ", 1, 5);
		alumno -= 1;
		double mediaAlumno = 0.0;
		for (int i = 0; i < notasAlumnos[i].length; i++) {
			mediaAlumno += notasAlumnos[alumno][i];
		}
		System.out.println("\tLa nota media del alumno número " + (alumno + 1) + " es: " + mediaAlumno/notasAlumnos[0].length);

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
				System.out.print("Introduce un número correcto. ");
			}
			sc.nextLine();
		}
	}
}
