package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej12_recorrer_tabla_foreach {

	public static void main(String[] args) {
		int tabla1[] = {1,2,3,4,5};
		int tabla2[] = {1,2,3,4,5};
		for (int valor: tabla1) {
			valor++;
		}
		for (int i = 0; i<tabla2.length; i++) {
			tabla2[i]++;
		}
		
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));

	}

}
