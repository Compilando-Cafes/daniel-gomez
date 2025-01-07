package t4_funciones.ejerciciosLibro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta04_03_Area_Volumen_Cilindro {

	public static void main(String[] args) {
		// Función que calcule y muestre el área o el volumen de un cilindro, según se
		// especifique. Para distinguir un caso de otro se le pasará como opción un
		// número: 1 (para el área) o 2 (para el volumen). Además, radio de la base y la
		// altura
		Scanner sc = new Scanner(System.in);
		int n = 1;
		double radio = 0, altura = 0;

		while (n > 0) {
			System.out.print("Elige área (1) o volumen (2) (0 para salir): ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduce un número correcto.");
			}
			sc.nextLine();

			if (n > 0) {
				System.out.print("Radio base: ");
				try {
					radio = sc.nextDouble();
				} catch (InputMismatchException e) {
					System.out.println("Error. Introduce un número correcto.");
				}
				System.out.print("Altura: ");
				try {
					altura = sc.nextDouble();
				} catch (InputMismatchException e) {
					System.out.println("Error. Introduce un número correcto.");
				}

				System.out.println(volarea(n, radio, altura));
			}
		}
		sc.close();
		System.out.println("Adios.");
	}

	// Función con dos parámetros
	public static double volarea(int eleccion, double radio, double altura) {
		if (eleccion == 1) {
			return (2 * Math.PI * radio * (altura + radio));
		}

		else if (eleccion == 2) {
			return (Math.PI * Math.pow(radio, 2) * altura);
		} else {
			return 0;
		}

	}

}
