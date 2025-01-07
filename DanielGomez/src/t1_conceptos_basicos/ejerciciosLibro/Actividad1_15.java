package t1_conceptos_basicos.ejerciciosLibro;

import java.util.Scanner;

public class Actividad1_15 {
	public static void main(String[] args) {
		double a,b,c,x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime a: ");
		a = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Dime b: ");
		b = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Dime c: ");
		c = sc.nextDouble();
		sc.nextLine();

		System.out.print("Dime x: ");
		x = sc.nextDouble();
		sc.nextLine();
		
		y = a*Math.pow(x, 2) + b*x + c;
		System.out.printf("Resultado: %,f",y);
	}

}
