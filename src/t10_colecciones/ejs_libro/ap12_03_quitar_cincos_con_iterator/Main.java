package t12_colecciones.ejs_libro.ap12_03_quitar_cincos_con_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

        // Se puede hacer con un while y el iterator declarado antes
        Iterator<Integer> it = coleccion.iterator();
        while (it.hasNext()){
            if (it.next() == 5){
                it.remove();
            }
        }

        // Se puede hacer con un for
        for (Iterator<Integer> it2 = coleccion.iterator(); it2.hasNext();){
            if (it2.next() == 5){
                it2.remove();
            }
        }

        System.out.println("Colección sin cincos: ");
        System.out.println(coleccion);
    }
    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo-minimo)+minimo;
        return  num;
    }

}