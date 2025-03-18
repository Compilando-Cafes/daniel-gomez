package t9_interfaces.interfaz3_comparable_comparator.ej3_llamada;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] precioLlamadas = {0.03, 0.1, 0.25, 0.5};
        Llamada[] llamadas = {
                new Llamada(234234234, 6, false, LocalDateTime.now(), LocalDateTime.now().plusMinutes(20), Llamada.DistanciaTelefonos.A, precioLlamadas),
                new Llamada(123456789, 987654321, true, LocalDateTime.now(), LocalDateTime.now().plusMinutes(30), Llamada.DistanciaTelefonos.B, precioLlamadas),
                new Llamada(222222222, 333333333, false, LocalDateTime.of(2024, 3, 5, 3, 10), LocalDateTime.of(2024, 3, 5, 3, 15), Llamada.DistanciaTelefonos.C, precioLlamadas),
                new Llamada(949123456, 949123457, true, LocalDateTime.now(), LocalDateTime.now().plusHours(2), Llamada.DistanciaTelefonos.A, precioLlamadas),
                new Llamada(1, 223334445, false, LocalDateTime.of(2025, 1, 1, 1, 1), LocalDateTime.of(2026, 1, 1, 1, 1), Llamada.DistanciaTelefonos.B, precioLlamadas),
                new Llamada(661123456, 637123456, true, LocalDateTime.now(), LocalDateTime.now().plusMonths(1), Llamada.DistanciaTelefonos.C, precioLlamadas),
                new Llamada(765623456, 888945678, false, LocalDateTime.now(), LocalDateTime.now().plusHours(1), Llamada.DistanciaTelefonos.D, precioLlamadas),
                new Llamada(333333333, 666666666, true, LocalDateTime.now(), LocalDateTime.now().plusSeconds(60), Llamada.DistanciaTelefonos.A, precioLlamadas),
                new Llamada(999999999, 888888888, false, LocalDateTime.now(), LocalDateTime.now().plusWeeks(1), Llamada.DistanciaTelefonos.B, precioLlamadas),
                new Llamada(123444321, 234523456, true, LocalDateTime.now(), LocalDateTime.now().plusYears(1), Llamada.DistanciaTelefonos.C, precioLlamadas),
        };

        while (true) {
            System.out.println("""
                    ==============================================
                    REGISTRO DE LLAMADAS
                    1. Mostrar las llamadas como están.
                    2. Mostrar las llamadas ordenadas de forma natural.
                    3. Mostrar las llamadas ordenadas en orden inverso.
                    4. Mostrar las llamadas ordenadas por coste.
                    0. Salir.
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 4);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.println("""
                            ***********************************************************************
                            LLAMADAS ORDENADAS COMO ESTÁN:""");
                }
                case 2 -> {
                    System.out.println("""
                            ***********************************************************************
                            LLAMADAS ORDENADAS DE FORMA NATURAL:""");
                    Arrays.sort(llamadas);
                }
                case 3 -> {
                    System.out.println("""
                            ***********************************************************************
                            LLAMADAS ORDENADAS EN ORDEN INVERSO:""");
                    CompararLlamadasInverso cli = new CompararLlamadasInverso();
                    Arrays.sort(llamadas, cli);
                }
                case 4 -> {
                    System.out.println("""
                            ***********************************************************************
                            LLAMADAS ORDENADAS POR COSTE:""");
                    CompararLlamadasPorCoste clpc = new CompararLlamadasPorCoste();
                    Arrays.sort(llamadas, clpc);
                }
            }
            System.out.println(Arrays.deepToString(llamadas));
        }
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