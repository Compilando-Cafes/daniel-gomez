package t5_arrays.utiles_arrays;

import java.util.Arrays;

public class utiles_arrays {

	// Funcion que recibe un array y lo ordena directamente con sort
	public static void ordenarArray(int[] array) {
		Arrays.sort(array);
	}

	// Funcion que recibe un array y lo ordena directamente sin sort
	public static void ordenarArraySinSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

	// Funcion que recibe un array y lo invierte
	public static void invertirArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int aux = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = aux;
		}
	}

	// Funcion que borra una posicion de un array
	public static void borrarPosicionArray(int[] array, int posicion) {
		for (int i = posicion; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = 0;
	}

	// Funcion que adelanta un puesto en un array siempre que no sea el primero
	public static void adelantarPosicionArray(int[] array, int posicion) {
		if (posicion != 0) {
			int aux = array[posicion];
			array[posicion] = array[posicion - 1];
			array[posicion - 1] = aux;
		}
	}

	// Funcion que lleva al último puesto de la funcion una posición recibida
	public static void llevarAlFinalArray(int[] array, int posicion) {
		int aux = array[posicion];
		for (int i = posicion; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = aux;
	}

	// Función que busca un valor en un array desordenado y devuelve la posición
	public static int buscarValorArray(int[] array, int valor) {
		int posicion = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}

	// Función que busca un valor en un array ordenado usando Arrays.binarySearch
	public static int buscarValorArrayOrdenado(int[] array, int valor) {
		return Arrays.binarySearch(array, valor);
	}

	// Función que devuelva true si encuentra un valor
	public static boolean contieneValor(int[] array, int valor) {
		for (int num : array) {
			if (num == valor) {
				return true;
			}
		}
		return false;
	}

	// Funcion para copiar otra funcion con copyOf
	public static int[] copiarArray(int[] array) {
		return Arrays.copyOf(array, array.length);
	}

	// Función para agrandar o reducir un array con copyOf
	public static int[] agrandarArray(int[] array, int longitud) {
		return Arrays.copyOf(array, longitud);
	}

	// Función para insertar un valor en un array en una posición determinada
	public static int[] insertarValorArray(int[] array, int valor, int posicion) {
		int[] nuevoArray = Arrays.copyOf(array, array.length + 1);
		for (int i = nuevoArray.length - 1; i > posicion; i--) {
			nuevoArray[i] = nuevoArray[i - 1];
		}
		nuevoArray[posicion] = valor;
		return nuevoArray;
	}

	// Función para insertar un valor en un array ordenado buscando con binaySearch
	// haciendola más grande
	public static void insertarValorArrayOrdenado(int[] array, int valor) {
		int posicion = Arrays.binarySearch(array, valor);
		if (posicion < 0) {
			posicion = -posicion - 1;
			array = Arrays.copyOf(array, array.length + 1);
			for (int i = array.length - 1; i > posicion; i--) {
				array[i] = array[i - 1];
			}
			array[posicion] = valor;
		}
	}

	// Función para insertar un valor al final de un array
	public static void insertarValorArrayAlFinal(int[] array, int valor) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = valor;
	}

	// Función para comparar dos tablas y que diga true si son iguales
	public static boolean compararTablas(int[] tabla1, int[] tabla2) {
		boolean iguales = true;
		if (tabla1.length == tabla2.length) {
			for (int i = 0; i < tabla1.length; i++) {
				if (tabla1[i] != tabla2[i]) {
					iguales = false;
					break;
				}
			}
		} else {
			iguales = false;
		}
		return iguales;
	}

	// Función para comparar dos tablas y que diga true si son iguales con
	// Arrays.equals
	public static boolean compararTablasConArrays(int[] tabla1, int[] tabla2) {
		return Arrays.equals(tabla1, tabla2);
	}

	// Función para mostrar un array binario
	public static void mostrarArrayBinario(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(Arrays.toString(array[i]));
		}
		System.out.println();
	}

	// Función para mostrar un array binario con un forEach
	public static void mostrarArrayBinarioConForEach(int[][] array) {
		for (int[] fila : array) {
			System.out.println(Arrays.toString(fila));
		}
	}

	// Función para eliminar duplicados de un array
	public static int[] eliminarDuplicadosArray(int[] array) {
		int[] nuevoArray = new int[array.length];
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			boolean repetido = false;
			for (int j = 0; j < contador; j++) {
				if (array[i] == nuevoArray[j]) {
					repetido = true;
					break;
				}
			}
			if (!repetido) {
				nuevoArray[contador] = array[i];
				contador++;
			}
		}
		return Arrays.copyOf(nuevoArray, contador);
	}

	// Función para generar un array con números aleatorios
	public static int[] generarArrayAleatorio(int longitud, int minimo, int maximo) {
		int[] array = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
		}
		return array;
	}

	// Función para calcular la suma de todos los elementos de un array
	public static int sumarArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

	// Funcion para multiplicar todos los elementos de un array
	public static int multiplicarArray(int[] array) {
		int producto = 1;
		for (int i = 0; i < array.length; i++) {
			producto *= array[i];
		}
		return producto;
	}

	// Función para encontrar el mayor de un array
	public static int mayorArray(int[] array) {
		int mayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}

	// Función para encontrar el menor de un array
	public static int menorArray(int[] array) {
		int menor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < menor) {
				menor = array[i];
			}
		}
		return menor;
	}

	// Función para encontrar la media de un array usando la funcion de sumarArray
	public static double mediaArray(int[] array) {
		return (double) sumarArray(array) / array.length;
	}

	// Funcion para encontrar el máximo y el mínimo de un array
	public static int[] mayorYMenorArray(int[] array) {
		int[] mayorYMenor = new int[2];
		mayorYMenor[0] = array[0];
		mayorYMenor[1] = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > mayorYMenor[0]) {
				mayorYMenor[0] = array[i];
			}
			if (array[i] < mayorYMenor[1]) {
				mayorYMenor[1] = array[i];
			}
		}
		return mayorYMenor;
	}

	// Función para concatenar dos arrays
	public static int[] concatenarArrays(int[] array1, int[] array2) {
		int[] arrayConcatenado = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			arrayConcatenado[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			arrayConcatenado[array1.length + i] = array2[i];
		}
		return arrayConcatenado;
	}

	// Función para rotar un array a la derecha
	public static void rotarArrayDerecha(int[] array) {
		int aux = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = aux;
	}

	// Función para rotar un array a la izquierda
	public static void rotarArrayIzquierda(int[] array) {
		int aux = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = aux;
	}

	// Función para comprobar si un array está ordenado
	public static boolean estaOrdenadoArray(int[] array) {
		boolean ordenado = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				ordenado = false;
				break;
			}
		}
		return ordenado;
	}

	// Función para contar ocurrencias de un valor en un array
	public static int contarOcurrenciasArray(int[] array, int valor) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				contador++;
			}
		}
		return contador;
	}

	// Función para buscar los índices de todas las ocurrencias de un valor
	public static int[] indicesDeOcurrencias(int[] array, int valor) {
		int[] temp = new int[array.length];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				temp[count++] = i;
			}
		}
		return Arrays.copyOf(temp, count);
	}

	// Función para reemplazar un valor por otro
	public static void reemplazarValorArray(int[] array, int valor1, int valor2) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor1) {
				array[i] = valor2;
			}
		}
	}

	// Función para contar los valores pares y los impares de un array
	public static int[] contarParesImparesArray(int[] array) {
		int[] paresImpares = new int[2];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				paresImpares[0]++;
			} else {
				paresImpares[1]++;
			}
		}
		return paresImpares;
	}

	// Hacer un array de números primos hasta un límite dado calculando internamente
	// si es primo
	public static int[] numerosPrimosHasta(int limite) {
		int[] primos = new int[limite];
		int contador = 0;
		for (int i = 2; i <= limite; i++) {
			if (esPrimo(i)) {
				primos[contador] = i;
				contador++;
			}
		}
		return Arrays.copyOf(primos, contador);
	}

	// Función que calcula si un número es primo
	private static boolean esPrimo(int numero) {
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}

	// Función para sumar los elementos de dos arrays
	public static int[] sumarArrays(int[] array1, int[] array2) {
		int[] suma = new int[Math.max(array1.length, array2.length)];
		for (int i = 0; i < suma.length; i++) {
			if (i < array1.length) {
				suma[i] += array1[i];
			}
			if (i < array2.length) {
				suma[i] += array2[i];
			}
		}
		return suma;
	}

}
