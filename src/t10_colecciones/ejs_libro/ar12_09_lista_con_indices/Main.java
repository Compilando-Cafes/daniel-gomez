package t12_colecciones.ejs_libro.ar12_09_lista_con_indices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        System.out.println("""
                ==============================================
                Introduce números enteros positivos
                ==============================================""");
        while (true) {
            int numero = pedirNumeroEntero("Número: ");
            if (numero < 0) {
                break;
            }
            lista.add(numero);
        }
        // Recorrer la lista y mostrar los pares, que serán multiplicados por 100, con su índice
        for (int i = 0; i< lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                System.out.print(i + " ");
                lista.set(i, lista.get(i) * 100);
            }
        }
        System.out.println();
        System.out.println(lista);
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

}