package t9_interfaces.interfaz2.ej2_transportes;

public class Barco implements Navegante {
    private double gastoEnViaje;

    // Constructores
    public Barco(double gastoEnViaje) {
        this.gastoEnViaje = gastoEnViaje;
    }

    public Barco() {
        this.gastoEnViaje = 0;
    }

    // Getters y setters
    public double getGastoEnViaje() {
        return gastoEnViaje;
    }

    public void setGastoEnViaje(double gastoEnViaje) {
        this.gastoEnViaje = gastoEnViaje;
    }

    // Sobreescribir métodos de la interfaz
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