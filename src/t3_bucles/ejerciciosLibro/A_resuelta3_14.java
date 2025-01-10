package t3_bucles.ejerciciosLibro;

public class A_resuelta3_14 {

	public static void main(String[] args) {
		// Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10

		for (int i = 1; i < 10; i++) {
			System.out.println("Tabla del " + i + ":");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (j * i));
			}
			System.out.println();
		}

	}

}
