package t1_conceptos_basicos.ejerciciosLibro;

public class Actividad1_12 {

	public static void main(String[] args) {
		int numero = 13;
		int resultado = (numero % 7) == 0 ? 7 :
			(numero % 7) == 1 ? 6 :
				(numero % 7) == 2 ? 5 :
					(numero % 7) == 3 ? 4 :
						(numero % 7) == 4 ? 3 :
							(numero % 7) == 5 ? 2 :
								(numero % 7) == 6 ? 1 : 0;
		
		System.out.println("Hay que sumarle para que sea multiplo de 7 un: " + resultado);

	}

}
