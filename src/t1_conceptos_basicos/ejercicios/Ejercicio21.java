package t1_conceptos_basicos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		/*
		 * LEER POR TECLADO 4 NOTAS de tipo int (nota1, nota2, nota3, nota4).
Comprobar:
• SI LA NOTA NO ESTA ENTRE 1 Y 10, LE ASIGNAMOS VALOR 0.
• CONTROLAR EXCEPCIONES AL LEER LA NOTA, SI HAY ALGUNA NOTA
ERRÓNEA, NO SE REALIZA EL PROCESO, SE MUESTRA MENSAJE EN
CONSOLA: “ERROR DE PROCESO”
SI LA ENTRADA DE NOTAS ES CORRECTA CALCULAR NOTA FINAL =
nota1*30% + nota2*25% + nota3*15% + nota4*30%

Y Visualizar la siguiente información en consola:
Nota final: 99,99
Suspenso si nota final < 5
Aprobado si (>= 5 y <6) , Bien si ( >=6 y < 7),
Notable (>=7 y < 9) Sobresaliente si >=9 y < 10) ,
Matrícula de honor si == 10

		 */
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Nota 1: ");
			int nota1 = sc.nextInt();
			nota1 = (nota1 > 10) || (nota1 < 0) ? 0 : nota1;
			sc.nextLine();
			
			System.out.print("Nota 2: ");
			int nota2 = sc.nextInt();
			nota2 = (nota2 > 10) || (nota2 < 0) ? 0 : nota2;
			sc.nextLine();
			
			System.out.print("Nota 3: ");
			int nota3 = sc.nextInt();
			nota3 = (nota3 > 10) || (nota3< 0) ? 0 : nota3;
			sc.nextLine();
			
			System.out.print("Nota 4: ");
			int nota4 = sc.nextInt();
			nota4 = (nota4 > 10) || (nota4 < 0) ? 0 : nota4;
			sc.nextLine();
			
			float notaFinal = (float)((nota1 * 0.3) + (nota2 * 0.25) + (nota3 * 0.15) + (nota4 * 0.3));
			
			String nota = notaFinal < 5 ? "Suspenso" :
				notaFinal >= 5 && notaFinal < 6 ? "Aprobado" :
					notaFinal >= 6 && notaFinal < 7 ? "Bien" :
						notaFinal >= 7 && notaFinal < 9 ? "Notable" : 
							notaFinal >= 9 && notaFinal < 10 ? "Sobresaliente": "Matrícula de honor";
					
			System.out.printf("Nota final: %,.2f%n", notaFinal);
			System.out.println(nota);
			
		} catch (InputMismatchException e){
			System.out.println("ERROR DE PROCESO");
		}
		
		sc.close();
	}

}
