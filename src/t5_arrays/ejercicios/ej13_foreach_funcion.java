package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej13_foreach_funcion {

	public static void main(String[] args) {
		int tabla1[] = { 11, 5, 24, 3, 83, 45 };
		int tabla2[] = { -11, -5, -24, -3, -83, -45 };
		int tabla3[] = { 11, 5, 24, -3, -83, -45 };
		int max1 = devolverMaximo(tabla1);
		int max2 = devolverMaximo(tabla2);
		int max3 = devolverMaximo(tabla3);
		
		System.out.println(Arrays.toString(tabla1));
		System.out.println("Número más alto: "+ max1);
		System.out.println(Arrays.toString(tabla2));
		System.out.println("Número más alto: "+ max2);
		System.out.println(Arrays.toString(tabla3));
		System.out.println("Número más alto: "+max3);
	}

	public static int devolverMaximo(int numeros[]) {
		int max = Integer.MIN_VALUE;
		for (int num : numeros) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	}

}
