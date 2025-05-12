package t12_colecciones.ejs_libro.ap12_04_coleccion_negativos_positivos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Collection<Integer> positivos = new ArrayList<>();
        Collection<Integer> negativos = new ArrayList<>();

        System.out.println("""
                    ==============================================
                    Introduce números enteros (0 para terminar)
                    ==============================================""");
        while (true) {
            int numero = pedirNumeroEntero("Número: ");
            if (numero == 0) {
                break;
            }
            if (numero > 0)
                positivos.add(numero);
            else
                negativos.add(numero);
        }
        System.out.println("Números positivos introducidos:");
        System.out.println(positivos);
        System.out.println("Números negativos introducidos:");
        System.out.println(negativos);

        Integer sumaPositivos = 0;
        for (Integer numero : positivos){
            sumaPositivos+= numero;
        }
        System.out.println("Suma de los positivos: " + sumaPositivos);

        Integer sumaNegativos = 0;
        for (Integer numero : negativos){
            sumaNegativos+= numero;
        }
        System.out.println("Suma de los negativos: " + sumaNegativos);

        System.out.println("Eliminando y mostrando los valores mayores que 10 y menores que -10:");
        for (Iterator<Integer> it = positivos.iterator(); it.hasNext();){
            if(it.next() > 10){
                it.remove();
            }
        }
        for (Iterator<Integer> it = negativos.iterator(); it.hasNext();){
            if(it.next() < -10){
                it.remove();
            }
        }
        System.out.println(positivos);
        System.out.println(negativos);
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