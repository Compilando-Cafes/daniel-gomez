package t10_colecciones.clase_3_interfaces_list_set.ejercicio2_alumno;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Alumno> alumnos = new TreeSet<>();
        int opcion;
        do {
            System.out.println("_________________________________________________________________");
            System.out.println("1. Añadir nuevo alumno sin notas");
            System.out.println("2. Añadir notas a un alumno");
            System.out.println("3. Listar a todos los alumnos");
            System.out.println("4. Reorganizar la lista de alumnos");
            System.out.println("5. Obtener la nota media más repetida");
            System.out.println("6. Listar la cantidad de aprobados y suspensos de cada alumno");
            System.out.println("0. Salir");
            opcion = pedirNumeroEntero("Introducir opción: ");
            switch (opcion) {
                case 0 -> {
                    System.out.println("¡Adios!");
                }
                case 1 -> {
                    System.out.println("_________________________________________________");
                    System.out.println("\t1. Añadir nuevo alumno sin notas");
                    int id = pedirNumeroEntero("\tID alumno: ");
                    System.out.print("\tNombre del alumno: ");
                    String nombre = sc.nextLine();
                    alumnos.add(new Alumno(id, nombre));
                }
                case 2 -> {
                    System.out.println("_________________________________________________");
                    System.out.println("\t2. Añadir notas a un alumno");
                    if (alumnos.isEmpty()) {
                        System.out.println("\tNo hay alumnos añadidos. Añadirlos primero.");
                        break;
                    }
                    System.out.println("\tAlumnos disponibles:");
                    for (Alumno alumno : alumnos) {
                        System.out.println(alumno);
                    }

                    int idAlumno = pedirNumeroEntero("\tID del alumno al que quieres añadir las notas: ");
                    // Buscar si existe el alumno
                    Alumno alumnoElegido = null;
                    for (Alumno a : alumnos) {
                        if (a.getIdAlumno() == idAlumno) {
                            alumnoElegido = a;
                            break;
                        }
                    }
                    // Si no existe salir
                    if (alumnoElegido == null) {
                        System.out.println("\tAlumno no encontrado");
                        break;
                    }

                    // Inicializar la lista de notas comprobando que no lo está ya
                    if (alumnoElegido.getNotasAlumno().isEmpty()) {
                        alumnoElegido.setNotasAlumno(new ArrayList<>());
                    } else {
                        System.out.println("El alumno ya tiene las notas añadidas");
                        break;
                    }

                    int numeroNotas = pedirNumeroEntero("\t¿Cuantas notas quieres añadir? (mínimo 1): ", 1);

                    for (int i = 1; i <= numeroNotas; i++) {
                        System.out.println("\tNota número " + i + " de " + numeroNotas + ": ");
                        int idAsignatura = pedirNumeroEntero("\tID de asignatura: ", 1);
                        System.out.print("\tNombre de asignatura: ");
                        String nombreAsignatura = sc.nextLine();
                        int nota = pedirNumeroEntero("\tNota: ", 0, 10);

                        alumnoElegido.insertaNota(new NotasAlumno(new Asignatura(idAsignatura, nombreAsignatura), nota));
                    }
                    System.out.println("\tNotas añadidas a " + alumnoElegido.getNombre());
                }
                case 3 -> {
                    System.out.println("_________________________________________________");
                    System.out.println("\t3. Listar a todos los alumnos");
                    // Comprobar si la lista está vacía
                    if (alumnos.isEmpty()) {
                        System.out.println("\tNo hay alumnos añadidos a la lista. Añadirlos primero.");
                    } else {
                        for (Alumno alumno : alumnos) {
                            System.out.println(alumno);
                        }
                    }
                }
                case 4 -> {
                    System.out.println("_________________________________________________");
                    System.out.println("\t4. Reorganizar la lista de alumnos");
                    // Comprobar si hay alumnos en la lista
                    if (alumnos.isEmpty()) {
                        System.out.println("\tLa lista de alumnos está vacía. Añade alumnos primero.");
                        break;
                    }
                    // Como he puesto con un set ya se ordena automáticamente
                    // Para variar lo pondré que se muestre con otros órdenes distintos
                    int orden;
                    do {
                        System.out.println("\t1. Ordenar por ID de alumno.");
                        System.out.println("\t2. Ordenar por nombre");
                        System.out.println("\t3. Ordenar por mayor nota media");
                        System.out.println("\t4. Ordenar por menor nota media");
                        System.out.println("\t5. Ordenar por alumnos con mayor número de suspensos");
                        System.out.println("\t6. Ordenar por alumnos con mayor número de aprobados");
                        System.out.println("\t0. Salir");
                        orden = pedirNumeroEntero("\tElección: ", 0, 6);
                        switch (orden) {
                            case 0 -> {
                                System.out.println("Volviendo al menú principal");
                            }
                            case 1 -> {
                                System.out.println("________________________________________");
                                System.out.println("\tAlumnos ordenados por ID de alumno:");
                                for (Alumno alumno : alumnos) {
                                    System.out.println(alumno);
                                }
                            }
                            case 2 -> {
                                System.out.println("________________________________________");
                                System.out.println("\tAlumnos ordenados por nombre:");
                                // Convertir el set con un orden prefijado a un list que permite cambiarlo
                                List<Alumno> listaAlumnos = new ArrayList<>(alumnos);
                                listaAlumnos.sort(new Comparator<Alumno>() {
                                    @Override
                                    public int compare(Alumno o1, Alumno o2) {
                                        return o1.getNombre().compareTo(o2.getNombre());
                                    }
                                });
                                for (Alumno alumno : listaAlumnos) {
                                    System.out.println(alumno);
                                }
                            }
                            case 3 -> {
                                System.out.println("________________________________________");
                                System.out.println("\tAlumnos ordenados por mayor nota media:");
                                // Convertir el set con un orden prefijado a un list que permite cambiarlo
                                List<Alumno> listaAlumnos = new ArrayList<>(alumnos);
                                listaAlumnos.sort(new Comparator<Alumno>() {
                                    @Override
                                    public int compare(Alumno o1, Alumno o2) {
                                        return Double.compare(o1.notaMedia(), o2.notaMedia());
                                    }
                                }.reversed());
                                for (Alumno alumno : listaAlumnos) {
                                    System.out.println(alumno);
                                }
                            }
                            case 4 -> {
                                System.out.println("________________________________________");
                                System.out.println("\tAlumnos ordenados por menor nota media:");
                                // Convertir el set con un orden prefijado a un list que permite cambiarlo
                                List<Alumno> listaAlumnos = new ArrayList<>(alumnos);
                                listaAlumnos.sort(new Comparator<Alumno>() {
                                    @Override
                                    public int compare(Alumno o1, Alumno o2) {
                                        return Double.compare(o1.notaMedia(), o2.notaMedia());
                                    }
                                });
                                for (Alumno alumno : listaAlumnos) {
                                    System.out.println(alumno);
                                }
                            }
                            case 5 -> {
                                System.out.println("________________________________________");
                                System.out.println("\tAlumnos ordenados por mayor número de suspensos:");
                                // Convertir el set con un orden prefijado a un list que permite cambiarlo
                                List<Alumno> listaAlumnos = new ArrayList<>(alumnos);
                                listaAlumnos.sort(new Comparator<Alumno>() {
                                    @Override
                                    public int compare(Alumno o1, Alumno o2) {
                                        return Integer.compare(o1.numeroSuspensos(), o2.numeroSuspensos());
                                    }
                                }.reversed());
                                for (Alumno alumno : listaAlumnos) {
                                    System.out.println(alumno);
                                }
                            }
                            case 6 -> {
                                System.out.println("________________________________________");
                                System.out.println("\tAlumnos ordenados por mayor número de aprobados:");
                                // Convertir el set con un orden prefijado a un list que permite cambiarlo
                                List<Alumno> listaAlumnos = new ArrayList<>(alumnos);
                                listaAlumnos.sort(new Comparator<Alumno>() {
                                    @Override
                                    public int compare(Alumno o1, Alumno o2) {
                                        return Integer.compare(o1.numeroAprobados(), o2.numeroAprobados());
                                    }
                                }.reversed());
                                for (Alumno alumno : listaAlumnos) {
                                    System.out.println(alumno);
                                }
                            }
                            default -> System.out.println("\tElige una opción correcta.");
                        }
                    } while (orden != 0);
                }

                case 5 -> {
                    System.out.println("_________________________________________________");
                    System.out.println("\t5. Obtener la nota media más repetida");
                    // Comprobar si la lista está vacía
                    if (alumnos.isEmpty()) {
                        System.out.println("\tAún no hay alumnos en la lista. Añadirlo primero.");
                    } else {
                        // Crear una lista nueva y guardar todas las notas medias en ella y mostrarla
                        List<Double> notasMedias = new ArrayList<>();
                        for (Alumno alumno : alumnos) {
                            notasMedias.add(alumno.notaMedia());
                            System.out.printf("\tLa nota media de %s es: %,.2f\n", alumno.getNombre(), alumno.notaMedia());
                        }

                        // Buscar la nota más frecuente
                        double notaMasRepetida = 0;
                        int maximaFrecuencia = 0;
                        for (Double nota : notasMedias) {
                            int frecuencia = Collections.frequency(notasMedias, nota);
                            if (frecuencia > maximaFrecuencia) {
                                maximaFrecuencia = frecuencia;
                                notaMasRepetida = nota;
                            }
                        }

                        // Controlar que todas las notas no sean diferentes
                        if (maximaFrecuencia == 1) {
                            System.out.println("\tTodas las notas son distintas. No hay ninguna que se repita.");
                        } else {
                            System.out.printf("\tLa nota media que más se repite es: %,.2f. Se ha repetido %d veces.\n", notaMasRepetida, maximaFrecuencia);
                        }
                    }
                }

                case 6 -> {
                    System.out.println("_________________________________________________");
                    System.out.println("\t6. Listar la cantidad de aprobados y suspensos de cada alumno");
                    // Comprobar si está vacía la lista
                    if (alumnos.isEmpty()) {
                        System.out.println("\tAñade alumnos primero.");
                    } else {
                        for (Alumno alumno : alumnos) {
                            System.out.println("\t" + alumno.getNombre() + " tiene " + alumno.numeroAprobados() +
                                    " aprobada" + (alumno.numeroAprobados() == 1 ? "" : "s") + " y " +
                                    alumno.numeroSuspensos() + " suspendida" + (alumno.numeroSuspensos() == 1 ? "" : "s"));
                        }
                    }
                }
                default -> {
                    System.out.println("\tIntroduce una opción válida.");
                }
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