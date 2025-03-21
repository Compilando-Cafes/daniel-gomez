package t9_interfaces.ejercicios.ej2_productos;

public class Juguete implements Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private int edadRecomendada;
    private int cantidad;
    private boolean esInteractivo;

    public Juguete(String nombre, double precio, String descripcion, int edadRecomendada, int cantidad, boolean esInteractivo) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.edadRecomendada = edadRecomendada;
        this.cantidad = cantidad;
        this.esInteractivo = esInteractivo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje < 100) {
            double descuento = (this.precio * porcentaje) / 100;
            System.out.println("Descuento aplicado.");
            System.out.printf("Antes costaba %,.2f€ y ahora cuesta %,.2f€\n", precio, this.precio-descuento);
            this.precio = this.precio - descuento;
        } else
            System.out.println("No se puede aplicar ese porcentaje.");
    }

    @Override
    public void reponer(int cantidad) {
        this.cantidad += cantidad;
    }

    @Override
    public boolean comprobarDisponibilidad() {
        if (cantidad > 0) {
            System.out.println("Actualmente hay un stock de " + cantidad + " unidades.");
            return true;
        }
        System.out.println("No queda stock de ese artículo.");
        return false;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("""
                        
                        Nombre: %s
                        Precio: %,.2f
                        Descripción: %s
                        Edad recomendada: %d
                        Cantidad en stock: %s
                        Es interactivo: %s
                        """,
                nombre,
                precio,
                descripcion,
                edadRecomendada,
                cantidad > 0 ? cantidad + " unidades." : "Sin stock.",
                esInteractivo ? "Si" : "No");
    }

    public void comprar() {
        this.cantidad--;
        System.out.println("Comprado una unidad.");
    }

    public boolean esSeguroParaEdad(int edad) {
        return edad >= edadRecomendada;
    }
}