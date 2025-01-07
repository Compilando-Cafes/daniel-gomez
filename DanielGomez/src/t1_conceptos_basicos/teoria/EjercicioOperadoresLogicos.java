package t1_conceptos_basicos.teoria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioOperadoresLogicos {

	public static void main(String[] args) {
		/*
		 * LEER POR TECLADO UN DIA Y UN MES.
		 * COMPROBAR SI EL DIA ESTA COMPRENDIDO ENTRE 1 Y 31
		 * COMPROBAR SI EL MES ENTRE 1 Y 12.
		 * COMPROBAR SI LAS DOS EXPRESIONES SE CUMPLEN O NO
		 * MOSTRAR EL VALOR true o false SI SE CUMPLEN O NO LAS EXPRESIONES
		 */
		System.out.println("Comprobación de dia y mes");
		
		boolean comprobarDia = true;
		boolean comprobarMes = true;
		boolean comprobarAmbos = true;
		int dia = 0;
		int mes = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce un día:");
			dia = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduce un mes:");
			mes = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Error");
		}
		
		comprobarDia = (dia >=1) && (dia <=31);
		comprobarMes = (mes >=1) && (mes <=12);
		comprobarAmbos = comprobarDia && comprobarMes;
		
		System.out.println("El día está entre 1 y 31: " + comprobarDia);
		System.out.println("El mes está entre 1 y 12: " + comprobarMes);
		System.out.println("Son ambos correctos: " + comprobarAmbos);
		
		sc.close();
	}

}
