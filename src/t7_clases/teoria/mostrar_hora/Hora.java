package t7_clases.teoria.mostrar_hora;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor vacío
    Hora() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    // Constructor completo
    Hora(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 23)
            this.hora = hora;
        else
            this.hora = 0;

        if (minuto >= 0 && minuto <= 59)
            this.minuto = minuto;
        else
            this.minuto = 0;

        if (segundo >= 0 && segundo <= 59)
            this.segundo = segundo;
        else
            this.segundo = 0;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23)
            this.hora = hora;
        else
            this.hora = 0;
    }

    public int getHora() {
        return hora;
    }


    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59)
            this.minuto = minuto;
        else
            this.minuto = 0;
    }

    public int getMinuto() {
        return minuto;
    }


    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59)
            this.segundo = segundo;
        else
            this.segundo = 0;
    }

    public int getSegundo() {
        return segundo;
    }

    public void segundosPasados(int segundo){
        while (segundo>0){
            if (this.segundo == 59){
                this.segundo = 0;
                if (this.minuto == 59){
                    this.minuto = 0;
                    if (this.hora == 23){
                        this.hora = 0;
                    } else {
                        this.hora++;
                    }
                } else {
                    this.minuto++;
                }
            } else {
                this.segundo++;
            }
            segundo--;
        }
    }

    public void queHoraEs(){
        System.out.printf("Son las: %02d:%02d:%02d%n", hora, minuto, segundo);
    }
}