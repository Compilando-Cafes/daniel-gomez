package t12_colecciones.ejs_libro.ar12_12_metodo_unir_conjuntos_genericos;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }

    static <E> Set<E> union (Set<E> conjunto1, Set<E> conjunto2){
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;
    }

    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.retainAll(conjunto2);
        return resultado;
    }
}