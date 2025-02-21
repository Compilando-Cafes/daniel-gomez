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
        if (hora == 23) {
            hora = 0;
            if (minutos == 59) {
                minutos = 0;
                if (segundos == 59)
                    segundos = 0;
                 else
                     segundos++;
            } else {
                minutos++;
            }
        } else {
            if (minutos == 59) {
                hora++;
                minutos = 0;
            } else {
                hora++;
                minutos++;
            }
        }
    }
}