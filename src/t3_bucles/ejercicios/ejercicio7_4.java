package t3_bucles.ejercicios;

public class ejercicio7_4 {

	public static void main(String[] args) {

		// Primero el for que recorre de arriba a abajo
		for (int i = 1; i <= 6; i++) {

			// Para los ceros a la izquierda del uno
			for (int j = 1; j < i; j++) {
				System.out.print(" 0");
			}

			// Para los unos
			System.out.print(" 1");

			// Para los ceros a la derecha del uno
			for (int k = 6; k > i; k--) {
				System.out.print(" 0");
			}
			
			// Salto de línea
			System.out.println();
		}
	}
}
