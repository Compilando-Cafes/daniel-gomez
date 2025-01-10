package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej22_cuadrado_con_x_distinto {

	public static void main(String[] args) {
		char diagonales[][] = new char[7][7];

		for (int i = 0; i < diagonales.length; i++) {
			for (int j = 0; j < diagonales[i].length; j++) {
				if (i == j) {
					diagonales[i][j] = 'm';
				} else if ((i + j) == diagonales.length - 1) {
					diagonales[i][j] = 'x';
				} else if (i + j < diagonales.length - 1 && i < j) {
					diagonales[i][j] = 'p';
				} else if (i + j < diagonales.length - 1 && i > j) {
					diagonales[i][j] = 'k';
				} else if (i + j > diagonales.length - 1 && i > j) {
					diagonales[i][j] = 'z';
				} else {
					diagonales[i][j] = 'f';
				}
			}
			System.out.println(Arrays.toString(diagonales[i]));
		}

	}

}
