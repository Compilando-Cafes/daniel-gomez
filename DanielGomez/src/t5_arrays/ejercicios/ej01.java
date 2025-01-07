package t5_arrays.ejercicios;

public class ej01 {

	public static void main(String[] args) {
		int longitud = 8;
		// Primero declarar
//		int edades[];
		// Crear el objeto y darle valores iniciales a cero
//		edades = new int[longitud];
		// Asignar valores a cada posición
//		edades[0] = 1;
//		edades[1] = 2;
//		edades[2] = 3;
//		edades[3] = 4;
//		edades[4] = 5;
//		edades[5] = 6;
//		edades[6] = 7;
//		edades[7] = 8;
		
		int edades2[]= {1,2,3,4,5,6,7,8,9};
		
		int edades[]= new int [longitud];
		
		

		for (int i = 0; i < longitud; i++) {
			System.out.print(edades[i] + " ");
		}
		System.out.println();

		for (int i = longitud - 1; i >= 0; i--) {
			System.out.print(edades[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < longitud; i += 2) {
			System.out.print(edades[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < longitud; i++) {
			if (i % 2 == 0)
				System.out.print(edades[i] + " ");
		}
		
		

	}

}
