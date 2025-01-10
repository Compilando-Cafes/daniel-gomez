package t6_cadenas_caracteres.teoria;

public class EjercicioClaseString {
    public static void main(String[] args) {
        System.out.println(comparaCadenas("c", "casa"));
    }

    public static int comparaCadenas(String cadena1, String cadena2) {
        int comparacion = cadena1.compareTo(cadena2);
        int resultado = 0;

        if (comprobarLetras(cadena1) == -1 || comprobarLetras(cadena2) == -1) {
            resultado = -1;
        } else {

            if (comparacion > 0) {
                resultado = 2;
            }
            if (comparacion < 0) {
                resultado = 1;
            }
        }

        return resultado;
    }

    // 1 si está bien, -1 mal
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