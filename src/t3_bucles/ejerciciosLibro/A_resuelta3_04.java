package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta3_04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int altura, contador = 0, contadorMasAlto = 0, masAlto = 0;

		do {
			contador++;

			System.out.print("Altura del árbol número " + contador + " en cm (-1 para salir): ");
			altura = sc.nextInt();
			sc.nextLine();

			if (masAlto < altura) {
				masAlto = altura;
				contadorMasAlto = contador;
			}

		} while (altura != -1);
		System.out.println("Árbol más alto: nº " + contadorMasAlto + " con " + masAlto + " cm.");

	}

}
