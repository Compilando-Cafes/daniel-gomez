package t7_clases.ejercicios.ejercicio2_mando_distancia;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MandoADistancia television = new MandoADistancia();

        while (true) {
            System.out.println("""
                    Soy el mando a distancia, ¿qué quieres hacer? (-1 para salir)
                        1. Encender la televisión / Apagar la televisión
                        2. Subir Volumen
                        3. Bajar Volumen
                        4. Cambiar canal (uno hacia delante)
                        5. Cambiar canal (uno hacia atrás)
                    """);
            int eleccion = pedirNumeroEntero("Elección: ", -1, 5);

            switch (eleccion){
                case -1 -> {
                    System.out.println("Eso es, deja el mando y la tele y ve a hacer ejercicios de programación. ;-)");
                    return;
                }
                case 0 -> {
                    System.out.println("Introduce un valor entre 1 y 5. -1 para salir.");
                }
                case 1 -> {
                    if (television.getEstado().equals(Estado.APAGADO.name())){
                        television.encenderTelevision();
                    } else{
                        television.apagarTelevision();
                    }
                }
                case 2 -> {
                    television.incrementarVolumen();
                }
                case 3 -> {
                    television.disminuirVolumen();
                }
                case 4 -> {
                    television.siguienteCanal();
                }
                case 5 -> {
                    television.anteriorCanal();
                }
            }
        }

    }

    public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}