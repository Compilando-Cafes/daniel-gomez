package t8_herencia.entregas.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class CongeladoPorNitrogeno extends Congelado{
    private String metodoCongelacionEmpleado;
    private int tiempoExposicionNitrogeno;

    public CongeladoPorNitrogeno(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen, double tempMantenimientoRecom, String metodoCongelacionEmpleado, int tiempoExposicionNitrogeno) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimientoRecom);
        this.metodoCongelacionEmpleado = metodoCongelacionEmpleado;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    public String getMetodoCongelacionEmpleado() {
        return metodoCongelacionEmpleado;
    }

    public void setMetodoCongelacionEmpleado(String metodoCongelacionEmpleado) {
        this.metodoCongelacionEmpleado = metodoCongelacionEmpleado;
    }

    public int getTiempoExposicionNitrogeno() {
        return tiempoExposicionNitrogeno;
    }

    public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    @Override
    public String toString() {
        return String.format("""
                ===========================
                PRODUCTO CONGELADO POR NITRÓGENO
                Nombre producto: %s
                Fecha de caducidad: %s
                Número de lote: %,d
                Fecha de envasado: %s
                País de origen: %s
                Temperatura de mantenimiento recomendada: %,.2f
                Método de congelación empleado: %s
                Tiempo de exposición al Nitrógeno: %,d segundos
                ===========================
                """, nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimientoRecom, metodoCongelacionEmpleado, tiempoExposicionNitrogeno);
    }
}