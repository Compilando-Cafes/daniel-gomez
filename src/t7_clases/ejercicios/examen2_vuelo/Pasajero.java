package t7_clases.ejercicios.examen2_vuelo;

public class Pasajero {
    private String nombre;
    private String apellidos;
    private String pasaporte;
    private int asiento;
    private boolean conVentana;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        if (asiento > 0)
            this.asiento = asiento;
        else
            this.asiento = 1;
    }

    public boolean isConVentana() {
        return conVentana;
    }

    public void setConVentana(boolean conVentana) {
        this.conVentana = conVentana;
    }

    public Pasajero(String nombre, String apellidos, String pasaporte, int asiento, boolean conVentana) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pasaporte = pasaporte;
        if (asiento > 0)
            this.asiento = asiento;
        else
            this.asiento = 1;
        this.conVentana = conVentana;
    }

    public void mostrarDatos() {
        System.out.println("El asiento " + asiento + (conVentana ? " con" : " sin") +
                " ventana está ocupado por el pasajero de nombre " +
                nombre + ", apellido " + apellidos + " y pasaporte " + pasaporte + ".");
    }
}