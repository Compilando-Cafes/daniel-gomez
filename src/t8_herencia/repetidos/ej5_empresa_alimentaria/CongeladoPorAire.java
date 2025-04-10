package t8_herencia.repetidos.ej5_empresa_alimentaria;

import java.time.LocalDate;
import java.util.Arrays;

public class CongeladoPorAire extends Congelado{
    private int[] composicionAire;

    public CongeladoPorAire(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, double temperaturaMantenimientoRecomendada, int[] composicionAire) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimientoRecomendada);
        this.composicionAire = composicionAire;
    }

    public int[] getComposicionAire() {
        return composicionAire;
    }

    public void setComposicionAire(int[] composicionAire) {
        this.composicionAire = composicionAire;
    }

    @Override
    public String toString() {
        return "CongeladoPorAire{" +
                "composicionAire=" + Arrays.toString(composicionAire) +
                ", fechaEnvasado=" + fechaEnvasado +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", temperaturaMantenimientoRecomendada=" + temperaturaMantenimientoRecomendada +
                ", nombre='" + nombre + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                '}';
    }
}