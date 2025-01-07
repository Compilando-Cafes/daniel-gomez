package t4_funciones.ejerciciosLibro;

public class A_aplicacion04_13 {

	public static void main(String[] args) {
		muestraPares(8);
		muestraPares(9);

	}

	public static void muestraPares(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				if (n % 2 == 0) {
					System.out.print(i == n ? i + "\n" : i + ", ");
				} else {
					System.out.print(i == n - 1 ? i + "\n" : i + ", ");
				}
			}
		}
	}
}
