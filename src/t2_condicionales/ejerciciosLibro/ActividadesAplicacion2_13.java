package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class ActividadesAplicacion2_13 {

	public static void main(String[] args) {
		/*
		 * En una granja se compra diariamente una cantidad (comidaDiaria) de comida
		 * para los animales. El número de animales que alimentar (todos de la misma
		 * especie) es numAnimales, y sabemos que cada animal come una media de
		 * kilosPorAnimal. Diseña un programa que solicite al usuario los valores
		 * anteriores y determine si disponemos de alimento suficiente para cada animal.
		 * En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno
		 * de los animales. Nota: Evitar que la aplicaciones realice divisiones por
		 * cero.
		 */
		int numAnimales;
		double comidaDiaria, kilosPorAnimal, totalComidaNecesaria;
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime el número de animales: ");
		numAnimales = sc.nextInt();
		sc.nextLine();

		System.out.print("Dime la cantidad de comida comprada para hoy: ");
		comidaDiaria = sc.nextDouble();

		System.out.print("Dime la media de kilos de comida por animal: ");
		kilosPorAnimal = sc.nextDouble();

		totalComidaNecesaria = (double)(kilosPorAnimal * numAnimales);
		
		if (numAnimales == 0) {
			System.out.println("No hay animales que alimentar.");
		} else {
			if (totalComidaNecesaria<=comidaDiaria) {
				System.out.println("Disponemos de comida suficiente para cada animal");
			} else {
				System.out.printf("Cantidad de comida que podemos dar a cada animal: %,.2f kilos", (double)(comidaDiaria / numAnimales));
			}
		}
		
		sc.close();

	}

}
