package t1_conceptos_basicos.ejercicios;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*
		 * 18) Programa que, dado un número total de segundos, devuelve el número de horas, minutos y 
		 * segundos equivalentes. Por ejemplo, dado un total de 3800 segundos debe mostrar 
		 * 1 hora, 3 minutos y 20 segundos.
		 */
		int totalSegundos = 3800;
		int hora, minutos, segundos;
		String resultado;
		
		hora = (totalSegundos / 3600);
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;
		
		resultado = hora + " hora, " + minutos + " minutos y " + segundos + " segundos.";
		System.out.println(resultado);
	}
}
