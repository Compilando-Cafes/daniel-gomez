package t1_conceptos_basicos.ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * 11) ¿ Cuál es el valor final de x y de z al ejecutar estas instrucciones una
		 * detrás de otra? 
		 * a) int x = 10; int z = x++%5; 
		 * b) x = 10; z = ++x%5 + 25; 
		 * c) x= 10; z *= ++x * 2; 
		 * d) x = 10; z /= x-- * 2 - 10;
		 */
		int x = 10; int z = x++%5; 
		x = 10; z = ++x%5 + 25; 
		x= 10; z *= ++x * 2; 
		x = 10; z /= x-- * 2 - 10;
		
		System.out.println(x);
		System.out.println(z);
		
	}

}
