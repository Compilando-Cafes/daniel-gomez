package t1_conceptos_basicos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// Escribir una aplicación que pida el año actual y el de nacimiento del usuario.
		// Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.
		
		System.out.println("¿En qué año estamos?");
		Scanner sc = new Scanner(System.in);
		int agno = 0;
		try {
			agno =sc.nextInt();
		} catch (InputMismatchException errorAgno) {
			System.out.println("Introduce un año correcto");
		}
		sc.nextLine();
		
		System.out.println("¿En qué año naciste?");
		int agnoNacimiento = 0;
		try {
			agnoNacimiento = sc.nextInt();
		} catch (InputMismatchException errorAgnoNacimiento) {
			System.out.println("Pon un año de nacimiento correcto");
		}
		sc.nextLine();
		
		int calculoEdad = agno - agnoNacimiento;
		System.out.println("Tienes " + calculoEdad + " años.");
		
		sc.close();
	}
}
