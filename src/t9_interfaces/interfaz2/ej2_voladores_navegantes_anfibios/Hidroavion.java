package t9_interfaces.interfaz2.ej2_voladores_navegantes_anfibios;

public class Hidroavion implements Anfibio {
    private int pasajeros;
    private boolean enViaje;
    private boolean enBarco;

    public Hidroavion(int pasajeros, boolean enViaje, boolean enBarco) {
        this.pasajeros = pasajeros;
        this.enViaje = enViaje;
        this.enBarco = enBarco;
    }
    public Hidroavion(){
        this.pasajeros = 0;
        this.enViaje = false;
        this.enBarco = true;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean isEnViaje() {
        return enViaje;
    }

    public void setEnViaje(boolean enViaje) {
        this.enViaje = enViaje;
    }

    public boolean isEnBarco() {
        return enBarco;
    }

    public void setEnBarco(boolean enBarco) {
        this.enBarco = enBarco;
    }

    @Override
    public void zarpar() {
        System.out.println("El hidroavión está zarpando");
        enViaje = true;
    }

    @Override
    public void navegar(boolean tiempo) {
        System.out.println("Está navegando.");
    }

    @Override
    public void anclar() {
        System.out.println("El hidroavión está en tierra.");
        enViaje = false;
    }

    @Override
    public void despegar() {
        System.out.println("El hidroavión está despegando.");
        enViaje = true;
    }

    @Override
    public double volar() {
        System.out.println("Está volando.");
        return 0;
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión está aterrizando.");
        enViaje = false;
    }

    @Override
    public void transformar() {

    }
}