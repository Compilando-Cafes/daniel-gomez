package t7_clases.ejercicios.examen5_gestion_restaurante;

import java.util.Arrays;

public class Restaurante {
    private Plato[] menu;
    private Cliente[] clientes;

    public Restaurante() {
        this.menu = new Plato[0];
        this.clientes = new Cliente[0];
    }

    public Restaurante(Plato[] menu, Cliente[] clientes) {
        if (clientes == null)
            this.clientes = new Cliente[0];
        else
            this.clientes = Arrays.copyOf(clientes, clientes.length);

        if (menu == null)
            this.menu = new Plato[0];
        else
            this.menu = Arrays.copyOf(menu, menu.length);
    }

    public Plato[] getMenu() {
        return menu;
    }

    public void setMenu(Plato[] menu) {
        if (menu == null)
            this.menu = new Plato[0];
        else
            this.menu = Arrays.copyOf(menu, menu.length);
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        if (clientes == null)
            this.clientes = new Cliente[0];
        else
            this.clientes = Arrays.copyOf(clientes, clientes.length);
    }

    public void agregarCliente(String nombre, int mesa){
        // Agrandar el tamaño de cliente
        clientes = Arrays.copyOf(clientes, clientes.length+1);
        clientes[clientes.length-1] = new Cliente(nombre, mesa, new Plato[0]);
    }

    public void agregarPlato(Plato plato){
        // Agrandar el tamaño de menu
        menu = Arrays.copyOf(menu, menu.length+1);
        menu[menu.length-1] = plato;
    }

    public void mostrarMenu(){
        System.out.println("Menú:");
        for (Plato plato : menu) {
            plato.mostrarDatos();
        }
    }

    public void mostrarClientes(){
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            cliente.mostrarDatos();
        }
    }

    public void tomarPedido(String nombreCliente, String nombrePlato){
        Cliente cliente = null;
        Plato plato = null;

        // Buscar cliente
        for (Cliente c : clientes) {
            if (c.getNombre().equals(nombreCliente)){
                cliente = c;
                break;
            }
        }

        // Buscar plato
        for (Plato p : menu) {
            if (p.getNombre().equals(nombrePlato)){
                plato = p;
                break;
            }
        }

        // Si no se ha encontrado el cliente o el plato
        if (cliente == null || plato == null){
            System.out.println("No se ha encontrado el cliente o el plato.");
            return;
        }

        // Agrandar el tamaño del pedido
        Plato[] pedido = Arrays.copyOf(cliente.getPedido(), cliente.getPedido().length+1);
        pedido[pedido.length-1] = plato;
        cliente.setPedido(pedido);
    }

}