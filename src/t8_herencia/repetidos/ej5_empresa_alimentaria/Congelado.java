package t8_herencia.repetidos.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class Congelado extends Producto{
    protected LocalDate fechaEnvasado;
    protected String paisOrigen;
    protected double temperaturaMantenimientoRecomendada;

    public Congelado(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, double temperaturaMantenimientoRecomendada) {
        super(nombre, fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
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

    public double getTemperaturaMantenimientoRecomendada() {
        return temperaturaMantenimientoRecomendada;
    }

    public void setTemperaturaMantenimientoRecomendada(double temperaturaMantenimientoRecomendada) {
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    @Override
    public String toString() {
        return "Congelado{" +
                "fechaEnvasado=" + fechaEnvasado +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", temperaturaMantenimientoRecomendada=" + temperaturaMantenimientoRecomendada +
                ", nombre='" + nombre + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                '}';
    }
}