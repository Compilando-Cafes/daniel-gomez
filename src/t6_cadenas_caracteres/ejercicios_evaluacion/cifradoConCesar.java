package t6_cadenas_caracteres.ejercicios_evaluacion;

import java.util.Scanner;

public class cifradoConCesar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("""
                ==============================================
                CIFRADO CON CESAR
                Introduce una frase y un desplazamiento mayor
                que 0 y verás la frase cifrada.
                ==============================================""");
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        int desplazamiento = pedirNumeroEntero("Desplazamiento (mayor que 0): ", 1);
        System.out.print("Frase cifrada:");
        System.out.println(cifrado(frase, desplazamiento));
    }

    public static String cifrado(String cadenaACifrar, int desplazamiento) {
        String resultado = "";
        // Comprobar que no está vacía la cadena a cifrar
        if (!cadenaACifrar.isEmpty()) {
            // Convertir a minúsculas
            cadenaACifrar = cadenaACifrar.toLowerCase();

            // Cambiar las letras para que empiecen de 0 (a) a 26 (z)
            for (int i = 0; i < cadenaACifrar.length(); i++) {

                // Que solo cambie si es una letra
                if (Character.isLetter(cadenaACifrar.charAt(i))) {
                    int posicionLetra = cadenaACifrar.charAt(i) - 'a';
                    int nuevaLetra = (posicionLetra + desplazamiento) % 26;
                    char cifrado = (char) (nuevaLetra + 'a');
                    resultado += cifrado;
                } else {
                    // Si no es una letra que lo añada diréctamente sin cifrar.
                    resultado += cadenaACifrar.charAt(i);
                }
            }
        }

        return resultado;
    }

    public static int pedirNumeroEntero(String mensaje, int minimo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo) {
                    return numero;
                } else {
                    System.out.println("El número debe ser mayor que " + minimo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}