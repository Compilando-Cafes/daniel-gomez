package t5_arrays.ejercicios_libro;

import java.util.Arrays;
import java.util.Scanner;

public class A5_19_Dorsales {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        llegadaAMeta();
    }

    public static void llegadaAMeta() {
        System.out.println("""
                =======================================================
                LLEGADA A META
                =======================================================
                """);
        int[] corredores = dorsalesEnMeta();
        System.out.println("_________________________________________________________");
        corredores = cambiosResultados(corredores, 1, "CORREDORES MENORES DE EDAD", "menor de edad");
        System.out.println("_________________________________________________________");
        corredores = cambiosResultados(corredores, 2, "POSITIVOS EN EL TEST ANTIDOPAJE", "positivo test antidopaje");
        System.out.println("_________________________________________________________");
        corredores = cambiosResultados(corredores, 3, "QUE NO HAN PAGADO LA INSCRIPCIÓN", "no inscrito");
        System.out.println("_________________________________________________________");

        // Resultados finales
        System.out.println("\nY LOS RESULTADOS SON:");
        if (corredores.length > 2) {
            System.out.println("\nMEDALLA DE BRONCE PARA...");
            System.out.println("\tEl dorsal número: " + corredores[2]);
        }
        if (corredores.length > 1) {
            System.out.println("\nMEDALLA DE PLATA PARA...");
            System.out.println("\tEl dorsal número: " + corredores[1]);
        }
        if (corredores.length > 0) {
            System.out.println("\nMEDALLA DE ORO PARA...");
            System.out.println("\tEl dorsal número: " + corredores[0]);
        } else {
            System.out.println("\tNo hay corredores, no hay medallas...");
        }
    }

    // Función para los que no han pagado la inscripción
    public static int[] moverAlUltimoPuesto(int[] tabla, int posicion) {
        // Controlar que no sea el último (posición 0)
        if (posicion > 0) {

            // Guardar el valor
            int aux = tabla[posicion];

            // Mover un puesto para arriba a los que estaban antes
            for (int i = posicion; i < tabla.length - 1; i++) {
                tabla[i] = tabla[i + 1];
            }

            // Poner el último el dorsal
            tabla[tabla.length - 1] = aux;
        }

        // Mostrar el cambio realizado
        System.out.println("\tLa clasificación va así: " + Arrays.toString(tabla));

        return tabla;

    }

    // Función para positivos en el test antidopaje
    public static int[] eliminarUnPuesto(int tabla[], int posicion) {
        // Mover todos los elementos después de posición un puesto más arriba
        for (int i = posicion; i < tabla.length - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        // Hacer la tabla un puesto más pequeña eliminando el último
        tabla = Arrays.copyOf(tabla, tabla.length - 1);

        // Mostrar el cambio realizado
        System.out.println("\tLa clasificación va así: " + Arrays.toString(tabla));

        return tabla;
    }

    // Función para dorsales menores de edad
    public static int[] subirUnPuesto(int tabla[], int posicion) {
        // Moverlo un puesto hacia arriba en la tabla
        // Controlar que no sea el primero
        if (posicion > 0) {
            int aux = tabla[posicion - 1];
            tabla[posicion - 1] = tabla[posicion];
            tabla[posicion] = aux;
        }

        // Mostrar el cambio realizado
        System.out.println("\tLa clasificación va así: " + Arrays.toString(tabla));

        return tabla;

    }

    // Función para ir introduciendo cambios en los resultados
    public static int[] cambiosResultados(int[] tabla, int funcion, String mensaje1, String mensaje2) {
        System.out.println("\nAHORA DIME LOS DORSALES DE LOS " + mensaje1);
        System.out.println("Dorsales disponibles: " + Arrays.toString(tabla));

        while (true) {
            int dorsal = pedirNumeroEntero("\tDorsal " + mensaje2 + " (-1 salir): ", -1);
            int posicion = busquedaTablaNoOrdenada(tabla, dorsal);

            // Controlar salida
            if (dorsal == -1) {
                return tabla;
            }

            // Controlar que el dorsal elegido está en la lista
            if (posicion == -1) {
                System.out.println("\tIntroduce un dorsal válido.");
            } else {

                switch (funcion) {
                    case 1 -> {
                        tabla = subirUnPuesto(tabla, posicion);
                    }
                    case 2 -> {
                        tabla = eliminarUnPuesto(tabla, posicion);
                    }
                    case 3 -> {
                        tabla = moverAlUltimoPuesto(tabla, posicion);
                    }
                }
            }
        }

    }

    // Función para hacer la tabla con todos los corredores que han llegado a meta
    public static int[] dorsalesEnMeta() {
        int[] corredores = new int[0];
        System.out.println("Introduce los dorsales en el orden en que han llegado (-1 salir). ");

        while (true) {
            int dorsal = pedirNumeroEntero("\tDorsal número: ", -1);

            // Control de salida
            if (dorsal == -1) {
                if (corredores.length == 0) {
                    System.out.println("\tAntes de salir introduce al menos un dorsal.");
                } else {
                    break;
                }
            } else {
                // Verificar si el dorsal ya existe en la tabla
                boolean existe = false;
                for (int corredor : corredores) {
                    if (corredor == dorsal) {
                        existe = true;
                        break;
                    }
                }
                if (existe) {
                    System.out.println("\tEste dorsal ya lo has puesto antes. No puede haber repetidos.");
                } else {

                    // Si no está, agrandar la tabla e ir añadiendo los números
                    corredores = Arrays.copyOf(corredores, corredores.length + 1);
                    corredores[corredores.length - 1] = dorsal;
                    System.out.println("\tDorsales hasta el momento: " + Arrays.toString(corredores));
                }
            }
        }

        return corredores;
    }

    public static int busquedaTablaNoOrdenada(int[] tabla, int valorABuscar) {
        int posicion = -1;
        for (int i = 0; i < tabla.length; i++) {
            if (valorABuscar == tabla[i]) {
                posicion = i;
                break;
            }
        }
        return posicion;
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
                    System.out.println("\tIntroduce un número mayor que " + minimo + ".");
                }
            } else {
                System.out.print("\tIntroduce un número correcto. ");
                sc.nextLine();
            }
        }
    }
}