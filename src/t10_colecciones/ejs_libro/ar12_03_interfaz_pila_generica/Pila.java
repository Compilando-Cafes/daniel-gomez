package t12_colecciones.ejs_libro.ar12_03_interfaz_pila_generica;

public interface Pila<T> {
    void apilar(T nuevo);
    T desapilar();
}
