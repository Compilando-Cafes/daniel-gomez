package t3_bucles.ejercicios;

import java.util.Scanner;

public class efercicioMultiplicarNumeros {

	public static void main(String[] args) {
		// MOSTRAR EL PRODUCTO DE LOS NÚMEROS DEL 1 AL N (N SE LEE DE TECLADO)
		int numero, c = 1, resultado = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		numero = sc.nextInt();
		sc.nextLine();

		while (c <= numero) {
			resultado *= c;
			c++;
		}
		System.out.println(resultado);
		sc.close();
	}

}
