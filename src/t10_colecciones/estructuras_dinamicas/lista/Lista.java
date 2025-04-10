package t10_colecciones.estructuras_dinamicas.lista;

import java.util.Arrays;

public class Lista<T> {
    private T[] tabla;

    public Lista() {
        this.tabla = (T[]) new Object[0];
    }

    public int longitud() {
        return tabla.length;
    }

    public void insertLast(T cadena) {
        tabla = Arrays.copyOf(tabla, longitud() + 1);
        tabla[tabla.length - 1] = cadena;
    }

    public void insertFirst(T cadena) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length -1);
        tabla[0] = cadena;
    }

    public void insertIn(int posicion, T cadena) {
        if (posicion >= 0 && posicion <= tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
            tabla[posicion] = cadena;
        } else {
            System.out.println("La posición indicada no está en el array");
        }
    }

    public void addLista(T[] lista) {
        int originalLength = tabla.length;
        tabla = Arrays.copyOf(tabla, originalLength + lista.length);
        System.arraycopy(lista, 0, tabla, originalLength, lista.length);


    }

    public void deleteIn(int indice){
        System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length - indice - 1);
        tabla = Arrays.copyOf(tabla, tabla.length - 1);
    }

    public T get(int posicion){
        return this.tabla[posicion];
    }

    public int search(T cadena){
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i].equals(cadena)) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }

    public static <T> T[] fusionTablas(T[] tabla1, T[] tabla2) {
        T[] fusion = Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
        System.arraycopy(tabla2, 0, fusion, tabla1.length, tabla2.length);
        return fusion;
    }

}