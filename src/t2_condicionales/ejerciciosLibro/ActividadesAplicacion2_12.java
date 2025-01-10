package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class ActividadesAplicacion2_12 {

	public static void main(String[] args) {
		// Calculadora de letras de DNI
		Scanner sc = new Scanner(System.in);
		int n;
		char letra;

		System.out.print("Introduce un número de DNI: ");
		n = sc.nextInt();
		sc.nextLine();
		
		letra = switch (n % 23) {
		case 0 -> {
			yield 'T';
		}
		case 1 -> {
			yield 'R';
		}
		case 2 -> {
			yield 'W';
		}
		case 3 -> {
			yield 'A';
		}
		case 4 -> {
			yield 'G';
		}
		case 5 -> {
			yield 'M';
		}
		case 6 -> {
			yield 'Y';
		}
		case 7 -> {
			yield 'F';
		}
		case 8 -> {
			yield 'P';
		}
		case 9 -> {
			yield 'D';
		}
		case 10 -> {
			yield 'X';
		}
		case 11 -> {
			yield 'B';
		}
		case 12 -> {
			yield 'N';
		}
		case 13 -> {
			yield 'J';
		}
		case 14 -> {
			yield 'Z';
		}
		case 15 -> {
			yield 'S';
		}
		case 16 -> {
			yield 'Q';
		}
		case 17 -> {
			yield 'V';
		}
		case 18 -> {
			yield 'H';
		}
		case 19 -> {
			yield 'L';
		}
		case 20 -> {
			yield 'C';
		}
		case 21 -> {
			yield 'K';
		}
		case 22 -> {
			yield 'E';
		}
		default -> {
			System.out.println("Número incorrecto.");
			yield ' ';
		}
		};

		System.out.println("La letra para el DNI número: " + n + " es: " + letra);
		sc.close();

	}

}
