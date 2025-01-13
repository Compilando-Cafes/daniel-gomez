package t6_cadenas_caracteres.ejercicios_libro;

import java.util.Arrays;
import java.util.Scanner;

public class AR6_03_Acierta_Contrasena {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                ==============================================
                ADIVINA LA CONTRASEÑA
                Juego para dos jugadores
                ==============================================""");

        String contrasena = "";
        // Controlar que solo tenga una palabra
        while (true) {
            System.out.print("Jugador 1: Introduce la contraseña (una sola palabra): ");
            contrasena = sc.nextLine();
            if (!contrasena.contains(" ")) {
                break;
            }
        }

        int version = pedirNumeroEntero("Elige que versión del juego prefieres (1 o 2): ", 1, 2);
        switch (version) {
            case 1 -> {
                versionUno(contrasena);
            }
            case 2 -> {
                versionDos(contrasena);
            }
        }
    }

    private static void versionDos(String contrasena) {
        char[] resultados = new char[contrasena.length()];
        Arrays.fill(resultados, '_');
        System.out.println("Adivina la contraseña letra a letra.");
        char intento = ' ';
        int contador = contrasena.length()-1;
        while(contador >= 0) {
            System.out.println(Arrays.toString(resultados));
            System.out.print("Jugador 2: ");
            intento = sc.nextLine().charAt(0);
            for (int i = 0; i < contrasena.length(); i++) {
                if (contrasena.charAt(i) == intento) {
                    resultados[i] = intento;
                    contador--;
                }
            }
        }
        System.out.println("Exacto! Esa era la contraseña. Estás hecho todo un hacker!");
    }

    private static void versionUno(String contrasena) {
        System.out.println("Adivina la contraseña.");
        String intento = "";
        do {
            System.out.print("Jugador 2: ");
            intento = sc.nextLine();
            if (intento.compareTo(contrasena) < 0) {
                System.out.println("Pista: La contraseña está después en el diccionario.");
            }
            if (intento.compareTo(contrasena) > 0) {
                System.out.println("Pista: La contraseña está antes en el diccionario.");
            }
        } while (!contrasena.equals(intento));
        System.out.println("Exacto! Esa era la contraseña. Estás hecho todo un hacker!");

    }

    public static boolean buscarEnString(String cadena, char caracter) {
        boolean resultado = true;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                resultado = false;
            }
        }
        return resultado;
    }

    public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}