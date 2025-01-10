package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;

public class Actividad2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean resultado;
		
		System.out.print("Dime un número entero: ");
		num = sc.nextInt();
		sc.nextLine();
		
		resultado = num>=0;
		System.out.println("¿El número es positivo? " + resultado);
		
		
		sc.close();
	}

}
