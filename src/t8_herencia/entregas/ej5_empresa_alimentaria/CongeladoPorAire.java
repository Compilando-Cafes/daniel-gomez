package t8_herencia.entregas.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class CongeladoPorAire extends Congelado{
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public CongeladoPorAire(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, double tempMantenimientoRecom, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimientoRecom);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public double getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public double getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(double porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public double getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }

    public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }

    public double getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }

    public void setPorcentajeVaporAgua(double porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public String toString() {
        return String.format("""
                ===========================
                PRODUCTO CONGELADO POR AIRE
                Nombre producto: %s
                Fecha de caducidad: %s
                Número de lote: %,d
                Fecha de envasado: %s
                País de origen: %s
                Temperatura de mantenimiento recomendada: %,.2f
                Porcentaje de Nitrógeno: %,.2f %%
                Porcentaje de Oxígeno: %,.2f %%
                Porcentaje de Dióxido de Carbono: %,.2f %%
                Porcentaje de vapor de agua: %,.2f %%
                ===========================
                """, nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimientoRecom, porcentajeNitrogeno, porcentajeOxigeno, porcentajeDioxidoCarbono, porcentajeVaporAgua);
    }
}