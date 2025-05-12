package t12_colecciones.ejs_libro.ap12_01_unir_tablas_genericas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] tabla1 = {"Hola", "Adios"};
        String[] tabla2 = {"Qué tal", "Vamos"};
        String[] union = unirTablas(tabla1, tabla2);
        System.out.println(Arrays.toString(union));
    }

    static<E> E[] unirTablas (E[] tabla1, E[] tabla2){
        E[] unidas = Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
        System.arraycopy(tabla2, 0, unidas, tabla1.length, tabla2.length);
        return unidas;
    }
}