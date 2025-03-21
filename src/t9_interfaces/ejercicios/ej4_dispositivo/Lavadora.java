package t9_interfaces.ejercicios.ej4_dispositivo;

public class Lavadora implements Dispositivo{
    String modo;
    int potencia;
    boolean estado;
    int capacidad;
    final int capacidadMaxima;

    public Lavadora(String modo, int potencia, boolean estado, int capacidad, int capacidadMaxima) {
        this.modo = modo;
        this.potencia = potencia;
        this.estado = estado;
        this.capacidad = capacidad;
        this.capacidadMaxima = capacidadMaxima;
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
                        Modo: %s
                        Potencia: %,d KW
                        Estado: %s
                        Capacidad: %,d kilos
                        Capacidad máxima: %,d kilos
                        """,
                modo,
                potencia,
                estado ? "Encendido" : "Apagado",
                capacidad,
                capacidadMaxima
                );
    }

    public void restarCapacidad(int capacidad){
        if (this.capacidad - capacidad > 0){
            this.capacidad-=capacidad;
            System.out.println("Capacidad restada. Nueva capacidad: " + this.capacidad);
        } else {
            this.capacidad = 0;
            System.out.println("Capacidad a 0.");
        }
    }

    public void aumentarCapacidad(int capacidad){
        if (this.capacidad + capacidad < capacidadMaxima){
            this.capacidad += capacidad;
            System.out.println("Capacidad aumentada a " + this.capacidad);
        } else{
            this.capacidad = capacidadMaxima;
            System.out.println("No se puede aumentar por encima de la capacidad máxima. Puesto al máximo: " + this.capacidad);
        }
    }

    public void seleccionarModo(String modo){
        switch (modo){
            case "Corta duración" -> {
                this.modo = modo;
                System.out.println("Cambiado a modo corta duración.");
            }
            case "Potencia maxima" -> {
                this.modo = modo;
                System.out.println("Cambiado a modo potencia máxima.");
            }
            case "Sostenible" -> {
                this.modo = modo;
                System.out.println("Cambiado a modo sostenible.");
            }
            default -> System.out.println("Modo introducido no válido.");
        }
    }

    public void seleccionarPotencia(int potencia){
        this.potencia = potencia;
    }
}