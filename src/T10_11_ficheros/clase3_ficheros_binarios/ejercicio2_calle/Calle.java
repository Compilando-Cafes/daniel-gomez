package T10_11_ficheros.clase3_ficheros_binarios.ejercicio2_calle;

import java.io.Serializable;

public class Calle implements Serializable {
    private String calle;
    private int numero;
    private int piso;

    public Calle(String calle, int numero, int piso) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Calle{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", piso=" + piso +
                '}';
    }
}