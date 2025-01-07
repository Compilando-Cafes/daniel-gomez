package t4_funciones.ejercicios;

import java.util.Scanner;

public class ejercicio_Numero_Cifras_Numero {

	public static void main(String[] args) {
		/*
		 * FUNCION QUE RECIBA UN NÚMERO ENTERO Y DEVUELVA EL NÚMERO DE CIFRAS DEL
		 * NÚMERO. CONDICIONES: NÚMERO MAYOR QUE 0. Y NÚMERO COMPRENDIDO ENTRE 1 Y
		 * 999.999 SI NO SE CUMPLE LO ANTERIOR LA FUNCIÓN DEBE DEVOLVER 0 SI SE CUMPLEN
		 * LAS CONDICIONES DEBE DEVOLVER EL NÚMERO DE CIFRAS
		 */
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime un número entero mayor que 0 entre 1 y 999.999: ");
		n = sc.nextInt();
		sc.nextLine();

		System.out.println("Tiene: " + numeroCifras(n) + " cifras.");
	}

	public static int numeroCifras(int n) {
		int cifras = 0;

		if (n > 0 && n <= 999999) {
			for (int i = n; i > 0; i /= 10) {
				cifras++;
			}
		}
		return cifras;
	}
}
