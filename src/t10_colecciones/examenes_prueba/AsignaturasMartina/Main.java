package t10_colecciones.examenes_prueba.AsignaturasMartina;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Alumno> alumnos = new TreeSet<>();

        // Añadir 5 alumnos
        List<NotasAlumno> notas1 = new ArrayList<NotasAlumno>();
        notas1.add(new NotasAlumno(new Asignatura(1, "Matemáticas"), 7));
        notas1.add(new NotasAlumno(new Asignatura(2, "Lengua"), 5));
        alumnos.add(new Alumno(1, "Daniel del Campo", notas1));

        List<NotasAlumno> notas2 = new ArrayList<NotasAlumno>();
        notas2.add(new NotasAlumno(new Asignatura(3, "Historia"), 4));
        notas2.add(new NotasAlumno(new Asignatura(1, "Matemáticas"), 6));
        alumnos.add(new Alumno(2, "Víctor", notas2));

        List<NotasAlumno> notas3 = new ArrayList<NotasAlumno>();
        notas3.add(new NotasAlumno(new Asignatura(1, "Matemáticas"), 8));
        notas3.add(new NotasAlumno(new Asignatura(3, "Historia"), 8));
        alumnos.add(new Alumno(3, "Daniel Gómez", notas3));

        List<NotasAlumno> notas4 = new ArrayList<NotasAlumno>();
        notas4.add(new NotasAlumno(new Asignatura(2, "Lengua"), 10));
        notas4.add(new NotasAlumno(new Asignatura(1, "Matemáticas"), 6));
        alumnos.add(new Alumno(4, "Martina", notas4));

        List<NotasAlumno> notas5 = new ArrayList<NotasAlumno>();
        notas5.add(new NotasAlumno(new Asignatura(3, "Historia"), 7));
        notas5.add(new NotasAlumno(new Asignatura(2, "Lengua"), 9));
        alumnos.add(new Alumno(5, "Alma", notas5));

        int opcion;
        do {
            System.out.println("=================================================");
            System.out.println("GESTIÓN DE ALUMNOS");
            System.out.println("1. Añadir nuevo alumno sin notas");
            System.out.println("2. Añadir notas a un alumno");
            System.out.println("3. Listar todos los alumnos");
            System.out.println("4. Reorganizar la lista de alumnos");
            System.out.println("5. Nota media más repetida");
            System.out.println("6. Ver aprobados y suspensos por alumno");
            System.out.println("0. Salir");
            System.out.println("=================================================");

            opcion = pedirNumeroEntero("Elige una opción: ", 0, 6);

            switch (opcion) {
                case 0:
                    System.out.println("Hasta otra.");
                    break;
                case 1:
                    int id = pedirNumeroEntero("ID del alumno: ");
                    System.out.print("Nombre del alumno: ");
                    String nombre = sc.nextLine();
                    alumnos.add(new Alumno(id, nombre, new ArrayList<NotasAlumno>()));
                    System.out.println("Alumno añadido.");
                    break;
                case 2:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos. Añádelos primero.");
                        break;
                    }

                    int idBuscado = pedirNumeroEntero("ID del alumno al que añadir notas: ");
                    Alumno alumnoEncontrado = null;
                    for (Alumno a : alumnos) {
                        if (a.getIdalumno() == idBuscado) {
                            alumnoEncontrado = a;
                            break;
                        }
                    }

                    if (alumnoEncontrado == null) {
                        System.out.println("Alumno no encontrado.");
                        break;
                    }

                    int numNotas = pedirNumeroEntero("¿Cuántas notas quieres añadir? ", 1);
                    for (int i = 0; i < numNotas; i++) {
                        System.out.println("Nota " + (i + 1) + ":");
                        int idAsig = pedirNumeroEntero("ID de la asignatura: ");
                        System.out.print("Nombre de la asignatura: ");
                        String nomAsig = sc.nextLine();
                        int nota = pedirNumeroEntero("Nota (0-10): ", 0, 10);
                        alumnoEncontrado.insertaNota(new NotasAlumno(new Asignatura(idAsig, nomAsig), nota));
                    }
                    System.out.println("Notas añadidas.");
                    break;
                case 3:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos.");
                    } else {
                        for (Alumno a : alumnos) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 4:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos.");
                        break;
                    }

                    List<Alumno> listaOrdenada = new ArrayList<>(alumnos);
                    System.out.println("1. Ordenar por nombre");
                    System.out.println("2. Mayor nota media");
                    System.out.println("3. Mayor número de suspensos");
                    int tipoOrden = pedirNumeroEntero("Elige tipo de orden: ", 1, 3);

                    if (tipoOrden == 1) {
                        Collections.sort(listaOrdenada, new Comparator<Alumno>() {
                            @Override
                            public int compare(Alumno a1, Alumno a2) {
                                return a1.getNombre().compareTo(a2.getNombre());
                            }
                        });
                    } else if (tipoOrden == 2) {
                        Collections.sort(listaOrdenada, new Comparator<Alumno>() {
                            @Override
                            public int compare(Alumno a1, Alumno a2) {
                                return Double.compare(a2.notaMedia(), a1.notaMedia());
                            }
                        });
                    } else if (tipoOrden == 3) {
                        Collections.sort(listaOrdenada, new Comparator<Alumno>() {
                            @Override
                            public int compare(Alumno a1, Alumno a2) {
                                return Integer.compare(a2.numeroSuspensos(), a1.numeroSuspensos());
                            }
                        });
                    }

                    for (Alumno a : listaOrdenada) {
                        System.out.println(a);
                    }
                    break;
                case 5:
                    List<Double> medias = new ArrayList<Double>();
                    for (Alumno a : alumnos) {
                        medias.add(a.notaMedia());
                    }

                    double masRepetida = 0;
                    int maxFrecuencia = 0;
                    for (int i = 0; i < medias.size(); i++) {
                        int frecuencia = 0;
                        for (int j = 0; j < medias.size(); j++) {
                            if (medias.get(i).equals(medias.get(j))) {
                                frecuencia++;
                            }
                        }
                        if (frecuencia > maxFrecuencia) {
                            maxFrecuencia = frecuencia;
                            masRepetida = medias.get(i);
                        }
                    }

                    if (maxFrecuencia <= 1) {
                        System.out.println("Todas las medias son distintas.");
                    } else {
                        System.out.printf("La nota media más repetida es %.2f (%d veces)\n", masRepetida, maxFrecuencia);
                    }
                    break;
                case 6:
                    for (Alumno a : alumnos) {
                        System.out.println(a.getNombre() + ": " + a.numeroAprobados() + " aprobados, " + a.numeroSuspensos() + " suspensos.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
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
                System.out.println("Introduce un número válido.");
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
                    System.out.println("Debe ser mayor o igual que " + minimo + ".");
                }
            } else {
                System.out.println("Introduce un número válido.");
                sc.nextLine();
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
                    System.out.println("Debe estar entre " + minimo + " y " + maximo + ".");
                }
            } else {
                System.out.println("Introduce un número válido.");
                sc.nextLine();
            }
        }
    }
}
