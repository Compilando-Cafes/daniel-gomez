package t6_cadenas_caracteres.examenes_prueba.examen4;

import java.util.Arrays;
import java.util.Scanner;

public class EliminaRepeticiones {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        fraseSinRepeticiones(frase);
    }

    private static void fraseSinRepeticiones(String frase) {
        String[] resultado = frase.split(" ");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = i + 1; j < resultado.length; j++) {
                if (resultado[i].equalsIgnoreCase(resultado[j])) {
                    resultado[j] = "";
                }
            }
        }
        String resultadoString = Arrays.toString(resultado);
        resultadoString = resultadoString.replace(", ", " ");
        resultadoString = resultadoString.substring(1, resultadoString.length() - 1);
        System.out.println(resultadoString);
    }


}