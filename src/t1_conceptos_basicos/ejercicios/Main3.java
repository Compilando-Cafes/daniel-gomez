package t1_conceptos_basicos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// Pedir al usuario su edad y mostrar la que tendrá el próximo año

		System.out.println(
				"Dime tu edad y tras un complicado cálculo te diré exáctamente cuantos años tendrás el año que viene!!");
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		boolean bucle = true;

		while (bucle) {
			try {
				edad = sc.nextInt();
				bucle = false;
			} catch (InputMismatchException errorEdad) {
				System.out.println("Pon tú edad, un número, no es tan dificil...");
			}
			sc.nextLine();
		}

		int resultado = edad + 1;
		System.out.println("Tienes " + edad + " años y el año que viene tendrás " + resultado + " años.");

		sc.close();
	}

}
