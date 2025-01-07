package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;

public class Actividad1_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double baseImponible;
		int iva;
		double importeIva;
		double total;
		
		System.out.print("Dime la base imponible: ");
		baseImponible = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Dime cual es el IVA: ");
		iva=sc.nextInt();
		sc.hasNextLine();
		
		importeIva = baseImponible * (iva /100.00);
		total = baseImponible + importeIva;
		
		System.out.println("Importe Iva: " + importeIva);
		System.out.println("Total: " + total);
		
		
		sc.close();
	}

}
