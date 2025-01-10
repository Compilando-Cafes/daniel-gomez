package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class ActividadesAplicacion2_14 {

	public static void main(String[] args) {
		// Escribe un programa que solicite al usuario un número
		// comprendido entre 1 y 99. El programa debe mostrarlo con letras,
		// por ejemplo, para 56, se verá: "cincuenta y seis".
		Scanner sc = new Scanner(System.in);
		int numero, unidades, decenas;
		String y, resultado = "error", cero, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, dieci,
				n20, veinti, treinta, cuarenta, cincuenta, sesenta, setenta, ochenta, noventa;

		y = " y ";
		
		// unidades
		cero = "cero";
		n1 = "uno";
		n2 = "dos";
		n3 = "tres";
		n4 = "cuatro";
		n5 = "cinco";
		n6 = "seis";
		n7 = "siete";
		n8 = "ocho";
		n9 = "nueve";

		// Un uso
		n10 = "diez";
		n11 = "once";
		n12 = "doce";
		n13 = "trece";
		n14 = "catorce";
		n15 = "quince";
		n20 = "veinte";

		// Decenas
		dieci = "dieci";
		veinti = "veinti";
		treinta = "treinta";
		cuarenta = "cuarenta";
		cincuenta = "cincuenta";
		sesenta = "sesenta";
		setenta = "setenta";
		ochenta = "ochenta";
		noventa = "noventa";

		// System.out.print("Introduce un número: ");
		// numero = sc.nextInt();
		numero = 0;
		while (numero <= 99) {
			if (numero < 0 || numero > 99) {
				System.out.println("Número incorrecto.");
			} else {
				if (numero <= 15 || numero == 20 || numero == 30 || numero == 40 || numero == 50 || numero == 60
						|| numero == 70 || numero == 80 || numero == 90) {
					switch (numero) {
					case 1 -> resultado = n1;
					case 2 -> resultado = n2;
					case 3 -> resultado = n3;
					case 4 -> resultado = n4;
					case 5 -> resultado = n5;
					case 6 -> resultado = n6;
					case 7 -> resultado = n7;
					case 8 -> resultado = n8;
					case 9 -> resultado = n9;
					case 10 -> resultado = n10;
					case 11 -> resultado = n11;
					case 12 -> resultado = n12;
					case 13 -> resultado = n13;
					case 14 -> resultado = n14;
					case 15 -> resultado = n15;
					case 20 -> resultado = n20;
					case 30 -> resultado = treinta;
					case 40 -> resultado = cuarenta;
					case 50 -> resultado = cincuenta;
					case 60 -> resultado = sesenta;
					case 70 -> resultado = setenta;
					case 80 -> resultado = ochenta;
					case 90 -> resultado = noventa;
					default -> resultado = cero;
					}
				} else {
					unidades = numero % 10;
					decenas = numero / 10;
					switch (decenas) {
					case 1 -> resultado = dieci;
					case 2 -> resultado = veinti;
					case 3 -> resultado = treinta + y;
					case 4 -> resultado = cuarenta + y;
					case 5 -> resultado = cincuenta + y;
					case 6 -> resultado = sesenta + y;
					case 7 -> resultado = setenta + y;
					case 8 -> resultado = ochenta + y;
					case 9 -> resultado = noventa + y;
					}
					switch (unidades) {
					case 0 -> resultado += cero;
					case 1 -> resultado += n1;
					case 2 -> resultado += n2;
					case 3 -> resultado += n3;
					case 4 -> resultado += n4;
					case 5 -> resultado += n5;
					case 6 -> resultado += n6;
					case 7 -> resultado += n7;
					case 8 -> resultado += n8;
					case 9 -> resultado += n9;
					}
				}
			}
			System.out.println(resultado);
			numero = numero + 1;
		}

		sc.close();
	}

}
