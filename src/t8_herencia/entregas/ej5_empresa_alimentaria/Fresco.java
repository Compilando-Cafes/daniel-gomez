package t8_herencia.entregas.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class Fresco extends Producto{
    public Fresco(String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
    }

    @Override
    public String toString() {
        return String.format("""
                ===========================
                PRODUCTO FRESCO
                Nombre producto: %s
                Fecha de caducidad: %s
                Número de lote: %,d
                Fecha de envasado: %s
                País de origen: %s
                ===========================
                """, nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
    }
}