package t6_cadenas_caracteres.examenes_prueba.examen1;

import java.util.Arrays;
import java.util.Scanner;

public class ProcesamientoAvanzadoCadenas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        // Dividir la cadena en palabras
        String[] cadena = dividirCadenaEnPalabras(frase);

        // Palabras ordenadas alfabéticamente
        ordenarAlfabeticamente(cadena);

        // Reemplazar todas las vocales de un array por *
        reemplazarVocalesPorAsteriscos(cadena);

        // Cadena invertida
        invertirCadena(cadena);
        System.out.println("Cadena invertida: " + Arrays.toString(cadena));

    }
    public static void ordenarAlfabeticamente(String[] palabras) {
        String[] copia = palabras.clone();
        // Poner primera letra de cada palabra en mayúscula
        for (int i = 0; i < copia.length; i++) {
            copia[i] = copia[i].substring(0, 1).toUpperCase() + copia[i].substring(1);
        }
        Arrays.sort(copia);
        System.out.println("Palabras ordenadas alfabéticamente: " + Arrays.toString(copia));
    }

    public static String[] dividirCadenaEnPalabras(String cadena) {
        String[] palabras = cadena.split(" ");
        System.out.println("Palabras: " + Arrays.toString(palabras));
        return palabras;
    }

    public static void reemplazarVocalesPorAsteriscos(String[] palabras) {
        String [] copia = palabras.clone();
        for (int i = 0; i < copia.length; i++) {
            copia[i] = copia[i].replace("a", "*").replace("e", "*").replace("i", "*").replace("o", "*").replace("u", "*");
        }
        System.out.println("Palabras con vocales reemplazadas por asteriscos: " + Arrays.toString(copia));
    }

    public static void invertirCadena(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }
    }
}