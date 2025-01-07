package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej17_ampliar_tabla_ordenada {

	public static void main(String[] args) {
		int tabla[] = { 3, 5, 11, 24, 45, 83 };
		int tablaDestino[] = new int[tabla.length + 1];

		int valor = 12;
		int posicion = Arrays.binarySearch(tabla, valor);

		int indice = -posicion - 1;
		for (int i = 0; i < tabla.length; i++) {
			if(i<indice) { // Para posición anterior a la que se busca
				tablaDestino[i] = tabla[i];
			} else if(i==indice) { // Si es la posición en la que debe estar el número nuevo
				tablaDestino[i] = valor; // Colocar el número
			} else if (i>indice) { // Posiciones posteriores
				tablaDestino[i]= tabla[i-1]; // Lo mueve un índice
			}
		}

	}

}
