package t6_cadenas_caracteres.examenes_prueba.examen5;

import java.util.Scanner;

public class EncuentraCaracterPerdido {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();
        System.out.print("Introduce un carácter a buscar: ");
        char caracter = sc.nextLine().charAt(0);

        // Contar los caracteres y mostrarlos y primera, última posición en la que aparece y si ninguna decirlo.
        analisisFrase(texto, caracter);
    }


    private static void analisisFrase(String texto, char caracter) {
        int ocurrencias = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                ocurrencias++;
            }
        }
        if (ocurrencias == 0) {
            System.out.println("El caracter " + caracter + " no aparece en el texto.");
        } else {
            int posicionPrimeraOcurrencia = texto.indexOf(caracter);
            int posicionÚltimaOcurrencia = texto.lastIndexOf(caracter);
            if (ocurrencias == 1) {
                System.out.println("Solo aparece una vez y está en la posición: " + posicionPrimeraOcurrencia);
            } else {
                System.out.println("El caracter " + caracter + " aparece " + ocurrencias + " veces.");
                System.out.println("Primera aparición: " + posicionPrimeraOcurrencia);
                System.out.println("Última aparición: " + posicionÚltimaOcurrencia);
            }
        }
    }
}