package t2_condicionales.ejerciciosLibro;

import java.util.Scanner;

public class ActividadesAplicacion2_18 {

	public static void main(String[] args) {
		// Anterior actividad modificada. Añadir que el jugador decida la operación a
		// realizar: suma, resta o multiplicación.
		int a,b,c, operacion = 0;
		String resultado = "";
		Scanner sc = new Scanner(System.in);
		boolean comprobacion= true;
		
		a = (int)(Math.random() *99 + 1);
		b = (int)(Math.random() *99 + 1);
		

		while (operacion != 1 && operacion != 2 && operacion != 3) {
			System.out.print("¿Que prefieres? (1: sumar, 2: restar o 3: multiplicar): ");
			operacion = sc.nextInt();
		}
		
		switch (operacion) {
		case 1 -> resultado = "sumar";
		case 2 -> resultado = "restar";
		case 3 -> resultado = "multiplicar";
		}
		
		System.out.println("Has decidido " + resultado + " los siguientes números: " + a + " y " + b);
		System.out.print("¿Cual es el resultado?: ");
		c = sc.nextInt();
		sc.nextLine();
		
		switch (operacion) {
		case 1 -> {
			comprobacion = (a+b)==c;
		}
		case 2 -> {
			comprobacion = (a-b)==c;
		}
		case 3 -> {
			comprobacion = (a*b)==c;
		}
		}
		resultado = comprobacion ? "Correcto!!!" : "Incorrecto!!!";
		System.out.println(resultado);
		c = sc.nextInt();
		
		sc.close();
	}

}
