package t10_colecciones.ejs_libro.ar12_07_quitar_cincos_con_metodos_globales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class Main {
    static Random r = new Random();
    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            coleccion.add(obtenerUnNumero(1, 10));
        }
        System.out.println("Colección completa: ");
        System.out.println(coleccion);

        // Hay que usar otra colección para compararla con la primera
        // Se puede hacer dentro
        coleccion.removeAll(new ArrayList<>(Arrays.asList(5,2,3,4,6)));
        // O fuera
        Collection<Integer> eliminar = new ArrayList<>();
        eliminar.add(5);
        eliminar.add(2);
        coleccion.removeAll(eliminar);

        System.out.println("Colección sin cincos: ");
        System.out.println(coleccion);
    }
    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo-minimo)+minimo;
        return  num;
    }
}