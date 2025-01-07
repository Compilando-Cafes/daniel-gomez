package t4_funciones.ejercicios;

public class ejercicio_pag_16_Suma_1aN {

	public static void main(String[] args) {
		
		System.out.println(suma1AN(4));
	}

	public static int suma1AN(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + suma1AN(n-1);
		}
	}
}
