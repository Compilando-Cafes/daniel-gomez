package t3_bucles.ejercicios;

public class forNumerosParesImpares {

	public static void main(String[] args) {
		// Pares 100 impares hasta 99
		String pares1 = "", impares1 = "";
		final int LIMITE = 100;
		
		for (int i = 0; i <= 100; i += 2) {
			pares1 += i + (i == 100 ? "": ", ");
		}
		
		for (int i = 1; i <= 100; i += 2) {
			impares1 += i + (i == 100 ? "": ", ");
		}
		
		System.out.println(pares1);
		System.out.println(impares1);
			
		
		
		
		
		
		
		
		
		
		String pares = "", impares = "";
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				pares += i + (i == 100 ? "": ", ");
			} else {
				impares += i + (i == 99 ? "": ", ");
			}
		}
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
		
		
		
		
		
		
		
		
		
		String pares3 = "", impares3 = "";
		
		for (int par = 2, impar = 1; par <= LIMITE ; par+=2, impar +=2) {
			
				pares3 += par + (par == 100 ? "": ", ");
				impares3 += impar + (impar == LIMITE-1  ? "": ", ");
		
		}
		
		System.out.println(pares3);
		System.out.println(impares3);
	}

}








