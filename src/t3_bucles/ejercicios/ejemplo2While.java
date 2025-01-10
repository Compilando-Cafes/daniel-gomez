package t3_bucles.ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemplo2While {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Proceso repetitivo donde se leerá un número de teclado, el proceso finalizará
		 * cuando el número esté entre 1 y 7. Igual que antes, este tipo de bucle se
		 * puede usar para validar la entrada por teclado de un número que esté en un
		 * rango, en este caso entre 1 y 7.
		 */
		
		int n = 0;

		while (n <= 1 || n >= 7) {
			System.out.print("Dame un número: ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				n = 0;
			}
			sc.nextLine();
		}
		System.out.println("Valor de n: " + n);
		System.out.println("Fin");
		
	}

}
