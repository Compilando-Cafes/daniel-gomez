package t7_clases.ejercicios.ejercicio1_segundo_grado;

import java.util.InputMismatchException;

public class EcuacionSegundoGrado {
    // Atributos de la clase
    private double a, b, c;

    // Constructor vacío
    EcuacionSegundoGrado() {
        a = 0;
        b = 0;
        c = 0;
    }

    // Constructor
    EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }


    // Solución
    public double[] solucion() {
        // Array de soluciones
        double[] soluciones = {0, 0};

        // Calculamos la raíz cuadrada
        double raizCuadrada = Math.pow(b, 2) - 4 * a * c;

        // Si la raíz cuadrada es menor que 0, devolvemos un array vacío
        if (raizCuadrada < 0) {
            return soluciones;
        } else {
            // Si no devolvemos un array con las soluciones
            soluciones[0] = (-b + Math.sqrt(raizCuadrada)) / (2 * a);
            soluciones[1] = (-b - Math.sqrt(raizCuadrada)) / (2 * a);
            return soluciones;
        }
    }
}