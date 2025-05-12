package t10_colecciones.examenes_prueba.examen1.ej3_censo_personal;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
    private String dni;
    private String nombre;
    private int edad;

    public Empleado(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

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
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado [" + dni + "]: " + nombre + " (" + edad + " años)";
    }

    @Override
    public int compareTo(Empleado o) {
        return this.dni.compareTo(o.dni);
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

}