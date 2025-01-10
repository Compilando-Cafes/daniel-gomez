package t4_funciones.ejerciciosLibro;

public class A_aplicacion04_17_Numeros_Amigos {

	public static void main(String[] args) {

		int a = 220, b = 284;
		System.out.println("Son amigos: " + a + " y " + b + " = " + sonAmigos(a, b));

		a = 1184;
		b = 1210;
		System.out.println("Son amigos: " + a + " y " + b + " = " + sonAmigos(a, b));

		a = 221;
		b = 284;
		System.out.println("Son amigos: " + a + " y " + b + " = " + sonAmigos(a, b));

		a = 79750;
		b = 88730;
		System.out.println("Son amigos: " + a + " y " + b + " = " + sonAmigos(a, b));

		a = 28;
		b = 28;
		System.out.println("Son amigos: " + a + " y " + b + " = " + sonAmigos(a, b));

	}

	private static boolean sonAmigos(int a, int b) {
		boolean valor = false;
		int sumaa = SumaDivisores(a);
		int sumab = SumaDivisores(b);
		if (a == b) {
			valor = false;
		} else if (sumaa == b && sumab == a) {
			valor = true;
		}
		return valor;
	}

	private static int SumaDivisores(int n) {
		int suma = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				suma += i;
			}
		}
		return suma;
	}

}
