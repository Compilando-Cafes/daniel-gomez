package t7_clases.ejercicios.examen4_gestion_biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private final String ISBN;
    private boolean disponible;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Libro(String titulo, String autor, String ISBN, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }

    public void mostrarDatos(){
        System.out.println("Libro: " + titulo + " de " + autor + " (ISBN: " + ISBN + ") - Disponible: " + (disponible? "Sí.": "No."));
    }
}