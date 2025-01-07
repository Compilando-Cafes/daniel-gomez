package t2_condicionales.teoria;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Leer dos números por teclado
		// Visualizar el mayor, el menor y si son iguales mostrar que son iguales
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Dime un número: ");
		n1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Dime otro número: ");
		n2 = sc.nextInt();
		sc.nextLine();
		
		// if
		if (n1>n2)
			System.out.println(n1);
		if (n2>n1)
			System.out.println(n2);
		if (n2==n1)
			System.out.println("Son iguales");
		
		// if + else
		if (n1>n2) {
			System.out.println(n1);
		} else {
			if (n1 == n2)
				System.out.println("Son iguales");
			else {
				System.out.println(n2);
			}
		}
		
		
		
		sc.close();

	}

}
