package t1_conceptos_basicos.ejercicios;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * 15) Construye una expresión que indique si un individuo puede o no beber.
		 * La condición para que un individuo pueda beber es que la edad esté entre 
		 * comprendida entre 18 y 60 años incluidos.
		 */
		int edad = 100;
		String puedeBeber = edad >= 18 && edad <= 60 ? "Puede beber" : "No puede beber";
		System.out.println(puedeBeber);
	}

}
