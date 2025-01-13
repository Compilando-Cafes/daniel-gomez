package t6_cadenas_caracteres.ejercicios_libro;

import java.util.Scanner;

public class AR6_06_Nombre_Sin_Vocales {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine();
        System.out.println(mostrarNombreSinVocales(nombre));
    }

    private static String mostrarNombreSinVocales(String nombre) {
        String resultado = "";
        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            if (!esVocal(caracter)) {
                resultado += caracter;
            }
        }
        return resultado;
    }

    private static boolean esVocal(char caracter) {
        boolean resultado = false;
        String vocales = "aeiouáéíóú";
        caracter = Character.toLowerCase(caracter);
        if (vocales.indexOf(caracter) >= 0) {
            resultado = true;
        }
        return resultado;

    }
}