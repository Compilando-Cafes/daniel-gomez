package t1_conceptos_basicos.ejercicios;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		/*
		 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que 
		 * influirán en esta dicisión: si está lloviendo y si hemos terminado nuestras tareas. Solo
		 * podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe
		 * una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho
		 * de que tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc)
		 * Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si
		 * necesita ir a la biblioteca. El algoritmo debe mostrar mediante un booleano (true o false)
		 * si es posible que se le otorgue permiso para ir a la calle.
		 */
		
		boolean lloviendo;
		boolean tareasTerminadas;
		Scanner sc = new Scanner(System.in);
		boolean irABiblioteca;
		boolean resultado;
		
		System.out.println("¿Está lloviendo?");
		lloviendo = sc.nextBoolean();
		
		System.out.println("¿Has terminado las tareas?");
		tareasTerminadas = sc.nextBoolean();
		
		System.out.println("¿Tienes que ir a al biblioteca?");
		irABiblioteca = sc.nextBoolean();
		
		resultado = irABiblioteca == true || (lloviendo == false && tareasTerminadas == true);
		System.out.println("Resultado: " + resultado);
			
		
		                                                                                                       
		
		

	}

}
