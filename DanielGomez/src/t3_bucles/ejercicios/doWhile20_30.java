package t3_bucles.ejercicios;

public class doWhile20_30 {

	public static void main(String[] args) {
		/*
		 * Visualizar los números del 20 al 30, su cuadrado y su cubo, la salida es la siguiente:
		 */
		int c = 20, cuadrado, cubo;
		
		System.out.println("Número   Cuadrado      Cubo");
		System.out.println("===========================");
		
		do {
			cuadrado = c * c;
			cubo = c * c*c;
			System.out.printf("%6d %10d %9d %n", c, cuadrado, cubo);
			
			c++;
		} while (c <= 30);
	}

}
