package t3_bucles.ejercicios;

public class ejercicio7_18 {

	public static void main(String[] args) {
		// Pintar tres triángulos
		String asterisco = "*";
		String espacio = " ";

		int huecos = 4;
		for (int i = 1; i <= 4; i++) {
			
			// Primeros espacios
			for (int j = huecos; j >= 0; j--) {
				System.out.print(espacio);
			}
			
			// Primer triángulo
			int impares1 = i * 2 - 1;
			for (int k = 1; k <= impares1; k++) {
				System.out.print(asterisco);
			}
			
			// Segundos espacios
			int impares2 = huecos * 2 - 1;
			for (int k = impares2; k >=1; k--) {
				System.out.print(espacio);
			}
			
			// Segundo triángulo
			impares1 = i * 2 - 1;
			for (int k = 1; k <= impares1; k++) {
				System.out.print(asterisco);
			}
			
			// Terceros espacios
			impares2 = huecos * 2 - 1;
			for (int k = impares2; k >=1; k--) {
				System.out.print(espacio);
			}
			
			// Tercer triángulo
			impares1 = i * 2 - 1;
			for (int k = 1; k <= impares1; k++) {
				System.out.print(asterisco);
			}
			
			// Salto de línea
			System.out.println("");
			
			huecos--;
		}
	}

}
