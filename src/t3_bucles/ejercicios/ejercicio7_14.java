package t3_bucles.ejercicios;

import java.util.Scanner;

public class ejercicio7_14 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 1, letras;

		// Control de acceso al programa
		// Número mayor que 0
		while (n > 0) {

			// Petición de número
			System.out.print("Introduce un número de términos a mostrar: ");
			n = sc.nextInt();
			sc.nextLine();

			// Petición de máximo de letras
			System.out.print("Introduce el número máximo de letras: ");
			letras = sc.nextInt();
			sc.nextLine();

			int control = 1, numero = 0;

			// Control para cada linea
			for (int i = 1; control <= n; i++) {
				
				// Reseteo e inicio de las letras para que empiece siempre por a
				char letra = 97;
				
				// Imprime linea a linea
				for (int j = 1; j <= i; j++) {
					
					if (i%(letras+1)== 0) {
						letra = 97;
						i = 1;
						numero++;
					}
					System.out.print(letra);
					letra++;
				}
				
				System.out.print(numero == 0? "  " : numero + "  ");
				control++;
				
			}

			System.out.println();
			System.out.println();
		}

	}

}
