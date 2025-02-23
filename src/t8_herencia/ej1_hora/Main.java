package t8_herencia.ej1_hora;

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(4,30);
        System.out.println(hora);
        for (int i = 0; i < 60; i++) {
            hora.inc();
        }
        System.out.println(hora.toString());

        HoraExacta horaExacta = new HoraExacta(4,3,6);
        HoraExacta horaExactaCopia = new HoraExacta(horaExacta.getHora(), horaExacta.getMinutos(), horaExacta.getSegundo());
        System.out.println(horaExacta);
        System.out.println(horaExactaCopia);

        // Avanzar un minuto
        for (int i = 0; i < 60; i++) {
            horaExacta.inc();
        }

        // Comparar los objetos después de avanzar un minuto
        System.out.println("¿Son iguales? " + (horaExacta.equals(horaExactaCopia)? "Si." : "No."));

        System.out.println(hora);
        System.out.println(horaExacta);
        System.out.println(horaExactaCopia);
    }
}