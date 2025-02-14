package t7_clases.ejercicios.examen5_gestion_restaurante;

public class Plato {
    private String nombre;
    private double precio;
    private boolean disponible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Plato(String nombre, double precio, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", precio: " + precio + " y disponibilidad: " + (disponible? "Si." : "No."));
    }

}