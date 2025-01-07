package t3_bucles.ejerciciosLibro;
import java.util.Scanner;
public class A_aplicacion3_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1, suma = 0;
		
		while (n!=0) {
			System.out.print("Dime las diferentes cantidades de dinero que tienes: ");
			n = sc.nextInt();
			sc.nextLine();
			
			suma += n;
		}
		
		System.out.println("Suma total: " + suma);

		sc.close();
	}

}
