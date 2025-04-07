package t9_interfaces.repetidos.ej1_cartas;

import java.util.Comparator;

public class CartaComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Carta otraCarta1 = (Carta) o1;
        Carta otraCarta2 = (Carta) o2;
        return Integer.compare(otraCarta1.getNumero(), otraCarta2.getNumero());
    }
}