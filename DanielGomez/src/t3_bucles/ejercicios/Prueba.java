package t3_bucles.ejercicios;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TRIÁNGULO 1

		int n = 5;

		System.out.println(" ");

		// TRIÁNGULO 2
		for (int i = n; i >= 0; i--) {

			for (int k = i; k < n; k++) {
				System.out.print("-");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*-");
			}

			System.out.println();
		}
		// TRIÁNGULO 3
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("-"); 
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*-");
			}

			System.out.println(" ");
		}
	}

}
