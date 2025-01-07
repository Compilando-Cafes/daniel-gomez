package t3_bucles.ejercicios;

public class factorial1A10 {

	public static void main(String[] args) {
		System.out.println("1! = 1");
		
		
		for (int i = 2; i <= 10; i++) {
			long resultado = 1;
			System.out.print(i + "!" + " = ");
			for (int j = 1; j <=i; j++) {
				System.out.print(j==i ? j: j + " * ");
				resultado *= j;
			}
			System.out.print(" = " + resultado + "\n");
		}

	}

}
