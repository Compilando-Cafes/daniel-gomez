package t3_bucles.ejercicios;

public class ejemploContinue {

	public static void main(String[] args) {

		int valor;
		valor = 8;

		System.out.println("Tabla de multiplicar del numero " + valor);

		for (int i = 0; i <= 10; i++) {

			if (i == 0)
				continue;

			System.out.println(valor + " * " + i + " = " + valor * i);
		}
	}
}