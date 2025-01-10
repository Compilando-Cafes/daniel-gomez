package t4_funciones.ejercicios;

public class ejercicio_pag_16_Potencia {

	public static void main(String[] args) {
		/*
		 * Construir de forma recursiva un método potencia que devuelva el resultado de
		 * elevar una base a un exponente entero n. Recibe la base y el exponente. A
		 * elevado a N = A * A * A . . . . . N VECES
		 */
		
		System.out.println("Potencia: " + potencia(4, 3));
	}

	public static long potencia(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		} else {
			return base * (potencia(base, exponente-1));
		}
	}

}
