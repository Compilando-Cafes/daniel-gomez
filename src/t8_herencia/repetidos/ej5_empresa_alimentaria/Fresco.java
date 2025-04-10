package t8_herencia.repetidos.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class Fresco extends Producto{
    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public Fresco(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(nombre, fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
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
        return "Fresco{" +
                "fechaEnvasado=" + fechaEnvasado +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                '}';
    }
}