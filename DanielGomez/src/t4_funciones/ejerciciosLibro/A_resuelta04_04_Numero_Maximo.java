package t4_funciones.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta04_04_Numero_Maximo {

	public static void main(String[] args) {
		// Número máximo de dos datos.

		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce el primer número: ");
		num1 = sc.nextInt();
		sc.nextLine();

		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("El número mayor de los dos es: " + comparaNumeros(num1, num2));
	}

	public static int comparaNumeros(int num1, int num2) {
		int max = num1 > num2 ? num1 : num2;
		return max;
	}

}
