package t5_arrays.actividades;

import java.util.Arrays;

public class suma_elementos {

	public static void main(String[] args) {
		/*
		 * Implementa la función: int [] suma(int t[ ], int numElementos), que crea y
		 * devuelve una tabla con las sumas de los numElementos elementos consecutivos
		 * de t.
		 */
		int [] t = {10,1,5,8,9,2};
		int [] t2 = {10,1,5,8,9,2,4,6};
		int [] t3 = {10,1};
		int [] t4 = new int [0];
		
		
		System.out.println(Arrays.toString(suma(t,6)));
		System.out.println();
		System.out.println(Arrays.toString(suma(t2,8)));
		System.out.println();
		System.out.println(Arrays.toString(suma(t2,10)));
		System.out.println();
		System.out.println(Arrays.toString(suma(t3,2)));
		System.out.println();
		System.out.println(Arrays.toString(suma(t4,0)));
		
		
	}
	
	public static int[] suma(int t[], int numElementos) {
		if (t.length!= numElementos  || numElementos<3) {
			System.out.println("Introduce una tabla que corresponda con el número de elementos que tiene o que tenga al menos 3 elementos.");
			System.out.print("Los elementos son " + numElementos + " y son: ");
			return t;
		}
		int resultado[] = new int[numElementos-2];
		
		for (int i = 0; i<resultado.length; i++) {
			int suma = 0;
			for (int j = i; j<i+3; j++) {
				suma += t[j];
			}
			resultado[i]=suma;
		}
		System.out.print("Suma de los elementos de 3 en 3: ");
		return resultado;
	}

}
