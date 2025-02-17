package t7_clases.examen;

public class Empleado {
    enum Trabajo {CAMARERO, COCINERO}

    private String nombreEmpleado;
    private int pedidosGestionados;
    private Trabajo trabajo;

    public Empleado(String nombreEmpleado, String trabajo) {
        this.nombreEmpleado = nombreEmpleado;
        this.pedidosGestionados = 0;

        boolean existe = false;
        Trabajo[] trabajosDisponibles = Trabajo.values();
        for (int i = 0; i < trabajosDisponibles.length && !existe; i++) {
            if (trabajo.equals(trabajosDisponibles[i].name())) {
                this.trabajo = Trabajo.valueOf(trabajo);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("El trabajo introducido no es correcto. Ponemos por defecto Camarero.");
            this.trabajo = Trabajo.CAMARERO;
        }
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getPedidosGestionados() {
        return pedidosGestionados;
    }

    public void setPedidosGestionados(int pedidosGestionados) {
        this.pedidosGestionados = pedidosGestionados;
    }

    public Trabajo getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        boolean existe = false;
        Trabajo[] trabajosDisponibles = Trabajo.values();
        for (int i = 0; i < trabajosDisponibles.length && !existe; i++) {
            if (trabajo.equals(trabajosDisponibles[i].name())) {
                this.trabajo = Trabajo.valueOf(trabajo);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("El trabajo introducido no es correcto. Ponemos por defecto Camarero.");
            this.trabajo = Trabajo.CAMARERO;
        }
    }

    public boolean isCocinero() {
        return trabajo.equals(Trabajo.COCINERO);
    }

    public boolean isCamarero() {
        return trabajo.equals(Trabajo.CAMARERO);
    }

    public void gestionaComanda() {
        pedidosGestionados++;
    }

    public void cocinoComanda(int cantidadIngredientesPlatoCocinar) {
        pedidosGestionados += cantidadIngredientesPlatoCocinar;
    }

    public void mostrarResumen() {
        System.out.println(nombreEmpleado + " ha realizado " + pedidosGestionados);
    }
}