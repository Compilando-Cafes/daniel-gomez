package t7_clases.teoria.cuenta_corriente;

public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;

    CuentaCorriente() {
        dni = "";
        nombre = "";
        saldo = 0;
    }

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0);
        this.dni = dni;
        this.nombre = nombre;
    }

    void sacarDinero(double cantidadSacar) {
        if (saldo-cantidadSacar >0){
            saldo -= cantidadSacar;
        } else {
            saldo = 0;
        }
    }

    void ingresarDinero(double cantidadIngresar){
        saldo += cantidadIngresar;
    }

    void mostrarInformacion(){
        System.out.println("Dni: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
    }
}