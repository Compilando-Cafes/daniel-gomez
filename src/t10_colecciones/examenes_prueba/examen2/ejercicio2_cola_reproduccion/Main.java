package t10_colecciones.examenes_prueba.examen2.ejercicio2_cola_reproduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> colaReproduccion = new ArrayList<>();

        while (true) {
            System.out.println("""
                    ==============================================
                    COLA DE REPRODUCCIÓN
                    1. Añadir una canción al final de la cola.
                    2. Reproducir la canción en la primera posición y eliminarla.
                    3. Mostrar la canción actual (posición 0).
                    4. Mostrar toda la lista actual de canciones.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 5);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.print("Canción: ");
                    String cancion = sc.nextLine();
                    colaReproduccion.add(cancion);
                    System.out.println("Canción añadida.");
                }
                case 2 -> {
                    if (colaReproduccion.isEmpty()){
                        System.out.println("Lista vacía.");
                    } else {
                        System.out.println(colaReproduccion.removeFirst());
                        System.out.println("Canción eliminada.");
                    }
                }
                case 3 -> {
                    if (colaReproduccion.isEmpty()){
                        System.out.println("Lista vacía.");
                    } else {
                        System.out.println("Canción primera: " + colaReproduccion.getFirst());
                    }
                }
                case 4 -> {
                    if (!colaReproduccion.isEmpty()) {
                        for (String cancion : colaReproduccion) {
                            System.out.println(cancion);
                        }
                    } else {
                        System.out.println("Lista vacía");
                    }
                }
            }
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