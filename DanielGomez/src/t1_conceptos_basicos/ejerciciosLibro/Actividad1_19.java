package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;

public class Actividad1_19 {

	public static void main(String[] args) {
		double importeTotal, nEntradaInfantil, nEntradaAdulto, importeTotalDescuento;
		Scanner sc = new Scanner(System.in);
		final double PRECIO_ENTRADA_INFANTIL = 15.50;
		final double PRECIO_ENTRADA_ADULTO = 20;
		
		System.out.print("Número de entradas infantiles: ");
		nEntradaInfantil = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Número de entradas adultos: ");
		nEntradaAdulto = sc.nextDouble();
		sc.nextLine();
		
		importeTotal = nEntradaInfantil * PRECIO_ENTRADA_INFANTIL + nEntradaAdulto * PRECIO_ENTRADA_ADULTO;
		importeTotalDescuento = importeTotal >= 100 ? importeTotal * 0.95 : importeTotal;
		
		System.out.printf("Resultado total con descuentos: %,.2f", importeTotalDescuento);
		
		sc.close();
		
	}

}
