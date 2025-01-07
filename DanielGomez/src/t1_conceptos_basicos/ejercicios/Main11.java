package t1_conceptos_basicos.ejercicios;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		/*
		 *  Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas
		 *  y peras. Por ese motivo, es necesario diseñar una aplicación que solicite las ventas (en
		 *  kilos) de cada semestre para cada fruta. La aplicación mostrará el importe total sabiendo
		 *  que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€
		 */
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		double importeTotal;
		int ventasPrimerSemestreManzanas;
		int ventasSegundoSemestreManzanas;
		int ventasPrimerSemestrePeras;
		int ventasSegundoSemestrePeras;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime las ventas en kilos del primer semestre para las manzanas:");
		ventasPrimerSemestreManzanas = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Dime las ventas en kilos del segundo semestre para las manzanas:");
		ventasSegundoSemestreManzanas = sc. nextInt();
		sc.nextLine();
		
		System.out.println("Dime las ventas en kilos del primer semestre para las peras:");
		ventasPrimerSemestrePeras = sc. nextInt();
		sc.nextLine();
		
		System.out.println("Dime las ventas en kilos del segundo semestre para las peras:");
		ventasSegundoSemestrePeras = sc. nextInt();
		sc.nextLine();
		
		importeTotal = (ventasPrimerSemestreManzanas * PRECIO_MANZANAS)  +
				(ventasSegundoSemestreManzanas * PRECIO_MANZANAS) +
				(ventasPrimerSemestrePeras * PRECIO_PERAS) +
				(ventasSegundoSemestrePeras * PRECIO_PERAS);
		
		System.out.printf("Importe total: %,.2f€", importeTotal);
		
		sc.close();
	}

}
