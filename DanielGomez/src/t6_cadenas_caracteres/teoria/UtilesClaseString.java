package t6_cadenas_caracteres.teoria;

public class UtilesClaseString {
    public static void main(String[] args) {

    }

    // Función para saber si un String tiene solo letras: 1 si está bien, -1 mal
    static int comprobarLetras(String cadena) {
        int resultado = 1;
        for (int i = 0; i < cadena.length() && resultado == 1; i++) {
            if (!Character.isLetter(cadena.charAt(i))) {
                resultado = -1;
            }
        }
        return resultado;
    }
}