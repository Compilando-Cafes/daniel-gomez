package t4_funciones.ejerciciosLibro;

public class A_resuelta04_12 {

	public static void main(String[] args) {
		// Función que calcula y devuelve la distancia euclídea que separa los puntos
		System.out.printf("%,.2f", distancia(2,5,6,9));
	}

	static double distancia(double x1, double y1, double x2, double y2) {
		System.out.print("La distancia euclídea es: ");
		return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
	}

}
