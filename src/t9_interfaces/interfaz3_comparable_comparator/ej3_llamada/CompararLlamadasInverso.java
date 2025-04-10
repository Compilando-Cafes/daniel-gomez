package t9_interfaces.interfaz3_comparable_comparator.ej3_llamada;

import java.util.Comparator;

public class CompararLlamadasInverso implements Comparator<Llamada> {
    @Override
    public int compare(Llamada otroNumero1, Llamada otroNumero2) {
        if (otroNumero2.getNumeroTelefono() == otroNumero1.getNumeroTelefono()){
            return otroNumero2.getFechaYHoraIncioLlamada().compareTo(otroNumero1.getFechaYHoraIncioLlamada());
        } else
            return otroNumero2.getNumeroTelefono() - otroNumero1.getNumeroTelefono();
    }
}