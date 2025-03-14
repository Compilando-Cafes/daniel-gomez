package t8_herencia.entregas.ej3_coches;

public class Truck extends Coche {
    private double peso;

    public Truck(int velocidad, double precio, String color, double pesoMaximo) {
        super(velocidad, precio, color);
        this.peso = pesoMaximo;
    }

    public double getPesoMaximo() {
        return peso;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.peso = pesoMaximo;
    }

    @Override
    public double precio() {
        if (peso > 2000)
            return precio * 0.9;
        else
            return precio * 0.8;
    }
}