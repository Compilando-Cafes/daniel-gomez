package t4_funciones.ejercicios;

public class numeroMaximo {

    public static void main(String[] args) {
        /*
         * You are given a positive integer num consisting only of digits 6 and 9.
         * 
         * Return the maximum number you can get by changing at most one digit (6
         * becomes 9, and 9 becomes 6).
         */
        System.out.println(obtenerNumeroMaximo(9669)); // Ejemplo de prueba
    }

    public static int obtenerNumeroMaximo(int num) {
        // Convertir el número a una cadena para facilitar la manipulación
        String numStr = String.valueOf(num);
        char[] numArray = numStr.toCharArray();

        // Cambiar el primer '6' que se encuentre a '9' (solo se permite un cambio)
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == '6') {
                numArray[i] = '9';
                break; // Solo un cambio
            }
        }

        // Convertir de vuelta a entero
        return Integer.parseInt(new String(numArray));
    }
}
