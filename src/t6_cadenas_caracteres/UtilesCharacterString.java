package t6_cadenas_caracteres;

public class UtilesCharacterString {

    // Función que devuelve un booleano si el carácter es una vocal.
    public static boolean esVocal(char letra) {
        return "aeiouAEIOU".indexOf(letra) != -1;
    }

    // Función que devuelve un booleano si el carácter es un número.
    public static boolean esNumero(char letra) {
        return "0123456789".indexOf(letra) != -1;
    }

    // Función que devuelve un booleano si el carácter es una letra
    public static boolean esLetra(char letra) {
        return "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ".indexOf(letra) != -1;
    }

    // Función que devuelve un booleano si hay espacios en blanco
    public static boolean esEspacioBlanco(char letra) {
        return " ".indexOf(letra) != -1;
    }

    // Función que da la vuelta a un String
    public static String invertirString(String cadena) {
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }

    // Función que quita las vocales de un String
    public static String quitarVocales(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (!esVocal(cadena.charAt(i))) {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    // Función que quita los números de un String
    public static String quitarNumeros(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (!esNumero(cadena.charAt(i))) {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    // Función que quita un caracter que se le pase de un String
    public static String quitarCaracter(String cadena, char caracter) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != caracter) {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    // Función que quita los espacios en blanco de un String
    public static String quitarEspaciosBlancos(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (!esEspacioBlanco(cadena.charAt(i))) {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    // Función que cuenta vocales de un String
    public static int contarVocales(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static int[] contarCadaVocal(String cadena) {
        int[] contador = new int[5];
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)){
                case 'a' -> contador[0]++;
                case 'e' -> contador[1]++;
                case 'i' -> contador[2]++;
                case 'o' -> contador[3]++;
                case 'u' -> contador[4]++;
            }
        }
        return contador;
    }

    // Función que cuenta números de un String
    public static int contarNumeros(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esNumero(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    // Función que cuenta letras de un String
    public static int contarLetras(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esLetra(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static int[] contarCadaVocalMayusMinusAcentos(String cadena) {
        cadena = cadena.toLowerCase();
        int[] contador = new int[5];
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)){
                case 'a', 'á' -> contador[0]++;
                case 'e', 'é' -> contador[1]++;
                case 'i', 'í' -> contador[2]++;
                case 'o', 'ó' -> contador[3]++;
                case 'u', 'ú' -> contador[4]++;
            }
        }
        return contador;
    }

    // Función que comprueba si una cadena es un palíndromo quitando los espacios
    public static boolean esPalindromo(String cadena) {
        boolean palindromo = true;
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                palindromo = false;
            }
        }
        return palindromo;
    }

    // Buscar la primera ocurrencia de un carácter en un String
    public static int buscarCaracter(String cadena, char caracter) {
        int posicion = -1;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    // Buscar la última ocurrencia de un carácter en un String
    public static int buscarCaracterUltimaOcurrencia(String cadena, char caracter) {
        int posicion = -1;
        for (int i = cadena.length() - 1; i >= 0; i--) {
            if (cadena.charAt(i) == caracter) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    // Función que devuelve un String con las vocales en mayúsculas
    public static String ponerVocalesMayusculas(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                resultado += Character.toUpperCase(cadena.charAt(i));
            } else {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    // Función que cuenta cuantas veces se repite un carácter en un String
    public static int contarCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    // Función que cambia todas las vocales/consonantes por un carácter dado
    public static String cambiarVocalesConsonantes(String cadena, char caracter) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i)) || esLetra(cadena.charAt(i))) {
                resultado += caracter;
            } else {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    // Función que pone en mayúsculas la primera letra de cada palabra
    public static String ponerMayusculasPrimeraLetraPalabras(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (i == 0) {
                resultado += Character.toUpperCase(cadena.charAt(i));
            } else if (esEspacioBlanco(cadena.charAt(i - 1))) {
                resultado += Character.toUpperCase(cadena.charAt(i));
            } else {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    // Función que cuenta palabras de una frase
    public static int contarPalabras(String cadena) {
        int contador = 1;
        for (int i = 0; i < cadena.length(); i++) {
            if (esEspacioBlanco(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    // Función para validar un email
    public static boolean validarEmail(String email) {
        boolean valido = false;
        if (email.indexOf("@") != -1 && email.indexOf(".") != -1) {
            valido = true;
        }
        return valido;
    }

    // Función para validar un DNI (8 números y 1 letra)
    public static boolean validarDNI(String dni) {
        boolean valido = false;
        if (dni.length() == 9 && esNumero(dni.charAt(0)) && esNumero(dni.charAt(1)) && esNumero(dni.charAt(2)) && esNumero(dni.charAt(3)) && esNumero(dni.charAt(4)) && esNumero(dni.charAt(5)) && esNumero(dni.charAt(6)) && esNumero(dni.charAt(7)) && esLetra(dni.charAt(8))) {
            valido = true;
        }
        return valido;
    }

    // Función para validar un número de teléfono
    public static boolean validarTelefono(String telefono) {
        boolean valido = false;
        if (telefono.length() == 9 && esNumero(telefono.charAt(0)) && esNumero(telefono.charAt(1)) && esNumero(telefono.charAt(2)) && esNumero(telefono.charAt(3)) && esNumero(telefono.charAt(4)) && esNumero(telefono.charAt(5)) && esNumero(telefono.charAt(6)) && esNumero(telefono.charAt(7)) && esNumero(telefono.charAt(8)) && telefono.charAt(0) == '6') {
            valido = true;
        }
        return valido;
    }

    // Función para validar una matrícula
    public static boolean validarMatricula(String matricula) {
        boolean valido = false;
        if (matricula.length() == 7 && esLetra(matricula.charAt(0)) && esLetra(matricula.charAt(1)) && esNumero(matricula.charAt(2)) && esNumero(matricula.charAt(3)) && esNumero(matricula.charAt(4)) && esLetra(matricula.charAt(5)) && esLetra(matricula.charAt(6))) {
            valido = true;
        }
        return valido;
    }

    // Función para comprobar si dos palabras son anagramas (mismas letras) (amor-roma)
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        boolean anagrama = false;
        if (palabra1.length() == palabra2.length()) {
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra2.indexOf(palabra1.charAt(i)) != -1) {
                    anagrama = true;
                } else {
                    anagrama = false;
                    break;
                }
            }
        }
        return anagrama;
    }

}