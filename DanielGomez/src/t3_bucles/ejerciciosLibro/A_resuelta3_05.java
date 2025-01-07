package t3_bucles.ejerciciosLibro;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta3_05 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El
		// jugador tendrá que introducir la solución de la suma de dos números
		// aleatorios comprendidos entre 1 y 100. Mientras la solución introducida sea
		// correcta, el juego continuará. En caso contrario, el programa terminará y
		// mostrará el número de operaciones realizadas correctamente.
		int suma, solucion, contador = 0, a, b;
		
		try {
		do {
		
		a = (int) (Math.random()* 100) + 1;
		b = (int) (Math.random() * 100) + 1;
		suma = a + b;
		
		System.out.print(a + " + " + b + " = ");
		solucion = sc.nextInt();
		if (solucion == suma)
			contador++;
		
		} while (solucion == suma);
		
		System.out.println("Has acertado sin fallos " + contador + " veces.");
		} catch(InputMismatchException e) {
			System.out.println("Error al introducir los datos.");
		}
		
	}

}
