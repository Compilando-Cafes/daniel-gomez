package t8_herencia.entregas.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class Producto {
    protected String nombre;
    protected LocalDate fechaCaducidad;
    protected int numeroLote;
    protected LocalDate fechaEnvasado;
    protected String paisOrigen;

    public Producto(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return String.format("""
                ===========================
                PRODUCTO
                Nombre producto: %s
                Fecha de caducidad: %s
                Número de lote: %,d
                Fecha de envasado: %s
                País de origen: %s
                ===========================
                """, nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
    }
}