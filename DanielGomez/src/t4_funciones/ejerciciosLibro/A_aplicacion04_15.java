package t4_funciones.ejerciciosLibro;

public class A_aplicacion04_15 {

	public static void main(String[] args) {
		System.out.println( diferenciaMin(1, 0, 0, 0));

	}
	
	static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
		
		return (hora1 * 60 + minuto1) - (hora2 * 60 + minuto2);
		
	}
}
