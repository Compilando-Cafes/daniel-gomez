package t12_colecciones.clase_5_ejercicios.ejercicio1_pedidos;

public class Pedido implements Comparable<Pedido>{
    private String direccionEnvio;
    private String descripcion;
    private int identificadorPedido;

    public Pedido(String direccionEnvio, String descripcion, int identificadorPedido) {
        this.direccionEnvio = direccionEnvio;
        this.descripcion = descripcion;
        setIdentificadorPedido(identificadorPedido);
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdentificadorPedido() {
        return identificadorPedido;
    }

    public void setIdentificadorPedido(int identificadorPedido) {
        if (identificadorPedido >= 0)
            this.identificadorPedido = identificadorPedido;
        else {
            System.out.println("Identificador del pedido puesto a 0");
            this.identificadorPedido = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("""
                        Pedido número: %d
                        Dirección de envío: %s
                        Descripción: %s
                        """,
                identificadorPedido,
                direccionEnvio,
                descripcion);
    }

    @Override
    public int compareTo(Pedido o) {
        return Integer.compare(this.identificadorPedido, o.identificadorPedido);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null)
            return this.identificadorPedido == ((Pedido) obj).identificadorPedido;
        else
            return false;
    }
}