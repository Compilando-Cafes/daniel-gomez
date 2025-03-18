package t9_interfaces.interfaz3_comparable_comparator.ej1_cartas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int eleccion = pedirNumeroEntero("¿Cuántas cartas diferentes quieres generar?: ", 0);
        Carta[] cartas = new Carta[eleccion];
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = Carta.nuevaCarta();
        }
        System.out.println(Arrays.deepToString(cartas));

        System.out.println("""
                ¿Qué método de ordenación prefieres?
                1. Por número de mayor a menor.
                2. Primero por palo y después por número.
                """);
        // Objeto del comparador
        ComparadorNumeroSolo comparadorNumeroSolo = new ComparadorNumeroSolo();
        Comparator c = comparadorNumeroSolo.reversed();
        int ordenacion = pedirNumeroEntero("Elección: ", 1, 2);
        if (ordenacion == 1){
            // Ordenar por número
            Arrays.sort(cartas, c);
        } else
            // Ordenar por palo y después por número
            Arrays.sort(cartas);
        // Mostrar el arrays de cartas ya ordenado
        System.out.println(Arrays.deepToString(cartas));
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