package t12_colecciones.clase_5_ejercicios.ejercicio2_frecuencia;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    ==============================================
                    Lista de números.
                    Cómo quieres crear la lista
                    1. Manualmente, uno a uno.
                    2. Que lo haga Random por mí.
                    0. Salir.
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 2);
            if (eleccion == 0) {
                System.out.println("Hasta el siguiente ejercicio.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    List<Integer> lista = new ArrayList<>();
                    System.out.println("No me lo esperaba...");
                    System.out.println("Al tema.");
                    LocalDateTime inicio = LocalDateTime.now();
                    while (true) {
                        int numero = pedirNumeroEntero("Número (-1 salir): ", -1);
                        if (numero == -1) {
                            break;
                        }
                        lista.add(numero);
                    }
                    LocalDateTime fin = LocalDateTime.now();
                    double segundos = ChronoUnit.SECONDS.between(inicio, fin);
                    System.out.println("Hecho, por fin. Solo has tardado " + segundos + " segundos.");
                    System.out.println("Sigamos.");
                    menu(lista);
                }
                case 2 -> {
                    List<Integer> lista = new ArrayList<>();
                    System.out.println("Ya decía yo...");
                    System.out.println("Generando 20 números aleatoriamente sin que tengas que hacer nada.");
                    LocalDateTime inicio = LocalDateTime.now();
                    for (int i = 0; i < 20; i++) {
                        lista.add(new Random().nextInt(10) + 1);
                    }
                    LocalDateTime fin = LocalDateTime.now();
                    long milisegundos = ChronoUnit.MILLIS.between(inicio, fin);
                    double segundos = milisegundos / 1000.0;
                    System.out.println("Hecho, todo facilidades.");
                    System.out.println("Y solo he tardado: " + segundos + " segundos.");
                    System.out.println("Sigamos.");
                    menu(lista);
                }
            }
        }
    }

    private static void menu(List<Integer> lista) {
        System.out.println("_______________________________________________________________________");
        System.out.println("Lista completa:");
        System.out.println(lista);
        System.out.println("_______________________________________________________________________");
        System.out.println("Números duplicados:");
        duplicados(lista);
        System.out.println("_______________________________________________________________________");
        System.out.println("Frecuencia de cada número:");
        frecuencia(lista);
        System.out.println("_______________________________________________________________________");
        System.out.println("Números ordenados por frecuencia:");
        ordenadoPorFrecuencia(lista);
        System.out.println("_______________________________________________________________________");
        System.out.println("Lista solo con los números que no se repiten:");
        numerosUnicos(lista);
    }

    private static void numerosUnicos(List<Integer> lista) {
        List<Integer> copia = new ArrayList<>(lista);
        for (Integer numero : lista) {
            if (Collections.frequency(lista, numero) > 1) {
                copia.removeAll(Collections.singleton(numero));
            }
        }
        System.out.println(copia);
    }

    private static void ordenadoPorFrecuencia(List<Integer> lista) {
        List<Integer> duplicados = new ArrayList<>();
        for (Integer numero : lista) {
            if (Collections.frequency(lista, numero) > 1) {
                duplicados.add(numero);
            }
        }
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Collections.frequency(lista, o1) == Collections.frequency(lista, o2)) {
                    return Integer.compare(o1, o2);
                } else
                    return Collections.frequency(lista, o1) - Collections.frequency(lista, o2);
            }
        };
        System.out.println("De mayor a menor frecuencia:");
        duplicados.sort(c.reversed());
        System.out.println(duplicados);
        System.out.println("De menor a mayor frecuencia:");
        duplicados.sort(c);
        System.out.println(duplicados);
    }

    private static void frecuencia(List<Integer> lista) {
        Set<String> frecuencias = new TreeSet<>();
        for (Integer numero : lista) {
            int frecuencia = Collections.frequency(lista, numero);
            frecuencias.add(numero + " -> " + frecuencia + " ve" + (frecuencia > 1 ? "ces" : "z") + " / ");
        }
        for (String elemento : frecuencias) {
            System.out.print(elemento);
        }
        System.out.println();
    }

    private static void duplicados(List<Integer> lista) {
        // Crear una lista para los duplicados
        Set<Integer> duplicados = new HashSet<>();
        for (Integer numero : lista) {
            if (Collections.frequency(lista, numero) > 1) {
                duplicados.add(numero);
            }
        }
        System.out.println(duplicados);
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