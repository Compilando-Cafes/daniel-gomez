package t7_clases.ejercicios.ejercicio4_calendario_con_eventos;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Calendario calendario = new Calendario();
        calendario.mostrarEventos();
        System.out.println();

        calendario.cambiarMes();

        calendario.setEvento(10, "Estudiar programación");
        calendario.setEvento(11, "Seguir estudiando programación");
        calendario.setEvento(12, "Continuar estudiando programación");
        calendario.setEvento(13, "Sin parar de estudiar programación");
        calendario.setEvento(14, "Examen de programación");

        calendario.mostrarEventos();
    }
}