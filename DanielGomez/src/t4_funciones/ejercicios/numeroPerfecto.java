package t4_funciones.ejercicios;

public class numeroPerfecto {

	public static void main(String[] args) {
		/*
		 * Un número perfecto es un número entero positivo que es igual a la suma de sus
		 * divisores positivos, excluyendo el número mismo. Un divisor de un número
		 * entero x es un número entero que puede dividir x.
		 * 
		 * Dado un número entero n, devuelve verdadero si n es un número perfecto; en
		 * caso contrario, devuelve falso.
		 */
		System.out.println(perfecto(28));

	}

	public static boolean perfecto(int n) {
		int suma = 0;
		// Divisores del número
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				suma += i;
			}
		}

		return suma == n;
	}

}
