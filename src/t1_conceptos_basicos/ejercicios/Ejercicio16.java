package t1_conceptos_basicos.ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
	
	

	public static void main(String[] args) {
		/*
		 * 16) Expresión que indica si una fecha es válida o no. 
		 * La Fecha viene dada como dd/mm/yyyy. 
		 * Leer por teclado el dia, el mes y el año. Definirlos de tipo int. 
		 * Un año válido es a partir de 1900 (4 digitos) a 9999.
		 * En un año bisiesto febrero tiene 29 dias, y si no es bisiesto 28.
		 * El resto de meses tiene de 1 a 31 días, ojo unos tienen 30 y otros 31 días.
		 * Enero=31, Febrero 29 si es bisiesto y si no 28, Marzo=31,
		 * Abril=30, Mayo=31, Junio=30, Julio=31,
		 * Agosto=31, septiembre=30, Octubre =31, noviembre=30, diciembre=31
		 */
		int dia, mes, agno;
		Scanner sc = new Scanner(System.in);
		boolean diaValido, mesValido, agnoValido, fechaValida, meses31Dias, meses30Dias;
		String mensaje;
		String fecha;
		
		System.out.print("Dime el día: ");
		dia = sc.nextInt();
		sc.nextLine();
		System.out.print("Dime el mes: ");
		mes = sc.nextInt();
		System.out.print("Dime el año: ");
		agno = sc.nextInt();
		
		agnoValido = (agno >= 1900 && agno <= 9999) ? true : false;
		boolean esBisiesto = ((agno % 4) == 0 ) && (((agno % 100) != 0) || ((agno % 400) == 0)) ? true : false;
		
		mesValido = (mes >=1 && mes <=12) ? true : false;
		meses31Dias = mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12;
		meses30Dias = mes == 4 || mes == 6 || mes == 9 || mes == 11;
		
		diaValido = meses31Dias && dia >=1 && dia <= 31 ? true : 
			meses30Dias && dia >=1 && dia <= 30 ? true :
				mes == 2 && esBisiesto && dia >=1 && dia <= 29 ? true :
					mes == 2 && !esBisiesto == false && dia >=1 && dia <= 28 ? true : false;
			
			
			
//		diaValido = mes == 1 && dia >=1 && dia <= 31 ? true :
//			mes == 2 && esBisiesto == true && dia >=1 && dia <= 29 ? true :
//				mes == 2 && esBisiesto == false && dia >=1 && dia <= 28 ? true :
//				mes == 3 && dia >=1 && dia <= 31 ? true :
//					mes == 4 && dia >=1 && dia <= 30 ? true :
//						mes == 5 && dia >=1 && dia <= 31 ? true :
//							mes == 6 && dia >=1 && dia <= 30 ? true :
//								mes == 7 && dia >=1 && dia <= 31 ? true :
//									mes == 8 && dia >=1 && dia <= 31 ? true :
//										mes == 9 && dia >=1 && dia <= 30 ? true :
//											mes == 10 && dia >=1 && dia <= 31 ? true :
//												mes == 11 && dia >=1 && dia <= 30 ? true :
//													mes == 12 && dia >=1 && dia <= 31 ? true : false;
		
		
		fechaValida = agnoValido && mesValido && diaValido;
		mensaje = fechaValida ? "Fecha válida" : "Fecha no válida";
		fecha = fechaValida ? dia + "/" + mes + "/" + agno : "-/-/-";
		System.out.println("Fecha: " + fecha);
		System.out.println(mensaje);
											
										
		sc.close();

	}

}
