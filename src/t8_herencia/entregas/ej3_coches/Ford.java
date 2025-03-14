package t8_herencia.entregas.ej3_coches;

import java.time.LocalDate;

public class Ford extends Coche {
    private int agnoFabricacion;
    private double descuento;

    public Ford(int velocidad, double precio, String color, int agnoFabricacion, double descuento) {
        super(velocidad, precio, color);
        this.agnoFabricacion = agnoFabricacion;
        this.descuento = descuento;
    }

    public int getAgnoFabricacion() {
        return agnoFabricacion;
    }

    public void setAgnoFabricacion(int agnoFabricacion) {
        this.agnoFabricacion = agnoFabricacion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public double precio() {
        LocalDate fecha = LocalDate.now();
        if (fecha.getYear() - agnoFabricacion > 3)
            return precio * descuento;
        else
            return precio;
    }
}