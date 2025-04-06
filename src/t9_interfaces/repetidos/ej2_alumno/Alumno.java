package t9_interfaces.ventanas.ej2_alumno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Alumno implements Comparable{
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Integer edad;
    private double notaMedia;
    private int totalAsignaturasMatriculado;

    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, int edad, double notaMedia, int totalAsignaturasMatriculado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.totalAsignaturasMatriculado = totalAsignaturasMatriculado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getTotalAsignaturasMatriculado() {
        return totalAsignaturasMatriculado;
    }

    public void setTotalAsignaturasMatriculado(int totalAsignaturasMatriculado) {
        this.totalAsignaturasMatriculado = totalAsignaturasMatriculado;
    }

    @Override
    public String toString() {
        return String.format("""
                        %10s %-10s | %8s | %4d | %,5.2f | %,d
                        """,
                nombre, apellido,
                fechaNacimiento.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)),
                edad,
                notaMedia,
                totalAsignaturasMatriculado);
    }

    @Override
    public int compareTo(Object o) {
        Alumno otroAlumno = (Alumno) o;
        int resultado = Integer.compare(otroAlumno.getEdad(), edad);
        if (resultado == 0) resultado = fechaNacimiento.compareTo(otroAlumno.getFechaNacimiento());
        if (resultado == 0) resultado = apellido.compareTo(otroAlumno.getApellido());
        if (resultado == 0) resultado = nombre.compareTo(otroAlumno.getNombre());
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}