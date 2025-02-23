package t8_herencia.ej1_poligono;

public class Rectangulo extends Poligono{
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    double area() {
        System.out.println("El area del polígono " + getClass().getName() + " es: " + base * altura);
        return super.base * super.altura;
    }
}