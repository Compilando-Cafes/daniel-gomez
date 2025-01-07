package t1_conceptos_basicos.teoria;

public class PrintfUso {

	public static void main(String[] args) {
		// Uso de printf

		/* % tiene las siguientes opciones:
		 * 
		 * %[flags][width][.precision]conversion
		 * 
		 * Conversión:
		 * d: Números enteros (decimales).
		 * f: Números de punto flotante (con decimales).
		 * s: Cadenas de texto (String).
		 * c: Caracteres. 
		 * b: Valores booleanos (true o false).
		 * n: Salto de línea independiente del sistema operativo.
		 * 
		 * Flag:
		 * -: Alinea el texto a la izquierda. 
		 * +: Incluye el signo + para números positivos.
		 * 0: Rellena el campo con ceros en lugar de espacios.
		 * ,: Incluye separadores de miles (por ejemplo, 1,000).
		 * (: Rodea números negativos con paréntesis.
		 * 
		 * Ancho (widht)
		 * 
		 * Precisión (.precision)
		 * Número de dígitos después del punto decimal (f)
		 * Número máximo de caracteres para cadenas de texto (s)
		 */

		String nombre = "Daniel";
		String apellido = "Gómez";
		String apellido2 = "Delgado";
		int edad = 44;
		double importe = 1234.56d;
		
		System.out.printf("Mi nombre es %s %s %s y tengo %d años.%n", nombre, apellido, apellido2, edad);
		System.out.printf("Importe: %f %n", importe);
		
		/*
		 * %f para dar formato de salida al número:
		 * 
		 * ,: Añadir separador de miles.
		 * 08: El número ocupará al menos 8 caracteres, rellenado con ceros si es necesario.
		 * .2: Mostrará 2 decimales.
		 * f: El número es de punto flotante.
		 */
		double d = 10000d;
		System.out.printf("Valor1: %,9.2f %n", d);
		System.out.printf("Valor2: %f %n", d);
		System.out.printf("Valor3: %,12.2f %n", d);

	}

}
