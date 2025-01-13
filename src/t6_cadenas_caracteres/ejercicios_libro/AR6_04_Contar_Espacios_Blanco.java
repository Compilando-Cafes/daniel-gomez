package t6_cadenas_caracteres.ejercicios_libro;

import java.util.Arrays;

public class AR6_04_Contar_Espacios_Blanco {
    public static void main(String[] args) {
        String frase = "Hola que tal   estás";
        int espacios = contarEspaciosEnBlanco(frase);
        System.out.println("La frase: \""+ frase + "\". Tiene " + espacios + " en blanco.");
    }

    private static int contarEspaciosEnBlanco(String frase) {
        int totalEspacios = 0;
        for (int i = 0; i<frase.length(); i++){
            if (Character.isSpaceChar(frase.charAt(i))){
                totalEspacios++;
            }
        }
        return totalEspacios;
    }
}