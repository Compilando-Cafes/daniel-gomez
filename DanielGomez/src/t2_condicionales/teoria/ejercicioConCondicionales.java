package t2_condicionales.teoria;

import java.util.Scanner;

public class ejercicioConCondicionales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codVendedor, zonaVenta;
		String nombre, zona, categoria;
		char categoriaVendedor;
		double importeVenta, importeZona, importeCategoria, importeTotal;
		
		System.out.print("Código del vendedor: ");
		codVendedor = sc.nextInt();
		sc.nextLine();

		System.out.print("Nombre del vendedor: ");
		nombre = sc.nextLine();

		System.out.print("Zona de venta: (1 a 4): ");
		zonaVenta = sc.nextInt();
		sc.nextLine();

		System.out.print("Categoría del vendedor (P, S, T): ");
		categoriaVendedor = sc.nextLine().charAt(0);

		System.out.print("Importe de la venta: ");
		importeVenta = sc.nextDouble();

		if (zonaVenta == 1) {
			zona = "CENTRO";
			importeZona = 2000;
		} else if (zonaVenta == 2) {
			zona = "SUR";
			importeZona = 3400;
		} else if (zonaVenta == 3) {
			zona = "ESTE-OESTE";
			importeZona = 2350;
		} else if (zonaVenta == 4) {
			zona = "NORTE";
			importeZona = 2500;
		} else {
			zona = "No definida";
			importeZona = 0;
		}
		
		if (categoriaVendedor == 'P') {
			categoria = "PRIMERA";
			importeCategoria = 200;
		} else if (categoriaVendedor == 'S') {
			categoria = "SEGUNDA";
			importeCategoria = 150;
		} else if (categoriaVendedor == 'T') {
			categoria = "TERCERA";
			importeCategoria = 100;
		} else {
			categoria = "No definida";
			importeCategoria = 0;
		}
		
		System.out.println("A)=============================");
		System.out.println("Vendedor: " + codVendedor + ", " + nombre);
		System.out.println("Zona: " + zonaVenta + " => " + zona);
		System.out.println(categoriaVendedor + " => " + categoria);

		importeTotal = importeVenta + (importeZona * 0.10) + importeCategoria;
		
		System.out.println("B)=============================");
		System.out.printf("Importe      : %,13.2f%n", importeVenta);
		System.out.printf("Importe total: %,13.2f", importeTotal);
		
		sc.close();
	}

}
