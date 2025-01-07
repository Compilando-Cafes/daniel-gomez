package t3_bucles.ejerciciosLibro;

import java.util.Scanner;

public class A_aplicacion3_13 {

	public static void main(String[] args) {
		int horas = 24, minutos = 60, segundos = 60, incremento;
		Scanner sc = new Scanner(System.in);

		while (horas < 0 || horas > 23) {
			System.out.print("Horas (0 - 23): ");
			horas = sc.nextInt();
			sc.nextLine();
		}

		while (minutos < 0 || minutos > 59) {
			System.out.print("Minutos (0 - 59): ");
			minutos = sc.nextInt();
			sc.nextLine();
		}
		while (segundos < 0 || segundos > 59) {
			System.out.print("Segundos (0 - 59): ");
			segundos = sc.nextInt();
			sc.nextLine();
		}

		System.out.print("¿Cuántos segundos quieres incrementar la hora?: ");
		incremento = sc.nextInt();
		sc.nextLine();

		while (incremento > 0) {
			segundos++;
			incremento--;

			if (segundos >= 60) {
				segundos = 0;
				minutos++;

				if (minutos >= 60) {
					minutos = 0;
					horas++;

					if (horas >= 24) {
						horas = 0;
					}
				}
			}
		}

		System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);

		sc.close();
	}

}
