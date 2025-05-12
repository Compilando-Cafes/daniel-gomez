package T10_11_ficheros.clase1_excepciones_ficheros.ej1_excepcion_personalizada;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        try {
            int numero = sc.nextInt();
            if (numero < 0) {
                throw new excepcionNumerosPositivos();
            } else
                System.out.println("Número positivo");
        } catch (excepcionNumerosPositivos ex) {
            System.out.println(ex);
        }
    }
}

