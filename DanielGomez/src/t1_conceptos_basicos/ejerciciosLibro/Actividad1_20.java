package t1_conceptos_basicos.ejerciciosLibro;

public class Actividad1_20 {

	public static void main(String[] args) {
		// Usamos el nombre cualificado completo de las clases
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        // Solicitamos un número real al usuario
        System.out.print("Introduce un número real: ");
        double numero = sc.nextDouble();
        
        // Calculamos la raíz cuadrada utilizando Math.sqrt
        double raizCuadrada = java.lang.Math.sqrt(numero);
        
        // Mostramos el resultado
        System.out.printf("La raíz cuadrada de %.2f es %.2f%n", numero, raizCuadrada);
        
        // Cerramos el escáner
        sc.close();
		
	}

}
