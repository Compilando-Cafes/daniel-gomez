package t10_colecciones.ejs_libro.aa12_25_map_club_apodo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio>, Serializable {
    private final String apodo;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(String apodo, String nombre, String alta) {
        this.apodo = apodo;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(alta, f);
    }

    // Constructor para las búsquedas
    public Socio(String apodo){
        this.apodo = apodo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    int antiguedad(){
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Socio o) {
        return this.apodo.compareTo(o.apodo);
    }

    // Debe usarse un atributo que no se pueda repetir para después usar los conjuntos o sets
    @Override
    public boolean equals(Object obj) {
        return apodo.equals(((Socio) obj).apodo); // Como es de tipo objeto hay que hacer el casting a Socio
    }

    @Override
    public String toString() {
        return String.format("""
                
                Apodo: %s
                Nombre: %s
                Fecha de alta: %s
                """, apodo, nombre, fechaAlta);
    }
}