package t9_interfaces.repetidos.ej2_transportes;

public class Hidroavion implements Anfibio {
    private int pasajeros;
    private boolean enViaje;
    private boolean enBarco;

    public Hidroavion(int pasajeros, boolean enViaje, boolean enBarco) {
        this.pasajeros = pasajeros;
        this.enViaje = enViaje;
        this.enBarco = enBarco;
    }

    public Hidroavion() {
        this.pasajeros = 0;
        this.enViaje = false;
        this.enBarco = true;
    }

    @Override
    public void transformar() {
        System.out.println("Me transformo en " + (this.enBarco? "avión.": "barco."));
        this.enBarco = !this.enBarco;
    }

    @Override
    public void zarpar() {
        if (this.enBarco) {
            System.out.println("El hidroavión está zarpando.");
            this.enViaje = true;
        } else {
            System.out.println("Estás en modo avión. Cambiar a modo barco.");
        }
    }

    @Override
    public void navegar(boolean tipo) {
        if (this.enBarco) {
            System.out.println("Está navegando.");
        } else
            System.out.println("Estás en modo avión. Cambiar a modo barco.");
    }

    @Override
    public void anclar() {
        if (this.enBarco) {
            System.out.println("El hidroavión está en tierra.");
            this.enViaje = false;
        } else
            System.out.println("Estás en modo avión. Cambiar a modo barco.");
    }

    @Override
    public void despegar() {
        if (!this.enBarco) {
            System.out.println("El hidroavión está despegando.");
            this.enViaje = true;
        } else {
            System.out.println("Estás en modo barco. Cambiar a avión.");
        }
    }

    @Override
    public double volar() {
        if (!this.enBarco) {
            System.out.println("Está volando.");
            return 0;
        } else {
            System.out.println("Estás en modo barco. Cambiar a avión.");
            return 0;
        }
    }

    @Override
    public void aterrizar() {
        if (!this.enBarco) {
            System.out.println("El avión está aterrizando.");
            this.enViaje = false;
        } else {
            System.out.println("Estás en modo barco. Cambiar a avión.");
        }
    }

    public void anadirPasajero(){
        if (!enViaje){
            this.pasajeros++;
            System.out.println("Pasajero añadido.");
        }
    }
}