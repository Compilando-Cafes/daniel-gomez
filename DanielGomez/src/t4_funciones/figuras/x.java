package t4_funciones.figuras;

public class x {

	public static void main(String[] args) {
		int n = 5; // Debe ser impar para que funcione bien
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        if (j == i || j == n - i - 1) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}

	}

}
