package t3_bucles.ejercicios;

public class ejercicio7_9 {

	public static void main(String[] args) {
		// Tablero de ajedrez con B y N
		// 8 filas y columnas

		String blancas = " B", negras = " N";
		int n = 8, resto;

		for (int i = 1; i <=n; i+= 2) {
			
			for (int j = n; j >= 1; j-=2) {
				System.out.print(blancas + negras);
			}
			System.out.println();
			
			for (int j = n; j >= 1; j-=2) {
				System.out.print(negras + blancas);
			}
			System.out.println();
		}

		System.out.println();
		// la suma de las filas y cada columnas da par para las blancas e impar para las
		// negras
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				resto = (i + j) % 2;
				if (resto == 0)
					System.out.print("B ");
				else
					System.out.print("N ");
			}
			System.out.println();
		}

	}

}
