package t2_condicionales.ejerciciosLibro;
import java.util.Scanner;

public class ActividadesAplicacion2_15 {

	public static void main(String[] args) {
		/*
		 * Escribe una aplicación que solicite por consola dos números reales
		 * que corresponden a la base y la altura de un triángulo. Deberá mostrarse
		 * su área, comprobando que los números introducidos por el usuario no
		 * son negativos, algo que no tendría sentido.
		 */
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		
		System.out.print("Dime la base del triángulo: ");
		n1 = sc.nextDouble();
		
		System.out.print("Dime la altura del triángulo: ");
		n2 = sc.nextDouble();
		
		System.out.println(n1 + n2);
		
		
		
		sc.close();
		
		
	}

}
