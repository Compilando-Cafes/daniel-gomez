package t9_interfaces.interfaz3_comparable_comparator.ej3_llamada;

import java.util.Comparator;

public class CompararLlamadasPorCoste implements Comparator<Llamada> {
    @Override
    public int compare(Llamada o1, Llamada o2) {
        return Double.compare(o1.calcularCoste(), o2.calcularCoste());
    }
}