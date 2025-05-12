package t10_colecciones.examenes_prueba.examen1.ej2_playlist_personal;

import java.util.Objects;

public class Cancion implements Comparable<Cancion>{
    private String titulo;
    private String artista;
    private int duracionEnSegundos;

    public Cancion(String titulo, String artista, int duracionEnSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionEnSegundos = duracionEnSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(int duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + "(dur: " + duracionEnSegundos + "s)";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return duracionEnSegundos == cancion.duracionEnSegundos && Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista, duracionEnSegundos);
    }

    public int compareTo(Cancion o) {
        int resultado = this.titulo.compareToIgnoreCase(o.titulo);
        if (resultado != 0) return resultado;

        resultado = this.artista.compareToIgnoreCase(o.artista);
        if (resultado != 0) return resultado;

        return Integer.compare(this.duracionEnSegundos, o.duracionEnSegundos);
    }
}