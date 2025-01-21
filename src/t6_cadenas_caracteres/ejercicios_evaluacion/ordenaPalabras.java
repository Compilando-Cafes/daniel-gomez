package t6_cadenas_caracteres.ejercicios_evaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class ordenaPalabras {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String cadenaPrueba = "hola_don_pepito_pasó_usted_ya_por_casa";
        System.out.println("Introduce una frase con las palabras separadas por guiones bajos en vez de espacios.");
        System.out.print("Frase: ");
        String cadena = sc.nextLine();

        System.out.println(ordenaPalabrasComas(cadena));
    }

    public static String ordenaPalabrasComas(String fraseOriginal) {
        String fraseOrdenada = "No has introducido nada.";
        if (!fraseOriginal.isEmpty()) {
            // Quitar los guiones y cambiarlos por espacios
            fraseOriginal = fraseOriginal.replace("_", " ");

            // Convertir a array de palabras para ordenarlas después.
            String[] palabras = fraseOriginal.split(" ");
            Arrays.sort(palabras);

            // Convertir de nuevo a String
            fraseOrdenada = String.join(", ", palabras);

            // Primero lo hice así, pero investigando vi que la manera anterior es más eficiente.
            //fraseOrdenada = Arrays.toString(palabras);
            //fraseOrdenada = fraseOrdenada.substring(1, fraseOrdenada.length() - 1);
        }
        return fraseOrdenada;
    }
}