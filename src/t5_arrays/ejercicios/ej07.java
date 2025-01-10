package t5_arrays.ejercicios;

public class ej07 {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = a;
		
		b[0] = 55;
		
		for (int i = 0; i<3;i++) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; i<3;i++) {
			System.out.println(b[i]);
		}

	}

}
