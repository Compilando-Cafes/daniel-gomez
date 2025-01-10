package t4_funciones.ejercicios;

public class ejercicio_pag_16_Suma_Cifras_Numero {

	public static void main(String[] args) {
		
		System.out.println(sumaCifrasNumero(5));

	}
	
	public static int sumaCifrasNumero(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n % 10 + sumaCifrasNumero(n/10);
		}
	}

}
