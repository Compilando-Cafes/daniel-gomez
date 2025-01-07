package t3_bucles.ejercicios;

import java.util.Scanner;

public class ejercicio7_13 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 1;
		

		// Control de acceso al programa
		// Número mayor que 0
		while (n > 0) {
			n=1;
			System.out.print("Introduce un número de términos a mostrar: ");
			n = sc.nextInt();
			sc.nextLine();
			int control = 1, numero = 0;

			// Control para cada linea
			for (int i = 1; control <= n; i++) {
				
				// Reseteo e inicio de las letras para que empiece siempre por a
				char letra = 97;
				
				// Imprime linea a linea
				for (int j = 1; j <= i; j++) {
					if (i%6== 0) {
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
