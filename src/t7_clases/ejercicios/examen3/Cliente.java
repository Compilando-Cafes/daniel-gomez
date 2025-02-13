package t7_clases.ejercicios.examen3;

public class Cliente {

    private String nombre;
    private String apellidos;
    private final String DNI;
    private String usuario;
    private String contrasena;

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

    public String getDNI() {
        return DNI;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    Cliente(String nombre, String apellidos, String DNI, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.DNI = "";
        this.usuario = "";
        this.contrasena = "";
    }
}