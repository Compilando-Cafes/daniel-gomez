package t1_conceptos_basicos.teoria;

/**
 * CLASE: ejerciciovariables.java
 * Descripción: ejercicios
 * Autor: Daniel Gómez Delgado
 */

public class EjercicioVariables {

	public static void main(String[] args) { // Esta es la apertura del método main
		
		String autor = "Daniel Gómez Delgado";

		// a. Se usa un boolean para resultados verdadero o falso
		boolean casado;
		casado = true;
		// b. Es final por que es un valor fijo, no cambia. Es un int que es el valor primitivo mínimo.
		final int VALOR_MAXIMO = 999999;
		
		// c. Un byte es suficiente.
		byte diaSemana;
		diaSemana = 4;
		
		// d. Short alcanza para esta cifra.
		short diaAgno;
		diaAgno = 100;
		
		// e. Al tratarse de dos caracteres es necesario el uso de char.
		char sexo;
		sexo = 'V';
		
		// f. El formato long alcanza para esta cifra.
		long milisegundos;
		milisegundos = 1298332800000l;
		
		// g. Al ser una factura debe tener decimales con lo que un float es suficiente.
		float totalFactura;
		totalFactura = 1234.56f;
		
		// h. Necesita de un long.
		long poblacionMundial;
		poblacionMundial = 6775235741l;
		
		// Imprimir por consola
		System.out.println("\n---------------------------------");
		System.out.printf("|  Autor: %s  |\n", autor);
		System.out.println("---------------------------------");
		
		System.out.println("\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
		
		System.out.println("\tEl valor de la variable casado es: \"" + casado + "\"");
		System.out.printf("\tEl valor de la variable casado es: \"%b\"\n", casado);
		
		System.out.println("\n\tEl valor de la variable VALOR_MAXIMO es: \"" + VALOR_MAXIMO + "\"");
		System.out.printf("\tEl valor de la variable VALOR_MAXIMO es: \"%,7d\"", VALOR_MAXIMO);
		
		System.out.println("\n\n\tEl valor de la variable diaSemana es: \"" + diaSemana + "\"");
		System.out.printf("\tEl valor de la variable diaSemana es: \"%4d\"", diaSemana);

		System.out.println("\n\n\tEl valor de la variable diaAgno es: \"" + diaAgno + "\"");
		System.out.printf("\tEl valor de la variable diaAgno es: \"%4d\"\n", diaAgno);
		
		System.out.println("\n\tEl valor de la variable sexo es: \"" + sexo + "\"");
		System.out.printf("\tEl valor de la variable sexo es: \"%c\"\n", sexo);
		
		System.out.println("\n\tEl valor de la variable milisegundos es: \"" + milisegundos + "\"");
		System.out.printf("\tEl valor de la variable milisegundos es: \"%,d\"\n", milisegundos);

		System.out.println("\n\tEl valor de la variable totalFactura es: \"" + totalFactura + "\"");
		System.out.printf("\tEl valor de la variable totalFactura es: \"%,.2f\"\n", totalFactura);
		
		System.out.println("\n\tEl valor de la variable poblacionMundial es: \"" + poblacionMundial + "\"");
		System.out.printf("\tEl valor de la variable poblacionMundial es: \"%,d\"\n", poblacionMundial);
		
	} // Fin método main

} // Fin clase ejercicio variables

