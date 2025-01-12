package t6_cadenas_caracteres.teoria;

import java.util.Scanner;

public class InvierteFrases {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Dime una frase y le daré la vuelta: ");
        String frase = sc.nextLine();

        System.out.println("Frase:");
        System.out.println("\t" + frase);

        System.out.println("Frase al revés:");
        System.out.println("\t" + invertirFrase(frase));
    }

    public static String invertirFrase(String frase) {
        String fraseInvertida = "";
        for (int i = 0; i < frase.length(); i++) {
            fraseInvertida = frase.charAt(i) + fraseInvertida;
        }
        return fraseInvertida;
    }

}