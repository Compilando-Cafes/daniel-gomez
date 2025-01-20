package t6_cadenas_caracteres.teoria;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_String_Adivinar_Palabra_Desordenada {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();
        adivinarPalabra(palabra);

    }

    public static void adivinarPalabra(String palabra) {
        // Desordenar la palabra y convertirla en un array de caracteres
        char [] palabraArray = desordenarString(palabra);

        // Mostrar el array de caracteres
        System.out.println(Arrays.toString(palabraArray));
        System.out.println("Adivina la palabra: ");
        String palabraAdivinada = sc.nextLine();

        while (!palabraAdivinada.equals(palabra)){
            System.out.print("¡Has fallado! Inténtalo de nuevo: ");
            palabraAdivinada = sc.nextLine();
        }
        System.out.println("¡Has acertado!");
    }

    public static char[] desordenarString(String palabra) {
        char [] palabraArray = palabra.toCharArray();
        for (int i=0; i<palabraArray.length; i++){
            int j = rand.nextInt(palabraArray.length);
            char temp = palabraArray[i];
            palabraArray[i] = palabraArray[j];
            palabraArray[j] = temp;
        }
        return palabraArray;
    }

}