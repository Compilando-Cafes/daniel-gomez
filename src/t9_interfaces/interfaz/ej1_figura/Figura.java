package t9_interfaces.interfaz.ej1_figura;

public interface Figura {
    double calcularArea();

    double calcularPerimetro();

    static double areaCirculo(double radio) {
        return redondearPi() * Math.pow(radio, 2);
    }

    static double redondearPi() {
        double pi = Math.round(Math.PI * 100);
        return pi / 100;
    }

}
