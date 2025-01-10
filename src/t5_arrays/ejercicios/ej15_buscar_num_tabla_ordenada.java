package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej15_buscar_num_tabla_ordenada {

	public static void main(String[] args) {
		int tabla[] = { 3, 5, 11, 24, 45, 83 };
		Arrays.sort(tabla);
		
		System.out.println(busquedaOrdenada(tabla, 11));
		
		System.out.println(Arrays.binarySearch(tabla, 23));
		
		int tabla2[] = Arrays.copyOf(tabla, 7);
		System.out.println(Arrays.toString(tabla2));
		
	}

	public static int busquedaOrdenada(int tabla[], int a_buscar) {
		int posicion = -1;
		if (tabla[0] < a_buscar && tabla[tabla.length - 1] > a_buscar) {
			posicion = comparar(tabla, a_buscar, 0, tabla.length-1);
		} else if (tabla[0] == a_buscar) {
			posicion = 0;
		} else if (tabla[tabla.length - 1] == a_buscar) {
			posicion = tabla.length - 1;
		}

		return posicion;
	}

	public static int comparar(int tabla[], int a_buscar, int inicio, int ultimo) {
		int posicion = -1;
		int indice = (ultimo - inicio) / 2 + inicio; // Para ir partiendo por dos

		// Si coincide que justo la mitad es el que buscamos
		if (tabla[indice] == a_buscar) {
			posicion = indice;

		} else if (tabla[indice] < a_buscar) {
			comparar(tabla, a_buscar, indice, indice);
		} else if (tabla[indice] > a_buscar) {
			comparar(tabla, a_buscar, inicio, indice);
		}

		return posicion;
	}

}
