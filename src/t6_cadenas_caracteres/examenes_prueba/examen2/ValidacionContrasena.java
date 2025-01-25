package t6_cadenas_caracteres.examenes_prueba.examen2;

import java.util.Scanner;

public class ValidacionContrasena {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Pedir una contraseña, indicar los requisitos para que sea valida y no parar de pedirla hasta que sea válida
        System.out.print("Introduce una contraseña (8 caracteres y al menos: 1 mayúscula, 1 minúscula, 1 número y un caracter especial): ");
        String contrasena = sc.nextLine();
        while (!validarContrasena(contrasena)) {
            System.out.print("Introduce una contraseña (8 caracteres y al menos: 1 mayúscula, 1 minúscula, 1 número y un caracter especial): ");
            contrasena = sc.nextLine();
        }
        System.out.println("Contraseña válida.");
    }

    // Función para validar una contraseña: 8 caracteres, 1 mayúscula, 1 minúscula, 1 número y 1 carácter especial
    // Debe indicar la razón por la que no es válida. Sin usar matches
    public static boolean validarContrasena(String contrasena) {
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

}