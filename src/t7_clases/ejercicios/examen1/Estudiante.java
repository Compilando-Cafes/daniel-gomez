package t7_clases.ejercicios.examen1;

import java.util.Arrays;
import java.util.Random;

public class Estudiante {
    private String nombre;
    private int edad;
    private double[] notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >0 && edad<130)
            this.edad = edad;
        else
            this.edad = 16;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        if (notas.length> 0 && notas.length <= 10)
            this.notas = notas;
        else {
            this.notas = new double[10];
            Arrays.fill(this.notas,0);
        }

    }

    Estudiante(String nombre, int edad, double[] notas) {
        this.nombre = nombre;

        if (edad >0 && edad<130)
            this.edad = edad;
        else
            this.edad = 16;

        if (notas.length> 0 && notas.length <= 10)
            this.notas = notas;
        else {
            this.notas = new double[10];
            Arrays.fill(this.notas,0);
        }
    }

    public void mostrarDatos(){
        System.out.println("El alumno de nombre " + nombre + " con edad " + edad);
        for (int i = 0; i < notas.length; i++){
            System.out.println(i == notas.length-1 ? notas[i] : notas[i] + ", ");
        }
    }
}