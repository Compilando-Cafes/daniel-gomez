package t1_conceptos_basicos.teoria.operadores;

import java.util.Scanner;

/**
 * Demostracion de los operadores incrementales A. Garcia-Beltran - Abril, 2006
 */
public class opIncrementales {
	public static void main(String[] args) {
		int i, j; // Variables enteras. Podrian ser reales o char
		i = 7;
		System.out.println("* Operando entero: i = " + i + ";");
		System.out.println(" Operador ++: j = i++; ");
		j = i++;
		System.out.println(" // i vale " + i + "; j vale " + j);
		i = 7;
		System.out.println(" i = " + i + ";");
		System.out.println(" j = ++i; ");
		j = ++i;
		System.out.println(" // i vale " + i + "; j vale " + j);
		i = 7;
		System.out.println("* Operando entero: i = " + i + ";");
		System.out.println(" Operador --: j = i--; ");
		j = i--;
		System.out.println(" // i vale " + i + "; j vale " + j);
		i = 7;
		System.out.println(" i = " + i + ";");
		System.out.println(" j = --i; ");
		j = --i;
		System.out.println(" // i vale " + i + "; j vale " + j);
		
		int k = 2;
		int l = 3;
		System.out.println("k: " + k);
		System.out.println("l" + l);
		
		
		
	}
}