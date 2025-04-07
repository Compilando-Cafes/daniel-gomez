package t9_interfaces.repetidos.ej1_cartas;

import java.util.Random;

public class Carta implements Comparable {
    static Random r = new Random();

    enum Palo {OROS, BASTOS, ESPADAS, COPAS}

    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        setNumero(numero);
        setPalo(palo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0 && numero <= 13) {
            this.numero = numero;
        } else {
            System.out.println("Número entre 1 y 13. Número 1 por defecto.");
            this.numero = 1;
        }
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta " + numero + " del palo " + palo;
    }

    @Override
    public int compareTo(Object o) {
        Carta otraCarta = (Carta) o;
        if (numero == otraCarta.getNumero()) {
            return palo.compareTo(otraCarta.palo);
        } else {
            return Integer.compare(numero, otraCarta.numero);
        }
    }

    public static Carta crearCarta() {
        Palo[] palosDisponibles = Palo.values();
        int paloAleatorio = obtenerUnNumero(0, palosDisponibles.length);
        return new Carta(obtenerUnNumero(1, 13), Palo.valueOf(palosDisponibles[paloAleatorio].name()));
    }

    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo - minimo) + minimo;
        return num;
    }
}