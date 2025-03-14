package t8_herencia.entregas.ej3_coches;

public class Sedan extends Coche {
    private double longitud;

    public Sedan(int velocidad, double precio, String color, double longitud) {
        super(velocidad, precio, color);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public double precio() {
        if (longitud > 20)
            return precio * 0.95;
        else
            return precio * 0.90;
    }
}