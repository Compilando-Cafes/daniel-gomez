package t5_arrays.ejercicios;

public class ej08 {

	public static void main(String[] args) {
		// Construye una tabla de 10 elementos del tipo que prefieras.
		// Crea dos variables que referencien a esa tabla y haz que ambas dejen de
		// referenciar a la misma.

		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int a[] = tabla;
		int b[] = tabla;

		System.out.println(tabla);
		System.out.println(a);
		System.out.println(b);

		a[0] = 99;
		b[1] = 999999;
		
		a = null;
		b = null;

		for (int i = 0; i < tabla.length; i++) {
			System.out.print(i == 0 ? tabla[i] : ", " + tabla[i]);
		}

		a = null;
		b = null;
		System.out.println();
		System.out.println(a);
		System.out.println(b);

	}

}
