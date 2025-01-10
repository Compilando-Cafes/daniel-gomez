package t4_funciones.ejerciciosLibro;

public class A_resuelta04_11 {

	public static void main(String[] args) {

		// Diseñar una función que calcule el máximo común divisor de dos números. Realizar una versión iterativa y otra recursiva.
        
        System.out.println(mcd(12, 18)); // Debería dar 6
        System.out.println(mcd(20, 10)); // Debería dar 10
        System.out.println(mcd(15, 25)); // Debería dar 5
		
		
		
	}
	// Escribe una fución que calcule de forma recursiva el máximo común divisor de
	// dos números
	public static int mcd(int a, int b) {
			if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);}
	}
	
}
