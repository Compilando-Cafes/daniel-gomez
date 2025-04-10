package t8_herencia.repetidos.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class Refrigerado extends Producto{
    private int codigoOrgSupAl;
    private LocalDate fechaEnvasado;
    private double temperaturaRecomendada;
    private String paisOrigen;

    public Refrigerado(String nombre, LocalDate fechaCaducidad, int numeroLote, int codigoOrgSupAl, LocalDate fechaEnvasado, double temperaturaRecomendada, String paisOrigen) {
        super(nombre, fechaCaducidad, numeroLote);
        this.codigoOrgSupAl = codigoOrgSupAl;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }

    public int getCodigoOrgSupAl() {
        return codigoOrgSupAl;
    }

    public void setCodigoOrgSupAl(int codigoOrgSupAl) {
        this.codigoOrgSupAl = codigoOrgSupAl;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Refrigerado{" +
                "codigoOrgSupAl=" + codigoOrgSupAl +
                ", fechaEnvasado=" + fechaEnvasado +
                ", temperaturaRecomendada=" + temperaturaRecomendada +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                '}';
    }

}