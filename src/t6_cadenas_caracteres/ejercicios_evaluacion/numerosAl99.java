package t6_cadenas_caracteres.ejercicios_evaluacion;

import java.util.Scanner;

public class numerosAl99 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String resultado = numeroATexto(pedirNumeroEntero("Introduce un número entre 0 y 99: ", 0, 99));
        resultado = resultado.substring(0,1).toUpperCase() + resultado.substring(1);
        System.out.println(resultado);
    }

    public static String numeroATexto(int numero) {
        String resultado = "", y = " y ";
        String[] decenas = {"diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] menores16 = {"once", "doce", "trece", "catorce", "quince"};
        String[] otros = {"dieci", "veinti"};

        int decena = numero / 10;
        int unidad = numero % 10;

        if (numero < 10) {
            // Para números del 0 al 9
            resultado = numeroATexto9(numero);
        } else if (numero % 10 == 0) {
            // Para decenas justas
            resultado = decenas[decena - 1];
        } else if (numero < 16) {
            // Entre 11 y 15
            resultado = menores16[numero - 11];
        } else if (numero < 20) {
            // Entre 16 y 19
            resultado = otros[0] + numeroATexto9(unidad);
        } else if (numero < 30) {
            // Entre 21 y 29
            resultado = otros[1] + numeroATexto9(unidad);
        } else {
            // Mayores de 30
            resultado = decenas[decena - 1] + y + numeroATexto9(unidad);
        }

        return resultado;
    }

    public static String numeroATexto9(int unidad) {
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        return unidades[unidad];
    }

    public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}
