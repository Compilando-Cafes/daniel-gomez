package t4_funciones.examen;

public class ejercicio1dgd {

	public static void main(String[] args) {

		System.out.println("Daniel Gómez Delgado");
		System.out.println();
		RelojArena(7);
		RelojArena(10);
		RelojArena(5);
		RelojArena(1);
		RelojArena(0);
		RelojArena(3);
	}

	public static void RelojArena(int altura) {
		// Verifica que la altura sea un número impar
		if (altura % 2 == 0) {
			System.out.println();
			System.out.println("El número debe ser impar.");
			System.out.println();
			return;
		}
		System.out.println("Reloj de arena de altura: " + altura);
		System.out.println();
		// Parte superior del reloj
		for (int i = 0; i < (altura + 1) / 2; i++) {
			
			// Espacios a la izquierda
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			
			// Números decrecientes
			for (int j = 0; j < altura - 2 * i; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}

		// Parte inferior del reloj
		for (int i = (altura - 1) / 2 - 1; i >= 0; i--) {
			
			// Espacios a la izquierda
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			
			// Números decrecientes
			for (int j = 0; j < altura - 2 * i; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}
	}
}
