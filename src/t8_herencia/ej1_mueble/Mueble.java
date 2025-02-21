package t8_herencia.ej1_mueble;

public class Mueble {
    enum Stock {SIN_STOCK, CON_STOCK};
    protected String identificador;
    protected String nombre;
    protected int cantidadDisponible;
    protected double precio;
    protected Stock stock;

    public Mueble(String identificador, String nombre, int cantidadDisponible, double precio, Stock stock) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.precio = precio;
        this.stock = stock;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void aumentaCantidad(int cantidad){
        cantidadDisponible += cantidad;
    }

    public void disminuyeCantidad(int cantidad){
        cantidadDisponible -= cantidad;
    }

    public void mostrarInfo(){
        System.out.println("El mueble " + nombre + " que está " + (stock == Stock.CON_STOCK? " con stock": " sin stock") + " y vale " + precio);
    }
}