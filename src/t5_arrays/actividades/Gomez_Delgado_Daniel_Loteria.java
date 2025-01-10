package t5_arrays.actividades;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Gomez_Delgado_Daniel_Loteria {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * ENUNCIADO: Define dos funciones que reciban la lista de números premiados y
		 * el número de un boleto. En ambos casos devuelve un boolean: true si está
		 * premiado, false si no.
		 * Una función copia la tabla para no modificarla, la
		 * ordena y después busca si el número ha sido premiado
		 * La otra función busca sin ordenar Permite que el usuario sea el que introduzca 
		 * su número por teclado.
		 */
		
		// Que el usuario ponga el número a bucar
		int numeroPremiado = pedirNumeroInt("Introduce el número a buscar: ");
		
		int numeros[] = new int [10];
		Random rand = new Random();
		
		for (int i = 0; i<numeros.length; i++) {
			numeros[i] = rand.nextInt(1000000);
		}
		
		System.out.println(Arrays.toString(numeros));
		System.out.println("Busqueda con función ordenada:");
		System.out.println(buscaCopiandoYOrdenando(numeros, numeroPremiado));
		System.out.println("Búsqueda con función sin ordenar: ");
		System.out.println(buscaSinOrdenar(numeros, numeroPremiado));
	}

	private static boolean buscaSinOrdenar(int numeros[], int numeroPremiado) {
		boolean resultado = false;
		for (int i = 0; i<numeros.length; i++) {
			if (numeroPremiado == numeros[i]) {
				resultado = true;
			}
		}
		return resultado;
	}

	private static boolean buscaCopiandoYOrdenando(int[] numeros, int numeroPremiado) {
		Arrays.sort(numeros);
		return Arrays.binarySearch(numeros, numeroPremiado)>=0;
	}
	
	public static int pedirNumeroInt(String mensaje) {
		while (true) {
			System.out.print(mensaje);
			try {
				int numero = sc.nextInt();
				sc.nextLine();
				return numero;
			} catch (InputMismatchException e) {
				System.out.print("Introduce un valor correcto. ");
			}
			sc.nextLine();
		}
	}

}
