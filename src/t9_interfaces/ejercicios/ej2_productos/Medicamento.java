package t9_interfaces.ejercicios.ej2_productos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Medicamento implements Producto{
    static Scanner sc = new Scanner(System.in);

    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidad;
    private LocalDate fechaCad;
    private boolean requiereReceta;
    private String[] componentes;

    public Medicamento(String nombre, double precio, String descripcion, int cantidad, LocalDate fechaCad, boolean requiereReceta, String[] componentes) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fechaCad = fechaCad;
        this.requiereReceta = requiereReceta;
        this.componentes = componentes;
    }

    @Override
    public String getNombre() {
        return this.nombre;
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
        System.out.println("""
                Elige el grupo para el descuento:
                a: ancianos (80%)
                b: desempleados (50%)
                c: jóvenes (30%)
                Cualquier otra opción no tendrá descuento.
                """);
        char eleccion = sc.nextLine().charAt(0);
        double precioAnterior = this.precio;
        switch (eleccion){
            case 'a' -> {
                this.precio *= 0.2;
            }
            case 'b' -> {
                this.precio *= 0.5;
            }
            case 'c' -> {
                this.precio *= 0.7;
            }
            default -> System.out.println("No se aplica ningún descuento.");
        }
        if (precioAnterior != this.precio)
            System.out.printf("Antes costaba %,.2f€ y ahora cuesta %,.2f€\n", precioAnterior, this.precio);
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
                        Cantidad en stock: %s
                        Fecha caducidad: %s
                        ¿Requiere receta?: %s
                        Componentes: %s
                        """,
                nombre,
                precio,
                descripcion,
                cantidad > 0 ? cantidad + " unidades." : "Sin stock.",
                fechaCad.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)),
                requiereReceta ? "Si" : "No",
                mostrarComponentes(componentes));
    }

    public String mostrarComponentes(String[] componentes){
        String resultado = "";
        for (int i = 0; i< componentes.length; i++){
            if (i== componentes.length-1){
                resultado += componentes[i];
            } else
                resultado += componentes[i] + ", ";
        }
        return resultado;
    }

    public boolean contiene(String componente){
        boolean encontrado = false;
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i].equalsIgnoreCase(componente)) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public boolean comprobarReceta(){
        return requiereReceta;
    }

}