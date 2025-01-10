package t5_arrays.ejercicios;

import java.util.Arrays;

public class ej16_numeros_premiados {

	public static void main(String[] args) {
		// Define dos funciones que reciban la lista de números premiados y el número de
		// un boleto. En ambos casos devuelve un boolean: true si está premiado, false
		// si no.
		// Una función copia la tabla para no modificarla, la ordena y después
		// busca si el número ha sido premiado.
		// La otra función busca sin ordenar.
		int numerosPremiados[]= {1,23,56,234,6,2,58};
		System.out.println(numerosPremiadosOrdena(numerosPremiados, 22));
		System.out.println(numerosPremiados(numerosPremiados, 22));
		
	}
	
	public static boolean numerosPremiadosOrdena(int numerosPremiados[], int numeroBoleto) {
		boolean premiado = false;
		int copiaNumerosPremiados[]= Arrays.copyOf(numerosPremiados, numerosPremiados.length);
		Arrays.sort(copiaNumerosPremiados);
		if (Arrays.binarySearch(copiaNumerosPremiados, numeroBoleto) <0){
			premiado = false;
		} else {
			premiado = true;
		}
		
		return premiado; 
	}
	
	public static boolean numerosPremiados(int numerosPremiados[], int numeroBoleto) {
		boolean premiado = false;
		for (int i = 0; i < numerosPremiados.length; i++) {
			if (numerosPremiados[i] == numeroBoleto) {
				premiado =true;
			}
		}
		
		return premiado;
	}

}
