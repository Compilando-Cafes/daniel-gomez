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
            switch (cadena.charAt(i)) {
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
            switch (cadena.charAt(i)) {
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

    // Función para validar una fecha
    public static boolean validarFecha(String fecha) {
        boolean valido = false;
        if (fecha.length() == 10 && esNumero(fecha.charAt(0)) && esNumero(fecha.charAt(1)) && fecha.charAt(2) == '/' && esNumero(fecha.charAt(3)) && esNumero(fecha.charAt(4)) && fecha.charAt(5) == '/' && esNumero(fecha.charAt(6)) && esNumero(fecha.charAt(7)) && esNumero(fecha.charAt(8)) && esNumero(fecha.charAt(9)) && Integer.parseInt(fecha.substring(0, 2)) <= 31 && Integer.parseInt(fecha.substring(3, 5)) <= 12) {
            valido = true;
        }
        return valido;
    }

    // Función para validar una hora
    public static boolean validarHora(String hora) {
        boolean valido = false;
        if (hora.length() == 5 && esNumero(hora.charAt(0)) && esNumero(hora.charAt(1)) && hora.charAt(2) == ':' && esNumero(hora.charAt(3)) && esNumero(hora.charAt(4)) && Integer.parseInt(hora.substring(0, 2)) <= 23 && Integer.parseInt(hora.substring(3, 5)) <= 59) {
            valido = true;
        }
        return valido;
    }

    // Funcion para validar una URL
    public static boolean validarURL(String url) {
        boolean valido = false;
        if (url.indexOf("http://") != -1 || url.indexOf("https://") != -1) {
            valido = true;
        }
        return valido;
    }

    // Función para validar un código postal
    public static boolean validarCodigoPostal(String cp) {
        boolean valido = false;
        if (cp.length() == 5 && esNumero(cp.charAt(0)) && esNumero(cp.charAt(1)) && esNumero(cp.charAt(2)) && esNumero(cp.charAt(3)) && esNumero(cp.charAt(4))) {
            valido = true;
        }
        return valido;
    }

    // Función para validar una IP
    public static boolean validarIP(String ip) {
        boolean valido = false;
        if (ip.length() == 15 && esNumero(ip.charAt(0)) && esNumero(ip.charAt(1)) && esNumero(ip.charAt(2)) && ip.charAt(3) == '.' && esNumero(ip.charAt(4)) && esNumero(ip.charAt(5)) && esNumero(ip.charAt(6)) && ip.charAt(7) == '.' && esNumero(ip.charAt(8)) && esNumero(ip.charAt(9)) && esNumero(ip.charAt(10)) && ip.charAt(11) == '.' && esNumero(ip.charAt(12)) && esNumero(ip.charAt(13)) && esNumero(ip.charAt(14)) && Integer.parseInt(ip.substring(0, 3)) <= 255 && Integer.parseInt(ip.substring(4, 7)) <= 255 && Integer.parseInt(ip.substring(8, 11)) <= 255 && Integer.parseInt(ip.substring(12, 15)) <= 255) {
            valido = true;
        }
        return valido;
    }

    // Función para validar una contraseña: 8 caracteres, 1 mayúscula, 1 minúscula, 1 número y 1 carácter especial
    public static boolean validarContrasena(String contrasena) {
        boolean valido = false;
        if (contrasena.length() >= 8) {
            boolean mayuscula = false;
            boolean minuscula = false;
            boolean numero = false;
            boolean caracterEspecial = false;
            for (int i = 0; i < contrasena.length(); i++) {
                if (Character.isUpperCase(contrasena.charAt(i))) {
                    mayuscula = true;
                }
                if (Character.isLowerCase(contrasena.charAt(i))) {
                    minuscula = true;
                }
                if (Character.isDigit(contrasena.charAt(i))) {
                    numero = true;
                }
                if (!Character.isLetterOrDigit(contrasena.charAt(i))) {
                    caracterEspecial = true;
                }
            }
            if (mayuscula && minuscula && numero && caracterEspecial) {
                valido = true;
            }
        }
        return valido;
    }

    // Función para validar una contraseña: 8 caracteres, 1 mayúscula, 1 minúscula, 1 número y 1 carácter especial
    // Debe indicar la razón por la que no es válida. Sin usar matches
    public static boolean validarContrasenaCompleta(String contrasena) {
        if (contrasena.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return false;
        }
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;
        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(caracter)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(caracter)) {
                tieneCaracterEspecial = true;
            }
        }
        if (!tieneMayuscula) {
            System.out.println("La contraseña debe tener al menos una mayúscula.");
            return false;
        }
        if (!tieneMinuscula) {
            System.out.println("La contraseña debe tener al menos una minúscula.");
            return false;
        }
        if (!tieneNumero) {
            System.out.println("La contraseña debe tener al menos un número.");
            return false;
        }
        if (!tieneCaracterEspecial) {
            System.out.println("La contraseña debe tener al menos un carácter especial.");
            return false;
        }
        return true;
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

    // Función para contar el número de caracteres alfanuméricos de un String
    public static void numeroCaracteresAlfabeticos(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de letras: " + contador);
    }

    // Función para contar el número de dígitos o números de un String
    public static void numeroDigitos(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de dígitos: " + contador);
    }

    // Función para contar el número de espacios en blanco de un String
    public static void numeroEspacios(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de espacios: " + contador);
    }

    // Función para contar el número de caracteres especiales de un String
    public static void numeroCaracteresEspeciales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isLetterOrDigit(texto.charAt(i)) && !Character.isWhitespace(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Número de caracteres especiales: " + contador);
    }

    // Función para poner en mayúsculas los caracteres alfabéticos de un String
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

    // Función que genera un Acrónimo de todas las palabras de un frase dada
    public static void acronimo(String frase) {
        String acronimo = "";
        acronimo += Character.toUpperCase(frase.charAt(0));
        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                acronimo += Character.toUpperCase(frase.charAt(i + 1));
            }
        }
        System.out.println("Acrónimo: " + acronimo);
    }

    // Función que hace un acrónimo de una frase de todas las palabras que estén en mayúsculas
    public static void acronimoMayusculas(String frase) {
        String acronimo = "";
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isUpperCase(frase.charAt(i))) {
                acronimo += frase.charAt(i);
            }
        }
        System.out.println("Acrónimo: " + acronimo);
    }

}