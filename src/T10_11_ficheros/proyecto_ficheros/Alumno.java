package T10_11_ficheros.proyecto_ficheros;

public class Alumno {
    private int identificador;
    private String nombre;
    private String apellido;
    private double notaMedia;
    private int edad;
    private String ciudad;
    private Calle calle;

    public Alumno(int identificador, String nombre, String apellido, double notaMedia, int edad, String ciudad, Calle calle) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMedia = notaMedia;
        this.edad = edad;
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Calle getCalle() {
        return calle;
    }

    public void setCalle(Calle calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notaMedia=" + notaMedia +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                ", calle=" + calle +
                '}';
    }
}