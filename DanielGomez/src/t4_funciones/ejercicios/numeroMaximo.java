package t4_funciones.ejercicios;

public class numeroMaximo {

	public static void main(String[] args) {
		/*
		 * You are given a positive integer num consisting only of digits 6 and 9.
		 * 
		 * Return the maximum number you can get by changing at most one digit (6
		 * becomes 9, and 9 becomes 6).
		 */
		numeroMaximo(8);
	}



	public static int numeroMaximo(int num) {
		int c = 1;
		int contador = 0;
		int contador2 = 1;
		int cociente = num;
		int numero2 = num;
		int resultado2 = 1;
		int result = 0;
		int resultado3 = 0;
		int valorfinal = num;
		int l = 0;
		int valorreturn = 0;
		do {
			num /= 10;
			c *= 10;
			l++;
		} while (num > 0);
		c /= 10;
		int d = c;
		do {
			c = d;
			contador = 0;
			cociente = numero2;
			resultado2 = 1;

			do {
				contador++;
				result = cociente / c;
				cociente = cociente % c;

				if (contador2 == contador) {
					// System.out.println(contador);
					if (result == 6) {
						result = 9;
						valorreturn = 1;
						// System.out.println("cambio a 9");

					} else if (result == 9) {
						result = 6;
						// System.out.println("cambio a 6");
					} else
						result = result;
				}
				// System.out.println(result*c);
				// System.out.println("resultoperacion"+result*c);
				resultado2 += result * c;

				c = c / 10;
			} while (c > 0);

			if (resultado2 > resultado3) {
				resultado3 = resultado2;
				resultado3 -= 1;
				resultado2 -= 1;
			}
			// System.out.println(resultado3);
			contador2++;
		} while (contador2 <= l);
		if (valorreturn != 1)
			return valorfinal;

		return resultado3;
	}

}

