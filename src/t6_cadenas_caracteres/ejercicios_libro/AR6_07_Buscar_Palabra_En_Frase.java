package t6_cadenas_caracteres.ejercicios_libro;

import java.util.Scanner;

public class AR6_07_Buscar_Palabra_En_Frase {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Dime una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ahora dime una palabra: ");
        String palabra = sc.nextLine();

        buscarPalabraEnFrase(frase, palabra);
    }

    private static void buscarPalabraEnFrase(String frase, String palabra) {
        int veces = 0;
        int posicion;
        posicion = frase.indexOf(palabra);
        while (posicion!=-1){
            veces++;
            posicion = frase.indexOf(palabra, posicion+1);
        }
        if (veces==0){
            System.out.println("La palabra no está en la frase.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" está repetida " + veces + " veces.");
        }


    }

}