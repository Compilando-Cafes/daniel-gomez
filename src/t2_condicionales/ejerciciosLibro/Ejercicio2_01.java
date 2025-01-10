package t2_condicionales.ejerciciosLibro;
import java.util.Scanner;

public class Ejercicio2_01 {

	public static void main(String[] args) {
		// Leer un número por teclado y mostrar en pantalla si es par o impar
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Dime un número: ");
		n = sc.nextInt();
		
		if (n%2 == 0 ) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		sc.close();

	}

}
