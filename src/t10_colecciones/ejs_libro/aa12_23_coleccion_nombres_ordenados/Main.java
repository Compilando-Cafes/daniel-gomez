package t12_colecciones.ejs_libro.aa12_23_coleccion_nombres_ordenados;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> nombres = new TreeSet<>();
        String nombre = "";
        while (!nombre.equals("fin")) {
            System.out.print("Nombre (fin para salir): ");
            nombre = new Scanner(System.in).next();
            if (!nombre.equals("fin") && nombres.add(nombre)) {
                System.out.println("Añadido a la lista.");
            } else if (!nombre.equals("fin")) {
                System.out.println("Nombre repetido. No añadido.");
            }
        }
        System.out.println(nombres);
    }
}
