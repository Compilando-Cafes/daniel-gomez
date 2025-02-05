package t7_clases.teoria.mostrar_hora;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Hora hora1 = new Hora(14, 30,5);
        hora1.queHoraEs();
        hora1.segundosPasados(59);
        hora1.queHoraEs();

        hora1.setHora(pedirNumeroEntero("Dime hora: "));
        hora1.setMinuto(pedirNumeroEntero("Dime minuto: "));
        hora1.setSegundo(pedirNumeroEntero("Dime segundo: "));

        System.out.println("Hora: " + hora1.getHora());
        System.out.println("Minuto: " + hora1.getMinuto());
        System.out.println("Segundo: " + hora1.getSegundo());

        hora1.queHoraEs();

    }
    public static int pedirNumeroEntero(String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}