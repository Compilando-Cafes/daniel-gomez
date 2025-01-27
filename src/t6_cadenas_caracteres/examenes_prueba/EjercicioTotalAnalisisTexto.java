package t6_cadenas_caracteres.examenes_prueba;

import java.util.Scanner;

public class EjercicioTotalAnalisisTexto {
    static Scanner sc = new Scanner(System.in);
    static int controlTextoVacio = 0;
    static String texto = "";


    public static void main(String[] args) {
        while (true) {

            System.out.println("""
                    ==============================================
                    PROCESADOR DE TEXTO
                    1. Introducir texto o modificarlo
                    2. Análisis del texto
                    3. Transformar el texto
                    4. Operaciones con el texto
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 4);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    controlTextoVacio++;
                    introducirTexto(texto);
                }
                case 2 -> {
                    if (controlTextoVacio > 0) {
                        analisisTexto(texto);
                    }
                }
                case 3 -> {
                    if (controlTextoVacio > 0) {
                        transformarTexto(texto);
                    }
                }
                case 4 -> {
                    if (controlTextoVacio > 0) {
                        operarConTexto(texto);
                    }
                }
            }
        }
    }

    private static void introducirTexto(String texto) {
        while (true) {
            System.out.print("Introduce un texto: ");
            texto = sc.nextLine();
            if (!texto.isEmpty()) {
                break;
            } else {
                System.out.println("No dejes el texto vacío para poder trabajar con el.");
            }
        }
    }

    private static void analisisTexto(String texto) {
        System.out.println("""
                ==============================================
                ANÁLISIS DE TEXTO
                ==============================================""");
        // Total de caracteres
        System.out.println("El número total de caracteres que has introducido es: " + texto.length());

        // Número de caracteres en mayúsculas
        System.out.println("El número de caracteres en mayúsculas es: ");
        contarMayusculasTexto(texto);

        // Número de caracteres en minúsculas
        System.out.println("El número de caracteres en minúscula es: ");
        contarMinusculasTexto(texto);

        // Número de números
        System.out.println("El número de números que has introducido es: ");
        contarNumerosTexto(texto);

        // Número de letras alfanuméricas
        System.out.println("El número de letras alfanuméricas es: ");
        contarLetras(texto);

        // Número de espacios en blanco
        System.out.println("El número de espacios en blanco es: ");
        contarEspaciosBlanco(texto);

        // Número de símbolos
        System.out.println("El número de símbolos es: ");
        contarSimbolos(texto);

        // Número de letras con tilde
        System.out.println("El número de letras con tilde es: ");
        contarLetrasConTilde(texto);

        // Número de palabras repetidas
        System.out.println("El número de palabras repetidas es: ");
        contarPalabrasRepetidas(texto);
    }

    private static void contarMayusculasTexto(String texto) {
        int contadorMayusculas = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                contadorMayusculas++;
            }
        }
        System.out.println("Letras en mayúsculas: " + contadorMayusculas);
    }

    private static void contarMinusculasTexto(String texto) {
        int contadorMinusculas = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLowerCase(texto.charAt(i))) {
                contadorMinusculas++;
            }
        }
        System.out.println("Letras en minúsculas: " + contadorMinusculas);
    }

    private static void contarNumerosTexto(String texto) {
        int contadorNumeros = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                contadorNumeros++;
            }
        }
        System.out.println("Números: " + contadorNumeros);
    }

    private static void contarLetras(String texto) {
        int contadorLetras = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                contadorLetras++;
            }
        }
        System.out.println("Letras alfanuméricas: " + contadorLetras);
    }

    private static void contarEspaciosBlanco(String texto) {
        int contadorEspacios = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i))) {
                contadorEspacios++;
            }
        }
        System.out.println("Espacios en blanco: " + contadorEspacios);
    }

    private static void contarSimbolos(String texto) {
        int contadorSimbolos = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isLetterOrDigit(texto.charAt(i)) && !Character.isWhitespace(texto.charAt(i))) {
                contadorSimbolos++;
            }
        }
        System.out.println("Símbolos: " + contadorSimbolos);
    }

    private static void contarLetrasConTilde(String texto) {
        int contadorTildes = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'á' || texto.charAt(i) == 'é' || texto.charAt(i) == 'í' || texto.charAt(i) == 'ó' || texto.charAt(i) == 'ú') {
                contadorTildes++;
            }
        }
        System.out.println("Letras con tilde: " + contadorTildes);
    }

    private static void contarPalabrasRepetidas(String texto) {
        String[] palabras = texto.split(" ");
        int contadorPalabrasRepetidas = 0;
        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    contadorPalabrasRepetidas++;
                }
            }
        }
        System.out.println("Palabras repetidas: " + contadorPalabrasRepetidas);
    }

    private static void transformarTexto(String texto) {
        while (true) {
            System.out.println("""
                    ==============================================
                    TRANSFORMAR EL TEXTO
                    1. Convertir texto a mayúsculas
                    2. Convertir texto a minúsculas
                    3. Quitar las vocales del texto
                    4. Quitar todos los espacios del texto
                    5. Cambiar un caracter por uno dado
                    6. Poner el texto al revés
                    7. Poner cada palabra al revés
                    8. Hacer el texto manchego (sustituir ado,edo e ido por ao, eo e io)
                    9. Hacer el texto andaluz (sustituir las s por h y eliminar las d y las r
                    10. Eliminar todas las palabras de una cantidad de caracteres dados.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 10);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> convertirTextoMayusculas(texto);
                case 2 -> convertirTextoMinusculas(texto);
                case 3 -> quitarVocalesTexto(texto);
                case 4 -> quitarEspaciosTexto(texto);
                case 5 -> cambiarCaracterPorOtro(texto);
                case 6 -> invertirTextoEntero(texto);
                case 7 -> invertirPalabrasTexto(texto);
                case 8 -> textoManchego(texto);
                case 9 -> textoAndaluz(texto);
                case 10 -> eliminarPalabrasSegunLongitud(texto);
            }
        }
    }

    // funcion que convierte el texto a mayusculas
    private static void convertirTextoMayusculas(String texto) {
        texto = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + texto);
    }

    private static void convertirTextoMinusculas(String texto) {
        texto = texto.toLowerCase();
        System.out.println("Texto en minúsculas: " + texto);
    }

    private static void quitarVocalesTexto(String texto) {
        String textoSinVocales = "";
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != 'a' && texto.charAt(i) != 'e' && texto.charAt(i) != 'i' && texto.charAt(i) != 'o' && texto.charAt(i) != 'u') {
                textoSinVocales += texto.charAt(i);
            }
        }
        System.out.println("Texto sin vocales: " + textoSinVocales);
    }


    private static void quitarEspaciosTexto(String texto) {
        String textoSinEspacios = texto.replaceAll(" ", "");
        System.out.println("Texto sin espacios: " + textoSinEspacios);
    }

    private static void cambiarCaracterPorOtro(String texto) {
        System.out.print("Introduce el caracter que quieres cambiar: ");
        char caracter = sc.next().charAt(0);
        System.out.print("Introduce el caracter por el que quieres cambiar: ");
        char caracterNuevo = sc.next().charAt(0);
        String textoCambiado = texto.replace(caracter, caracterNuevo);
        System.out.println("Texto cambiado: " + textoCambiado);
    }

    private static void invertirTextoEntero(String texto) {
        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        System.out.println("Texto invertido: " + textoInvertido);
    }

    private static void invertirPalabrasTexto(String texto) {
        String[] palabras = texto.split(" ");
        String textoInvertido = "";
        for (int i = 0; i < palabras.length; i++) {
            String palabraInvertida = "";
            for (int j = palabras[i].length() - 1; j >= 0; j--) {
                palabraInvertida += palabras[i].charAt(j);
            }
            textoInvertido += palabraInvertida + " ";
        }
        System.out.println("Palabras invertidas: " + textoInvertido);
    }

    private static void textoManchego(String texto) {
        String[] palabras = texto.split(" ");
        String textoManchego = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].endsWith("ado")) {
                palabras[i] = palabras[i].replace("ado", "ao");
            } else if (palabras[i].endsWith("edo")) {
                palabras[i] = palabras[i].replace("edo", "eo");
            } else if (palabras[i].endsWith("ido")) {
                palabras[i] = palabras[i].replace("ido", "io");
            }
            textoManchego += palabras[i] + " ";
        }
        System.out.println("Texto manchego: " + textoManchego);

    }

    private static void textoAndaluz(String texto) {
        String textoAndaluz = texto.replace("s", "h");
        textoAndaluz = textoAndaluz.replace("d", "");
        textoAndaluz = textoAndaluz.replace("r", "");
        System.out.println("Texto andaluz: " + textoAndaluz);
    }

    private static void eliminarPalabrasSegunLongitud(String texto) {
        System.out.print("Introduce la longitud de las palabras que quieres eliminar: ");
        int longitud = sc.nextInt();
        String[] palabras = texto.split(" ");
        String textoSinPalabras = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() != longitud) {
                textoSinPalabras += palabras[i] + " ";
            }
        }
        texto = textoSinPalabras;
        System.out.println("Texto sin palabras de longitud " + longitud + ": " + texto);
    }

    private static void operarConTexto(String texto) {
        while (true) {
            System.out.println("""
                    ==============================================
                    OPERAR CON TEXTO
                    1. Generar acrónimo con todo el texto
                    2. Comprobar si es un palíndromo
                    3. Ordenar alfabéticamente las palabras
                    4. Contar totales de cada letra en el texto
                    5. Sustituir todas las palabras del texto por "Yo soy Gru" repetidas veces.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 10);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> generarAcronimo(texto);
                case 2 -> comprobarPalindromo(texto);
                case 3 -> ordenarAlfabeticamente(texto);
                case 4 -> contarTotalesCaracteres(texto);
                case 5 -> cambiarAYoSoyGru(texto);
            }
        }
    }

    // Generar acrónimo con todo el texto
    private static void generarAcronimo(String texto) {
        String[] palabras = texto.split(" ");
        String acronimo = "";
        for (int i = 0; i < palabras.length; i++) {
            acronimo += palabras[i].charAt(0);
        }
        System.out.println("Acrónimo: " + acronimo);
    }

    private static void comprobarPalindromo(String texto) {
        String textoSinEspacios = texto.replaceAll(" ", "");
        String textoInvertido = "";
        for (int i = textoSinEspacios.length() - 1; i >= 0; i--) {
            textoInvertido += textoSinEspacios.charAt(i);
        }
        if (textoSinEspacios.equals(textoInvertido)) {
            System.out.println("El texto es un palíndromo.");
        } else {
            System.out.println("El texto no es un palíndromo.");
        }
    }

    private static void ordenarAlfabeticamente(String texto) {
        String[] palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].compareTo(palabras[j]) > 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        String textoOrdenado = "";
        for (int i = 0; i < palabras.length; i++) {
            textoOrdenado += palabras[i] + " ";
        }
        System.out.println("Texto ordenado alfabéticamente: " + textoOrdenado);
    }

    private static void contarTotalesCaracteres(String texto) {
        int[] contadorLetras = new int[26];
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                char letra = Character.toLowerCase(texto.charAt(i));
                contadorLetras[letra - 'a']++;
            }
        }
        for (int i = 0; i < contadorLetras.length; i++) {
            if (contadorLetras[i] > 0) {
                System.out.println("Letra " + (char) (i + 'a') + ": " + contadorLetras[i]);
            }
        }
    }

    public static void cambiarAYoSoyGru(String texto) {
        String[] palabras = texto.split(" ");
        String textoCambiado = "";
        for (int i = 0; i < palabras.length; i++) {
            if (i % 3 == 0) {
                textoCambiado += "Yo ";
            } else if (i % 3 == 1) {
                textoCambiado += "soy ";
            } else if (i % 3 == 2) {
                textoCambiado += "Gru ";
            }
        }
        System.out.println("Texto cambiado: " + textoCambiado);
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