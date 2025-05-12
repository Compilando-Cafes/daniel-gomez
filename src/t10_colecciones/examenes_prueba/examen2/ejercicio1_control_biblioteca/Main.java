package t10_colecciones.examenes_prueba.examen2.ejercicio1_control_biblioteca;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> biblioteca = new LinkedHashSet<>();
        /*
            Elijo un Set por que no se permiten duplicados
            La implementación LinkedHashSet ya que al ser una biblioteca interesa guardar por orden de registro
         */
        while (true) {
            System.out.println("""
                    ==============================================
                    BIBLIOTECA
                    1. Registrar un libro prestado, sin permitir duplicados.
                    2. Devolver (eliminar) un libro.
                    3. Mostrar si un libro concreto está prestado.
                    4. Mostrar cuántos libros hay actualmente prestados.
                    5. Vaciar el registro cuando se cierra la biblioteca.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 5);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.print("Libro: ");
                    String libro = sc.nextLine();
                    biblioteca.add(libro);
                    System.out.println("Libro añadido");
                }
                case 2 -> {
                    System.out.print("Libro: ");
                    String libro = sc.nextLine();
                    if (biblioteca.remove(libro)) {
                        System.out.println("Libro eliminado.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Libro: ");
                    String libro = sc.nextLine();
                    if (biblioteca.contains(libro)){
                        System.out.println("Libro disponible.");
                    } else {
                        System.out.println("Libro no disponible.");
                    }
                }
                case 4 -> {
                    if (biblioteca.isEmpty()){
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("Libros prestados actualmente: " + biblioteca.size());
                        for (String libro : biblioteca){
                            System.out.println(libro);
                        }
                    }
                }
                case 5 -> {
                    biblioteca.clear();
                    System.out.println("Biblioteca vaciada.");
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