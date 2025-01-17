package t6_cadenas_caracteres.teoria;

import java.util.Arrays;

public class Ejercicio4_String_Frase_Numeros_Espacios {
    public static void main(String[] args) {
        String cadena = "EsTo3eS4mUy6uTiL";
        System.out.println("La suma de los números es: " + secuenciaNumerosLetras(cadena));
    }

    public static int secuenciaNumerosLetras(String texto) {
        int suma = 0;
        char[] arrayTexto = texto.toCharArray();
        for (int i = 0; i < arrayTexto.length; i++) {
            if (Character.isDigit(arrayTexto[i])) {
                suma += Integer.parseInt(String.valueOf(arrayTexto[i]));
                arrayTexto[i] = ' ';
            }
        }
        String textoFinal = String.valueOf(arrayTexto).toLowerCase();
        textoFinal = textoFinal.substring(0, 1).toUpperCase() + textoFinal.substring(1);
        System.out.println("La frase es: " + textoFinal);
        return suma;
    }
}