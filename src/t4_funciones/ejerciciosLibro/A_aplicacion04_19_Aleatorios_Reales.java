package t4_funciones.ejerciciosLibro;

public class A_aplicacion04_19_Aleatorios_Reales {

	public static void main(String[] args) {
		numerosAleatorios(5);
		
	}
	
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		for (int i = 1; i<= cantidad; i++) {
			int n = (int)(Math.random()*(maximo-minimo+1)+minimo);
			System.out.print(n + " ");
		}
	}
	
	public static void numerosAleatorios(int cantidad) {
		for (int i = 1; i<= cantidad; i++) {
			double n = Math.random();
			System.out.print(n + " ");
		}
	}


}
