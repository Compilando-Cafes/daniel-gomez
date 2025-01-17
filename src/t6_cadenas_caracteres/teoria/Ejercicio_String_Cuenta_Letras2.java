package t6_cadenas_caracteres.teoria;

import java.util.Arrays;

public class Ejercicio_String_Cuenta_Letras2 {
    public static void main(String[] args) {
        String cadena = "patata camaleón batata";
        System.out.println(Arrays.toString(CuentaLetras2(cadena)));
    }

    private static int[] CuentaLetras2(String cadena) {
        int[] resultado = new int[26];
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c >= 'a' && c <= 'z') {
                resultado[c - 'a']++;
            }
        }
        return resultado;
    }
}