package t9_interfaces.ejercicios.ej2_productos;

public interface Producto {
    String getNombre();
    double getPrecio();
    String getDescripcion();
    void aplicarDescuento(double porcentaje);
    void reponer(int cantidad);
    boolean comprobarDisponibilidad();
    void mostrarInformacion();
}
