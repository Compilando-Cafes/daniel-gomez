package t12_colecciones.ejs_libro.ar12_13_sorteo;

import java.util.*;

public class Sorteo<T extends Comparable<T>> {
    private final Set<T> elementos;

    public Sorteo() {
        this.elementos = new TreeSet<>();
    }

    boolean add(T elemento) {
        return elementos.add(elemento);
    }

    Set<T> premiados(int numPremiados) {
        Set<T> premiados = null;
        List<T> temp = new ArrayList<>(elementos);
        Collections.shuffle(temp); // Los números del conjunto de elementos desordenados.
        if (numPremiados < elementos.size()) {
            premiados = new TreeSet<>();
            for (int i = 0; i< numPremiados; i++){
                premiados.add(temp.get(i)); // Añadimos a la lista de premiados el número de premios solicitado
            }
        }
        return premiados;
    }

    @Override
    public String toString() {
        return "Sorteo {elementos=" + elementos + '}';
    }
}