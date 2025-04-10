package t8_herencia.repetidos.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class CongeladoPorAgua extends Congelado{
    private double gramosSalLitroAgua;

    public CongeladoPorAgua(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, double temperaturaMantenimientoRecomendada, double gramosSalLitroAgua) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimientoRecomendada);
        this.gramosSalLitroAgua = gramosSalLitroAgua;
    }

    public double getGramosSalLitroAgua() {
        return gramosSalLitroAgua;
    }

    public void setGramosSalLitroAgua(double gramosSalLitroAgua) {
        this.gramosSalLitroAgua = gramosSalLitroAgua;
    }

    @Override
    public String toString() {
        return "CongeladoPorAgua{" +
                "gramosSalLitroAgua=" + gramosSalLitroAgua +
                ", fechaEnvasado=" + fechaEnvasado +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", temperaturaMantenimientoRecomendada=" + temperaturaMantenimientoRecomendada +
                ", nombre='" + nombre + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                '}';
    }
}