package t9_interfaces.repetidos.ej2_transportes;

public class Avion implements Volador{
    private int gasolina;

    public Avion(int gasolina) {
        this.gasolina = gasolina;
    }

    public Avion() {
        this.gasolina = 10;
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
        this.gasolina--;
        System.out.println("Volando. Gasolina reducida en uno.");
        return this.gasolina;
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión está aterrizando.");
    }

    public void recargarGasolina(int cantidad){
        this.gasolina += cantidad;
        System.out.println("Gasolina recargada.");
    }
}