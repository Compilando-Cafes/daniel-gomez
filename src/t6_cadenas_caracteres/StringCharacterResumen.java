package t6_cadenas_caracteres;

import java.util.Arrays;

public class StringCharacterResumen {
    public static void main(String[] args) {
        char caracter = 'a';
        String cadena = "";
        int entero = 0;
        boolean booleano = true;


        // CLASE CHARACTER
        // Conversiones
        caracter = Character.toUpperCase(caracter);
        caracter = Character.toLowerCase(caracter);
        cadena = Character.toString(caracter); // También para un int de un ASCII

        // Clasificaciones
        booleano = Character.isDigit(caracter);
        booleano = Character.isLetter(caracter);
        booleano = Character.isLetterOrDigit(caracter);
        booleano = Character.isLowerCase(caracter);
        booleano = Character.isUpperCase(caracter);
        booleano = Character.isSpaceChar(caracter); // Solo el espacio
        booleano = Character.isWhitespace(caracter); // Espacio + \t, \n y \r...

        // CLASE STRING
        // Convertir a string
        cadena = String.valueOf(1234); //Válido para int, double, char y boolean.

        String cadena1 = "Pepe González";
        String cadena2 = "Daniel Gonzo";

        // Comparaciones
        // Comparar si son iguales dos cadenas
        booleano = cadena1.equals(cadena2); // NO COMPARAR CON ==. Usar .equals
        booleano = cadena1.equalsIgnoreCase(cadena2); // Sin distinguir mayúsculas. A == a

        // Comparar dos trozos de dos cadenas
        booleano = cadena1.regionMatches(5, cadena2, 7, 4);
        booleano = cadena1.regionMatches(true,5, cadena2, 7, 4); // +True para ignorar mayúsculas
        /* 4 valores: Ej. Apellidos que empiecen por Gon
        1. Inicio de cadena1 que queremos comparar. Ej.: Cadena1 = Pepe González. Desde posición 5: a partir de la G
        2. Cadena2. Ej.: Daniel Gonzo
        3. Desde donde de cadena2. Ej.: posición 7 a partir de la G
        4. Número de caracteres a comparar en AMBAS. Ej.: 3 caracteres. cadena1=Gon == cadena2=Gon. Resultado = true.
         */

        // Comparar que cadena es mayor, cual va antes en el diccionario.
        cadena1 = "aaa";
        cadena2 = "bbb";
        entero = cadena1.compareTo(cadena2);
        entero = cadena1.compareToIgnoreCase(cadena2); // Ignora mayúsculas y minúsculas
        /*
        0: si son iguales
        negativo: si cadena1 va antes por orden alfabético.
        positivo: si cadena2 va antes por orden alfabético.
         */

        // Obtener un carácter.
        caracter = cadena1.charAt(0);
        // Obtener longitud (cuantos caracteres tiene)
        entero = cadena1.length();

        // Modificaciones de una cadena
        // Obtener un trozo o una subcadena
        cadena1 = cadena2.substring(1, 2); // Inicio y fin (opcional, si no se pone es hasta el final)
        cadena1 = cadena1.strip(); // quita espacios al principio y al final
        cadena1 = cadena1.stripLeading(); // quita espacios al principio
        cadena1 = cadena1.stripLeading(); // quita espacios al final

        // Búsqueda
        entero = cadena1.indexOf('c'); // Posición de lo que queramos
        entero = cadena1.indexOf('c', 4); // Buscar desde un índice concreto
        entero = cadena1.lastIndexOf('c', 4); // Busca desde la posición indicada desde el final

        // Comprobar
        booleano = cadena1.isEmpty(); // True si está vacía
        booleano = cadena1.contains("a"); // True si encuentra lo que le pongamos

        // Prefijos y sufijos
        booleano = cadena1.startsWith("Daniel"); // Si empieza por algo desde posición 0
        booleano = cadena1.startsWith("Daniel", 5); // Si empieza por algo desde posición que pongamos
        booleano = cadena1.endsWith("Daniel"); // Si termina por algo

        // Conversiones
        cadena1 = cadena1.toLowerCase(); // Convierte letras a minúsculas (resto deja igual)
        cadena1 = cadena1.toUpperCase(); // Convierte letras a mayúsculas (resto deja igual)

        // Reemplazar
        cadena1 = cadena1.replace("a", "w"); // Reemplaza lo que encuentre de algo por lo que queramos.

        // Separar String a Array
        String cadena3 = "Hola que tal";
        String[] tabla = cadena3.split(" "); // Separa por donde digamos con el separador



















    }
}