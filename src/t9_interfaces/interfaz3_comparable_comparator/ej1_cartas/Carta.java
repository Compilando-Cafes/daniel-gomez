package t9_interfaces.interfaz3_comparable_comparator.ej1_cartas;

import java.util.Random;

public class Carta implements Comparable {
    static Random r = new Random();
    enum Palo {OROS, BASTOS, ESPADAS, COPAS}

    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        if (numero < 0 || numero > 13) {
            System.out.println("Número incorrecto. Por defecto el 1.");
            this.numero = 1;
        } else
            this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0 || numero > 13) {
            System.out.println("Número incorrecto. Por defecto el 1.");
            this.numero = 1;
        } else
            this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return String.format("Carta %d del palo %s", this.numero, this.palo.name().toLowerCase());
    }

    @Override
    public int compareTo(Object o) {
        Carta otraCarta = (Carta) o;
        if (palo.name().equals(otraCarta.palo.name())) {
            if (numero == otraCarta.numero) {
                return 0;
            } else if (numero < otraCarta.numero) {
                return -1;
            } else {
                return 1;
            }
        } else if (palo.name().compareTo(otraCarta.palo.name()) < 0) {
            return -1;
        } else if (palo.name().compareTo(otraCarta.palo.name()) > 0) {
            return 1;
        }
        return 0;
    }

    static Carta nuevaCarta(){
        Palo[] palosPosibles = Palo.values();
        return new Carta(obtenerUnNumero(1,14), palosPosibles[obtenerUnNumero(0, palosPosibles.length)]);
    }

    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo-minimo)+minimo;
        return  num;
    }
}