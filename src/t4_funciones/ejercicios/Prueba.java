package t4_funciones.ejercicios;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {
		// Pedir un número al usuario
		String input = JOptionPane.showInputDialog("Introduce un número:");
		int numero;

		try {
			// Convertir la entrada a un número entero
			numero = Integer.parseInt(input);

			// Verificar si el número es primo
			if (esPrimo(numero)) {
				JOptionPane.showMessageDialog(null, numero + " es un número primo.");
			} else {
				JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
		}
	}

	// Método para verificar si un número es primo
	public static boolean esPrimo(int num) {
		if (num <= 1) {
			return false; // Números menores o iguales a 1 no son primos
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // Si es divisible por algún número entre 2 y √num, no es primo
			}
		}
		return true; // Si no se encontró divisor, es primo

	}
}