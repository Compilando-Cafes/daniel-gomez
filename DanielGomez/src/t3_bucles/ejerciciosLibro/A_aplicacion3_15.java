package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_aplicacion3_15 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Triángulo de Pascal para n filas.
		int n;

		System.out.print("Filas del triángulo de Pascal: ");
		n = sc.nextInt();
		sc.nextLine();

		// Filas
		for (int i = 0; i < n; i++) {
			
			// Columnas
			for (int j = 0; j <= i; j++) {
				
				// Variables que inician los factoriales
				int factorialN = 1, factorialM = 1, factorialNM = 1;
				
				// Cálculo factorial relacionado con la fila
				for (int k = 1; k <= i; k++) {
					factorialN *= k;
				}
				
				// Cálculo factorial relacionado con la posición
				for (int l = 1; l <= j; l++) {
					factorialM *= l;
				}
				
				// Cálculo factorial de la resta
				for (int m = 1; m <= (i-j); m++) {
					factorialNM *= m;
				}
				
				// Cálculo del número definitivo
				int numero = (factorialN) / (factorialM * factorialNM);
				
				System.out.print(numero + " ");
			}
			
			// Salto de línea
			System.out.println();
		}

	}

}
