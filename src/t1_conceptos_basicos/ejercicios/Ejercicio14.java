package t1_conceptos_basicos.ejercicios;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * 14) Dada una variable esBisiesto de tipo boolean almacenar el valor verdadero 
		 * o falso dependiendo de si el año asignado a la variable anio de tipo int es bisiesto
		 *  o no respectivamente. Nota: un año es bisiesto si es divisible entre 4 y no lo es
		 *   entre 100. También es bisiesto si es divisible entre 400. 
		 *   Por ejemplo: 2000 y 2004 son años bisiestos mientras que 1900 y 2005 no son bisiestos. 
		 *   Bisiesto 29 dias - no bisiesto 28 dias
		 *   (wikipedia) Un año es bisiesto si cumple los siguientes criterios:
• Es bisiesto si es divisible entre 4.
• Pero no es bisiesto si es divisible entre 100.
• Pero sí es bisiesto si es divisible entre 400.

Desde un enfoque algorítmico, se consideran las proposiciones o enunciados lógicos siguientes:
• p: Es divisible entre 4
• q: Es divisible entre 100
• r: Es divisible entre 400
Entonces se utiliza la fórmula lógica para establecer si un año dado es bisiesto:
es bisiesto si es divisible entre cuatro y (no es divisible entre 100 o es divisible entre 400).
		 */
		
		int anio = 2005;
		boolean esBisiesto = (anio % 4 == 0 ) && (!(anio % 100 == 0) || (anio % 400 == 0)) ? true : false;
		System.out.println(esBisiesto);
		
	}

}
