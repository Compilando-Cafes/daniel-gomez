package t4_funciones.figuras;

public class arbolNavidad {

	public static void main(String[] args) {
		pintarArbolNavidad();
	}
	
	public static void pintarArbolNavidad() {
		// Arbol de navidad
		String ast = "*";
		int arbol = 1, n = 8;

		// Bucle para recorrer cada fila
		for (int i = n; i > 0; i--) {

			// Bucles para cada posición
			// Espacios
			for (int f = i; f > 0; f--) {
				System.out.print(" ");
			}

			// árbol
			for (int f = 1; f <= arbol; f++) {
				System.out.print(ast);
			}
			arbol += 2;

			// Salto de línea
			System.out.println();
		}
		
		// Tronco
		int inicioTronco = n;

		// Bucle para las filas que tendrá el tronco
		for (int i = 7; i > 0; i--) {
			// Espacios hasta el tronco
			for (int e = inicioTronco - 1; e > 0; e--) {
				System.out.print(" ");
			}

			// Pintar el tronco
			for (int t = 1; t <= 2; t++) {
				System.out.print("|");
			}
			System.out.println();
		}

	}

}
