package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class Ejercicio2_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, mayor, menor;

		System.out.print("Introduce un número entero: ");
		n1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Introduce otro número entero: ");
		n2 = sc.nextInt();
		sc.nextLine();

		mayor = n1 > n2 ? n1 : n2;
		menor = n2 < n1 ? n2 : n1;
		
		System.out.println("Mayor: " + mayor + ", menor: " + menor);
		sc.close();
		
	}
}
