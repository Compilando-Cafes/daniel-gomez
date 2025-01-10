package t2_condicionales.ejerciciosLibro;
import java.util.Scanner;

public class Ejercicio2_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n;
		System.out.print("Introduce un número decimal: ");
		n = sc.nextDouble();
		sc.close();
		
		if (n == 0) {
			System.out.println("No es casi-cero");
		} else {
			if(n<=-1 || n >=1) {
				System.out.println("No es casi-cero");
			} else {
				System.out.println("Es casi-cero");
			}
		}
	}
}
