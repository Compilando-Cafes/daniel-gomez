package t6_cadenas_caracteres.ejercicios_evaluacion;

import java.util.Scanner;

public class numerosAl99 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Escribe una función numeroATexto a la que le pasamos
        un entero y nos devuelve una cadena con ese número
        puesto como texto (p.ej.: 76 =
        “setenta y seis”).
        El número deberá estar comprendido entre 0 y 99.
        En caso contrario, devuelve una cadena vacía.
        Se recomienda escribir la función NumeroTexto9
        que hace lo mismo, pero sólo con números del 0 al 9.
        Escribir un switch de 100 elementos NO es la solución
         */
        System.out.println(numeroATexto(pedirNumeroEntero("Introduce un número entre 0 y 99: ", 0, 99)));
    }

    public static String numeroATexto(int numero) {
        String resultado = "";
        String y = " y ", diez = "diez", dieci = "dieci", veinte = "veinte", veinti = "veinti", treinta = "treinta", cuarenta = "cuarenta",
                cincuenta = "cincuenta", sesenta = "sesenta", setenta = "setenta", ochenta = "ochenta",
                noventa = "noventa";
        int resto = numero % 10;
        if (numero < 10) {
            resultado = numeroATexto9(numero);
        } else if (numero == 10) {
            resultado = diez;
        } else if (numero < 20) {
            switch (numero) {
                case 11 -> resultado = "once";
                case 12 -> resultado = "doce";
                case 13 -> resultado = "trece";
                case 14 -> resultado = "catorce";
                case 15 -> resultado = "quince";
                case 16, 17, 18, 19 -> resultado = dieci + numeroATexto9(resto);
            }
        } else if (numero == 20) {
            resultado = veinte;
        } else if (numero < 30) {
            resultado = veinti + numeroATexto9(resto);
        } else if (numero == 30) {
            resultado = treinta;
        } else if (numero == 40) {
            resultado = cuarenta;
        } else if (numero < 50) {
            resultado = cuarenta + y + numeroATexto9(resto);
        } else if (numero == 50) {
            resultado = cincuenta;
        } else if (numero < 60) {
            resultado = cincuenta + y + numeroATexto9(resto);
        } else if (numero == 60) {
            resultado = sesenta;
        } else if (numero < 70) {
            resultado = sesenta + y + numeroATexto9(resto);
        } else if (numero == 70) {
            resultado = setenta;
        } else if (numero < 80) {
            resultado = setenta + y + numeroATexto9(resto);
        } else if (numero == 80) {
            resultado = ochenta;
        } else if (numero < 90) {
            resultado = ochenta + y + numeroATexto9(resto);
        } else if (numero == 90) {
            resultado = noventa;
        } else {
            resultado = noventa + y + numeroATexto9(resto);
        }
        return resultado;
    }


    public static String numeroATexto9(int numero) {
        String resultado = "";
        switch (numero) {
            case 0 -> resultado = "cero";
            case 1 -> resultado = "uno";
            case 2 -> resultado = "dos";
            case 3 -> resultado = "tres";
            case 4 -> resultado = "cuatro";
            case 5 -> resultado = "cinco";
            case 6 -> resultado = "seis";
            case 7 -> resultado = "siete";
            case 8 -> resultado = "ocho";
            case 9 -> resultado = "nueve";
        }
        return resultado;
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