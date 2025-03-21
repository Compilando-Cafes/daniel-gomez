package t9_interfaces.ejercicios.ej1_libros;

public class Ebook implements Libro{
    enum Formato {PDF, EPUB, MOBI, AZW}
    private String nombre;
    private int numPaginas;
    private double tamano;
    private Formato formato;
    private double porcentajeLeido;

    public Ebook(String nombre, int numPaginas, double tamano, Formato formato, double porcentajeLeido) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.tamano = tamano;
        this.formato = formato;
        this.porcentajeLeido = porcentajeLeido;
    }

    @Override
    public int getNumPaginas() {
        return numPaginas;
    }

    public double getTamano() {
        return tamano;
    }

    @Override
    public void getInformacion() {
        System.out.printf("""
                Título: %s
                Número de páginas: %,d
                Tamaño: %,.2f MB
                Formato: %s
                Porcentaje leído: %,.2f%%
                """, nombre, numPaginas, tamano, formato.toString(), porcentajeLeido);
    }

    @Override
    public void getEstatusLeido() {
        System.out.printf("Actualmente has leído un %,.2f%% del total del libro.\n", porcentajeLeido);
    }

    public void setPorcentajeLeido(int pagina) {
        if (pagina < numPaginas) {
            this.porcentajeLeido = (double) (pagina * 100) / numPaginas;
            System.out.println("Porcentaje actualizado.");
        }
        else {
            this.porcentajeLeido = 100;
            System.out.println("Felicidades, has terminado el libro.");
        }

    }

    public void transformar(String formato){
        // Cambiar solo si pasa de pdf a estos formatos como indica el ejercicio
        if (this.formato.equals(Formato.PDF)) {
            if (formato.equals(Formato.EPUB.toString()))
                this.tamano *= 1.2;
            if (formato.equals(Formato.MOBI.toString()))
                this.tamano *= 0.5;
            if (formato.equals(Formato.AZW.toString()))
                this.tamano *= 2;
            System.out.println("Formato cambiado. El tamaño del libro se ha modificado.");
        }
        this.formato = Formato.valueOf(formato);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return String.format("""
                \tTítulo: %s
                """, nombre);
    }
}