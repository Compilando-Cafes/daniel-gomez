package t8_herencia.entregas.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class Congelado extends Producto{
    protected double tempMantenimientoRecom;

    public Congelado(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, double tempMantenimientoRecom) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.tempMantenimientoRecom = tempMantenimientoRecom;
    }

    public double getTempMantenimientoRecom() {
        return tempMantenimientoRecom;
    }

    public void setTempMantenimientoRecom(double tempMantenimientoRecom) {
        this.tempMantenimientoRecom = tempMantenimientoRecom;
    }

    @Override
    public String toString() {
        return String.format("""
                ===========================
                PRODUCTO CONGELADO
                Nombre producto: %s
                Fecha de caducidad: %s
                Número de lote: %,d
                Fecha de envasado: %s
                País de origen: %s
                Temperatura de mantenimiento recomendada: %,.2f
                ===========================
                """, nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimientoRecom);
    }
}