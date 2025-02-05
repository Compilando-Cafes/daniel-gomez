package t6_cadenas_caracteres.examen;

import java.util.Arrays;
import java.util.Scanner;

public class compra_2 {
    public static Scanner sc = new Scanner(System.in);
    static String[] listaCompra = new String[0];

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    ==============================================
                    ¿Qué quiere hacer?
                    1. Producto a añadir a la lista.
                    2. Producto ya comprado.
                    0. Fin.
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Introduce opción: ", 0, 2);
            if (eleccion == 0) {
                System.out.println("Saliendo...");
                break;
            }
            switch (eleccion) {
                case 1 -> productoAnadir();
                case 2 -> productoComprado();
            }
        }
    }

    private static void productoAnadir() {
        // Solicitar nombre producto
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        // Introducir la cantidad del producto a comprar
        int cantidad = pedirNumeroEntero("Cantidad: ", 1);

        // Añadir el nombre y cantidad a la lista de la compra con el formato: Producto: cantidad
        String producto = nombre + ": " + cantidad;

        // Añadir a la lista de la compra
        listaCompra = Arrays.copyOf(listaCompra, listaCompra.length + 1);
        listaCompra[listaCompra.length - 1] = producto;

        // Mostrar la lista de la compra
        System.out.println("LISTA:");
        for (int i = 0; i < listaCompra.length; i++) {
            System.out.println(listaCompra[i]);
        }
        System.out.println();
    }


    private static void productoComprado() {
        // Solicita un nombre de producto
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        // Controlar si el producto está en la lista
        boolean encontrado = false;
        for (int i = 0; i < listaCompra.length; i++) {
            String producto = listaCompra[i];
            if (producto.startsWith(nombre)) {
                encontrado = true;
                // Mostrar el producto y después eliminarlo de la lista
                System.out.println("Producto encontrado: " + producto);
                listaCompra = eliminarElementoArray(listaCompra, i);
                break;
            }
        }

        // Mensaje si no encuentra el producto
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }

        // Mostrar la lista de la compra
        System.out.println("LISTA:");
        for (int i = 0; i < listaCompra.length; i++) {
            System.out.println(listaCompra[i]);
        }
        System.out.println();
    }

    // Función para eliminar un elemento de un array
    public static String[] eliminarElementoArray(String[] array, int posicion) {
        for (int i = posicion; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array = Arrays.copyOf(array, array.length - 1);
        return array;
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