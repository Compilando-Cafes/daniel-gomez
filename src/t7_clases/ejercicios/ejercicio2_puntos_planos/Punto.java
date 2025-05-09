package t7_clases.ejercicios.ejercicio2_puntos_planos;

public class Punto {
    // Atributos
    double x, y;

    // Constructor vacío
    Punto() {
        x = 0;
        y = 0;
    }

    // Constructor con parámetros
    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Mostrar el punto
    public void muestra() {
        System.out.printf("X: %,.2f, Y: %,.2f%n", x, y);
    }

    // Desplazar la x
    public void desplazaX(double dx) {
        x += dx;
    }

    // Desplazar la y
    public void desplazaY(double dy) {
        y += dy;
    }

    // Desplazar los dos
    public void desplazaXY(double dx, double dy) {
        x += dx;
        y += dy;
    }

    // Distancia Euclidea
    public double distanciaEuclidea(Punto punto) {
        return Math.sqrt(Math.pow(this.x - punto.x, 2) + Math.pow(this.y - punto.y, 2));
    }

}