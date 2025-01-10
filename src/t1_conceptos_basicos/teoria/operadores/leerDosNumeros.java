package t1_conceptos_basicos.teoria.operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class leerDosNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------------");
		System.out.println("|         Lectura de números enteros           |");
		System.out.println("------------------------------------------------");

		System.out.println("|        Introduce un numero entero            | ");
		System.out.print("------------------>");
		int numero1 = 0;
		try {
			numero1 = sc.nextInt();
		} catch (InputMismatchException aeEntradaEnteroUno) {
			System.out.println("*************Introduce un número correcto**************");
		}
		sc.nextLine();

		System.out.println("|        Introduce otro numero entero          | ");
		System.out.print("------------------>");
		int numero2 = 0;
		try {
			numero2 = sc.nextInt();
		} catch (InputMismatchException aeEntradaEnteroUno) {
			System.out.println("*************Introduce un número correcto*************");
		}
		sc.nextLine();

		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int multiplicacion = numero1 * numero2;
		int division = 0;
		try {
			division = numero1 / numero2;

		} catch (ArithmeticException aeDivision) {
			System.out.println("*************Error al dividir*************");
		}

		System.out.println("------------------------------------------------");
		System.out.println("|            Resultado operaciones             |");
		System.out.println("------------------------------------------------");
		System.out.printf("| Suma              | %,3d | + | %,3d | = | %,3d  |%n", numero1, numero2, suma);
		System.out.printf("| Resta             | %,3d | - | %,3d | = | %,3d  |%n", numero1, numero2, resta);
		System.out.printf("| Multiplicación    | %,3d | * | %,3d | = | %,3d  |%n", numero1, numero2, multiplicacion);
		System.out.printf("| Dividir           | %,3d | / | %,3d | = | %,3d  |%n", numero1, numero2, division);
		System.out.println("------------------------------------------------");

		System.out.println("------------------------------------------------");
		System.out.println("|        Lectura de números decimales          |");
		System.out.println("------------------------------------------------");

		System.out.println("|         Introduce un numero decimal          | ");
		System.out.print("------------------>");
		
		float decimal1 = 0.0f;
		try {
			decimal1 = sc.nextFloat();
		} catch (InputMismatchException aeEntradaEnteroUno) {
			System.out.println("*************Introduce un número correcto*************");
		}
		sc.nextLine();

		System.out.println("|         Introduce un numero decimal          | ");
		System.out.print("------------------>");
		float decimal2 = 0.0f;
		try {
			decimal2 = sc.nextFloat();
		} catch (InputMismatchException aeEntradaEnteroUno) {
			System.out.println("*************Introduce un número correcto*************");
		}
		sc.nextLine();

		System.out.println("------------------------------------------------");
		System.out.println("|            Resultado operaciones             |");
		System.out.println("------------------------------------------------");

		System.out.printf("| Suma           | %,3.2f | + | %3.2f | = | %5.2f |%n", decimal1, decimal2,
				(decimal1 + decimal2));
		System.out.printf("| Resta          | %,3.2f | - | %3.2f | = | %5.2f |%n", decimal1, decimal2,
				(decimal1 - decimal2));
		System.out.printf("| Multiplicación | %,3.2f | * | %3.2f | = | %5.2f |%n", decimal1, decimal2,
				(decimal1 * decimal2));
		System.out.printf("| Dividir        | %,3.2f | / | %3.2f | = | %5.2f |%n", decimal1, decimal2,
				(decimal1 / decimal2));
		System.out.println("------------------------------------------------");
		sc.close();
	}
}
