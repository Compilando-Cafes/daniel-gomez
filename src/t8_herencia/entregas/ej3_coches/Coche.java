package t8_herencia.entregas.ej3_coches;

public abstract class Coche {
    protected int velocidad;
    protected double precio;
    protected String color;

    public Coche(int velocidad, double precio, String color) {
        this.velocidad = velocidad;
        this.precio = precio;
        this.color = color;
    }

    public Coche() {
        this.velocidad = 0;
        this.precio = 0;
        this.color = "";
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double precio();
}