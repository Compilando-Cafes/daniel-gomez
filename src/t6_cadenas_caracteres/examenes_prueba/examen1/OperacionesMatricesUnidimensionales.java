package t6_cadenas_caracteres.examenes_prueba.examen1;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesMatricesUnidimensionales {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int comprobarSiArrayCreado = 0;
        int[] matriz = new int[0];

        while (true) {
            System.out.println("""
                    ==============================================
                    Matrices unidimensionales
                    1. Crear array
                    2. Rellenar array
                    3. Calcular suma y promedio de los valores del array
                    4. Valor máximo y mínimo del array
                    5. Invertir array
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 5);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    comprobarSiArrayCreado = 1;
                    matriz = crearArray();
                    System.out.println("Array creado.");
                }
                case 2 -> {
                    // Comprobar primero si el array ha sido creado
                    if (comprobarSiArrayCreado == 0) {
                        System.out.println("Primero debes crear un array.");
                    } else {
                        rellenarArray(matriz);
                        System.out.println("Array rellenado.");
                        System.out.println(Arrays.toString(matriz));
                        comprobarSiArrayCreado = 2;

                    }
                }
                case 3 -> {
                    if (comprobarSiArrayCreado < 2) {
                        System.out.println("Primero debes crear un array y rellenarlo.");
                    } else {
                        mostrarSumaYPromedioArray(matriz);
                    }

                }
                case 4 -> {
                    if (comprobarSiArrayCreado < 2) {
                        System.out.println("Primero debes crear un array y rellenarlo.");
                    } else {
                        mostrarMaximoMinimoArray(matriz);
                    }
                }
                case 5 -> {
                    if (comprobarSiArrayCreado<2) {
                        System.out.println("Primero debes crear un array y rellenarlo.");
                    } else {
                        invertirArray(matriz);
                    }
                }
            }
        }
    }

    public static void invertirArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void mostrarMaximoMinimoArray(int[] matriz) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] > max) {
                max = matriz[i];
            }
            if (matriz[i] < min) {
                min = matriz[i];
            }
        }
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }

    private static void mostrarSumaYPromedioArray(int[] matriz) {
        int suma = sumarArray(matriz);
        System.out.println("Suma: " + suma);

        double promedio = (double) suma / matriz.length;
        System.out.println("Promedio: " + promedio);
    }

    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    private static void rellenarArray(int[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = pedirNumeroEntero("Introduce el valor para la posición " + i + ": ");
        }
    }

    public static int[] crearArray() {
        int longitud = pedirNumeroEntero("Introduce la longitud del array: ", 1);
        return new int[longitud];
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

    public static int pedirNumeroEntero(String mensaje, int minimo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo) {
                    return numero;
                } else {
                    System.out.println("El número debe ser mayor que " + minimo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
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