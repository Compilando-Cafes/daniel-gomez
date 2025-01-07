package t3_bucles.ejerciciosLibro;

public class A_resuelta3_10_2 {

	public static void main(String[] args) {
		int sumaPares = 0, sumaImpares = 0;
		
		for (int i = 1; i <= 10; i++) {
			int impar = 2 * i-1;
			int par = 2 * i;
			sumaImpares += impar;
			sumaPares += par;
		}
		
		System.out.println("Suma 10 primero pares: " + sumaPares);
		System.out.println("Suma 10 primeros impares: " + sumaImpares);
	}
}
