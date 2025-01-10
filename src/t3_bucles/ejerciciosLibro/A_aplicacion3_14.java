package t3_bucles.ejerciciosLibro;
import java.util.Scanner;
public class A_aplicacion3_14 {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Número de números primos entre uno y n
		int n, contador = 0; 
		
		System.out.print("Dime un número: ");
		n = sc.nextInt();
		sc.nextLine();
		
		// Bucle para cada número entre uno y n
		for (int i = 1; i<=n; i++) {
			// Variable que controla si solo tiene dos divisores y no más
			int control = 0;
			
			// Cada número debe ser fraccionado a su vez
			for (int j = 1; j<=i; j++) {
				// Control de restos
				if (i%j == 0) {
					// Cada vez que es positivo se suma uno a control
					control++;
				}
			}
			
			// Si control ha encontrado solo dos divisores correctos es primo
			if (control == 2) {
				contador++;
			}
		}
		
		System.out.println("Número de primos de 1 a " + n + ": " + contador);
	}
}
