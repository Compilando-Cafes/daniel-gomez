package t7_clases.ejercicios.ejercicio4_calendario_con_eventos;

public class Calendario {
    private Dia[] diasDelMes;
    private int mesActual;

    Calendario() {
        this.diasDelMes = new Dia[31];
        for (int i = 0; i < diasDelMes.length; i++) {
            diasDelMes[i] = new Dia(i + 1, 1);
        }
        this.mesActual = 1;
    }

    public void cambiarMes() {
        if (mesActual == 12) {
            this.mesActual = 1;
        } else {
            this.mesActual++;
        }
        int numeroDias = 0;
        switch (this.mesActual) {
            case 1, 3, 5, 7, 8, 10, 12 -> numeroDias = 31;
            case 2 -> numeroDias = 28;
            case 4, 6, 9, 11 -> numeroDias = 30;
        }

        // Aquí se crea un nuevo array con la longitud que tenga el mes
        this.diasDelMes = new Dia[numeroDias];

        for (int i = 0; i < diasDelMes.length; i++) {
            diasDelMes[i] = new Dia(i + 1, this.mesActual);
        }
    }

    public void setEvento(int dia, String evento){
        switch (this.mesActual) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia>0 && dia<=31){
                    diasDelMes[dia-1].setEvento(evento);
                }
            }
            case 2 -> {
                if (dia>0 && dia <=28){
                    diasDelMes[dia-1].setEvento(evento);
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia>0 && dia <=30){
                    diasDelMes[dia-1].setEvento(evento);
                }
            }
        }
    }

    public void mostrarEventos(){
        for (Dia dia : diasDelMes) {
            dia.mostrarEvento();
        }
    }
}