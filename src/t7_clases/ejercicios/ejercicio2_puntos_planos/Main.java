package t7_clases.ejercicios.ejercicio2_puntos_planos;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2,3);
        Punto punto2 = new Punto(4,6);
        System.out.println("Estado inicial de dos puntos:");
        System.out.println("Punto 1:");
        punto1.muestra();
        System.out.println("Punto 2:");
        punto2.muestra();

        System.out.println("\nCambios al punto 1:");
        System.out.println("Desplazar x:");
        punto1.desplazaX(2);
        punto1.muestra();

        System.out.println("Desplazar y:");
        punto1.desplazaY(2);
        punto1.muestra();

        System.out.println("Desplazar x e y:");
        punto1.desplazaXY(2,2);
        punto1.muestra();

        System.out.println("\nLa distancia Euclídea entre los siguientes dos puntos: ");
        System.out.println("Punto 1: ");
        punto1.muestra();
        System.out.println("Punto 2: ");
        punto2.muestra();
        System.out.printf("Distancia euclídea: %,.2f", punto1.distanciaEuclidea(punto2));
    }
}