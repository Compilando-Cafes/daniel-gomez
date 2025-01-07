package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;

public class Actividad1_22 {

	public static void main(String[] args) {
		double longitud;
		Scanner sc = new Scanner(System.in);
		int resultado;
		
		System.out.print("Longitud del lanzamiento en metros: ");
		longitud = sc.nextDouble();
		
		resultado = (int)(longitud * 100); 
		System.out.print("Resultado: " + resultado + " cm");
		
		
		
		sc.close();
	}

}
