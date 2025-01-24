package t6_cadenas_caracteres.ejercicios_libro;

import java.util.Scanner;

public class ExtraCambiarVocalesUnaDada {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.print("Dame una vocal: ");
        char vocal = sc.nextLine().charAt(0);
        System.out.println(cambiarVocales(frase, vocal));
    }

    public static String cambiarVocales(String frase, char vocal) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (frase.charAt(i) == vocales[j]) {
                    if (vocales[j] != vocal) {
                        // Comprobar si es mayúscula en ASCII inferior a 97
                        int posicionAscii = vocales[j];
                        if (posicionAscii<97){
                            frase = frase.substring(0, i) + Character.toUpperCase(vocal) + frase.substring(i + 1);
                        } else {
                            frase = frase.substring(0, i) + vocal + frase.substring(i + 1);
                        }
                    }
                }
            }
        }

        return frase;
    }
}