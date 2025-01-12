package t5_arrays.ejercicios_libro;

import java.util.Scanner;

public class A5_15_Notas_Alumnos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                ==============================================
                APLICACIÓN GESTORA DE NOTAS
                ==============================================""");

        // Se organizan en grupos compuestos por 5 personas cada uno
        // Preguntar por cuantos grupos de alumnos serán
        int numeroGrupos = pedirNumeroEntero("¿Cuántos grupos de 5 alumnos quieres introducir?: ", 1);

        // Tabla tridimensional que tendrá: número de grupos, 5 alumnos y 3 trimestres por alumno
        int[][][] tablaDatos = new int[numeroGrupos][5][3];
        double[] notasMediasPorGrupo = new double[numeroGrupos];

        // Introducir los datos
        for (int grupo = 0; grupo < tablaDatos.length; grupo++) {
            System.out.println("Grupo de alumnos número " + (grupo+1) + ":");
            int notaTotalGrupo = 0;

            for (int alumno = 0; alumno < tablaDatos[0].length; alumno++) {
                System.out.println("Alumno número " + (alumno+1));
                for (int trimestre = 0; trimestre < tablaDatos[grupo][alumno].length; trimestre++) {
                    tablaDatos[grupo][alumno][trimestre] = pedirNumeroEntero("Nota trimestre número " + (trimestre+1) + ": ", 0, 10);
                    notaTotalGrupo += tablaDatos[grupo][alumno][trimestre];
                }
            }
            notasMediasPorGrupo[grupo] = (double) notaTotalGrupo / 5;
        }

        // Mostrar resultados
        // Nota media de cada grupo
        System.out.println("Las notas medias de cada grupo de 5 alumnos son:");
        for (int i = 0; i < notasMediasPorGrupo.length; i++) {
            System.out.println("Nota media grupo número " + (i + 1) + ": " + notasMediasPorGrupo[i]);
        }

        // Nota media de un alumno escogido
        System.out.println("Dime de que alumno quieres saber la nota: ");
        int grupoAlumno = pedirNumeroEntero("Grupo: ", 1, numeroGrupos);
        int numeroAlumno = pedirNumeroEntero("Número de alumno (1 a 5): ", 1, 5);
        int totalAlumno = 0;
        for (int trimestre = 0; trimestre < 3; trimestre++) {
            totalAlumno += tablaDatos[grupoAlumno][numeroAlumno][trimestre];
        }
        double mediaAlumno = (double) totalAlumno/3;
        System.out.println("La nota media del alumno solicitado es: " + mediaAlumno);
    }


    public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("El número debe estar entre" + minimo + " y " + maximo + ".");
                }
            } else {
                System.out.print(
                        "Introduce un número válido.");
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
                if (numero >= minimo) {
                    return numero;
                } else {
                    System.out.println("El número debe ser mayor que " + minimo + ".");
                }
            } else {
                System.out.print(
                        "Introduce un número válido.");
                sc.nextLine();
            }
        }
    }
}