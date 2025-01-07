package t1_conceptos_basicos.ejerciciosLibro;
import java.util.Scanner;

public class Actividad1_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int segundosTotales, horas, minutos, segundos;
		
		
		System.out.print("Introduce una cantidad de segundos: ");
		segundosTotales = sc.nextInt();
		sc.nextLine();
		
		horas = segundosTotales / 3600;
		minutos = (segundosTotales % 60) / 60;
		segundos = (segundosTotales % 60) % 60;
		
		System.out.println("Horas: " + horas + ", minutos: "+ minutos + " y segundos: " + segundos);
		
		
		sc.close();

	}

}
