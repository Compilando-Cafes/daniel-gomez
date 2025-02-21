package t8_herencia.ej1_mueble;

public class Silla extends Mueble {
    private boolean esConjunto;
    private int cantConjunto;

    public Silla(String identificador, String nombre, int cantidadDisponible, double precio, Stock stock, boolean esConjunto, int cantConjunto) {
        super(identificador, nombre, cantidadDisponible, precio, stock);
        this.esConjunto = esConjunto;
        this.cantConjunto = cantConjunto;
    }

    public boolean isEsConjunto() {
        return esConjunto;
    }

    public void setEsConjunto(boolean esConjunto) {
        this.esConjunto = esConjunto;
    }

    public int getCantConjunto() {
        return cantConjunto;
    }

    public void setCantConjunto(int cantConjunto) {
        this.cantConjunto = cantConjunto;
    }

    @Override
    public void mostrarInfo() {
        System.out.println((esConjunto ? "El conjunto de " + cantConjunto + " sillas" : "La silla") + " de nombre " + nombre + " está " + (stock == Stock.CON_STOCK ? " con stock" : " sin stock") + " y vale " + precio);
    }

    @Override
    public void disminuyeCantidad(int cantidad) {
        cantidadDisponible -= esConjunto ? (cantidad * cantConjunto) : cantidad;
    }
}