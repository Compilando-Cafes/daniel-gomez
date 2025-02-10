package t7_clases.ejercicios.ejercicio4_calendario_con_eventos;

public class Dia {
    private int dia;
    private int mes;
    private String evento;

    Dia(int dia, int mes){
        this.dia = dia;
        this.mes = mes;
        this.evento = null;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void mostrarEvento(){
        if (evento == null){
            System.out.println(this.dia + "/" + this.mes + ": No hay evento");
        } else {
            System.out.println(this.dia + "/" + this.mes + ": " + this.evento);
        }
    }

}