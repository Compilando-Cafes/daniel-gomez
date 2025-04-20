package t10_colecciones.clase_1_colecciones.ej2_numeros_positivos_negativos;

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
                NÚMEROS REALES
                Introduce todos los números que quieras.
                ==============================================""");
        while (true) {
            int eleccion = pedirNumeroEntero("Número (0 para salir): ");
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            if (eleccion > 0) {
                positivos.add(eleccion);
            } else {
                negativos.add(eleccion);
            }
        }

        // Mostrar las listas
        System.out.println("Números positivos: ");
        System.out.println(positivos);
        System.out.println("Números negativos: ");
        System.out.println(negativos);

        // Mostrar sumas de ambas listas
        int resultadoPositivos = 0;
        for (Integer positivo : positivos) {
            resultadoPositivos += positivo;
        }
        System.out.println("Suma total positivos: " + resultadoPositivos);

        int resultadoNegativos = 0;
        for (Integer negativo : negativos) {
            resultadoNegativos += negativo;
        }
        System.out.println("Suma total negativos: " + resultadoNegativos);

        // Suma de los dos números que se encuentran en la misma posición. Si no son iguales sustituir por ceros la más corta.
        Collection<Integer> suma = new ArrayList<>();
        Iterator<Integer> itPositivo = positivos.iterator();
        Iterator<Integer> itNegativo = negativos.iterator();
        while (itPositivo.hasNext() || itNegativo.hasNext()) {
            int numPos = itPositivo.hasNext() ? itPositivo.next() : 0;
            int numNeg = itNegativo.hasNext() ? itNegativo.next() : 0;
            suma.add(numPos + numNeg);
        }
        System.out.println("Suma de los dos números que se encuentran en la misma posición: ");
        System.out.println(suma);

        // Eliminar todos los valores mayores de 20 y menores de -20
        Iterator<Integer> itPos = positivos.iterator();
        while (itPos.hasNext()) {
            if (itPos.next() > 20) {
                itPos.remove();
            }
        }
        Iterator<Integer> itNeg = negativos.iterator();
        while (itNeg.hasNext()){
            if (itNeg.next()< -20){
                itNeg.remove();
                }
        }

        System.out.println("Lista de positivos y negativos reducidos:");
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
