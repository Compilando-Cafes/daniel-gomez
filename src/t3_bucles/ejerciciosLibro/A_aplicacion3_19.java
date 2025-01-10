package t3_bucles.ejerciciosLibro;

public class A_aplicacion3_19 {

	public static void main(String[] args) {
		// Calcular la raiz cuadrada de un número
		int n = 23, resultado = 0;

		for (int i = 1; i <= n; i++) {
			if (Math.pow(i, 2) >= n) {
				resultado = i-1;
				break;
			}
		}

		System.out.println("La raiz cuadrada de " + n + " es: " + resultado + " con un resto de: " + (n - (int)Math.pow(resultado, 2)));

	}

}
