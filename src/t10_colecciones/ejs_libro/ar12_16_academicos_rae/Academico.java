package t12_colecciones.ejs_libro.ar12_16_academicos_rae;

public class Academico implements Comparable<Academico> {
    String nombre;
    int aIngreso;

    public Academico(String nombre, int aIngreso) {
        this.nombre = nombre;
        this.aIngreso = aIngreso;
    }

    @Override
    public int compareTo(Academico o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Academico{" + "nombre='" + nombre + '\'' + ", aIngreso=" + aIngreso + "}\n";
    }
}