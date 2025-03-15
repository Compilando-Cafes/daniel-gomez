package t9_interfaces.interfaz2.ej2_transportes;

public class Avion implements Volador {
    private int gasolina;

    // Constructores
    public Avion(int gasolina) {
        this.gasolina = gasolina;
    }

    public Avion() {
        gasolina = 10;
    }

    // Getters y setters
    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    // Sobreescribir métodos de la interfaz
    @Override
    public void despegar() {
        System.out.println("El avión está despegando.");
    }

    @Override
    public double volar() {
        if (this.gasolina > 1)
            return gasolina--;
        else
            return 0;
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión está aterrizando.");
    }

    public void recargarGasolina(int cantidad) {
        this.gasolina += cantidad;
    }
}