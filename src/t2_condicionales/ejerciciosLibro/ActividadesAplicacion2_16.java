package t2_condicionales.ejerciciosLibro;
import java.util.Scanner;

public class ActividadesAplicacion2_16 {

	public static void main(String[] args) {
		// Utiliza el operador ternario para calcular el valor absoluto de un número que
		// se solicita al usuario por teclado
		Scanner sc = new Scanner(System.in);
		int n, resultado;
		
		System.out.print("Dime un número para calcular su valor absoluto: ");
		n = sc.nextInt();
		sc.nextLine();
		
		resultado = n<0 ? n*-1:n;
		System.out.println(resultado);
		sc.close();
	}

}
