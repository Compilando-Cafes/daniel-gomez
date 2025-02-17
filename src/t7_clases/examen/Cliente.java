package t7_clases.examen;

public class Cliente {
    private String nombreCliente;
    private int mesaCliente;
    private double totalCuenta;

    public Cliente(String nombreCliente, int mesaCliente) {
        this.nombreCliente = nombreCliente;
        this.mesaCliente = mesaCliente;
        this.totalCuenta = 0;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getMesaCliente() {
        return mesaCliente;
    }

    public void setMesaCliente(int mesaCliente) {
        this.mesaCliente = mesaCliente;
    }

    public double getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(double totalCuenta) {
        this.totalCuenta = totalCuenta;
    }

    public void anyadirACuenta(double valor){
        totalCuenta += valor;
    }

    public void mostrarCuenta(){
        System.out.println("El total de su comida es " + totalCuenta + ", gracias por su visita.");
    }
}