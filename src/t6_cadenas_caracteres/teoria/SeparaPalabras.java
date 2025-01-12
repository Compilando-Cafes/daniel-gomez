package t6_cadenas_caracteres.teoria;

import java.util.Scanner;

public class SeparaPalabras {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Dime una frase y la mostraré sin espacios y separada por palabras: ");
        String frase = sc.nextLine();

        System.out.println("Frase: " + frase);
        cambiarCadena(frase);
    }
    public static void cambiarCadena (String cadena){
        String sinEspacios = "";
        String palabraPorLinea = "";

        for (int i = 0; i<cadena.length(); i++){
            palabraPorLinea += cadena.charAt(i);
            if (!Character.isWhitespace(cadena.charAt(i))){
                sinEspacios += cadena.charAt(i);
            }
            if (Character.isWhitespace(cadena.charAt(i))){
                palabraPorLinea += "\n";
            }
        }
        System.out.println("\nSin espacios:");
        System.out.println(sinEspacios);

        System.out.println("\nUna palabra por línea:");
        System.out.println(palabraPorLinea);

    }
}