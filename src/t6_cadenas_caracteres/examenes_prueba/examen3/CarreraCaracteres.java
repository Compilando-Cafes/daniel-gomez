package t6_cadenas_caracteres.examenes_prueba.examen3;

import java.util.Arrays;
import java.util.Scanner;

public class CarreraCaracteres {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Usuario elige los caracteres que compiten
        System.out.print("Introduce el primer carácter: ");
        char caracter1 = sc.nextLine().charAt(0);
        System.out.print("Introduce el segundo carácter: ");
        char caracter2 = sc.nextLine().charAt(0);
        comenzarCarrera(caracter1, caracter2);

    }

    public static void comenzarCarrera(char caracter1, char caracter2) {
        System.out.println("Línea de partida:");
        // Crear pistas y rellenarlas
        char[] pistaCaracter1 = new char[20];
        char[] pistaCaracter2 = new char[20];
        Arrays.fill(pistaCaracter1, '.');
        Arrays.fill(pistaCaracter2, '.');
        pistaCaracter1[0] = caracter1;
        pistaCaracter2[0] = caracter2;

        // Mostrar posiciones iniciales
        mostrarArray(pistaCaracter1);
        mostrarArray(pistaCaracter2);

        // Turnos
        int turno = 0;
        while (true) {
            turno++;
            System.out.println("Turno " + turno);

            // Avance aleatorio de cada jugador
            int avance1 = pedirNumeroAleatorio(1, 3);
            int avance2 = pedirNumeroAleatorio(1, 3);

            // Buscar posiciónes de cada jugador
            int posicion1 = buscarEnArrayPosicion(pistaCaracter1, caracter1);
            int posicion2 = buscarEnArrayPosicion(pistaCaracter2, caracter2);

            // Intercambiar posiciones en cada tabla
            intercambiarPosicionesArray(pistaCaracter1, posicion1, avance1);
            intercambiarPosicionesArray(pistaCaracter2, posicion2, avance2);

            // Mostrar estado carrera
            mostrarArray(pistaCaracter1);
            mostrarArray(pistaCaracter2);

            // Fin
            if (posicion1 + avance1 >= pistaCaracter1.length) {
                System.out.println("¡El ganador es A!");
                break;
            } else if (posicion2 + avance2 >= pistaCaracter2.length) {
                System.out.println("¡El ganador es B!");
                break;
            }
        }


    }

    private static void mostrarArray(char[] pistaCaracter1) {
        String tabla = String.valueOf(pistaCaracter1);
        System.out.println(tabla);
    }

    public static int pedirNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }


    public static void intercambiarPosicionesArray(char[] array, int posicion1, int avance) {
        int nuevaPosicion = posicion1 + avance;
        if (nuevaPosicion >= array.length) {
            nuevaPosicion = array.length - 1;
        }
        array[nuevaPosicion] = array[posicion1];
        array[posicion1] = '.';
    }

    public static int buscarEnArrayPosicion(char[] array, char valor) {
        int i = 0;
        while (i < array.length && array[i] != valor) {
            i++;
        }
        if (i < array.length) {
            return i;
        } else {
            return -1;
        }
    }
}