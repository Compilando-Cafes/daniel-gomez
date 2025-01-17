package t6_cadenas_caracteres.teoria;

import java.util.Arrays;

public class Ejercicio_String_Cuenta_Letras {
    public static void main(String[] args) {
        String cadena = "patata camaleón batata";
        System.out.println(Arrays.toString(CuentaLetras(cadena)));
    }

    public static int[] CuentaLetras(String texto){
        int[] resultado = new int[5];
        for (int i = 0; i<texto.length(); i++){
            switch (Character.toLowerCase(texto.charAt(i))){
                case 'a', 'á' -> resultado[0]++;
                case 'b' -> resultado[1]++;
                case 'c' -> resultado[2]++;
                case 'd' -> resultado[3]++;
                case 'e', 'é' -> resultado[4]++;
            }
        }
        return resultado;
    }

}