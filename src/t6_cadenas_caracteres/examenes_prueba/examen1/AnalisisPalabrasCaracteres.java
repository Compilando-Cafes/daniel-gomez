package t6_cadenas_caracteres.examenes_prueba.examen1;

import java.util.Scanner;

public class AnalisisPalabrasCaracteres {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce una frase: ");
        String fraseUsuario = sc.nextLine();
        analisisFrase(fraseUsuario);
    }

    private static void analisisFrase(String fraseUsuario) {
        // Contar cuántas palabras tiene
        int numeroPalabrasFrase = contarPalabras(fraseUsuario);
        System.out.println("La frase tiene " + numeroPalabrasFrase + " palabras.");

        // Contar vocales
        int[] numeroVocales = contarCadaVocal(fraseUsuario);
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Número de vocales:");
        for (int i = 0; i<numeroVocales.length; i++){
            System.out.println(vocales[i] + ": " + numeroVocales[i]);
        }

        // Determinar si es palíndromo
        if (esPalindromo(fraseUsuario)){
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }

    public static int contarPalabras(String cadena) {
        int contador = 1;
        for (int i = 0; i < cadena.length(); i++) {
            if (esEspacioBlanco(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esEspacioBlanco(char letra) {
        return " ".indexOf(letra) != -1;
    }

    public static int[] contarCadaVocal(String cadena) {
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

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replace(" ", "").toLowerCase();
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}