package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej20_array_ajedrez {

	public static void main(String[] args) {
		// Array ajedrez
		int blanco = 1, negro = 0;
		int ajedrez[][] = new int[8][8];

		for (int i = 0; i < ajedrez.length; i++) {
			for (int j = 0; j < ajedrez[i].length; j++) {
				if ((i+j)%2==0) {
					ajedrez[i][j]=negro;
				} else {
					ajedrez[i][j]=blanco;
				}
			}
			System.out.println(Arrays.toString(ajedrez[i]));
		}
	}

}
