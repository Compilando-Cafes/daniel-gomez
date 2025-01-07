package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_aplicacion3_11 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		String binario = "";

		System.out.print("Número para convertir a binario: ");
		n = sc.nextInt();
		sc.nextLine();
		
		while (n>0) {
			int digito = n%2;
			binario = digito + binario;
			n/=2;
		}
		System.out.println(binario);
	}
}
