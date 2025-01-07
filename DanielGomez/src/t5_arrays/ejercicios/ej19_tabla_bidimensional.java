package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej19_tabla_bidimensional {

	public static void main(String[] args) {
		int tablaBidimensional[][] = new int[4][6];
		for (int i = 0; i < tablaBidimensional.length; i++) {
			for (int j = 0; j < tablaBidimensional[i].length; j++) {
				tablaBidimensional[i][j] = (i + j) * 2;
			}
			System.out.println(Arrays.toString(tablaBidimensional[i]));
		}

	}

}
