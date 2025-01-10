package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta3_02 {

	public static void main(String[] args) {

		// Salir cuando sea negativo
		// Mostrar suma, media, número de alumnos y cuantos son mayores de edad
		short n = 0;
		int suma = 0, contador = 0, mayoresEdad = 0;
		double media = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce las edades de alumnos que quieras y cuando termines escribe un negativo: ");
		n = sc.nextShort();

		while (n >= 0) {
			suma += n;
			contador++;
			media = (double) suma / contador;
			if (n >= 18) {
				mayoresEdad += n;
			}

			System.out.print("Introduce las edades de alumnos que quieras y cuando termines escribe un negativo: ");
			n = sc.nextShort();

		}

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Número de alumnos: " + contador);
		System.out.println("Mayores de edad: " + mayoresEdad);

		sc.close();

	}

}
