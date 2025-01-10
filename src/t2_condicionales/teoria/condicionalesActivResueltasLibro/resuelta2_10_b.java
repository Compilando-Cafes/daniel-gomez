package t2_condicionales.teoria.condicionalesActivResueltasLibro;

import java.util.Scanner;

public class resuelta2_10_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una nota: ");
		
		int nota = sc.nextInt();
		
		switch (nota) {
		case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Error: nota no v�lida");
		}
		
		System.out.println("================================");
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6: 
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			 System.out.println("Notable");
			 break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Error: nota no v�lida");
		}
		sc.close();
		
		
		
		
		
	}
}