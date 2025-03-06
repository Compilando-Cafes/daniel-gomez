package t9_interfaces.interfaz.ej1_figura;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(10.5, 15.3);

        System.out.println("Perímetro círculo: " + circulo.calcularPerimetro());
        System.out.println("Área círculo: " + circulo.calcularArea());
        System.out.println("Área círculo calculado con Figura: " + Figura.areaCirculo(circulo.getRadio()));

        System.out.println("Perímetro rectángulo: " + rectangulo.calcularPerimetro());
        System.out.println("Área rectángulo: " + rectangulo.calcularArea());
    }

}