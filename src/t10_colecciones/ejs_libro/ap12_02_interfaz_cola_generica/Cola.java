package t12_colecciones.ejs_libro.ap12_02_interfaz_cola_generica;

public interface Cola<T> {
    void encolar(T nuevo);
    T desencolar();
}
