package t5_arrays.ejercicios;

import java.util.Scanner;

public class ej11_tabla_con_indicador_llenado {

	public static void main(String[] args) {
		char nombre[] = new char[10];
		int indicador = leerNombre(nombre);

		for (int i = 0; i < indicador; i++) {
			System.out.print(nombre[i]);
		}

	}

	public static int leerNombre(char nombre[]) {
		char nom_aux[];
		while (true) {
			System.out.print("Introduce un nombre: ");
			Scanner sc = new Scanner(System.in);
			String nom_recuperado = sc.nextLine();
			nom_aux = nom_recuperado.toCharArray();

			if (nom_aux.length <= 10) {
				for (int i = 0; i < nom_aux.length; i++) {
					nombre[i] = nom_aux[i];
				}
				break;
			} else {
				System.out.println("Introduce un nombre menor a 10 caracteres");
			}
		}
		return nom_aux.length;
	}

}
