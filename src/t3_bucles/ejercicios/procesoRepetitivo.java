package t3_bucles.ejercicios;

import java.util.Scanner;

public class procesoRepetitivo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Proceso repetitivo en el que se leen números de teclado. El proceso
		 * repetitivo finaliza cuando el número leído es 0. Antes de entrar en el
		 * proceso repetitivo leemos un número. Por cada número leído (DISTINTO DE 0) se
		 * pide: o Visualizar su cuadrado y su cubo. o Sumarlos a una variable
		 * acumulador que tendrás que inicializar a 0. o Contar los números leidos, usa
		 * un contador que también tendrás que inicializar a 0. o Después de realizar
		 * esas operaciones se vuelve a leer por teclado el número y serepite el
		 * proceso. Al finalizar el proceso repetitivo se debe visualizar el número de
		 * números introducidos por teclado distintos de 0 y la suma de los números.
		 */

		int N, SUMA, CUENTA, CUAD, CUBO;
		SUMA = 0;
		CUENTA = 0;

		System.out.println("Finaliza con un cero");
		System.out.print("Dame un número: ");
		N = sc.nextInt();
		sc.nextLine();

		while (N != 0) {
			CUENTA = CUENTA + 1;
			SUMA = SUMA + N;
			CUAD = N * N;
			CUBO = CUAD * N;
			System.out.println("\tCuadrado: " + CUAD + " Cubo: " + CUBO);
			System.out.print("Dame un número: ");
			N = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("SUMA: " + SUMA + ", NUMEROS DISTINTOS 0: " + CUENTA);

	}

}
