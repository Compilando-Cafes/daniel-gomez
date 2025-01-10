package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej18_quitar_numero_tabla_desordenada {

	public static void main(String[] args) {
		int tabla[] = { 3, 5, 11, 24, 45, 83 };

		int valor = 24;
		int posicion = buscaTablaNoOrdenada(tabla, valor);
		tabla[posicion] = tabla[tabla.length - 1];
		tabla = Arrays.copyOf(tabla, tabla.length - 1);
		System.out.println(Arrays.toString(tabla));
	}

	public static int buscaTablaNoOrdenada(int tabla[], int a_buscar) {
		int indice_enc = -1;
		int contador = 0;
		for (int num : tabla) {
			if (num == a_buscar) {
				indice_enc = contador;
				break;
			}
			contador++;
		}

		return indice_enc;
	}

}
