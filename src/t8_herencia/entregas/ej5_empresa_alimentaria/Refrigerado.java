package t8_herencia.entregas.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class Refrigerado extends Producto{
    private int codigoOrganismoSupervision;
    private double tempMantenimientoRecom;

    public Refrigerado(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, int codigoOrganismoSupervision, double tempMantenimientoRecom) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
        this.tempMantenimientoRecom = tempMantenimientoRecom;
    }

    public int getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }

    public void setCodigoOrganismoSupervision(int codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
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
                PRODUCTO REFRIGERADO
                Nombre producto: %s
                Fecha de caducidad: %s
                Número de lote: %,d
                Fecha de envasado: %s
                País de origen: %s
                Código de organismo de supervisión: %,d
                Temperatura de mantenimiento recomendada: %,.2f
                ===========================
                """, nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, codigoOrganismoSupervision, tempMantenimientoRecom);
    }
}