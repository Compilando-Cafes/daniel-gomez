package t8_herencia.entregas.ej2_cajas;

public class Caja {
    protected double alto;
    protected double ancho;
    protected double fondo;
    protected double peso;
    protected Etiqueta etiqueta;

    public Caja(double alto, double ancho, double fondo, double peso) {
        if (alto > 0 && alto <= 50) {
            this.alto = alto;
        } else {
            System.out.println("Máximo 50 cm de largo.");
            this.alto = 50;
        }

        if (ancho > 0 && ancho <= 50) {
            this.ancho = ancho;
        } else {
            System.out.println("Máximo 50 cm de ancho.");
            this.ancho = 50;
        }

        if (fondo > 0 && fondo <= 50) {
            this.fondo = fondo;
        } else {
            System.out.println("Máximo 50 cm de fondo.");
            this.fondo = 50;
        }

        if (peso > 0 && peso <= 10) {
            this.peso = peso;
        } else {
            System.out.println("Máximo 10 kg de peso.");
            this.peso = 10;
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto > 0 && alto <= 50) {
            this.alto = alto;
        } else {
            System.out.println("Máximo 50 cm de largo.");
            this.alto = 50;
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho > 0 && ancho <= 50) {
            this.ancho = ancho;
        } else {
            System.out.println("Máximo 50 cm de ancho.");
            this.ancho = 50;
        }
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        if (fondo > 0 && fondo <= 50) {
            this.fondo = fondo;
        } else {
            System.out.println("Máximo 50 cm de fondo.");
            this.fondo = 50;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0 && peso <= 10) {
            this.peso = peso;
        } else {
            System.out.println("Máximo 10 kg de peso.");
            this.peso = 10;
        }
    }

    public void setEtiqueta(String nombreDestinatario, String direccionDestinatario, String direccionRemitente, String empresaQueEnvia, int peso, String descripcionContenido) {
        this.etiqueta = new Etiqueta(nombreDestinatario, direccionDestinatario, direccionRemitente, empresaQueEnvia, peso, descripcionContenido);
    }

    public double volumenCaja() {
        return alto * ancho * fondo;
    }

    public double costoEnvio() {
        return volumenCaja() * peso;
    }

    @Override
    public String toString() {
        return String.format("""
                          =================================
                          MEDIDAS DE LA CAJA
                          \tAlto: %,.2f cm
                          \tAncho: %,.2f cm
                          \tFondo: %,.2f cm
                          \tPeso: %,.2f kg
                        
                          CONTENIDO ETIQUETA
                          \tNombre destinatario: %s
                          \tDirección destinatario: %s
                          \tDirección remitente: %s
                          \tEmpresa que envía: %s
                          \tPeso: %d kg
                          \tDescripción contenido: %s
                        
                          COSTE ENVÍO
                          \tCoste envío: %,.2f €
                          ==================================
                        """, alto, ancho, fondo, peso,
                etiqueta.getNombreDestinatario(), etiqueta.getDireccionDestinatario(), etiqueta.getDireccionRemitente(),
                etiqueta.getEmpresaQueEnvia(), etiqueta.getPeso(), etiqueta.getDescripcionContenido(),
                costoEnvio());
    }
}