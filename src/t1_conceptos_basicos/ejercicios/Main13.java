package t1_conceptos_basicos.ejercicios;

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		/* Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas
		 * enteras que se solicitarán al usuario) El programa debe mostrar la nota media del curso
		 * como se utiliza en el boletín de calificaciones (solo la parte entera) y como se usa en
		 * el expediente académico (con decimales).
		 */
		Scanner sc = new Scanner(System.in);
		int notasPrimerTri, notasSegundoTri, notasTercerTri;
		int notaMediaBoletin;
		double notaMediaExpediente;
		
		System.out.println("Notas del primer trimestre:");
		notasPrimerTri = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Notas del segundo trimestre:");
		notasSegundoTri = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Notas del tercer trimestre:");
		notasTercerTri = sc.nextInt();
		sc.nextLine();
		
		notaMediaBoletin = (notasPrimerTri + notasSegundoTri + notasTercerTri) / 3;
		notaMediaExpediente = (notasPrimerTri + notasSegundoTri + notasTercerTri) / 3.0;
		System.out.println("Nota media: " + notaMediaBoletin);
		System.out.printf("Nota media expediente: %,.2f", notaMediaExpediente);
		
		sc.close();
	}

}
