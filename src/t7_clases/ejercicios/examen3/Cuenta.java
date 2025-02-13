package t7_clases.ejercicios.examen3;

public class Cuenta {
    private int numero;
    private double saldo;
    private Cliente cliente;
    private String[] movimientos;

    public String[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String[] movimientos) {
        this.movimientos = movimientos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero>0 && numero<99999999)
            this.numero = numero;
        else
            System.out.println("No se ha podido asignar el número de cuenta. Introducir un número de 8 cifras máximo.");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Constructor
    public Cuenta(String[] movimientos, int numero, double saldo, String nombre, String apellidos, String DNI, String usuario, String contrasena) {
        if (numero>0 && numero<99999999)
            this.numero = numero;
        else
            System.out.println("No se ha podido asignar el número de cuenta. Introducir un número de 8 cifras máximo.");

        this.saldo = saldo;

        this.cliente = new Cliente(nombre, apellidos, DNI, usuario, contrasena);

        this.movimientos = movimientos;
    }
}