package t7_clases.ejercicios.examen5_gestion_restaurante;

import java.util.Arrays;

public class Cliente {
    private String nombre;
    private int mesa;
    private Plato[] pedido;

    public Cliente(String nombre, int mesa, Plato[] pedido) {
        this.nombre = nombre;
        this.mesa = mesa;

        if (pedido == null){
            this.pedido = new Plato[0];
        } else {
            this.pedido = Arrays.copyOf(pedido, pedido.length);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Plato[] getPedido() {
        return pedido;
    }

    public void setPedido(Plato[] pedido) {
        if (pedido == null){
            this.pedido = new Plato[0];
        } else {
            this.pedido = Arrays.copyOf(pedido, pedido.length);
        }
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", mesa: " + mesa + " y platos: " + Arrays.toString(pedido));
    }
}