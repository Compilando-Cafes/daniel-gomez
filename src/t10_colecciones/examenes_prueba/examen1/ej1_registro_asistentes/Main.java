package t10_colecciones.examenes_prueba.examen1.ej1_registro_asistentes;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> listaAsistentes = new LinkedHashSet<>(); // Elijo un Set ya que no debe repetirse y un LinkedHashSet para que los vaya añadiendo al final
        while (true) {
            System.out.println("""
                    ==============================================
                    REGISTRO ASISTENTES
                    1. Registrar el nombre de un asistente
                    2. Eliminar un asistente
                    3. Verificar si un nombre está apuntado
                    4. Contar cuántos asistentes hay actualmente
                    5. Obtener un array de String con todos los nombres
                    0. Vaciar todos los registros al cerrar inscripciones y salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 5);
            if (eleccion == 0) {
                listaAsistentes.clear();
                System.out.println("La lista se ha vaciado por completo.");
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    String nombre = obtenerNombre();
                    if (listaAsistentes.add(nombre)) {
                        System.out.println("Nombre añadido a la lista correctamente.");
                    } else
                        System.out.println("El asistente ya estaba en la lista.");
                }
                case 2 -> {
                    if (listaAsistentes.isEmpty()) {
                        System.out.println("La lista está vacía");
                    } else {
                        String nombre = obtenerNombre();
                        if (listaAsistentes.remove(nombre)) {
                            System.out.println("Asistente eliminado de la lista");
                        } else {
                            System.out.println("El asistente no se encontraba en la lista.");
                        }
                    }
                }
                case 3 -> {
                    String nombre = obtenerNombre();
                    if (listaAsistentes.contains(nombre)){
                        System.out.println("El nombre " + nombre + " figura en la lista.");
                    } else {
                        System.out.println("El nombre " + nombre + " no figura en la lista.");
                    }
                }
                case 4 -> {
                    if (listaAsistentes.isEmpty()){
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("Actualmente en la lista hay " + listaAsistentes.size() + " asistentes.");
                    }
                }
                case 5 -> {
                    // Método 1
                    int contador = 1;
                    Iterator<String> it = listaAsistentes.iterator();
                    while (it.hasNext()){
                        System.out.println("Asistente número " + contador + ": " + it.next());
                        contador++;
                    }

                    // Método 2
                    contador = 1;
                    for (String asistente : listaAsistentes){
                        System.out.println("Asistente número " + contador + ": " + asistente);
                        contador++;
                    }

                    // Método 3
                    String[] lista = listaAsistentes.toArray(new String[0]);
                    System.out.println("Array de asistentes: " + Arrays.toString(lista));
                }
            }
        }
    }

    private static String obtenerNombre() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        return nombre;
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