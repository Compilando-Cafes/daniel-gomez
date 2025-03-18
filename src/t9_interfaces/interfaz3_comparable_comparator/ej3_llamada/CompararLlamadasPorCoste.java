package t9_interfaces.interfaz3_comparable_comparator.ej3_llamada;

import java.util.Comparator;

public class CompararLlamadasPorCoste implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Llamada llamada1 = (Llamada) o1;
        Llamada llamada2 = (Llamada) o2;

        // Esto no se puede hacer restando, ya que si la diferencia es pequeña no sería exacto, daría cero y sería incorrecto.
        return Double.compare(llamada1.calcularCoste(), llamada2.calcularCoste());
    }
}