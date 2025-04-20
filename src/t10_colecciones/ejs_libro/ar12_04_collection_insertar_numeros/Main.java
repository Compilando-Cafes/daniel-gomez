package t10_colecciones.ejs_libro.ar12_04_collection_insertar_numeros;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();
        System.out.println("""
                    ==============================================
                    Introduce números enteros no negativos
                    ==============================================""");
        while (true) {
            int eleccion = pedirNumeroEntero("Número: ", -1);
            if (eleccion == -1) {
                break;
            }
            coleccion.add(eleccion);
        }
        System.out.println("Números introducidos:");
        System.out.println(coleccion);

        System.out.println("Números pares:");
        for (Integer numero : coleccion) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        System.out.println("Eliminando los múltiplos de tres:");
        for (Iterator<Integer> it = coleccion.iterator(); it.hasNext(); ) {
            if (it.next()%3 == 0) {
                it.remove();
            }
        }
        System.out.println(coleccion);
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