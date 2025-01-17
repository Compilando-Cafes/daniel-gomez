package t6_cadenas_caracteres.ejercicios_libro;

public class AR6_10_Palindromas {
    public static void main(String[] args) {
        String cadena = "anita lava la tina";
        // pon una palindroma
        String palindromo = "a a a a a a a a a a a a a";
        System.out.println(esPalindroma(palindromo));
    }
    // una función que reciba una cadena y devuelva si es palíndroma o no
    public static boolean esPalindroma(String cadena) {
        // quitar espacios

        int i = 0;
        int j = cadena.length() - 1;
        while (i < j) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}