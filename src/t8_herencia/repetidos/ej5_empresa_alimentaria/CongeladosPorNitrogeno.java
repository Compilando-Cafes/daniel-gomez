package t8_herencia.repetidos.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class CongeladosPorNitrogeno extends Congelado{
    private String metodoCongelacion;
    private int tiempoExposicionNitrogeno;

    public CongeladosPorNitrogeno(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, double temperaturaMantenimientoRecomendada, String metodoCongelacion, int tiempoExposicionNitrogeno) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimientoRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicionNitrogeno() {
        return tiempoExposicionNitrogeno;
    }

    public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    @Override
    public String toString() {
        return "CongeladosPorNitrogeno{" +
                "metodoCongelacion='" + metodoCongelacion + '\'' +
                ", tiempoExposicionNitrogeno=" + tiempoExposicionNitrogeno +
                ", fechaEnvasado=" + fechaEnvasado +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", temperaturaMantenimientoRecomendada=" + temperaturaMantenimientoRecomendada +
                ", nombre='" + nombre + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                '}';
    }
}