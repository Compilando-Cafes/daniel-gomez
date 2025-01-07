package t5_arrays.ejercicios;

public class ej14_buscar_numero_tabla {

	public static void main(String[] args) {
		int tabla[] = {11, 5, 24, 3, 83, 45};
		int indice = buscaTablaNoOrdenada(tabla, 83);
		System.out.println("Está en la posición: " + indice);
		int indice2 = buscaTablaNoOrdenada(tabla, 93);
		System.out.println("Está en la posición: " + indice2);

	}
	
	public static int buscaTablaNoOrdenada(int tabla[], int a_buscar) {
		int indice_enc = -1;
		int contador = 0;
		for(int num: tabla) {
			if (num == a_buscar) {
				indice_enc = contador;
				break;
			}
			contador++;
		}
		
		
		return indice_enc;
	}

}
