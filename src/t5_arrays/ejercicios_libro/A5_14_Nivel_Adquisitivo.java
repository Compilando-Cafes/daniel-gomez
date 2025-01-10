package t5_arrays.ejercicios_libro;

import java.util.Arrays;
import java.util.Scanner;

public class A5_14_Nivel_Adquisitivo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Aplicación para realizar encuestas estadísticas.");
        int cantidadSueldos = 0;
        double[] sueldos = new double[cantidadSueldos];
        while (true) {
            cantidadSueldos++;
            sueldos = Arrays.copyOf(sueldos, cantidadSueldos);
            double sueldo = pedirNumeroDouble("¿Cual es tu sueldo? (-1 para salir): ", -1);
            if (sueldo == -1) {
                break;
            }
            sueldos[cantidadSueldos - 1] = sueldo;
        }
        mostrarSueldosDecrecientes(sueldos);
        mostrarSueldoMaximoMinimo(sueldos);
        mostrarMediaSueldos(sueldos);
    }

    // haz una función para mostrar un array ordenado de mayor a menor
    private static void mostrarSueldosDecrecientes(double[] sueldos) {
        double[] sueldosDecrecientes = Arrays.copyOf(sueldos, sueldos.length);
        Arrays.sort(sueldosDecrecientes);
        for (int i = 0; i < sueldosDecrecientes.length / 2; i++) {
            double aux = sueldosDecrecientes[i];
            sueldosDecrecientes[i] = sueldosDecrecientes[sueldosDecrecientes.length - 1 - i];
            sueldosDecrecientes[sueldosDecrecientes.length - 1 - i] = aux;
        }
        System.out.println("Sueldos ordenados de forma decreciente: " + Arrays.toString(sueldosDecrecientes));
    }

    private static void mostrarSueldoMaximoMinimo(double[] tabla) {
        double mayor = tabla[0];
        double menor = tabla[0];
        for (int i = 1; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
            if (tabla[i] < menor) {
                menor = tabla[i];
            }
        }
        System.out.println("El sueldo más alto es: " + mayor);
        System.out.println("El sueldo más bajo es: " + mayor);

    }

    private static void mostrarMediaSueldos(double[] tabla) {
        double suma = 0.0;
        for (double v : tabla) {
            suma += v;
        }
        double media = suma / tabla.length;
        System.out.println("La media de todos los sueldos es: " + media);
    }

    public static double pedirNumeroDouble(String mensaje, int minimo) {
        double numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                numero = sc.nextDouble();
                if (numero >= minimo) {
                    return numero;
                } else {
                    System.out.println("Mínimo: " + minimo + ".");
                }
            } else {
                System.out.print(
                        "Introduce un valor correcto.");
                sc.nextLine();
            }
        }
    }
}