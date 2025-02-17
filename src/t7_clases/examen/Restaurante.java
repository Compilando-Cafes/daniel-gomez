package t7_clases.examen;

import java.util.Arrays;

public class Restaurante {
    Plato[] platos;
    Empleado[] empleados;
    private Cliente[] clientes;
    private int[][] comandas;
    private boolean[] mesasLibres;

    public Restaurante() {
        this.platos = new Plato[6];
        this.empleados = new Empleado[5];
        this.clientes = new Cliente[15];
        this.comandas = new int[3][4];
        this.mesasLibres = new boolean[15];
        // Pongo las mesas libres
        Arrays.fill(mesasLibres, true);
    }

    public Restaurante(Plato[] platos, Empleado[] empleados, Cliente[] clientes, int[][] comandas, boolean[] mesasLibres) {
        this.platos = platos;
        this.empleados = empleados;
        this.clientes = clientes;
        this.comandas = comandas;
        this.mesasLibres = mesasLibres;
    }

    public Plato[] getPlatos() {
        return platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int[][] getComandas() {
        return comandas;
    }

    public void setComandas(int[][] comandas) {
        this.comandas = comandas;
    }

    public boolean[] getMesasLibres() {
        return mesasLibres;
    }

    public void setMesasLibres(boolean[] mesasLibres) {
        this.mesasLibres = mesasLibres;
    }

    public void mostrarMenu() {
        for (Plato plato : platos) {
            plato.mostrarInformacion();
        }
    }

    public int entradaCliente(String nombre) {
        int mesa = -1;
        // Busca una mesa libre
        for (int i = 0; i < mesasLibres.length; i++) {
            // Si es true la posición es que la mesa está libre y almacena el valor
            if (mesasLibres[i]) {
                mesa = i;
                break;
            }
        }
        // Si encuentra una mesa libre
        if (mesa != -1) {
            // Crea un cliente y lo añade
            Cliente cliente = new Cliente(nombre, mesa);
            clientes[mesa] = cliente;
            mesasLibres[mesa] = false;
        }
        return mesa;
    }

    public void salidaCliente(int mesa) {
        // Busca la mesa
        if (mesa >= 0 && mesa < clientes.length && clientes[mesa] != null) {
            // Muestra la cuenta
            clientes[mesa].mostrarCuenta();
            // Libera la mesa correspondiente
            mesasLibres[mesa] = true;
            // Elimina al cliente
            clientes[mesa] = null;
        }
    }

    public void apuntaComanda(int plato, int mesa) {
        if (plato >= 0 && plato < platos.length && mesa >= 0 && mesa < clientes.length) {
            // Pone un 1 en la comanda para mostrar que se ha pedido
            comandas[plato][mesa] = 1;
            // Buscar un camarero al azar
            int camarero = (int) (Math.random() * empleados.length);
            // Llamar a gestiona la comanda
            empleados[camarero].gestionaComanda();
            // Añadirlo siempre que sea posible
            if (clientes[mesa] != null) {
                clientes[mesa].anyadirACuenta(platos[plato].getPrecioPlato());
            }
        }
    }

    // No consigo que funcione esta función y no sé por qué...
    public void entregarComanda() {
        // Buscar en el array bidimensional
        for (int i = 0; i < comandas.length; i++) {
            for (int j = 0; j < comandas[i].length; j++) {
                if (comandas[i][j] != 0) {
                    // Busca un camarero aleatorio
                    int camarero = (int) (Math.random() * empleados.length);
                    // Llama a gestionar la comanda
                    empleados[camarero].gestionaComanda();
                    // Pone la comanda a cero
                    comandas[i][j] = 0;
                    System.out.println("Mesa " + j + ", el plato " + platos[i].getNombrePlato() + " está listo.");
                }
            }
        }
    }

    public void tandaDeCocina() {
        // Recorre el array bidimensional
        for (int i = 0; i < comandas.length; i++) {
            for (int j = 0; j < comandas[i].length; j++) {
                // Si no está a cero, si encuentra una comanda
                if (comandas[i][j] != 0) {
                    // Busca un cocinero al azar
                    int cocinero = (int) (Math.random() * empleados.length);
                    // Llama a cocinar la comanda
                    empleados[cocinero].cocinoComanda(platos[i].getCantidadIngredientes());
                    // Pone la comanda a cero
                    comandas[i][j] = 0;
                }
            }
        }
    }

    public void resumenDia() {
        for (Empleado empleado : empleados) {
            empleado.mostrarResumen();
        }
    }
}