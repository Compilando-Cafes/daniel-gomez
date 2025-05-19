package T10_11_ficheros.proyecto_ficheros;

public class Calle {
    private String nombreCalle;
    private int numeroCalle;

    public Calle(String nombreCalle, int numeroCalle) {
        this.nombreCalle = nombreCalle;
        this.numeroCalle = numeroCalle;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    @Override
    public String toString() {
        return "Calle{" +
                ", nombreCalle='" + nombreCalle + '\'' +
                ", numeroCalle=" + numeroCalle +
                '}';
    }
}