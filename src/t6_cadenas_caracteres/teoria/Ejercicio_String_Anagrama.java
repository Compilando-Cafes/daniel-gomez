package t6_cadenas_caracteres.teoria;

import java.util.Arrays;

public class Ejercicio_String_Anagrama {
    public static void main(String[] args) {
        String palabra1 = "Enterre";
        String palabra2 = "retener";

        System.out.println("Resultado: " + esAnagrama(palabra1, palabra2));

    }

    public static boolean esAnagrama(String palabra1, String palabra2) {
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        boolean resultado = false;
        if (palabra1.length() == palabra2.length()) {
            char[] arrayPalabra1 = palabra1.toCharArray();
            char[] arrayPalabra2 = palabra2.toCharArray();
            Arrays.sort(arrayPalabra1);
            Arrays.sort(arrayPalabra2);
            int contador = 0;
            for (int i = 0; i < palabra1.length(); i++) {
                if (arrayPalabra1[i] == arrayPalabra2[i]){
                    contador++;
                }
            }
            if (contador== arrayPalabra1.length){
                resultado = true;
            }

        }
        return resultado;
    }
}