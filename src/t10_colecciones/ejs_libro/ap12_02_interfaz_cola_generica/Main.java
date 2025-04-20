package t10_colecciones.ejs_libro.ap12_02_interfaz_cola_generica;

public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> contenedor = new Contenedor<>(new Integer[0]);

        contenedor.encolar(1);
        contenedor.encolar(3);
        contenedor.encolar(6);
        System.out.println("Desencolando: " + contenedor.desencolar());

        contenedor.apilar(10);
        contenedor.apilar(23);
        System.out.println("Desapilando: " + contenedor.desapilar());
    }

}