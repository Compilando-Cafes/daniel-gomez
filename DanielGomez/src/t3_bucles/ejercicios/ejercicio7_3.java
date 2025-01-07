package t3_bucles.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables generales
		int nDepartamentos = 0;
		String nombre, localidad;

		// Variables datos empleados
		int numeroEmpleado, nEmpleados;
		String apellido, oficio;
		double salario;
		
		// Variables resultados
		int maxEmpleados = Integer.MIN_VALUE, numMaxEmpleados = 0;
		String nombreDepartamentoMax = "";

		// Control de entrada del programa
		do {
			// Pedir el número de departamentos
			System.out.print("Nº DE DEPARTAMENTOS (<=0 para salir): ");
			try {
				nDepartamentos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce un valor correcto");
				sc.nextLine(); // Limpiar el buffer del scanner
				continue;
			}

			// Verificar si se desea salir
			if (nDepartamentos <= 0) {
				System.out.println("Fin del programa.");
				break;
			}

			// Bucle para introducir información de cada departamento
			for (int i = 1; i <= nDepartamentos; i++) {

				// Variables para cada departamento
				double totalSalarios = 0, salarioMaximo = Double.MIN_VALUE;
				String apellidoMax = "";
				numeroEmpleado = 0;
				nEmpleados = 0;

				// Nombre
				System.out.print("Nombre del departamento: ");
				nombre = sc.next();

				// Localidad
				System.out.print("Localidad: ");
				localidad = sc.next();

				// Número de empleados que tiene
				while (nEmpleados <= 0) {
					System.out.print("Número de empleados: ");
					try {
						nEmpleados = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Introduce un valor correcto.");
						sc.nextLine();
					}
				}
				
				// Bucle para introducir información de cada empleado 
				for (int j = 1; j <= nEmpleados; j++) {

					// Resetear salario para cada empleado
					salario = 0;

					// Control y petición de número empleado
					while (numeroEmpleado <= 0) {
						System.out.print("Número de empleado: ");
						try {
							numeroEmpleado = sc.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Introduce un valor correcto");
							sc.nextLine();
						}
					}

					// Petición apellido
					System.out.print("Apellido: ");
					apellido = sc.next();

					// Petición oficio
					System.out.print("Oficio: ");
					oficio = sc.next();

					// Petición salario
					while (salario <= 0) {
						System.out.print("Salario: ");
						try {
							salario = sc.nextDouble();
						} catch (InputMismatchException e) {
							System.out.println("Introduce un valor correcto.");
							sc.nextLine();
						}
					}

					// Cálculos salario medio y apellido con mayor salario en el departamento
					totalSalarios += salario;
					if (salario >= salarioMaximo) {
						salarioMaximo = salario;
						apellidoMax = apellido;
					}
				}

				// Calcular y mostrar media y apellido con el salario más alto de cada departamento
				double salarioMedio = totalSalarios / nEmpleados;
				System.out.println("Media salarios del departamento " + nombre + ": " + salarioMedio);
				System.out.println("Apellido del empleado con el salario más alto: " + apellidoMax);

				// Actualizar departamento con el mayor número de empleados
				if (nEmpleados > maxEmpleados) {
					maxEmpleados = nEmpleados;
					nombreDepartamentoMax = nombre;
					numMaxEmpleados = nEmpleados;
				}
			}

			// Mostrar el departamento con más empleados al final del proceso
			System.out.println("Departamento con más empleados: " + nombreDepartamentoMax);
			System.out.println("Número de empleados en el departamento: " + numMaxEmpleados);
			System.out.println("Número total de departamentos introducidos: " + nDepartamentos);

		} while (nDepartamentos > 0);
	}
}
