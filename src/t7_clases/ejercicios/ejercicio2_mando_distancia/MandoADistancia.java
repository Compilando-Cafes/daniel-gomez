package t7_clases.ejercicios.ejercicio2_mando_distancia;

enum Estado {ENCENDIDO, APAGADO}

public class MandoADistancia {
    private Estado estado;
    private int canal;
    private String[] canalesDisponibles = new String[10];
    private int volumen;

    // Constructor sin parámetros
    MandoADistancia() {
        volumen = 12;
        estado = Estado.APAGADO;
        canal = 1;
        canalesDisponibles[0] = "La 1";
        canalesDisponibles[1] = "La 2";
        canalesDisponibles[2] = "Antena 3";
        canalesDisponibles[3] = "Cuatro";
        canalesDisponibles[4] = "Telecinco";
        canalesDisponibles[5] = "La Sexta";
        canalesDisponibles[6] = "CCM";
        canalesDisponibles[7] = "Clan";
        canalesDisponibles[8] = "Boing";
        canalesDisponibles[9] = "Teledeporte";
    }

    public String getEstado() {
        return estado.name();
    }

    public void setEstado(String estado) {
        // Controlar que el estado introducido sea el correcto
        Estado[] estadosPosibles = Estado.values();
        boolean existe = false;
        for (int i = 0; i < estadosPosibles.length && !existe; i++) {
            if (estado.equals(estadosPosibles[i].name())) {
                this.estado = Estado.valueOf(estado);
                existe = true;
            }
        }
        if (!existe) {
            this.estado = Estado.APAGADO;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        // Comprobar si la televisión está encendida
        if (estado.equals(Estado.ENCENDIDO)) {
            // Controlar que el canal está entre 1 y 10
            if (canal >= 1 && canal <= 10) {
                this.canal = canal;
            }
        }
    }

    public String[] getCanalesDisponibles() {
        return canalesDisponibles;
    }

    public void setCanalesDisponibles(String[] canalesDisponibles) {
        // Comprobar si la televisión está encendida
        if (estado.equals(Estado.ENCENDIDO)) {
            // Controlar que tenga 10 canales
            if (canalesDisponibles.length == 10) {
                this.canalesDisponibles = canalesDisponibles;
            } else {
                this.canalesDisponibles[0] = "La 1";
                this.canalesDisponibles[1] = "La 2";
                this.canalesDisponibles[2] = "Antena 3";
                this.canalesDisponibles[3] = "Cuatro";
                this.canalesDisponibles[4] = "Telecinco";
                this.canalesDisponibles[5] = "La Sexta";
                this.canalesDisponibles[6] = "CCM";
                this.canalesDisponibles[7] = "Clan";
                this.canalesDisponibles[8] = "Boing";
                this.canalesDisponibles[9] = "Teledeporte";
            }
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        // Comprobar si la televisión está encendida
        if (estado.equals(Estado.ENCENDIDO)) {
            // Controlar que esté entre 0 y 100
            if (volumen >= 0 && volumen <= 100)
                this.volumen = volumen;
            else
                this.volumen = 0;
        }
    }

    public void incrementarVolumen() {
        // Comprobar si la televisión está encendida
        if (estado.equals(Estado.ENCENDIDO)) {
            this.volumen++;
            System.out.println("Se ha incrementado el volumen a " + getVolumen());
        }
    }

    public void disminuirVolumen() {
        // Comprobar si la televisión está encendida
        if (estado.equals(Estado.ENCENDIDO)) {
            this.volumen--;
            System.out.println("Se ha disminuido el volumen a " + getVolumen());
        }
    }

    public void siguienteCanal() {
        // Comprobar si la televisión está encendida
        if (estado.equals(Estado.ENCENDIDO)) {
            if (this.canal == 10)
                this.canal = 1;
            else
                this.canal++;
            System.out.println("Actualmente viendo el canal " + canalesDisponibles[this.canal - 1] + " en el número " + this.canal);
        }
    }

    public void anteriorCanal() {
        // Comprobar si la televisión está encendida
        if (estado.equals(Estado.ENCENDIDO)) {
            if (this.canal == 1)
                this.canal = 10;
            else
                this.canal--;
            System.out.println("Actualmente viendo el canal " + canalesDisponibles[this.canal - 1] + " en el número " + this.canal);
        }
    }

    public void encenderTelevision() {
        this.estado = Estado.ENCENDIDO;
        System.out.println("La televisión se ha encendido\nActualmente viendo el canal " + canalesDisponibles[this.canal - 1] + " en el número " + this.canal);
    }

    public void apagarTelevision() {
        this.estado = Estado.APAGADO;
        System.out.println("El televisor se ha apagado.");
    }

}