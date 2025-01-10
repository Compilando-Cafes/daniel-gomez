package t2_condicionales.teoria;

import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) {
		// Número par o impar

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Dime un número: ");
		n = sc.nextInt();
		sc.nextLine();

		// Con dos ifs
		if (n % 2 == 0)
			System.out.println("PAR");
		
		if (n % 2 != 0) 
			System.out.println("IMPAR");

		
		// Con un solo if
		String resul = "IMPAR";
		if (n % 2 == 0)
			resul = "PAR";
		System.out.println(resul);
		
		sc.close();
	}

}
