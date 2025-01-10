package t4_funciones.ejercicios;

public class ejercicio1_Varios_Metodos {

	// 1) Método que reciba un número double y un entero y devuelva el número de
	// tipo double elevado al número de tipo entero.
	public static double potencias(double numero, int potencia) {
		return Math.pow(numero, potencia);
	}

	// 2) Método que devuelva el entero mayor de tres enteros dados como parámetros.
	public static int numeroMayor(int num1, int num2, int num3) {
		System.out.print("De los números " + num1 + ", " + num2 + " y " + num3 + " el mayor es el: ");
		int max = 0;
		if (num1 >= num2 && num1 >= num3)
			max = num1;
		if (num2 >= num1 && num2 >= num3)
			max = num2;
		if (num3 >= num1 && num3 >= num2)
			max = num3;

		return max;
	}

	// 3) Método que devuelva el entero menor de tres enteros dados como parámetros
	public static int numeroMenor(int num1, int num2, int num3) {
		System.out.print("De los números " + num1 + ", " + num2 + " y " + num3 + " el menor es el: ");
		int min = 0;
		if (num1 <= num2 && num1 <= num3)
			min = num1;
		if (num2 <= num1 && num2 <= num3)
			min = num2;
		if (num3 <= num1 && num3 <= num2)
			min = num3;

		return min;
	}

	// 4) Método que devuelva el entero central de tres enteros dados como
	// parámetros.
	public static int numeroMediano(int num1, int num2, int num3) {
		System.out.print("De los números " + num1 + ", " + num2 + " y " + num3 + " el mediano es el: ");
		int mediano = 0;

		if (num1 >= num2 && num1 <= num3)
			mediano = num1;
		if (num1 >= num3 && num1 <= num2)
			mediano = num1;
		if (num2 >= num1 && num2 <= num3)
			mediano = num2;
		if (num2 >= num3 && num2 <= num1)
			mediano = num2;
		if (num3 >= num1 && num3 <= num2)
			mediano = num3;
		if (num3 >= num2 && num3 <= num1)
			mediano = num3;

		return mediano;
	}

	// 5) Método que devuelve verdadero o falso dependiendo de si el carácter que
	// recibe es una letra minúscula o no.
	public static boolean minuscula(char c) {
		boolean resultado = false;
		System.out.print("¿" + c + " es una letra minúscula? ");
		if (c >= 'a' && c <= 'z') {
			resultado = true;
		}

		return resultado;
	}

	// 6) Método que devuelve verdadero o falso dependiendo de si una fecha (dando
	// el día, el mes y el año como parámetros) es válida o no.
	public static boolean fechaCorrecta(int dia, int mes, int agno) {
		System.out.print("¿La fecha: " + dia + "/" + mes + "/" + agno + " es correcta? ");
		boolean resultado = false;
		if (agno > 0) {
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 1, 3, 5, 7, 8, 10, 12 -> {
					if (dia >= 1 && dia <= 31) {
						resultado = true;
					}
				}
				case 4, 6, 9, 11 -> {
					if (dia >= 1 && dia <= 30) {
						resultado = true;
					}
				}
				case 2 -> {
					if (esBisiesto(agno)) {
						if (dia >= 1 && dia <= 29) {
							System.out.print("!Un año bisiesto! ");
							resultado = true;
						}
					} else {
						if (dia >= 1 && dia <= 28) {
							resultado = true;
						}
					}
				}
				default -> resultado = false;
				}
			}
		}
		return resultado;
	}

	public static boolean esBisiesto(int agno) {
		boolean resultado = false;
		if (agno % 4 == 0)
			if (agno % 100 != 0 || agno % 400 == 0)
				resultado = true;

		return resultado;
	}

	// 7) Método que devuelve el número de cifras de un número entero que recibe
	// como parámetro.
	public static int cifrasNumero(int n) {
		System.out.print("El número " + n + " tiene las siguientes cifras: ");
		if (n < 0) {

		}
		int cifras = 0;
		for (int i = n; i > 0; i /= 10) {
			cifras++;
		}

		return cifras;
	}

	// 8) Método que recibe una letra y devuelve true si se trata de una vocal, en
	// caso contrario devuelve false.
	public static boolean vocal(char c) {
		System.out.print("¿" + c + " es una vocal? ");
		boolean resultado = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
				|| c == 'I' || c == 'O' || c == 'U');
		return resultado;
	}

	// 9) Método que recibe dos números enteros y un carácter indicando la operación
	// a realizar con esos números: suma, resta, multiplica o divide ( +, - , *, / )
	// y devuelve un entero con el resultado de la operación. En una división por 0
	// debe devolver 0
	public static int operaciones(int n1, int n2, char c) {
		System.out.print(n1 + " " + c + " " + n2 + " = ");
		int resultado = 0;
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			switch (c) {
			case '+'-> resultado = n1 + n2;
			case '-' -> resultado = n1 - n2;
			case '*' -> resultado = n1 * n2;
			case '/' -> {
				if (n2 != 0)
					resultado = n1/n2;
			}
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		/*
		 * REALIZA UN MÉTODO main QUE LLAME A LOS MÉTODOS ANTERIORES Y VISUALICE LA
		 * INFORMACIÓN PERTINENTE DEPENDIENDO DE LO QUE DEVUELVA CADA LLAMADA.
		 */
		// 1:
		System.out.printf("La potencia es: %,.2f%n", potencias(2.5, 3));
		System.out.printf("La potencia es: %,.2f%n", potencias(2, 2));

		// 2:
		System.out.println();
		System.out.println(numeroMayor(2, 4, 6));
		System.out.println(numeroMayor(6, 5, 4));
		System.out.println(numeroMayor(6, 7, 5));
		System.out.println(numeroMayor(1, 1, 1));

		// 3:
		System.out.println();
		System.out.println(numeroMenor(2, 4, 6));
		System.out.println(numeroMenor(6, 5, 4));
		System.out.println(numeroMenor(6, 2, 5));
		System.out.println(numeroMenor(1, 1, 1));

		// 4:
		System.out.println();
		System.out.println(numeroMediano(2, 4, 6));
		System.out.println(numeroMediano(6, 3, 4));
		System.out.println(numeroMediano(6, 2, 5));
		System.out.println(numeroMediano(1, 1, 1));

		// 5:
		System.out.println();
		System.out.println(minuscula('2'));
		System.out.println(minuscula('A'));
		System.out.println(minuscula('$'));
		System.out.println(minuscula('b'));

		// 6:
		System.out.println();
		System.out.println(fechaCorrecta(2, 10, 1900));
		System.out.println(fechaCorrecta(2, 10, -1));
		System.out.println(fechaCorrecta(2, 13, 2024));
		System.out.println(fechaCorrecta(45, 10, 1900));
		System.out.println(fechaCorrecta(29, 10, 2024));
		System.out.println(fechaCorrecta(29, 2, 2020));
		System.out.println(fechaCorrecta(29, 2, 2021));

		// 7:
		System.out.println();
		System.out.println(cifrasNumero(5));
		System.out.println(cifrasNumero(55));
		System.out.println(cifrasNumero(555));
		System.out.println(cifrasNumero(0));
		System.out.println(cifrasNumero(-45));

		// 8:
		System.out.println();
		System.out.println(vocal('c'));
		System.out.println(vocal('2'));
		System.out.println(vocal('%'));
		System.out.println(vocal('A'));
		System.out.println(vocal('i'));

		// 9:
		System.out.println();
		System.out.println(operaciones(4, 2, '+'));
		System.out.println(operaciones(4, 2, '-'));
		System.out.println(operaciones(2, 4, '*'));
		System.out.println(operaciones(4, 2, '/'));
		System.out.println(operaciones(2, 4, '/'));
		System.out.println(operaciones(4, 0, '/'));

	}

}
