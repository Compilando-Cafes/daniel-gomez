package t6_cadenas_caracteres.ejercicios_evaluacion;

import java.util.Scanner;

public class eliminadorDeEtiquetas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String cadenaParaProbar = "<p>Esto es texto normal y <b>esto es texto en negrita.</b></p>";
        System.out.print("Introduce un texto con formato XML (con etiquetas): ");
        String cadena = sc.nextLine();

        System.out.println("Cadena a transformar: " + cadena);
        System.out.println("Cadena transformada: " + eliminaEtiquetas(cadena));
    }

    public static String eliminaEtiquetas(String cadena) {
        String resultado = "";

        while (cadena.contains("<")) {
            int posicionInicio = cadena.indexOf("<");

            // En resultado guardas lo que haya antes de "<"
            resultado += cadena.substring(0, posicionInicio);

            int posicionFin = cadena.indexOf(">", posicionInicio);

            // Añadir el texto de después de ">"
            cadena = cadena.substring(posicionFin + 1);
        }

        // Añadir el texto restante fuera de etiquetas
        resultado += cadena;

        return resultado;
    }
}
