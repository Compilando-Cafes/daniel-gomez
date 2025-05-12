package t12_colecciones.ejs_libro.ar12_03_interfaz_pila_generica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> p = new Contenedor<>(new Integer[0]);
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir un número entero positivo (-1 para terminar): ");
        Integer n = sc.nextInt();
        while (n != -1){
            p.apilar(n);
            System.out.print("Introducir un número entero positivo (-1 para terminar): ");
            n = sc.nextInt();
        }
        System.out.println("Desapilamos: ");
        n = p.desapilar();
        while (n != null){
            System.out.print(n + " ");
            n = p.desapilar();
        }
        System.out.println();
    }

}