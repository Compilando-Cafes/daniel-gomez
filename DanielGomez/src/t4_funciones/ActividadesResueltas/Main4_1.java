package t4_funciones.ActividadesResueltas;

import java.util.Scanner;

public class Main4_1 {

	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	      System.out.print("Introduzca un número: ");
	      int n = sc.nextInt();
	      System.out.println("--Antes de llamar a la funcion--");
	      eco(n); //invocamos la funcion
	      System.out.println("--Después de llamar a la funcion--");
	   }

	   static void eco(int a) {
	      for (int i = 0; i < a; i++) {
	         System.out.println("Eco...");
	      }
	   }
	}