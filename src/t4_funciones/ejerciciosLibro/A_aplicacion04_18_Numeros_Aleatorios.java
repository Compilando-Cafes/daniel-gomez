package t4_funciones.ejerciciosLibro;

public class A_aplicacion04_18_Numeros_Aleatorios {

	public static void main(String[] args) {
		numerosAleatorios(5, 1, 3);
	}
	
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		System.out.println();
		for (int i = 1; i<= cantidad; i++) {
			int n = (int)(Math.random()*(maximo-minimo+1)+minimo);
			System.out.print(n + " ");
		}
		
	}
	

}
