package t9_interfaces.ejercicios.ej1_libros;

import java.util.Arrays;

public class LibroFisico implements Libro {
    private String nombre;
    private int numPaginas;
    String[] frasesDestacadas;
    int marcaPaginas;
    double[] dimensiones;
    double peso;

    public LibroFisico(String nombre, int numPaginas, String[] frasesDestacadas, int marcaPaginas, double[] dimensiones, double peso) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.frasesDestacadas = frasesDestacadas;
        this.marcaPaginas = marcaPaginas;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getFrasesDestacadas() {
        return frasesDestacadas;
    }

    public void setFrasesDestacadas(String[] frasesDestacadas) {
        this.frasesDestacadas = frasesDestacadas;
    }

    @Override
    public int getNumPaginas() {
        return this.numPaginas;
    }

    @Override
    public void getInformacion() {
        System.out.printf("""
                =========================================
                Título: %s
                Número de páginas: %,d
                Frases destacadas:
                %s
                ¿Por qué página vas?: %,d
                Dimensiones: %s
                Peso: %,.2f gramos
                El precio del libro es: %,.2f€
                """, nombre, numPaginas, formatoFrasesDestacadas(frasesDestacadas), marcaPaginas, formatoDimensiones(dimensiones), peso, calcularPrecio());
    }

    public String formatoFrasesDestacadas(String[] cadena) {
        String resultado = "";
        for (String elemento : cadena) {
            resultado += elemento + "\n";
        }
        return resultado;
    }

    public String formatoDimensiones(double[] dimensiones) {
        return dimensiones[0] + " cm. de alto X " + dimensiones[1] + " cm. de ancho X " + dimensiones[2] + " cm. de fondo.";
    }

    @Override
    public void getEstatusLeido() {
        System.out.println("Actualmente leyendo la página " + marcaPaginas + " de " + numPaginas);
    }

    public void setMarcaPaginas(int marcaPaginas) {
        if (marcaPaginas > this.marcaPaginas) {
            this.marcaPaginas = marcaPaginas;
            System.out.println("Marca páginas guardado.");
        } else
            System.out.println("No se ha actualizado el marca páginas. Has puesto una página inferior a la que estaba registrada. Se mantiene la anterior.");
    }

    public void destacarFrase(int pagina, String frase) {
        frasesDestacadas = Arrays.copyOf(frasesDestacadas, frasesDestacadas.length + 1);
        frasesDestacadas[frasesDestacadas.length - 1] = pagina + ":" + frase;
        System.out.println("Frase destacada guardada.");
    }

    public void eliminarFrases(int pagina) {
        for (int i = 0; i < frasesDestacadas.length; i++) {
            if (frasesDestacadas[i].startsWith(pagina + ":")) {
                frasesDestacadas[i] = frasesDestacadas[frasesDestacadas.length - 1];
                frasesDestacadas = Arrays.copyOf(frasesDestacadas, frasesDestacadas.length - 1);
                System.out.println("Frase eliminada correctamente.");
            }
        }
    }

    public double calcularPrecio() {
        // Pongo entre 100 al final porque si no salen precios muy altos al estar en centímetros y gramos las dimensiones y el peso
        return ((dimensiones[0] * dimensiones[1] * dimensiones[2]) + peso) / 100.0;
    }

    @Override
    public String toString() {
        return String.format("""
                \t Título: %s
                """, nombre);
    }
}