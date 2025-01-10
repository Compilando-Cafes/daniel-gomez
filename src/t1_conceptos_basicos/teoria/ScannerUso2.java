package t1_conceptos_basicos.teoria;

import java.util.Scanner;

public class ScannerUso2 {

	public static void main(String[] args) {
		
		 String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();

//		Scanner teclado = new Scanner(System.in);
//		
//		System.out.println("Ingrese su nombre: ");
//		String nombre = teclado.nextLine();
//		
//		System.out.println("Ingrese su Edad: ");
//		int edad = teclado.nextInt();
//		teclado.nextLine(); //Después de todos poner el nextLine() para que continue ejecutándose
//		
//		System.out.println("Dame un curso: ");
//		int curso = teclado.nextInt();
//		teclado.nextLine();
//		
//		System.out.println("Dame media: ");
//		float media= teclado.nextFloat();
//		teclado.nextLine();
//		
//		System.out.println("Dame asignatura: ");
//		String asignatura = teclado.nextLine();
//		
//		System.out.println("Nombre: " + nombre);
//		System.out.println("Edad: " + edad);
//		System.out.println("Curso: " + curso);
//		System.out.println("Media: " + media);
//		System.out.println("Asignatura: " + asignatura);
//		
//		teclado.close(); // Cerrar Scanner
	}

}
