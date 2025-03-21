package t9_interfaces.ejercicios.ej2_productos;

import java.util.Arrays;

public class Ropa implements Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private String tipoMaterial;
    private String[] color;
    private String[] talla;
    private int[][] disponibilidad; // Colores filas y tallas columnas

    public Ropa(String nombre, double precio, String descripcion, String tipoMaterial, String[] color, String[] talla, int[][] disponibilidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.tipoMaterial = tipoMaterial;
        this.color = color;
        this.talla = talla;
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
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
        for (int i = 0; i< disponibilidad.length; i++) {
            for (int j = 0; j < disponibilidad[0].length; j++) {
                disponibilidad[i][j] += cantidad;
            }
        }
    }

    @Override
    public boolean comprobarDisponibilidad() {
        int contador = 0;
        for (int i = 0; i< disponibilidad.length; i++){
            for (int j = 0; j< disponibilidad[i].length; j++){
                if (disponibilidad[i][j] > 0){
                    contador++;
                    System.out.println("Color " + color[i] + " talla " + talla[j] + " cantidad: " + disponibilidad[i][j] + " unidades.");
                }
            }
        }
        if (contador == 0) {
            System.out.println("No queda disponibilidad de ningún producto.");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("""
                        Nombre: %s
                        Precio: %,.2f
                        Descripción: %s
                        Tipo de material: %s
                        Colores: %s
                        Tallas: %s
                        Cantidad en stock: %s
                        """,
                nombre,
                precio,
                descripcion,
                tipoMaterial,
                mostrarArray(color),
                mostrarArray(talla),
                mostrarArrayBidimensional(disponibilidad)
                );
    }

    public String mostrarArray(String[] tabla){
        String resultado = "";
        for (int i = 0; i < tabla.length; i++) {
            resultado += i == tabla.length-1? tabla[i] : tabla[i] + ", ";
        }
        return resultado;
    }

    public String mostrarArrayBidimensional(int[][] tabla){
        String resultado = "";
        for (int i = 0; i< tabla.length; i++){
            for (int j = 0; j< tabla[i].length; j++){
                if (tabla[i][j] > 0){
                    resultado += ("Color " + color[i] + " talla " + talla[j] + " cantidad: " + tabla[i][j] + " unidades.\n");
                }
            }
        }
        return resultado;
    }
}