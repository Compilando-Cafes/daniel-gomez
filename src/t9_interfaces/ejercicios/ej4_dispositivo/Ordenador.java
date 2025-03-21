package t9_interfaces.ejercicios.ej4_dispositivo;

import java.util.Random;

public class Ordenador implements Dispositivo, Electronico {
    static Random r = new Random();
    int bateria;
    boolean ahorroEnergia;
    boolean estado;

    public Ordenador(int bateria, boolean ahorroEnergia, boolean estado) {
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
    public void cargarBateria() throws InterruptedException {
        int numeroAleatorio = obtenerUnNumero(50, 100);
        for (int i = 0; i < numeroAleatorio; i++) {
            if (i + bateria >= 100) {
                this.bateria = 100;
                System.out.println("100%\nBatería cargada al máximo.");
                return;
            } else {
                System.out.print(i + bateria + "%.. ");
                Thread.sleep(300);
            }

        }
        this.bateria += numeroAleatorio;
        System.out.println("\nBatería cargada al " + bateria + "%");
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
        this.ahorroEnergia = !ahorroEnergia;
    }

    public void utilizar(int pestanasAbiertas) {
        if (ahorroEnergia) {
            if ((bateria - pestanasAbiertas) > 0) {
                this.bateria -= pestanasAbiertas;
                System.out.println("La batería ahora está al " + this.bateria);
            } else {
                System.out.println("Batería agotada. Apagando.");
                this.estado = false;
                this.ahorroEnergia = false;
            }
        } else {
            if ((bateria - (pestanasAbiertas * 2)) > 0) {
                this.bateria -= pestanasAbiertas * 2;
                System.out.println("La batería ahora está al " + this.bateria);
            } else {
                System.out.println("Batería agotada. Apagando.");
                this.estado = false;
            }
        }
    }
}