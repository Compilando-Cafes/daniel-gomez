package t8_herencia.ej1_mueble;

public class Sofa extends Mueble {
    private int sitios;
    public Sofa(String identificador, String nombre, int cantidadDisponible, double precio, Stock stock, int sitios) {
        super(identificador, nombre, cantidadDisponible, precio, stock);
        this.sitios = sitios;
    }

    public int getSitios() {
        return sitios;
    }

    public void setSitios(int sitios) {
        this.sitios = sitios;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El sofá de " + sitios + " plazas de nombre " + nombre + ", está " +(stock == Stock.CON_STOCK? " con stock": " sin stock") + " y vale " + precio);
    }
}