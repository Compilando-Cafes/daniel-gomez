package t6_cadenas_caracteres.ejercicios_libro;

import java.util.Scanner;

public class AR6_08_Javalandia_Javalandes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                ==============================================
                BIENVENIDO A JAVALANDIA
                Esto es un traductor de Javalandés
                ==============================================""");
        System.out.print("Introduce la frase que quieras traducir: ");
        String frase = sc.nextLine();
        traductorJavalandes(frase);
    }

    private static void traductorJavalandes(String frase) {
        final String prefijo = "Javalín, javalón, ";
        final String sufijo = " javalén, len, len.";
        if (frase.startsWith(prefijo)) {
            System.out.println("Es una frase en Javalandés!!! Traduciendo...:");
            frase = frase.substring(prefijo.length());
            System.out.println(frase);
        } else if (frase.endsWith(sufijo)) {
            System.out.println("Es una frase de un dialecto del Javalandés!!! Traduciendo...:");
            frase = frase.substring(0, frase.length() - sufijo.length());
            System.out.println(frase);
        } else {
            System.out.println("Traduciendo a Javalandés y su dialecto...: ");
            frase = prefijo + frase + sufijo;
            System.out.println(frase);
        }
    }
}