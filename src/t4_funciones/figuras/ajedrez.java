package t4_funciones.figuras;

public class ajedrez {

	public static void main(String[] args) {

		tableroAjedrez();
	}

	public static void tableroAjedrez() {

		// Control de las 8 filas
		for (int fila = 1; fila <= 8; fila++) {

			// Pintar lineas
			for (int columna = 1; columna <= 8; columna++) {
				if ((fila % 2 == 0 && columna % 2 == 0) || (fila % 2 != 0 && columna % 2 != 0)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}

	}

}
