package t10_colecciones.ejs_libro.aa12_11a15_contenedor_cola_pila_ordenado;

import t10_colecciones.ejs_libro.ar12_03_interfaz_pila_generica.Pila;

import java.util.*;

public class Contenedor<T> implements Pila<T>, Cola<T> {
    private T[] objetos;

    public Contenedor(T[] objetos) {
        this.objetos = objetos;
    }

    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }

    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        System.arraycopy(objetos, 0, objetos, 1, objetos.length - 1);
        objetos[0] = nuevo;
    }

    T extraerDelFinal() {
        T res = null;
        if (objetos.length > 0) {
            res = objetos[objetos.length - 1];
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        }
        return res;
    }

    T extraerDelPrincipio() {
        T res = null;
        if (objetos.length > 0) {
            res = objetos[0];
            objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
        }
        return res;
    }

    void ordenar() {
        Arrays.sort(objetos);
    }

    void ordenar(Comparator<T> c){
        Arrays.sort(objetos, c);
    }
    
    T get (int indice){
        return objetos[indice];
    }
    
    T[] quitarRepetidos(T[] elementos){
        Set<T> sinRepetidos = new LinkedHashSet<>(Arrays.asList(elementos));
        return sinRepetidos.toArray(Arrays.copyOf(elementos, sinRepetidos.size()));
    }

    public String toString() {
        return Arrays.deepToString(objetos);
    }

    @Override
    public void apilar(T nuevo) {
        this.insertarAlPrincipio(nuevo);
    }

    @Override
    public T desapilar() {
        return this.extraerDelFinal();
    }

    @Override
    public void encolar(T nuevo) {
        this.insertarAlFinal(nuevo);
    }

    @Override
    public T desencolar() {
        return this.extraerDelPrincipio();
    }
}
