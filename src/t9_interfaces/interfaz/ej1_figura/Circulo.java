package t9_interfaces.interfaz.ej1_figura;

public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Figura.redondearPi() * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return (double) Math.round((2 * Figura.redondearPi() * radio) * 100) /100;
    }
}