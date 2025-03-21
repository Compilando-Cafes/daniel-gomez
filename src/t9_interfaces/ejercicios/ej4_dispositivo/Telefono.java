package t9_interfaces.ejercicios.ej4_dispositivo;

import java.util.Random;

public class Telefono implements Dispositivo, Electronico {
    static Random r = new Random();
    private int bateria;
    boolean ahorroEnergia;
    boolean estado;

    public Telefono(int bateria, boolean ahorroEnergia, boolean estado) {
        this.bateria = bateria;
        this.ahorroEnergia = ahorroEnergia;
        this.estado = estado;
    }

    @Override
    public void encender() {
        this.estado = true;
    }

    @Override
    public void apagar() {
        this.estado = false;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("""
                        Batería: %s
                        Modo ahorro energía: %s
                        Estado: %s
                        """,
                bateria,
                ahorroEnergia ? "Activado" : "Desactivado",
                estado ? "Encendido" : "Apagado");
    }

    @Override
    public void cargarBateria() {
        int numeroAleatorio = obtenerUnNumero(0, 50);
        if (numeroAleatorio + this.bateria < 100) {
            this.bateria += numeroAleatorio;
            System.out.println("Batería cargada. Ahora está al " + bateria + "%");
        } else {
            this.bateria = 100;
            System.out.println("Batería cargada al 100%");
        }
    }

    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo - minimo) + minimo;
        return num;
    }

    @Override
    public void reiniciar() {
        this.estado = false;
        this.ahorroEnergia = false;
        this.estado = true;
        System.out.println("Reiniciado.");
    }

    @Override
    public boolean conectarWifi(String red, String contrasena) {
        return false;
    }

    @Override
    public int verificarBateria() {
        return this.bateria;
    }

    @Override
    public void modoAhorroEnergia() {
        if (this.bateria < 20) {
            this.ahorroEnergia = true;
            System.out.println("Modo ahorro energía activado.");
        } else
            System.out.println("No se ha activado el modo ahorro de energía. Batería superior a 20.");
    }

    public void utilizar(String aplicacion) {
        if (bateria > 0) {
            int bateriaAntes = bateria;
            switch (aplicacion) {
                case "Whatsapp" -> bateria -= 5;
                case "Instagram" -> bateria -= 10;
                case "TikTok" -> bateria -= 20;
                default -> bateria -= 1;
            }
            if (bateria <=0) {
                System.out.println("Batería agotada. Apagando.");
                this.bateria = 0;
                this.estado = false;
                this.ahorroEnergia = false;
            } else
                System.out.println("Después de usar " + aplicacion + " la batería ha pasado del " + bateriaAntes + "% al " + bateria + "%");
        } else
            System.out.println("Batería gastada. Carga primero la batería.");
    }
}