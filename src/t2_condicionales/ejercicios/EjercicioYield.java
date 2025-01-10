package t2_condicionales.ejercicios;

public class EjercicioYield {

	public static void main(String[] args) {
		int mes = 4;
		int dias = switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
		yield 31;
		}
		case 4, 6, 9, 11 -> {
		yield 30;
		}
		case 2 -> {
		yield 28;
		}
		default -> {
		yield -1;
		}
		};
		System.out.println("Dias: " + dias);
		}

}
