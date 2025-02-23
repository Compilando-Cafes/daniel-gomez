package t8_herencia.ej1_poligono;

public abstract class Poligono {
    protected double base;
    protected double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    abstract double area();
}