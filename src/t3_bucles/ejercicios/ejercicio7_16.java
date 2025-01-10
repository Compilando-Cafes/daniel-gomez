package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_16 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 1;

		do {
			System.out.print("Introduce un número: ");
			
			// Control de errores.
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir el número.");
			}
			sc.nextLine();

			// Cambio del número a positivo si es negativo
			if (n < 0) {
				n = -n;
			}
			
			// Iniciar variable que se resetea cada vez que vuelva a empezar el programa
			String binario = "";
			
			// Cambio del número a binario
			// Se trata de ir dividiento entre 2 y quedarse el resto
			for (int i = n; i>0 ; i/=2) {
				binario = (i % 2) + binario;
			}
			
			System.out.println("El " + n + " en binario es igual a: " + binario);
			
		} while (n != 0);

	}

}
