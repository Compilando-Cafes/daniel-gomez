package t6_cadenas_caracteres.examenes_prueba.examen5;

import java.util.Scanner;

public class Laberinto {
    static char[][] laberinto = {
            {'.', '.', '.', '#', '.'},
            {'.', '#', '.', '#', '.'},
            {'.', '#', '.', '.', '.'},
            {'.', '#', '#', '#', '.'},
            {'.', '.', '.', '.', 'X'}
    };
    static int jugadorFila = 0;
    static int jugadorColumna = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarLaberinto();
            System.out.println("Posición actual: [" + jugadorFila + "][" + jugadorColumna + "]");
            System.out.print("Introduce un movimiento (W/A/S/D) o Q para salir: ");
            char movimiento = sc.next().toUpperCase().charAt(0);

            if (movimiento == 'Q') {
                System.out.println("Has decidido abandonar el juego.");
                break;
            }

            moverJugador(movimiento);

            if (laberinto[jugadorFila][jugadorColumna] == 'X') {
                mostrarLaberinto();
                System.out.println("¡Has alcanzado la posición objetivo! ¡Felicidades!");
                break;
            }
        }
    }

    public static void mostrarLaberinto() {
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                if (i == jugadorFila && j == jugadorColumna) {
                    System.out.print("P ");
                } else {
                    System.out.print(laberinto[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void moverJugador(char movimiento) {
        int nuevaFila = jugadorFila;
        int nuevaColumna = jugadorColumna;

        switch (movimiento) {
            case 'W':
                nuevaFila--;
                break;
            case 'A':
                nuevaColumna--;
                break;
            case 'S':
                nuevaFila++;
                break;
            case 'D':
                nuevaColumna++;
                break;
            default:
                System.out.println("Movimiento no válido.");
                return;
        }

        if (nuevaFila >= 0 && nuevaFila < laberinto.length && nuevaColumna >= 0 && nuevaColumna < laberinto[0].length && laberinto[nuevaFila][nuevaColumna] != '#') {
            jugadorFila = nuevaFila;
            jugadorColumna = nuevaColumna;
        } else {
            System.out.println("Movimiento no permitido. Hay una pared o estás fuera del laberinto.");
        }
    }
}