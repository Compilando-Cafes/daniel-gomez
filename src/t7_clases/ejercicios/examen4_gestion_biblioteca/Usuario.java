package t7_clases.ejercicios.examen4_gestion_biblioteca;

import java.util.Arrays;

public class Usuario {
    private String nombre;
    private final String DNI;
    private Libro[] librosPrestados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Libro[] getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(Libro[] librosPrestados) {
        if (librosPrestados == null)
            this.librosPrestados = new Libro[0];
        else
            this.librosPrestados = Arrays.copyOf(librosPrestados, librosPrestados.length);
    }

    public Usuario(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.librosPrestados = new Libro[0];
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", DNI: " + DNI);
        System.out.println("Libros prestados: " + Arrays.toString(librosPrestados));
    }

}