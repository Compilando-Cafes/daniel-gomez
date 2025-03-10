package t8_herencia.ej1_hora;

public class Hora {
    protected int hora;
    protected int minutos;

    public Hora(int hora, int minutos) {
        if (hora >= 0 && hora < 24)
            this.hora = hora;
        else
            System.out.println("Hora incorrecta. 0 por defecto.");

        if (minutos >= 0 && minutos < 60)
            this.minutos = minutos;
        else
            System.out.println("Minutos incorrectos. 0 por defecto.");
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24)
            this.hora = hora;
        else
            System.out.println("Hora incorrecta. 0 por defecto.");
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60)
            this.minutos = minutos;
        else
            System.out.println("Minutos incorrectos. 0 por defecto.");
    }

    public void inc() {
        minutos++;
        // Comprobar tope minutos
        if (minutos == 60) {
            minutos = 0;
            hora++;
            // Comprobar tope horas
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }
}