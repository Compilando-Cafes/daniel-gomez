package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;

public class Actividad1_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int milimetros, centimetros, metros, suma;
		
		System.out.print("Distancia en milímetros: ");
		milimetros = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Distancia en centímetros: ");
		centimetros = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Distancia en metros: ");
		metros = sc.nextInt();
		sc.nextLine();
		
		suma = (milimetros / 10) + centimetros + (metros * 100);
		System.out.println("Total en centímetros: " + suma);
		
		sc.close();
	}

}
