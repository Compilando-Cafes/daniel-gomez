package t4_funciones.ejercicios;

public class ambitoVariables {

	static int a = 4; // variable de clase

	public static void main(String[] args) {
		int b = 20; // local
		funcion1();
		funcion2(a, b);
	}

	static void funcion1() {
		int a = 5, b = 1; // locales
		while (a > 0) {
			int c = b; // de bloque
			System.out.println(a + c);
			a--;
			c++;
		}
	}

	static void funcion2(int a, int b) {
		int z; // local
		z = a + b; // a y b locales
		System.out.println(z);
	}

}
