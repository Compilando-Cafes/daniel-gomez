package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta3_13 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota
		// igual a cuatro) y suspenso
		int notas = 0, aprobados = 0, condicionados = 0, suspensos = 0;

		for (int i = 1; i <= 6; i++) {
			System.out.print("Nota " + i + ": ");
			notas = sc.nextInt();
			
			if (notas < 4)
				suspensos++;
			else if (notas == 4)
				condicionados++;
			else
				aprobados++;
		}

		if (aprobados == 0)
			System.out.println("Aprobados: Nadie...");
		else
			System.out.println("Aprobados: " + aprobados);
		if (condicionados == 0)
			System.out.println("Condicionados: ¡Ninguno!");
		else
			System.out.println("Condicionados: " + condicionados);
		if (suspensos == 0)
			System.out.println("Suspensos: ¡No ha suspendido nadie!");
		else
			System.out.println("Suspensos: " + suspensos);

	}

}
