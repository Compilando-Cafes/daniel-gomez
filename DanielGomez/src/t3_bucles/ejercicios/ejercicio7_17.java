package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_17 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 1;

		do {

			System.out.print("Introduce un número en binario: ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir el número.");
			}
			sc.nextLine();

			// Conversión de binario a decimal.
			// Divisiones entre 10
			// Restos multiplicarlos por 2 elevado a cero, 2 elevado a 1...

			// Variable que controla el resultado y se resetea cada vez que vuelve a entrar
			int decimal = 0, elevado = 0;
			
			for (int i = n; i > 0; i /= 10) {
				
				decimal += (int) ((i%10) * (Math.pow(2, elevado)));
				elevado++;
			}
			
			System.out.println("El binario " + n + " en decimal es: " + decimal);

		} while (n != 0);

	}

}
