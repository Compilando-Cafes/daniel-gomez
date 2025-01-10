package t4_funciones.ejercicios;

public class A_resuelta04_02_Numeros_Pares_Entre_Dos {

	public static void main(String[] args) {
		// Método que reciba dos números leídos de teclado; y muestre en pantalla
		// los números pares comprendidos entre ellos. (variación del 4.2)

		numerosPares(1, 6);
	}
	
	public static void numerosPares(int desde, int hasta) {

		desde = desde < 0 ? -desde : desde;
		hasta = hasta < 0 ? -hasta : hasta;

		if (desde > hasta) {
			int aux = desde;
			desde = hasta;
			hasta = aux;
		}  

		String resultado = " ";

		for (int i = desde + 1; i <= hasta; i++) {
			if (i % 2 == 0) {
				resultado += i == hasta-1 ? +i : +i + ", ";
			}
		}
		System.out.println(resultado);

	}

}
