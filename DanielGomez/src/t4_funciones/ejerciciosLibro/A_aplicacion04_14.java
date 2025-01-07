package t4_funciones.ejerciciosLibro;

public class A_aplicacion04_14 {

	public static void main(String[] args) {

		System.out.println("Segundos: " + segundos(2, 1, 5));
		
	}

	public static int segundos(int dias, int horas, int minutos) {

		return (dias * 24) + (horas * 60) + (minutos * 60);

	}

}
