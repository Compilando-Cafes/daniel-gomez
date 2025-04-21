package t10_colecciones.ejs_libro.aa12_17y18_cola_generica;

public interface Cola<T> {
    void encolar(T nuevo);
    T desencolar();
}
