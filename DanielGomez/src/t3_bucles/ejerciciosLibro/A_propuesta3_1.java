package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_propuesta3_1 {

	public static void main(String[] args) {
		// Diseña una aplicación que muestre la edad máxima y mínima de un grupo de
		// alumnos. El usuario introducirá las edades y terminará escribiendo un -1

		short maximo = -1, minimo = 150, n = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce las edades de alumnos que quieras y cuando termines escribe -1: ");
		n = sc.nextShort();

		while (n != -1) {
			
			// Método 1: Usando un break
//			System.out.print("Introduce las edades de alumnos que quieras y cuando termines escribe -1: ");
//			n = sc.nextShort();
//			if (n==-1) {
//				 break;
//			} else {
//				if (n > maximo) {
//					maximo = n;
//				}
//				if (n<minimo){
//					minimo = n;
//				}
//			}
			
			// Método 2: Pidiendo dos veces
			if (n > maximo) {
				maximo = n;
			}
			if (n < minimo) {
				minimo = n;
			}

			System.out.print("Introduce las edades de alumnos que quieras y cuando termines escribe -1: ");
			n = sc.nextShort();

		}

		System.out.println("Edad máxima introducida: " + maximo);
		System.out.println("Edad mínima introducida: " + minimo);

		sc.close();

	}

}
