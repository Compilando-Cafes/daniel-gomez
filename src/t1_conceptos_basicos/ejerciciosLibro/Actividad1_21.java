package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;
public class Actividad1_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		boolean resultado;
		
		System.out.print("Número uno: ");
		n1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Número dos: ");
		n2 = sc.nextDouble();
		sc.nextLine();
		
		resultado = n1 == n2 ? true : false;
		System.out.print("¿Son iguales? " + resultado);
		
		sc.close();
	}

}
