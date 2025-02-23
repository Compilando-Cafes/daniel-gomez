package t8_herencia.ej1_hora;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        if (segundos < 0 || segundos >= 60)
            this.segundos = 0;
        else
            this.segundos = segundos;
    }

    public int getSegundo() {
        return segundos;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60)
            this.segundos = segundo;
        else
            System.out.println("Segundos incorrectos. Por defecto 0.");
    }

    @Override
    public void inc() {
        segundos++;
        // Comprobar tope segundos
        if (segundos == 60) {
            segundos = 0;
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
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HoraExacta horaExacta) {
            return this.hora == horaExacta.hora && this.minutos == horaExacta.minutos && this.segundos == horaExacta.segundos;
        }
        return false;
    }
}