package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;

public class Actividad1_14 {

	public static void main(String[] args) {
		double base, altura, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime la base del triángulo: ");
		base = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Dime la altura del triángulo: ");
		altura = sc.nextDouble();
		sc.nextLine();

		area = (base * altura) / 2.00;
		System.out.println("El area del triángulo es: " + area);

		sc.close();
	}

}
