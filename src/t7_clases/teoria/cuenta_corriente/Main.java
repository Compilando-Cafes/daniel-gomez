package t7_clases.teoria.cuenta_corriente;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("012345678E", "Daniel");

        cuenta1.ingresarDinero(1000);
        cuenta1.mostrarInformacion();

        cuenta1.sacarDinero(500);
        cuenta1.mostrarInformacion();

        cuenta1.sacarDinero(1000);
        cuenta1.mostrarInformacion();

    }
}