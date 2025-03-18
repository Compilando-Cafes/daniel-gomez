package t9_interfaces.interfaz3_comparable_comparator.ej3_llamada;

import java.util.Comparator;

public class CompararLlamadasInverso implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Llamada otroNumero1 = (Llamada) o1;
        Llamada otroNumero2 = (Llamada) o2;
        if (otroNumero2.getNumeroTelefono() == otroNumero1.getNumeroTelefono()){
            return otroNumero2.getFechaYHoraIncioLlamada().compareTo(otroNumero1.getFechaYHoraIncioLlamada());
        } else
            return otroNumero2.getNumeroTelefono() - otroNumero1.getNumeroTelefono();
    }
}