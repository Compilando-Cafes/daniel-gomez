package t9_interfaces.interfaz.ej2_animal;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Pato pato = new Pato(20);

        // Array con cuatro posiciones aleatorias entre uno y 4
        int[] posiciones = new int[4];
        rand = new Random();

        for (int i = 0; i < 4; i++) {

        }


        System.out.println(Arrays.toString(posiciones));
    }
}