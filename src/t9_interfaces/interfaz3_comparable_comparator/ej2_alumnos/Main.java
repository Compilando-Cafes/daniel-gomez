package t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos;

import com.sun.management.UnixOperatingSystemMXBean;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2000, 2,3);
        LocalDate fecha2 = LocalDate.of(1980, 12,31);
        LocalDate fecha3 = LocalDate.of(1960, 5,5);
        LocalDate fecha4 = LocalDate.of(1990, 1,8);
        LocalDate fecha5 = LocalDate.of(1970, 7,23);

        Alumno[] alumnos = {
                new Alumno("Manolo", "García", fecha1, LocalDate.now().getYear()-fecha1.getYear(), 7.5, 5),
                new Alumno("Alejandro", "Sanz", fecha2, LocalDate.now().getYear()-fecha2.getYear(), 5, 4),
                new Alumno("Ana", "Torroja", fecha3, LocalDate.now().getYear()-fecha3.getYear(), 9, 6),
                new Alumno("Amaia", "Montero", fecha4, LocalDate.now().getYear()-fecha4.getYear(), 3, 7),
                new Alumno("Lola", "Flores", fecha5, LocalDate.now().getYear()-fecha5.getYear(), 8.3, 3)
        };

        while (true) {
            System.out.println("""
                    ==============================================
                    ORDEN DE LA LISTA DE ALUMNOS
                    1. Sin ordenar.
                    2. Por edad (mayor a más joven).
                    3. Por fecha de nacimiento (mayor a más joven).
                    4. Por apellido (a-z).
                    5. Por nombre (a-z).
                    6. Comparar dos alumnos.
                    0. Salir.
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 6);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.println("ALUMNOS SIN ORDENAR:");
                }
                case 2 -> {
                    System.out.println("ALUMNOS ORDENADOS POR EDAD");
                    CompararEdad ce = new CompararEdad();
                    Comparator c = ce.reversed();
                    Arrays.sort(alumnos, c);
                }
                case 3 -> {
                    System.out.println("ALUMNOS ORDENADOS POR FECHA DE NACIMIENTO");
                    CompararFechaNacimiento cfn = new CompararFechaNacimiento();
                    Arrays.sort(alumnos, cfn);
                }
                case 4 -> {
                    System.out.println("ALUMNOS ORDENADOS POR APELLIDO");
                    CompararApellido ca = new CompararApellido();
                    Arrays.sort(alumnos, ca);
                }
                case 5 -> {
                    System.out.println("ALUMNOS ORDENADOS POR NOMBRE");
                    CompararNombre cn = new CompararNombre();
                    Arrays.sort(alumnos, cn);
                }
                case 6 -> {
                    System.out.println("COMPARAR DOS ALUMNOS");
                    int posAlumno1 = pedirNumeroEntero("Dime un alumno del 1 al 5: ", 1, 5)-1;
                    int posAlumno2 = pedirNumeroEntero("Dime un alumno del 1 al 5: ", 1, 5)-1;
                    System.out.println(alumnos[posAlumno1].equals(alumnos[posAlumno2])?"Son iguales.": "No son iguales");
                }
            }
            System.out.println(eleccion!=6?Arrays.deepToString(alumnos):"");
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