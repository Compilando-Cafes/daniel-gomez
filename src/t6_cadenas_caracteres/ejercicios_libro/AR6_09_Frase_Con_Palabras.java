package t6_cadenas_caracteres.ejercicios_libro;

import java.util.Scanner;

public class AR6_09_Frase_Con_Palabras {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                ==============================================
                FRASE A PARTIR DE PALABRAS
                ==============================================""");

        String frase = "", palabra;

        System.out.println("Dime las palabras que quieras y cuando termines pon fin.");

        do {
            System.out.print("Palabra: ");
            palabra = sc.nextLine();
            if (!palabra.toLowerCase().equals("fin")){
                if (palabra.contains(" ")){
                    System.out.println("Introduce una sola palabra sin espacios.");
                } else {
                    if (frase.isEmpty()) {
                        frase = palabra;
                    } else {
                        frase = frase + " " + palabra;
                    }
                }

            }


        } while (!palabra.toLowerCase().equals("fin"));
        System.out.println(frase);
    }
}