import java.util.Arrays;

public class UtilesArrays {

	// Función para mostrar una tabla [-,-,-,-]
	public static void mostrarArray(int[] array) {System.out.println(Arrays.toString(array));
	}

	// Función para mostrar una tabla con for each
	public static void mostrarArrayForEach(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Función para mostrar una tabla con for
	public static void mostrarArrayFor(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// Función para intercambiar una posición de un array por otra dadas, si supera el maximo permitido lo coloca al final.
	public static void intercambiarPosicionesArray(char[] array, int posicion1, int avance) {
		int nuevaPosicion = posicion1 + avance;
		if (nuevaPosicion >= array.length) {
			nuevaPosicion = array.length - 1;
		}
		array[nuevaPosicion] = array[posicion1];
		array[posicion1] = '.';
	}

	// Función para buscar en una tabla con while que devuelve la posición o -1 si no lo encuentra
	public static int buscarEnArrayPosicion(int[] array, int valor) {
		int i = 0;
		while (i < array.length && array[i] != valor) {
			i++;
		}
		if (i < array.length) {
			return i;
		} else {
			return -1;
		}
	}

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

	// Buscar en una tabla con binarySearch
	public static int buscarEnArray(int[] array, int valor) {
		return Arrays.binarySearch(array, valor);
	}

	// Función para insertar algo en una tabla ordenada con System.arraycopy
	public static void insertarEnArrayOrdenadoConSystem(int[] array, int valor) {
		int posicion = Arrays.binarySearch(array, valor);
		if (posicion < 0) {
			posicion = -posicion - 1;
			array = Arrays.copyOf(array, array.length + 1);
			System.arraycopy(array, posicion, array, posicion + 1, array.length - posicion - 1);
			array[posicion] = valor;
		}
	}

	// Función para insertar algo en una tabla no ordenada, al final
	public static void insertarEnArray(int[] array, int valor) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = valor;
	}

	// Función para eliminar un elemento en una tabla no ordenada
	public static void eliminarEnArray(int[] array, int valor) {
		int posicion = Arrays.binarySearch(array, valor);
		if (posicion >= 0) {
			for (int i = posicion; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			array = Arrays.copyOf(array, array.length - 1);
		}
	}

	// Función para eliminar un elemento en una tabla ordenada
	public static void eliminarEnArrayOrdenado(int[] array, int valor) {
		int posicion = Arrays.binarySearch(array, valor);
		if (posicion >= 0) {
			System.arraycopy(array, posicion + 1, array, posicion, array.length - posicion - 1);
			array = Arrays.copyOf(array, array.length - 1);
		}
	}

	// Función que recibe un array y lo invierte, lo pone al revés, le da la vuelta.
	public static void invertirArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int aux = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = aux;
		}
	}

	// Función que invierte una cadena y lo que tiene también
	public static String invertirCadena(String cadena) {
		String invertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
		}
		return invertida;
	}

	// Función que da la vuelta a una fila de un array bidimensional
	public static void invertirFilaArrayBidimensional(int[][] array, int fila) {
		for (int i = 0; i < array[fila].length / 2; i++) {
			int aux = array[fila][i];
			array[fila][i] = array[fila][array[fila].length - 1 - i];
			array[fila][array[fila].length - 1 - i] = aux;
		}
	}

	// Función que da la vuelta a una columna de un array bidimensional
	public static void invertirColumnaArrayBidimensional(int[][] array, int columna) {
		for (int i = 0; i < array.length / 2; i++) {
			int aux = array[i][columna];
			array[i][columna] = array[array.length - 1 - i][columna];
			array[array.length - 1 - i][columna] = aux;
		}
	}

	// Funcion que borra una posicion de un array
	public static void borrarPosicionArray(int[] array, int posicion) {
		for (int i = posicion; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = 0;
	}

	// Función que adelanta un puesto en un array siempre que no sea el primero
	public static void adelantarPosicionArray(int[] array, int posicion) {
		if (posicion != 0) {
			int aux = array[posicion];
			array[posicion] = array[posicion - 1];
			array[posicion - 1] = aux;
		}
	}

	// Función que lleva al último puesto de la funcion una posición recibida
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

	// Función para mostrar un array bidimensional
	public static void mostrarArrayBidimensional(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(Arrays.toString(array[i]));
		}
		System.out.println();
	}

	// Función para mostrar un array bidimensional de enteros con un formato de 3 espacios
	public static void mostrarArrayBidimensionaEnterosConFormatol(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j< array.length; j++){
				System.out.printf("%-3d", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	// Función para mostrar el mayor y menor de un array bidimensional
	public static void mayorMenorMatrizBidimensional(int[][] matriz) {
		int mayor = matriz[0][0];
		int menor = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > mayor) {
					mayor = matriz[i][j];
				}
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}
		System.out.println("El mayor valor de la matriz es: " + mayor);
		System.out.println("El menor valor de la matriz es: " + menor);
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

	// Función para multiplicar todos los elementos de un array
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

	// Función para quitar las palabras repetidas de una frase y mostrarla
	private static void fraseSinRepeticiones(String frase) {
		String[] resultado = frase.split(" ");
		for (int i = 0; i < resultado.length; i++) {
			for (int j = i + 1; j < resultado.length; j++) {
				if (resultado[i].equalsIgnoreCase(resultado[j])) {
					resultado[j] = "";
				}
			}
		}
		String resultadoString = Arrays.toString(resultado);
		resultadoString = resultadoString.replace(", ", " ");
		resultadoString = resultadoString.substring(1, resultadoString.length() - 1);
		System.out.println(resultadoString);
	}

	// Función para quitar los números repetidos de una frase y mostrarla
	private static void fraseSinNumerosRepetidos(String frase) {
		String[] resultado = frase.split(" ");
		for (int i = 0; i < resultado.length; i++) {
			for (int j = i + 1; j < resultado.length; j++) {
				if (resultado[i].equalsIgnoreCase(resultado[j])) {
					resultado[j] = "";
				}
			}
		}
		String resultadoString = Arrays.toString(resultado);
		resultadoString = resultadoString.replace(", ", " ");
		resultadoString = resultadoString.substring(1, resultadoString.length() - 1);
		System.out.println(resultadoString);
	}


	// Función para encontrar la media de un array usando la función de sumarArray
	public static double mediaArray(int[] array) {
		return (double) sumarArray(array) / array.length;
	}

	// Función para encontrar el máximo y el mínimo de un array
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

	public static int[] contarCadaVocal(String cadena) {
		int[] contador = new int[5];
		for (int i = 0; i < cadena.length(); i++) {
			switch (cadena.charAt(i)){
				case 'a' -> contador[0]++;
				case 'e' -> contador[1]++;
				case 'i' -> contador[2]++;
				case 'o' -> contador[3]++;
				case 'u' -> contador[4]++;
			}
		}
		return contador;
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

	public static int[] contarCadaVocalMayusMinusAcentos(String cadena) {
		cadena = cadena.toLowerCase();
		int[] contador = new int[5];
		for (int i = 0; i < cadena.length(); i++) {
			switch (cadena.charAt(i)){
				case 'a', 'á' -> contador[0]++;
				case 'e', 'é' -> contador[1]++;
				case 'i', 'í' -> contador[2]++;
				case 'o', 'ó' -> contador[3]++;
				case 'u', 'ú' -> contador[4]++;
			}
		}
		return contador;
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
	public static boolean esPrimo(int numero) {
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
	// Función que rote una matriz bidimensional 90 grados a la derecha
	public static int[][] rotarMatrizDerecha(int[][] matriz) {
		int[][] matrizRotada = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizRotada.length; i++) {
			for (int j = 0; j < matrizRotada[i].length; j++) {
				matrizRotada[i][j] = matriz[matriz.length - 1 - j][i];
			}
		}
		return matrizRotada;
	}
	// Función que transpone una matriz bidimensional o le cambia las filas por las columnas
	public static int[][] transponerMatriz(int[][] matriz) {
		int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizTranspuesta.length; i++) {
			for (int j = 0; j < matrizTranspuesta[i].length; j++) {
				matrizTranspuesta[i][j] = matriz[j][i];
			}
		}
		return matrizTranspuesta;
	}


	// Función que añade un elemento a un array de strings
	public static String[] anadirElementoArray(String[] array, String elemento) {
		String[] nuevoArray = Arrays.copyOf(array, array.length + 1);
		nuevoArray[nuevoArray.length - 1] = elemento;
		return nuevoArray;
	}

	// Función que elimina o quita un elemento de un array de strings
	public static String[] eliminarElementoArray(String[] array, String elemento) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (!array[i].equalsIgnoreCase(elemento)) {
				contador++;
			}
		}
		String[] nuevoArray = new String[contador];
		contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (!array[i].equalsIgnoreCase(elemento)) {
				nuevoArray[contador] = array[i];
				contador++;
			}
		}
		return nuevoArray;
	}

	public static String[] eliminarElemento(String[] array, String elemento) {
		int index = -1;

		// Buscar el índice del elemento a eliminar
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase(elemento)) { // Ignora mayúsculas y minúsculas
				index = i;
				break;
			}
		}

		// Si no se encuentra el elemento, devolver el array sin cambios
		if (index == -1) {
			return array;
		}

		// Mover los elementos una posición atrás
		System.arraycopy(array, index + 1, array, index, array.length - index - 1);

		// Reducir el tamaño del array
		return Arrays.copyOf(array, array.length - 1);
	}

	// Buscar en un array de String y devuelve true si está o false si no está
	public static boolean buscarEnArrayString(String[] array, String valor) {
		boolean encontrado = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase(valor)) {
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}
}
