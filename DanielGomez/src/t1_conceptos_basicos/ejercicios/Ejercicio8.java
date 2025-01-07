package t1_conceptos_basicos.ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * A partir de una variable int llamada mes, escribe una expresión usando el
		 * operador ? que almacene en una variable true si el mes está comprendido entre
		 * 1 y 12. Realiza otra expresión que almacene en una variable el valor “SI” si
		 * el mes está comprendido entre 1 y 12 y “NO” si no lo está.
		 */
		int mes = 2;
		boolean mesValido = (mes >= 1 && mes <= 12) ? true : false;
		String resultado = mesValido ? "Si" : "No";
		System.out.println("¿Está el mes entre 1 y 12? " + resultado);

	}

}
