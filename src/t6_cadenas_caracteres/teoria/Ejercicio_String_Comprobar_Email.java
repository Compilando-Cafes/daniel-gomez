package t6_cadenas_caracteres.teoria;

public class Ejercicio_String_Comprobar_Email {
    public static void main(String[] args) {
        // Comprobar que un email tiene un @ y gmail.com
        String email = "ejemplo@gmail.com";

        if (comprobarEmail(email)) {
            System.out.println("Email correcto.");
        } else {
            System.out.println("Email incorrecto.");
        }


    }

    private static boolean comprobarEmail(String email) {
        boolean resultado = false;
        String finalEmail1 = "gmail.com";
        String finalEmail2 = "educastillalamancha.es";
        int posicionArroba = email.indexOf('@');

        // Comprobar si hay un '@' y hay texto después
        if (posicionArroba >= 0 && posicionArroba < email.length() - 1) {
            // Ajustar el índice y verificar con regionMatches
            if (email.regionMatches(posicionArroba + 1, finalEmail1, 0, finalEmail1.length()) ||
                    email.regionMatches(posicionArroba + 1, finalEmail2, 0, finalEmail2.length())) {
                resultado = true;
            }
        }
        return resultado;
    }



}