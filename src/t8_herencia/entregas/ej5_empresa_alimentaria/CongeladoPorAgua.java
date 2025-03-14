package t8_herencia.entregas.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class CongeladoPorAgua extends Congelado{
    private double gramosSalPorLitroAgua;

    public CongeladoPorAgua(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, double tempMantenimientoRecom, double gramosSalPorLitroAgua) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimientoRecom);
        this.gramosSalPorLitroAgua = gramosSalPorLitroAgua;
    }

    public double getGramosSalPorLitroAgua() {
        return gramosSalPorLitroAgua;
    }

    public void setGramosSalPorLitroAgua(double gramosSalPorLitroAgua) {
        this.gramosSalPorLitroAgua = gramosSalPorLitroAgua;
    }

    @Override
    public String toString() {
        return String.format("""
                ===========================
                PRODUCTO CONGELADO POR AGUA
                Nombre producto: %s
                Fecha de caducidad: %s
                Número de lote: %,d
                Fecha de envasado: %s
                País de origen: %s
                Temperatura de mantenimiento recomendada: %,.2f
                Gramos de sal por litro de agua: %,.2f gr/l
                ===========================
                """, nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimientoRecom, gramosSalPorLitroAgua);
    }
}