package t10_colecciones.ejs_libro.aa12_24_fusion_listas_enteros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> lista2 = new ArrayList<>(List.of(2, 3, 4));
        System.out.println(fusion(lista1, lista2));
        System.out.println(lista1);
        System.out.println(lista2);
    }

    public static List<Integer> fusion(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>(lista1);
        resultado.addAll(lista2);
        Collections.sort(resultado);
        return resultado;
    }

}