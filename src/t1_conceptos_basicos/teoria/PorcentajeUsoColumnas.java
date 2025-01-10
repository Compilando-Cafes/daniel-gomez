package t1_conceptos_basicos.teoria;

public class PorcentajeUsoColumnas {

	public static void main(String[] args) {
		// Definir 3 variables
			// int
			int cod;
			// double
			double importe;
			// int
			int dep;
			
			System.out.println("COD   IMPORTE     DE");
			System.out.println("---   ---------   --");
			cod=23; importe = 1000.87; dep=20;
			System.out.printf("%3d   %,9.2f   %2d\n", cod, importe, dep);
			cod=1; importe = 900.87; dep=2;
			System.out.printf("%3d   %,9.2f   %2d\n", cod, importe, dep);
			cod=345; importe = 1.87; dep=5;
			System.out.printf("%3d   %,9.2f   %2d\n", cod, importe, dep);
			
	}

}
