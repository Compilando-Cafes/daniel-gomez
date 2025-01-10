package t4_funciones.ejerciciosLibro;

public class A_resuelta04_02_Numeros_Entre_Dos {

	public static void main(String[] args) {
		// Escribir una función a la que se le pasen dos enteros y muestre todos los
		// números comprendidos entre ellos
		// Llamada a la función
		numerosEntreDos(2, 5);
		System.out.println();
		numerosEntreDos(0, 0);
		System.out.println();
		numerosEntreDos(5, 2);
		System.out.println();
		numerosEntreDos(-4, 5);
		System.out.println();
		numerosEntreDos(4, 4);

	}

	// Función
	public static void numerosEntreDos(int desde, int hasta) {

		// Controlar que desde sea mayor que hasta
		if (desde > hasta) {
			int aux = desde;
			desde = hasta;
			hasta = aux;
		}

		// Bucle para iterar por ambos números
		for (int i = desde; i < hasta; i++) {
			System.out.print(i == hasta - 1 ? i : i + ", ");
		}
	}
}
