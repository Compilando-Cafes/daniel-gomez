package t1_conceptos_basicos.ejercicios;

public class Main5 {

	public static void main(String[] args) {
		// El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
		// Escribir un programa que compruebe que el rango de valores de un tipo se comporta de forma
		// circular, es decir, el valor siguiente al máximo es el valor mínimo.
		
		short numero = 32767;
		System.out.println("Short: " + numero);
		System.out.println("Si lo pongo dentro del system no funciona: " + (numero + 1));
		numero+=2;
		System.out.println("Short + 1 = " + numero);

	}

}
