package t9_interfaces.interfaz2.ej2_transportes;

public class Hidroavion implements Anfibio {
    private int pasajeros;
    private boolean enViaje;
    private boolean enBarco;

    // Constructores
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

    // Getters y setters
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

    // Sobreescribir métodos
    @Override
    public void despegar() {
        if (!enBarco) {
            System.out.println("El hidroavión está despegando.");
            enViaje = true;
        } else
            System.out.println("No puede despegar en modo barco.");
    }

    @Override
    public double volar() {
        if (!enBarco) {
            System.out.println("Está volando.");
        } else {
            System.out.println("No puede volar en modo barco.");
        }
        return 0;
    }

    @Override
    public void aterrizar() {
        if (!enBarco) {
            System.out.println("El avión está aterrizando.");
            enViaje = false;
        } else
            System.out.println("No puede aterrizar en modo barco.");
    }

    @Override
    public void zarpar() {
        if (enBarco) {
            System.out.println("El hidroavión está zarpando.");
            enViaje = true;
        } else
            System.out.println("No puede zarpar en modo avión.");
    }

    @Override
    public void navegar(boolean tiempo) {
        if (enBarco) {
            System.out.println("Está navegando.");
        } else
            System.out.println("No puede navegar en modo avión.");
    }

    @Override
    public void anclar() {
        if (enBarco) {
            System.out.println("El hidroavión está en tierra.");
            enViaje = false;
        } else
            System.out.println("No puede anclar en modo avión.");
    }

    @Override
    public void transformar() {
        if (enBarco){
            System.out.println("Me transformo en avión.");
            enBarco = false;
        } else {
            System.out.println("Me transformo en barco.");
            enBarco = true;
        }
    }

    public void anadirPasajero(){
        if (!enViaje){
            pasajeros++;
        }
    }
}