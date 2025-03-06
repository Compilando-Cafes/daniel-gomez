package t9_interfaces.interfaz2.ej2_voladores_navegantes_anfibios;

public class Barco implements Navegante {
    private double gastoEnViaje;

    public Barco(double gastoEnViaje) {
        this.gastoEnViaje = gastoEnViaje;
    }

    public Barco() {
        this.gastoEnViaje = 0;
    }

    public double getGastoEnViaje() {
        return gastoEnViaje;
    }

    public void setGastoEnViaje(double gastoEnViaje) {
        this.gastoEnViaje = gastoEnViaje;
    }

    @Override
    public void zarpar() {
        System.out.println("Comenzamos el viaje con " + gastoEnViaje + " gasto de combustible.");
    }

    @Override
    public void navegar(boolean tiempo) {
        if (tiempo) {
            this.gastoEnViaje++;
        } else {
            this.gastoEnViaje += 2;
        }
    }

    @Override
    public void anclar() {
        System.out.println("Hemos llegado, hemos gastado " + gastoEnViaje + " combustible.");
    }

    public void reiniciaCombustible(){
        this.gastoEnViaje = 0;
    }
}