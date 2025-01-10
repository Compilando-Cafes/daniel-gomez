package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;

public class Actividad1_18 {

	public static void main(String[] args) {
		int nHormigas, nAranas, nCochinillas, nPatasTotal;
		final int PATAS_HORMIGAS = 6, PATAS_ARANAS = 8, PATAS_COCHINILLAS = 14;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de hormigas capturadas: ");
		nHormigas = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Número de arañas capturadas: ");
		nAranas = sc.nextInt();
		sc.nextLine();

		System.out.print("Número de cochinillas capturadas: ");
		nCochinillas = sc.nextInt();
		sc.nextLine();
		
		nPatasTotal = (nHormigas * PATAS_HORMIGAS) + (nAranas * PATAS_ARANAS) + (nCochinillas * PATAS_COCHINILLAS);
		System.out.println("Número total de patas: " + nPatasTotal);
		
		sc.close();
	}

}
