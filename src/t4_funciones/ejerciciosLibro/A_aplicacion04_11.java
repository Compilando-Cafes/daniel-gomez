package t4_funciones.ejerciciosLibro;

public class A_aplicacion04_11 {

	public static void main(String[] args) {
		// Diseña una función que calcule y muestre la superficie y el volumen de una esfera.
		// Superficie = 4* PI * radio al cuadrado
		// Volumen = (4 * PI) / 3 * radio al cubo
		
		superficieVolumenEsfera(5);
		superficieVolumenEsfera(14.5);
		superficieVolumenEsfera(54);

	}

	public static void superficieVolumenEsfera(double radio) {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		System.out.printf("Superficie de la esfera: %,.2f%n", superficie);
		
		double volumen = ((4 * Math.PI) / 3) * Math.pow(radio, 2);
		System.out.printf("Volumen de la esfera: %,.2f%n", volumen);
	}
}

