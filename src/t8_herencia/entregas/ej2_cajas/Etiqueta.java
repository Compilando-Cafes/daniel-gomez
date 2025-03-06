package t8_herencia.entregas.ej2_cajas;

public class Etiqueta {
    private String nombreDestinatario;
    private String direccionDestinatario;
    private String direccionRemitente;
    private String empresaQueEnvia;
    private int peso;
    private String descripcionContenido;

    public Etiqueta(String nombreDestinatario, String direccionDestinatario, String direccionRemitente, String empresaQueEnvia, int peso, String descripcionContenido) {
        this.nombreDestinatario = nombreDestinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.direccionRemitente = direccionRemitente;
        this.empresaQueEnvia = empresaQueEnvia;
        this.peso = peso;
        this.descripcionContenido = descripcionContenido;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public String getEmpresaQueEnvia() {
        return empresaQueEnvia;
    }

    public void setEmpresaQueEnvia(String empresaQueEnvia) {
        this.empresaQueEnvia = empresaQueEnvia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDescripcionContenido() {
        return descripcionContenido;
    }

    public void setDescripcionContenido(String descripcionContenido) {
        this.descripcionContenido = descripcionContenido;
    }
}