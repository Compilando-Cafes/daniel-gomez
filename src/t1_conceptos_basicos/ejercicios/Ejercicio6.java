package t1_conceptos_basicos.ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * A partir de una variable de tipo carácter construye una expresión booleana
		 * que indica si el valor asignado a la variable corresponde a un dígito (0 al
		 * 9) o no.
		 */
		char caracter = '4';
		boolean entre0y9 = (caracter >= '0') && (caracter <= '9');
		System.out.println(entre0y9);
		

	}

}
