package t6_cadenas_caracteres.ejercicios_evaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class agendaDeTelefonos {
    static Scanner sc = new Scanner(System.in);
    static int tamanoAgenda = 0;
    static String[] agenda = new String[0];

    public static void main(String[] args) {
        /*
        Diseña un programa que se comporte como una pequeña
        agenda. Mediante un menú el usuario podrá elegir entre:
        Añadir un nuevo contacto (nombre y teléfono)
        Buscar un teléfono de un contacto por el nombre
        Mostrar la información de todos los contactos
        ordenados alfabéticamente por el nombre.
        */
        agendaTelefonos();
    }

    public static void agendaTelefonos() {

        while (true) {
            System.out.println("""
                    ==============================================
                    AGENDA DE TELÉFONOS
                    1. Añadir nuevo contacto.
                    2. Buscar un contacto.
                    3. Mostrar todos los contactos.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 3);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> agenda = anadirContacto(agenda);
                case 2 -> buscarContacto(agenda);
                case 3 -> mostrarContactos(agenda);
            }
        }
    }

    public static String[] anadirContacto(String[] agenda) {
        System.out.println("Introduce todos los contactos y sus teléfonos que quieras. (0 para salir)");
        while (true) {
            // Pedir nombre
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            // Controlar la salida
            if (nombre.equals("0")) {
                break;
            }

            // Pedir teléfono
            String telefono = comprobarTelefono("Teléfono (9 números sin espacios): ");
            tamanoAgenda++;
            agenda = Arrays.copyOf(agenda, tamanoAgenda);
            agenda[tamanoAgenda - 1] = nombre + ":" + telefono;
            System.out.println("Nuevo contacto añadido.");
        }
        return agenda;
    }

    private static String comprobarTelefono(String mensaje) {
        String telefono;
        do {
            System.out.print(mensaje);
            telefono = sc.nextLine();
            if (telefono.contains(" ")) {
                System.out.println("No pongas espacios.");
            }
            if (telefono.length() != 9) {
                System.out.println("Debe tener 9 dígitos.");
            }
            if (!sonNumeros(telefono)) {
                System.out.println("Deben ser solo números.");
            }
        } while (telefono.contains(" ") || telefono.length() != 9 || !sonNumeros(telefono));
        return telefono;
    }

    public static boolean sonNumeros(String telefono) {
        for (int i = 0; i < telefono.length(); i++) {
            if (!Character.isDigit(telefono.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarContactos(String[] agenda) {
        if (agenda.length == 0) {
            System.out.println("La agenda está vacía. Primero introduce contactos.");
            return;
        }

        // Ordenar la lista alfabéticamente
        Arrays.sort(agenda);

        for (int i = 0; i < agenda.length; i++) {
            int posicion = agenda[i].indexOf(":");
            System.out.println("Contacto número " + (i + 1) + ":");
            System.out.println("\tNombre: " + agenda[i].substring(0, posicion));
            System.out.println("\tTeléfono: " + agenda[i].substring(posicion + 1));
        }
    }

    public static void buscarContacto(String[] agenda) {
        if (agenda.length == 0) {
            System.out.println("La agenda está vacía. Primero introduce datos.");
            return;
        }

        System.out.print("Dime el nombre del contacto a buscar: ");
        String nombre = sc.nextLine();

        // Buscar contacto
        for (String contacto : agenda) {
            if (contacto.startsWith(nombre + ":")) {
                System.out.println("Nombre: " + nombre);
                int posicion = contacto.indexOf(":");
                System.out.println("\tTeléfono: " + contacto.substring(posicion + 1));
                return;
            }
        }

        System.out.println("El nombre introducido no está en la agenda.");
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
