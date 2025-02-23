package t8_herencia.ej1_poligono;

public class Triangulo extends Poligono{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    double area(){
        System.out.println("El area del polígono " + getClass().getName() + " es: " + (base * altura) / 2);
        return (super.base * super.altura) / 2;
    }

}