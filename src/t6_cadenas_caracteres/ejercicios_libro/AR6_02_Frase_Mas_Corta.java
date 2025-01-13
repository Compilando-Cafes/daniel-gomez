package t6_cadenas_caracteres.ejercicios_libro;

import java.util.Scanner;

public class AR6_02_Frase_Mas_Corta {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce la primera frase: ");
        String frase1 = sc.nextLine();

        System.out.println("Introduce la segunda frase: ");
        String frase2 = sc.nextLine();

        comparaFrases(frase1, frase2);

    }
    public static void comparaFrases(String frase1, String frase2){
        if (frase1.length()> frase2.length()){
            System.out.println("La primera frase es más larga que la segunda.");
        }
        if (frase1.length()<frase2.length()){
            System.out.println("La segunda frase es más larga que la primera.");
        }
        if (frase1.length() == frase2.length()){
            System.out.println("Las dos son igual de largas.");
        }
    }
}