package t10_colecciones.clase_4_interfaz_map.ejercicio2_zoo;

import java.util.Set;

public class Habitat {
    enum Recinto {CERRADO, ABIERTO}

    ;
    private String nombre;
    private Set<String> listaAnimales;
    private String caracteristicas;
    private double kilometrosOcupa;
    private Recinto recinto;

    public Habitat(String nombre, Set<String> listaAnimales, String caracteristicas, double kilometrosOcupa, Recinto recinto) {
        this.nombre = nombre;
        this.listaAnimales = listaAnimales;
        this.caracteristicas = caracteristicas;
        setKilometrosOcupa(kilometrosOcupa);
        this.recinto = recinto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<String> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(Set<String> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getKilometrosOcupa() {
        return kilometrosOcupa;
    }

    public void setKilometrosOcupa(double kilometrosOcupa) {
        if (kilometrosOcupa > 0)
            this.kilometrosOcupa = kilometrosOcupa;
        else {
            System.out.println("Puesto a cero.");
            this.kilometrosOcupa = 0;
        }
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }

    @Override
    public String toString() {
        return String.format("""
                        %s: %,.2f km
                        \t· Espacio %s
                        \t· Cantidad de animales: %d
                        \t· Animales para visitar:
                        %s
                        """,
                nombre.toUpperCase(),
                kilometrosOcupa,
                recinto.toString().toLowerCase(),
                listaAnimales.size(),
                mostrarListaAnimales(listaAnimales)
        );
    }

    private Object mostrarListaAnimales(Set<String> listaAnimales) {
        String resultado = "";
        for (String animal : listaAnimales) {
            resultado += "\t\t· " + animal + "\n";
        }
        return resultado;
    }
}