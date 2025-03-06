package t9_interfaces.interfaz2.ej2_voladores_navegantes_anfibios;

public class Avion implements Volador {
    private int gasolina;

    public Avion(int gasolina) {
        this.gasolina = gasolina;
    }

    public Avion() {
        gasolina = 10;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    @Override
    public void despegar() {
        System.out.println("El avión está despegando.");
    }

    @Override
    public double volar() {
        if (this.gasolina > 0)
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