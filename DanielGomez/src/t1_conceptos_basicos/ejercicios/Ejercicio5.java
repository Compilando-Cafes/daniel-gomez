package t1_conceptos_basicos.ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		// - Expresión booleana que indica si un valor entero está en el intervalo entre 1 y 7 ambos incluidos.
		int numero = 2;
		boolean entre1y7 = (numero >= 1) && (numero <= 7);
		System.out.println("El número está entre 1 y 7: "+ entre1y7);
	}

}
