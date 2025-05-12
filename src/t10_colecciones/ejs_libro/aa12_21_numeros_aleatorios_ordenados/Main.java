package t12_colecciones.ejs_libro.aa12_21_numeros_aleatorios_ordenados;

import java.util.Collection;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Collection<Integer> numeros = new TreeSet<>(c);
        while (numeros.size()< 20){
            numeros.add(new Random().nextInt(99)+1);
        }
        System.out.println(numeros);
    }

}