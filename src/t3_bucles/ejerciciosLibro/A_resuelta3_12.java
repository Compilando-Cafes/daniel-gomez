package t3_bucles.ejerciciosLibro;
import java.util.Scanner;
public class A_resuelta3_12 {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso
		int calificaciones, suspenso = 0;
		
		for (int i = 1; i<=5; i ++) {
			System.out.print("Calificación " + i + ": ");
			calificaciones = sc.nextInt();
			if (calificaciones < 5) {
				suspenso++;
			}
		}
		
		if (suspenso == 0)
			System.out.println("No ha suspendido nadie.");
		else
			System.out.println("Han suspendido: "+ suspenso);
		

	}

}
