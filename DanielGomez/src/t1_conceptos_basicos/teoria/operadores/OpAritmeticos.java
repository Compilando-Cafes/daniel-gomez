package t1_conceptos_basicos.teoria.operadores;
/**
 * Demostracion de los operadores aritmeticos basicos A. Garcia-Beltran - marzo,
 * 2002
 */
public class OpAritmeticos {
	public static void main(String[] args) {
		int i, j;
		double a, b;
		i = 7;
		j = 3;
		i=-i;
		System.out.println("* Operandos enteros: i = " + i + " ; j = " + j);
		System.out.println(" Operador suma: i + j = " + (i + j));
		System.out.println(" Operador resta: i - j = " + (i - j));
		System.out.println(" Operador producto: i * j = " + (i * j));
		System.out.println(" Operador division: i / j = " + (i / j));
		System.out.println(" Operador resto: i % j = " + (i % j));
		a = 12.5;
		b = 4.3;
		System.out.println("* Operandos reales: a = " + a + " ; b = " + b);
		System.out.println(" Operador suma: a + b = " + (a + b));
		System.out.println(" Operador resta: a - b = " + (a - b));
		System.out.println(" Operador producto: a * b = " + (a * b));
		System.out.println(" Operador division: a / b = " + (a / b));
		System.out.println(" Operador resto: a % b = " + (a % b));
	}
}