package t4_funciones.figuras;

public class casa {

	public static void main(String[] args) {
		int n = 4; // Altura del techo
		// Techo
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 1; j <= (2 * i - 1); j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		// Base
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= (2 * n - 1); j++) {
		        if (i == n || j == 1 || j == (2 * n - 1)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}

	}

}
