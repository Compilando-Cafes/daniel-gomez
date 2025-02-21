package t8_herencia.ej1_mueble;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mueble[] mueble = new Mueble[5];
        // Rellenar array mueble
        System.out.println("Bienvenido a IKEA");
        for (int i = 0; i < mueble.length; i++) {
            System.out.println("""
                    ==============================================
                    ¿DE QUÉ TIPO QUIERES CREAR EL MUEBLE?
                    1. Mueble sencillo. (KALLAX)
                    2. Sofá. (EKTORP)
                    3. Silla. (EKEDALEN)
                    ==============================================""");
            int eleccion = pedirNumeroEntero("Elige: ", 1, 3);
            switch (eleccion) {
                case 1 -> mueble[i] = new Mueble("1", "Mueble", 10, 50, Mueble.Stock.CON_STOCK);
                case 2 -> mueble[i] = new Sofa("1", "Sofa", 10, 50, Mueble.Stock.CON_STOCK, 3);
                case 3 -> mueble[i] = new Silla("1", "Silla", 10, 50, Mueble.Stock.CON_STOCK, true, 4);
            }
        }

        // Menú
        while (true) {
            System.out.println("""
                    ==============================================
                    OPCIONES
                    1. Listar muebles
                    2. Comprar silla
                    3. Comprar sofá
                    4. Comprar mueble
                    5. Aumentar cantidad
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 5);
            if (eleccion == 0) {
                System.out.println("Volverás...");
                break;
            }
            switch (eleccion) {
                case 1 -> listarMuebles(mueble);
                case 2 -> comprarSilla();
                case 3 -> comprarSofa();
                case 4 -> comprarMueble();
                case 5 -> aumentarCantidad();
            }
        }
    }

    private static void listarMuebles(Mueble[] mueble) {
        for (Mueble m : mueble) {
            m.mostrarInfo();
        }
    }

    private static void comprarSilla() {
        int cantidad = pedirNumeroEntero("Cantidad: ");
        String nombre = sc.nextLine();

    }

    private static void comprarSofa() {
    }

    private static void comprarMueble() {
    }

    private static void aumentarCantidad() {
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

    public static int pedirNumeroEntero(String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }

    public static int pedirNumeroEntero() {
        int numero;
        while (true) {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } else {
                System.out.print("Introduce un número válido: ");
                sc.nextLine();
            }
        }
    }

    public static boolean buscarEnArray(Mueble[] array, String valor) {
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNombre().equalsIgnoreCase(valor)) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

}