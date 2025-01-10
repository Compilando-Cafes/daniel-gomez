package t1_conceptos_basicos.ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * A partir de una variable de tipo carácter construye una expresión booleana
		 * para determinar si el valor asignado corresponde a una letra o no
		 * (mayúsculas, minúsculas, ñ, no incluimos acentos -
		 */

		char c = 'd';
		boolean mayus = (c >= 'A') && (c <= 'Z');
		boolean minus = (c >= 'a') && (c <= 'z');
		boolean ene = (c == 'Ñ') || (c == 'ñ');

		boolean esUnaLetra = mayus || minus || ene;
		System.out.println("Es una letra: " + esUnaLetra);
		
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isLetter(c));
		

	}

}
