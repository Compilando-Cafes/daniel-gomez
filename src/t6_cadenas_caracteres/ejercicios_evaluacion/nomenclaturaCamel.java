package t6_cadenas_caracteres.ejercicios_evaluacion;

import java.util.Scanner;

public class nomenclaturaCamel {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println(camel(frase));
    }

    public static String camel(String frase) {
        // Poner frase en minúsculas
        frase = frase.toLowerCase();

        // Quitar los espacios al comienzo
        frase = frase.stripLeading();

        // Si empieza con un número lo quita
        while (Character.isDigit(frase.charAt(0))){
            frase = frase.substring(1);
        }

        // Quitar los espacios y rehacer la frase
        while (frase.contains(" ")){
            int posicion = frase.indexOf(" ");
            char letra = frase.charAt(posicion+1);
            letra = Character.toUpperCase(letra);
            frase = frase.substring(0, posicion) + letra + frase.substring(posicion+2);
        }

        return frase;
    }
}