package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej21_cuadrado_con_x {

	public static void main(String[] args) {
		char diagonales[][]= new char[8][8];
		
		for (int i=0; i<diagonales.length;i++) {
			for (int j=0 ; j<diagonales[i].length;j++) {
				if (i==j) {
					diagonales[i][j] = 'm';
				} else if ((i+j) == diagonales.length-1) {
					diagonales[i][j]='x';
				} else {
					diagonales[i][j]= 'f';
				}
			}
			System.out.println(Arrays.toString(diagonales[i]));
		}

	}

}
