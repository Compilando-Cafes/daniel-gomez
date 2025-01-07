package t2_condicionales.ejerciciosLibro;
import java.util.Scanner;
public class ActividadesAplicacion2_17 {

	public static void main(String[] args) {
		// Realiza el juego de la suma, que consiste en que aparezcan dos números
		// aleatorios (entre 1 y 99) que el usuario tiene que sumar. La aplicación debe
		// indicar si el resultado de la operación es correcto o incorrecto
		int a,b,c;
		String resultado;
		Scanner sc = new Scanner(System.in);
		a = (int)(Math.random() *99 + 1);
		b = (int)(Math.random() *99 + 1);
		
		System.out.print("Dime la suma de " + a + " y de " + b + ": ");
		c = sc.nextInt();
		
		resultado = (a + b)== c ? "Correcto" : "Incorrecto";
		
		System.out.println("Y.....: " + resultado);
		sc.close();
	}

}
