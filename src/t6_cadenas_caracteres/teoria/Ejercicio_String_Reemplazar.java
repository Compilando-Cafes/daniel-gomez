package t6_cadenas_caracteres.teoria;

import java.util.Scanner;

public class Ejercicio_String_Reemplazar {
    static Scanner sc = new Scanner(System.in);
    static char[] caracteres = {'l', 's', 'e', 'o', 'r'};

    public static void main(String[] args) {
        /* Frase introducida por teclado. Sustituir:
            l por 1
            s por 2
            e por 3
            o por 0
            r por 7
            Devuelve tabla con la cantidad de letras de cada tipo que ha modificado
         */
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        int[] resultado = reemplazar(frase);
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Cambios en la " + caracteres[i]);
            System.out.println(": " + resultado[i]);
        }
    }

    public static int[] reemplazar(String frase) {
        int[] resultado = new int[5];
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == caracteres[i]) {
                    resultado[i]++;
                }
            }
        }

        frase = frase.replace('l', '1');
        frase = frase.replace('s', '2');
        frase = frase.replace('e', '3');
        frase = frase.replace('o', '0');
        frase = frase.replace('r', '7');

        System.out.println("Frase modificada: " + frase);
        return resultado;
    }
}