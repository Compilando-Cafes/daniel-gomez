package t4_funciones.ejerciciosUltimos;

public class ejercicio_extra_long_short {

	public static void main(String[] args) {
		// Metodo que reciba un número long y un número short y que diga cuantas veces
		// se repita el short en el long
		repetidos(32335, (short)3);
		repetidos(456696965, (short)3);
		repetidos(3, (short)3);
		repetidos(33333333, (short)3);
		repetidos(2147483648214748364L, (short)3);
		
		
	}

	public static void repetidos(long l, short s) {
		int contador = 0;
		for (long i = l; i > 0; i /= 10) { 
			if (i % 10==s) {
				contador++;
			}
		}
		System.out.println("El " + l + " tiene un " + s + ": " + contador + " veces.");
	}
}
