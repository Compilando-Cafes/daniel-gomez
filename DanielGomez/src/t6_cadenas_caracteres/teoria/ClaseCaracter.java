package t6_cadenas_caracteres.teoria;

import java.util.Arrays;
import java.util.Scanner;

public class ClaseCaracter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] listaCaracteresUsuario = new char[15];
        int tamanoListaNumeros = 0;
        char[] listaNumeros = new char[tamanoListaNumeros];
        int tamanoListaLetras = 0;
        char[] listaLetras = new char[tamanoListaLetras];
        int tamanoListaNumerosYLetras = 0;
        char[] listaNumerosYLetras = new char[tamanoListaNumerosYLetras];
        int tamanoListaEspaciosVacios = 0;
        char[] listaEspaciosVacios = new char[tamanoListaEspaciosVacios];

        for (int i = 0; i < 15; i++) {
            System.out.print("Carácter número " + (i + 1) + ": ");
            char caracter = sc.next().charAt(0);
            listaCaracteresUsuario[i] = caracter;

            // Comprobar si es número y añadirlo
            if (Character.isDigit(caracter)) {
                tamanoListaNumeros++;
                listaNumeros = Arrays.copyOf(listaNumeros, tamanoListaNumeros);
                listaNumeros[tamanoListaNumeros - 1] = caracter;
            }

            // Comprobar si es letra y añadirlo
            if (Character.isLetter(caracter)) {
                tamanoListaLetras++;
                listaLetras = Arrays.copyOf(listaLetras, tamanoListaLetras);
                listaLetras[tamanoListaLetras - 1] = caracter;
            }


            // Comprobar si es número o letra y añadirlo
            if (Character.isLetterOrDigit(caracter)) {
                tamanoListaNumerosYLetras++;
                listaNumerosYLetras = Arrays.copyOf(listaNumerosYLetras, tamanoListaNumerosYLetras);
                listaNumerosYLetras[tamanoListaNumerosYLetras - 1] = caracter;
            }

            // Comprobar si es espacio vacío y añadirlo
            if (Character.isWhitespace(caracter)) {
                tamanoListaEspaciosVacios++;
                listaEspaciosVacios = Arrays.copyOf(listaEspaciosVacios, tamanoListaEspaciosVacios);
                listaEspaciosVacios[tamanoListaEspaciosVacios - 1] = caracter;
            }
        }

        System.out.println("Lista de caracteres introducidos por el usuario:");
        System.out.println(Arrays.toString(listaCaracteresUsuario));

        System.out.println("Lista de números:");
        System.out.println(Arrays.toString(listaNumeros));

        System.out.println("Lista de letras:");
        System.out.println(Arrays.toString(listaLetras));

        System.out.println("Lista de números y letras:");
        System.out.println(Arrays.toString(listaNumerosYLetras));

        System.out.println("Lista de espacios vacíos:");
        System.out.println(Arrays.toString(listaEspaciosVacios));
    }


}