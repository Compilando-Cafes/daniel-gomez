package t7_clases.ejercicios.ejercicio2_puntos_planos;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2,3);
        punto1.muestra();

        punto1.desplazaX(2);
        punto1.desplazaY(2);
        punto1.muestra();

        punto1.desplazaXY(2,2);
        punto1.muestra();

        punto1.distanciaEuclidea(punto1);
    }
}