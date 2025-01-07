package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_propuesta3_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		String resultado = "";

		System.out.print("Introduce un número positivo: ");
		n = sc.nextInt();
		sc.nextLine();

		for (int i = n; i > 0; i /= 10) {
			resultado += i % 10;
		}
		System.out.println(resultado);
	}
}
