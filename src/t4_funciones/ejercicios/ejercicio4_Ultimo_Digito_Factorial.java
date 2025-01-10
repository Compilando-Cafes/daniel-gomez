package t4_funciones.ejercicios;

public class ejercicio4_Ultimo_Digito_Factorial {

	public static void main(String[] args) {
		/*
		 * Realiza un método Java con nombre ultimo que reciba un número N entero
		 * positivo > 0 y muestre en pantalla el último digito del factorial de dicho
		 * número. Por ejemplo Para N = 2, debe mostrar un 2 (1*2 = 2) Por ejemplo Para
		 * N = 4, debe mostrar un 4 (1*2*3*4 = 24) Por ejemplo Para N = 5, debe mostrar
		 * un 0 (1*2*3*4 *5 = 120)
		 * 
		 * Probar el método para pintar el factorial del 1 al 15 y mostrar el ultimo
		 * digito: Ultimo digito de factorial de 1, ( 1) 1 Ultimo digito de factorial de
		 * 2, ( 2) 2 Ultimo digito de factorial de 3, ( 6) 6 Ultimo digito de factorial
		 * de 4, ( 24) 4 Ultimo digito de factorial de 5, ( 120) 0 Ultimo digito de
		 * factorial de 6, ( 720) 0 Ultimo digito de factorial de 7, ( 5.040) 0 Ultimo
		 * digito de factorial de 8, ( 40.320) 0 Ultimo digito de factorial de 9, (
		 * 362.880) 0 Ultimo digito de factorial de 10, ( 3.628.800) 0 Ultimo digito de
		 * factorial de 11, ( 39.916.800) 0 Ultimo digito de factorial de 12, (
		 * 479.001.600) 0 Ultimo digito de factorial de 13, ( 6.227.020.800) 0 Ultimo
		 * digito de factorial de 14, (87.178.291.200) 0
		 */

		for (int i = 1; i <= 15; i++) {
			ultimo(i);
		}
	}

	public static void ultimo(int n) {
		if (n <= 0) {
			System.out.println("El número debe ser mayor que 0.");
			return;
		}

		long factorial = factorialRecursivo(n);
		int ultimoDigito = (int) (factorial % 10);
		
		System.out.printf("Último dígito del factorial de %d, (%d) %d%n", n, factorial, ultimoDigito);
	}

	public static long factorialRecursivo(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorialRecursivo(n - 1);
	}
}