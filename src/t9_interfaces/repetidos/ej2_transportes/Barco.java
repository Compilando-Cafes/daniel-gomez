package t9_interfaces.repetidos.ej2_transportes;

public class Barco implements Navegante{
    private double gastoEnViaje;

    public Barco(double gastoEnViaje) {
        this.gastoEnViaje = gastoEnViaje;
    }

    public Barco() {
        gastoEnViaje = 0.0;
    }

    public double getGastoEnViaje() {
        return gastoEnViaje;
    }

    public void setGastoEnViaje(double gastoEnViaje) {
        this.gastoEnViaje = gastoEnViaje;
    }

    @Override
    public void zarpar() {
        System.out.println("Zarpando.");
        System.out.println("Comenzamos el viaje con " + gastoEnViaje + " gasto de combustible.");
    }

    @Override
    public void navegar(boolean tipo) {
        if (tipo){
            this.gastoEnViaje++;
            System.out.println("Navegando. Gasto en viaje aumentado en uno.");
        } else {
            this.gastoEnViaje+=2;
            System.out.println("Navegando. Gasto en viaje aumentado en dos.");
        }
    }

    @Override
    public void anclar() {
        System.out.println("Anclado.");
        System.out.println("Hemos llegado, hemos gastado " + gastoEnViaje + " combustible.");
    }

    public void reiniciaCombustible(){
        this.gastoEnViaje = 0;
        System.out.println("Gasto en viaje reiniciado y puesto a cero.");
    }
}