package t3_bucles.ejercicios;
import java.util.Scanner;

public class datosAlumnos {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String nombre;
		int curso, contador = 0, hombres = 0, mujeres = 0, cursoUno = 0, cursoDos = 0, cursoTres = 0;
		char sexo, finalizar;
		
		do {
			
			// Introducir nombre
			System.out.print("Nombre: ");
			nombre = sc.next();
			sc.nextLine();
			
			// Control de sexo correcto
			do {
				System.out.print("Sexo (H,h,M,m): ");
				sexo = sc.next().charAt(0);
				sc.nextLine();
				
				if (sexo == 'H' || sexo == 'h')
					hombres++;
				else
					mujeres++;
				
			} while (sexo != 'H' && sexo != 'h' && sexo != 'M' && sexo != 'm');
			
			// Control de curso correcto
			do {
				System.out.print("Curso (1 a 3): ");
				curso = sc.nextInt();
				sc.nextLine();	
				
				switch (curso) {
				case 1 -> cursoUno++;
				case 2 -> cursoDos++;
				default -> cursoTres++;
				}
			} while (curso <1 || curso > 3);
			
			// Cálculos
			contador++;
			
			// Control de cierre del programa
			System.out.print("¿Desea introducir más datos de alumnos (N,n para salir)?");
			finalizar = sc.next().charAt(0);
			
		} while(finalizar != 'n' && finalizar != 'N');
		System.out.println("Número de alumnos introducidos: " + contador);
		System.out.println("Número de hombres: " + hombres);
		System.out.println("Número de mujeres: " + mujeres);
		System.out.println("Número en curso 1: " + cursoUno);
		System.out.println("Número en curso 2: " + cursoDos);
		System.out.println("Número en curso 3: " + cursoTres);
		System.out.println(nombre);
		
	}

}
