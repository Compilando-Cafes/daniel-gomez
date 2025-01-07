package t4_funciones.figuras;

public class triangulos {

	public static void main(String[] args) {
		int altura = 5;

		// Primer triángulo
		System.out.println("Triángulo 1:");
		for (int i = 1; i <= altura; i++) {

			for (int j = i; j <= altura; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		// Segundo triángulo
		System.out.println("Triángulo 1 hueco:");
		for (int i = 1; i <= altura; i++) {
			for (int j = i; j <= altura; j++) {
				if (i == 1 || i == altura || j == i || j == altura) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("Triángulo 2:");
		// Tercer triángulo
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		// Cuarto triángulo
		System.out.println("Triángulo 2 hueco:");
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == altura || j == i || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		// Quinto triángulo
		System.out.println("Triángulo 3:");
		for (int i = 1; i <= altura; i++) {

			for (int j = i; j < altura; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		// Sexto triángulo
		System.out.println("Triángulo 3 hueco:");
		for (int i = 1; i <= altura; i++) {

			for (int j = i; j < altura; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				if (i == altura || j == i || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		// Séptimo triángulo
		System.out.println("Triángulo 4:");
		for (int i = 1; i <= altura; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= altura; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		// Octavo triángulo
		System.out.println("Triángulo 4 hueco:");

		for (int i = 1; i <= altura; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= altura; j++) {
				if (i == 1 || i == altura || j == i || j == altura) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		// Noveno triángulo
		System.out.println("Triángulo 5:");
		int impar = 1;
		for (int i = 1; i <= altura; i++) {

			for (int j = i; j < altura; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= impar; j++) {
				System.out.print("* ");
			}
			impar += 2;
			System.out.println();
		}

		System.out.println();
		// Décimo triángulo
		System.out.println("Triángulo 5 hueco:");
		int impar2 = 1;
		for (int i = 1; i <= altura; i++) {

			for (int j = i; j < altura; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= impar2; j++) {
				if (j == 1 || j == impar2 || i == altura) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			impar2 += 2;
			System.out.println();
		}

		System.out.println();
		// Undécimo triángulo
		System.out.println("Triángulo 6:");
		int impar3 = 2 * altura - 1;
		for (int i = 1; i <= altura; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= impar3; j++) {
				System.out.print("* ");
			}
			impar3 -= 2;
			System.out.println();
		}

		System.out.println();
		// Duodécimo triángulo
		System.out.println("Triángulo 6 hueco:");
		int impar4 = 2 * altura - 1;
		for (int i = 1; i <= altura; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= impar4; j++) {

				if (i == 1 || j == 1 || j == impar4 || i == altura) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			impar4 -= 2;
			System.out.println();
		}
	}
}
