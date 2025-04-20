package t10_colecciones.ejs_libro.ar12_11_socio;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio>, Serializable {
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(String dni, String nombre, String alta) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(alta, f);
    }

    // Constructor para las búsquedas
    public Socio(String dni){
        this.dni = dni;
    }

    int antiguedad(){
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);
    }

    // Debe usarse un atributo que no se pueda repetir para después usar los conjuntos o sets
    @Override
    public boolean equals(Object obj) {
        return dni.equals(((Socio) obj).dni); // Como es de tipo objeto hay que hacer el casting a Socio
    }

    @Override
    public String toString() {
        return String.format("""
                
                Dni: %s
                Nombre: %s
                Fecha de alta: %s
                """, dni, nombre, fechaAlta);
    }
}