package t12_colecciones.clase_5_ejercicios.ejercicio1_pedidos;

public class LineaPedido implements Comparable<LineaPedido>{
    private String producto;
    private double cantidad;
    private double precio;
    private int identificador;

    public LineaPedido(String producto, double cantidad, double precio, int identificador) {
        this.producto = producto;
        setCantidad(cantidad);
        setPrecio(precio);
        setIdentificador(identificador);
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if (cantidad >= 0)
            this.cantidad = cantidad;
        else {
            System.out.println("Cantidad puesta a 0");
            this.cantidad = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0)
            this.precio = precio;
        else {
            System.out.println("Precio puesto a 0");
            this.precio = 0;
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        if (identificador >= 0)
            this.identificador = identificador;
        else {
            System.out.println("Identificador puesto a 0");
            this.identificador = 0;
        }
    }

    public double obtenerPVPLinea() {
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return String.format("""
                        Linea %d
                        \t%s %,.0f unidades * %,.2f€ = %,.2f€
                        """,
                identificador,
                producto,
                cantidad,
                precio,
                obtenerPVPLinea());
    }

    @Override
    public int compareTo(LineaPedido o) {
        return Integer.compare(this.identificador, o.identificador);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null)
            return this.identificador == ((LineaPedido) obj).identificador;
        else
            return false;
    }
}