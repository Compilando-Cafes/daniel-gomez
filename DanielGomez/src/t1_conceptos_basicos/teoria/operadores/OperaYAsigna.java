package t1_conceptos_basicos.teoria.operadores;

public class OperaYAsigna {

	public static void main(String[] args) {
//		int a = 6;
//		int b = -2;
//		int c = 3;
//
//		a += 5;
//		System.out.println("a = " + a);
//
//		a += b;
//		System.out.println("a = " + a);
//
//		a += b + c;
//		System.out.println("a = " + a);
//
//		a *= b + c;
//		System.out.println("a = " + a);

		int a,b,c;
		a = -3; b = 7; c = -2;
		a += b++ - c--;
		b *= --c;
		c += a * b++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
