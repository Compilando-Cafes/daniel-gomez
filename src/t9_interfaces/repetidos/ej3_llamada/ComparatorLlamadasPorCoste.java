package t9_interfaces.repetidos.ej3_llamada;

import java.util.Comparator;

public class ComparatorLlamadasPorCoste implements Comparator<Llamada> {
    @Override
    public int compare(Llamada o1, Llamada o2) {
        return Double.compare(o1.calcularCoste(), o2.calcularCoste());
    }
}