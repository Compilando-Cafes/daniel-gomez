package t1_conceptos_basicos.teoria.operadores;

public class ejemplosOperadores {

	public static void main(String[] args) {
		int resto = 100 % 3;
		System.out.println("Resto: " + resto);
		System.out.println("Resto: " + (100 % 3) );
		int a=20, b=30;
		System.out.println("Suma: " + (a+b) );
		System.out.println("Suma: " + a + b );
		
		try {
		b=0;
		System.out.println(" a / b : "+ (a/b));
		//error java.lang.ArithmeticException: / by zero
		} catch (ArithmeticException e) {
			System.out.println("a / b : DIVISION POR 0");
			e.printStackTrace();
		}
		
		double x=123.4;
		x= x/0;
		System.out.println(" Valor de x: " + x);
		//Valor de x: Infinity --Division por 0

		
		
	}

}
