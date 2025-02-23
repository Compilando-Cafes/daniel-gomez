package t8_herencia.ej1_poligono;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2,3);
        Rectangulo rectangulo = new Rectangulo(2,3);
        PoligonoRegular poligonoRegular = new PoligonoRegular(2,3,4,5);

        System.out.println(triangulo.area());
        System.out.println(rectangulo.area());
        System.out.println(poligonoRegular.area());
    }
}