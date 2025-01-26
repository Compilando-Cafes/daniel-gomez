package t6_cadenas_caracteres.examenes_prueba.examen5;

import java.util.Scanner;

public class Acronimos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        acronimoMayusculas(frase);
    }

    public static void acronimoMayusculas(String frase) {
        String acronimo = "";
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isUpperCase(frase.charAt(i))) {
                acronimo += frase.charAt(i);
            }
        }
        System.out.println("Acrónimo generado: " + acronimo);
    }
}