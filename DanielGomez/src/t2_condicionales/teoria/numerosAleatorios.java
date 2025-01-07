package t2_condicionales.teoria;

public class numerosAleatorios {

	public static void main(String[] args) {
		
		int n = 50;
		while (n>=0) {
		int n1 = (int) (Math.random());
		int n2 = (int) (Math.random() * 99);
		int n3 = (int) (Math.random() * 99 + 1);
		int n4 = (int) (Math.random() * 99 + 90);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		n=n-1;
		}
	}

}
