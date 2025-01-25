package t6_cadenas_caracteres.examenes_prueba.examen2;

import java.util.Scanner;

public class EstadisticasTexto {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Desarrolla un programa que analice un texto ingresado por el usuario y calcule las siguientes estadísticas:
        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

//1.	Número total de caracteres (incluyendo espacios).
        System.out.println("Número total de caracteres: " + texto.length());

//2.	Número de caracteres alfabéticos (letras).
        numeroCaracteresAlfabeticos(texto);

//3.	Número de dígitos.
        numeroDigitos(texto);

//4.	Número de espacios.
        numeroEspacios(texto);

//5.	Número de caracteres especiales (que no sean letras, dígitos ni espacios).
        numeroCaracteresEspeciales(texto);

//6.	Crear una versión del texto donde todos los caracteres alfabéticos estén en mayúsculas.
        caracteresAlfabeticosMayusculas(texto);

/*
        Entrada:
Introduce un texto: Hola Mundo 123! ¿Cómo estás?
Salida esperada:
Número total de caracteres: 27
Número de letras: 15
Número de dígitos: 3
Número de espacios: 5
Número de caracteres especiales: 4
Texto en mayúsculas: HOLA MUNDO 123! ¿CÓMO ESTÁS?
         */
    }
    public static void numeroCaracteresAlfabeticos(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de letras: " + contador);
    }

    public static void numeroDigitos(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de dígitos: " + contador);
    }

    public static void numeroEspacios(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de espacios: " + contador);
    }

    public static void numeroCaracteresEspeciales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isLetterOrDigit(texto.charAt(i)) && !Character.isWhitespace(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de caracteres especiales: " + contador);
    }

    public static void caracteresAlfabeticosMayusculas(String texto) {
        String textoMayusculas = "";
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                textoMayusculas += Character.toUpperCase(texto.charAt(i));
            } else {
                textoMayusculas += texto.charAt(i);
            }
        }
        System.out.println("Texto en mayúsculas: " + textoMayusculas);
    }

}