package t9_interfaces.interfaz3_comparable_comparator.ej1_cartas;

import java.util.Comparator;

public class ComparadorNumeroSolo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Carta c1 = (Carta) o1;
        Carta c2 = (Carta) o2;
        return c1.getNumero() - c2.getNumero();
    }
}