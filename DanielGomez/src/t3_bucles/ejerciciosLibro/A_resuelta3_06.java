package t3_bucles.ejerciciosLibro;
import java.util.Scanner;

public class A_resuelta3_06 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.print("Dime un número: ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i<=n; i++) {
			System.out.println(i);
		}

	}

}

