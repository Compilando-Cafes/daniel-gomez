package t12_colecciones.ejs_libro.ap12_02_interfaz_cola_generica;

public interface Pila<T> {
    void apilar(T nuevo);
    T desapilar();
}
