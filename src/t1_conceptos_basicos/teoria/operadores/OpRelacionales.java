package t1_conceptos_basicos.teoria.operadores;
/**
 * Demostracion de los operadores relacionales A. Garcia-Beltran - marzo, 2002
 */
public class OpRelacionales {
	public static void main(String[] args) {
		int i, j;
		i = 7;
		j = 3;
		
		
		System.out.println("* Operandos enteros: i = " + i + " ; j = " + j);
		System.out.println(" Operador igualdad: i == j es " + (i == j));
		System.out.println(" Operador desigualdad: i != j es " + (i != j));
		System.out.println(" Operador mayor que: i > j es " + (i > j));
		System.out.println(" Operador menor que: i < j es " + (i < j));
		System.out.println(" Operador mayor o igual que: i >= j es " + (i >= j));
		System.out.println(" Operador menor o igual que: i <= j es " + (i <= j));

		// ****************
		i = 7;
		j = 3;
		{
			boolean valor1 = i > j;
			System.out.println("Valor1 : " + valor1);
			boolean valor2 = i > 5;
			System.out.println("Valor2 : " + valor2);

			boolean valor3 = (valor1 || valor2 || 7 > 1) && (i > 1);

			System.out.println("Valor1 || valor2 : " + valor3);

			valor3 = valor1 && valor2;
			System.out.println("Valor1 && valor2 : " + valor3);

			System.out.println("!Valor3 : " + !valor3);
		}

		
		
	}// main
}