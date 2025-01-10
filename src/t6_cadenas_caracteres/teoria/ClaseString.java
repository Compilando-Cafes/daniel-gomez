package t6_cadenas_caracteres.teoria;

public class ClaseString {
    public static void main(String[] args) {
        String letra = "a";
        // Para extraer el String de cualquier otro valor
        String cad1 = String.valueOf(1234);
        String cad2 = String.valueOf(-12.34);
        String cad3 = String.valueOf('C');
        String cad4 = String.valueOf(false);
        System.out.println(cad1);
        System.out.println(cad2);
        System.out.println(cad3);
        System.out.println(cad4);

        // Comparar dos Strings
        cad1.equals(cad2);

        // Ignorar si está o no en mayúsculas
        cad1.equalsIgnoreCase(cad3);

        // Comparar dos porciones de Strings
        String palabra = "Hola mundo";
        String palabra2 = "_hola";
        boolean resultado = palabra.regionMatches(true,0, palabra2, 1, 4);
        boolean resultado2 = palabra.regionMatches(0, palabra2, 1, 4);
        System.out.println(resultado);
        System.out.println(resultado2);

        // Para saber  que String va antes
        // Devuelve 0 si son iguales, negativo si la palabra1 es menor y positivo si la otra
        int comparacion = palabra.compareTo(palabra2);
        System.out.println(comparacion);

        // Subcadenas
        System.out.println(palabra.substring(2));
        System.out.println(palabra.substring(2,3));

        // Quitar los espacios del principio
        palabra.stripLeading();

        // Quitar espacios al final
        palabra.stripTrailing();

        // Caracteres no imprimibles
        palabra.trim();

    }
}