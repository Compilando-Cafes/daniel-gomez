package t4_funciones.ejerciciosLibro;

public class A_resuelta04_10 {

	public static void main(String[] args) {
		// Diseñar una función que calcule a elevado a n, donde a es real y n es entero
		// no negativo. Realizar una versión iterativo y otra recursiva.
		elevadoMath(2, 2);
		elevadoMath(2, -2);
		
		System.out.println(elevadoIterativa(2, 2));
		System.out.println(elevadoIterativa(2, -2));

		System.out.println(elevadoRecursiva(2, 2));
		System.out.println(elevadoRecursiva(2, -2));

	}

	// Función directa
	public static void elevadoMath(int n, int a) {
		if (a<0)
			a *= -1;
		System.out.println(Math.pow(a, n));
	}

	// Función iterativa
	public static int elevadoIterativa(int n, int a) {
		if (a < 0)
			a *= -1;
		for (int i = 1; i <= a; i++) {
			n *= i;
		}
		return n;
	}

	// Función recursiva
	public static int elevadoRecursiva(int n, int a) {
		if (a < 0)
			a *= -1;
		if (a == 0) {
			return 1;
		} else {
			return n * elevadoRecursiva(n, a - 1);
		}

	}

}
