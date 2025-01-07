/**
 * By Daniel
 */

package t1_conceptos_basicos.teoria;

public class VariablesTipos {

	public static void main(String[] args) {

		// Tipos de datos primitivos

		int prueba; // Variable declarada pero sin valor, sin iniciar.
		char c = 'a';
		byte pruebaDos, prueba3 = 10, prueba4; // PruebaDos y 4 no están inicializadas, o no tienen valor.
		double prueba5 = 10.0;
		boolean aprobado = true;
		float decimal = 10.123f;
		pruebaDos = 1;
		prueba4= 2;

		prueba = 2000;

		System.out.println(prueba);
		System.out.println(c);
		System.out.println("Valor variable prueba3: " + prueba3);
		System.out.println("Valor variable decimal: " + decimal);
		System.out.println(pruebaDos);
		System.out.printf("%d %d %f %s", pruebaDos, prueba4, prueba5, aprobado);
		
		String ciudad = "Guadalajara";
		System.out.println("Valor de la constante ciudad: " + ciudad);

		final int CONSTANTE_UNO = 10;
		final double CONSTANTE_DOS = 10.0;
		System.out.println(CONSTANTE_UNO + CONSTANTE_DOS);

	}

}
