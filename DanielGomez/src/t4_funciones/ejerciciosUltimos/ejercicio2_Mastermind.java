package t4_funciones.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2_Mastermind {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Se define una combinación numerica de 4 cifras en la llamada a la función.
		// mastermind(0, 9, 3, 0);
		mastermind(0, 9, 3, 6);
	}

	// Función Mastermind
	// Debe controlar que no se repita ninguna de las cifras y errores.
	// Jugador tiene 10 intentos. Se debe controlar que lo que introduce el jugador
	// está entre 0 y 9 y es correcto. Con una función aparte. Si uno repetido no se
	// sale, muestra un mensaje y vuelve a leer.
	// Después comprobar aciertos y coincidencias.
	public static void mastermind(int objetivo1, int objetivo2, int objetivo3, int objetivo4) {

		// Controlar que los números introducidos no se repiten o son correctos
		if (objetivo1 == objetivo2 || objetivo1 == objetivo3 || objetivo1 == objetivo4 || objetivo2 == objetivo3
				|| objetivo2 == objetivo4 || objetivo3 == objetivo4) {
			System.out.println("Los números introducidos no deben estar repetidos.");
			return;
		}

		// Control de 10 intentos:
		int contador = 1;

		while (contador <= 10) {
			int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
			int aciertos = 0, coincidencias = 0;
			String numIntroducidos = "[";

			System.out.println("Intento: " + contador);

			n1 = numeroMaximoMinimo("\tIntroduce un número (0 y 9) 1: ", 0, 9);
			n2 = numeroMaximoMinimo("\tIntroduce un número (0 y 9) 2: ", 0, 9);
			n3 = numeroMaximoMinimo("\tIntroduce un número (0 y 9) 3: ", 0, 9);
			n4 = numeroMaximoMinimo("\tIntroduce un número (0 y 9) 4: ", 0, 9);

			numIntroducidos = numIntroducidos + n1 + ", " + n2 + ", " + n3 + ", " + n4 + "]";

			if (n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3 == n4) {
				System.out.println("\tHay Números repetidos: " + numIntroducidos + " leerlos de nuevo");
			} else {

				// Aciertos
				if (n1 == objetivo1)
					aciertos++;
				if (n2 == objetivo2)
					aciertos++;
				if (n3 == objetivo3)
					aciertos++;
				if (n4 == objetivo4)
					aciertos++;

				// Coincidencias
				if (n1 == objetivo2 || n1 == objetivo3 || n1 == objetivo4)
					coincidencias++;
				if (n2 == objetivo1 || n2 == objetivo3 || n2 == objetivo4)
					coincidencias++;
				if (n3 == objetivo1 || n3 == objetivo1 || n3 == objetivo4)
					coincidencias++;
				if (n4 == objetivo1 || n4 == objetivo2 || n4 == objetivo3)
					coincidencias++;

				// Mostrar números introducidos, aciertos y coincidencias
				System.out.println("\tNúmeros introducidos: " + numIntroducidos);
				System.out.println("\tAciertos: " + aciertos);
				System.out.println("\tCoincidencias: " + coincidencias);
			}

			// Verificar aciertos (coincide número con posición)
			if (aciertos == 4) {
				System.out.println("<<ENHORABUENA, HAS ACERTADO LA COMBINACIÓN EN " + contador + " INTENTOS>>");
				return;
			}

			contador++;
		}
		System.out.println("Has perdido... La conbinación ganadora era: " + objetivo1 + objetivo2 + objetivo3 + objetivo4);

	}

	// Función control números
	public static int numeroMaximoMinimo(String mensaje, int min, int max) {
		int n;

		while (true) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
				if (n>=min && n<=max)
					return n;
				System.out.println("\tEl número debe estar entre " + min + " y " + max + ".");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}

}
