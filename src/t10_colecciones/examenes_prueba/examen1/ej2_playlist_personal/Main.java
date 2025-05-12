package t10_colecciones.examenes_prueba.examen1.ej2_playlist_personal;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Cancion> listaCanciones = new ArrayList<>(); // Elijo un List, ya que puede haber canciones repetidas y se debe ir añadiendo al final de la lista. ArrayList ya que no se nota diferencia entre ninguna de sus dos implementaciones en este tamaño de lista
        while (true) {
            System.out.println("""
                    ==============================================
                    PLAYLIST PERSONAL
                    1. Añadir una canción al final y también en una posición concreta
                    2. Sustituir una canción de un índice dado
                    3. Obtener y mostrar la canción que esté en la posición X
                    4. Buscar la primera y la última aparición de un mismo título
                    5. Eliminar por índice y por instancia de Canción (usando equals())
                    6. Invertir el orden y luego barajar la lista
                    7. Ordenar alfabéticamente por título
                    8. Convertir la lista a un array y reconstruirla a partir de ese array
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 8);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    Cancion cancion = pedirCancion();
                    System.out.println("1. Añadir al final de la lista");
                    System.out.println("2. Añadir en una posición concreta de la lista");
                    int posicion = pedirNumeroEntero("Elección: ", 1, 2);
                    switch (posicion) {
                        case 1 -> {
                            listaCanciones.add(cancion);
                            System.out.println("Canción añadida al final de la lista.");
                        }
                        case 2 -> {
                            int posicionLista = pedirNumeroEntero("Posición: ", 0, listaCanciones.size());
                            listaCanciones.add(posicionLista, cancion);
                            System.out.println("Canción añadida en la posición indicada.");
                        }
                    }
                }
                case 2 -> {
                    if (listaCanciones.isEmpty()) {
                        System.out.println("La lista de canciones está vacía.");
                    } else {
                        int indice = pedirNumeroEntero("Índice: ", 0, listaCanciones.size());
                        listaCanciones.set(indice, pedirCancion());
                    }
                }
                case 3 -> {
                    if (listaCanciones.isEmpty()) {
                        System.out.println("La lista de canciones está vacía.");
                    } else {
                        int indice = pedirNumeroEntero("Índice: ", 0, listaCanciones.size());
                        System.out.println(listaCanciones.get(indice));
                    }
                }
                case 4 -> {
                    if (listaCanciones.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.print("Título a buscar: ");
                        String titulo = sc.nextLine();

                        int primera = -1;
                        int ultima = -1;

                        for (int i = 0; i < listaCanciones.size(); i++) {
                            if (listaCanciones.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                                if (primera == -1) primera = i;
                                ultima = i;
                            }
                        }

                        if (primera == -1) {
                            System.out.println("No se ha encontrado ninguna canción con ese título.");
                        } else {
                            System.out.println("Primera aparición en posición: " + primera);
                            System.out.println(listaCanciones.get(primera));
                            System.out.println("Última aparición en posición: " + ultima);
                            System.out.println(listaCanciones.get(ultima));
                        }
                    }
                }
                case 5 -> {
                    System.out.println("1. Por índice.");
                    System.out.println("2. Por Canción.");
                    int opcion = pedirNumeroEntero("Elección: ",1,2);
                    if (opcion == 1){
                        int indiceCancion = pedirNumeroEntero("Índice: ", 0, listaCanciones.size());
                        System.out.println(listaCanciones.remove(indiceCancion) + " - Canción eliminada.");
                    } else {
                        Cancion cancion = pedirCancion();
                        if (listaCanciones.remove(cancion)){
                            System.out.println("Canción eliminada.");
                        } else {
                            System.out.println("Canción no encontrada.");
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Lista con el orden original: ");
                    for (Cancion cancion : listaCanciones){
                        System.out.println(cancion);
                    }

                    System.out.println("Lista invertida: ");
                    Collections.reverse(listaCanciones);
                    for (Cancion cancion : listaCanciones){
                        System.out.println(cancion);
                    }

                    System.out.println("Lista barajada: ");
                    Collections.shuffle(listaCanciones);
                    for (Cancion cancion : listaCanciones){
                        System.out.println(cancion);
                    }
                }
                case 7 -> {
                    Comparator<Cancion> ctTitulo = new Comparator<Cancion>() {
                        @Override
                        public int compare(Cancion o1, Cancion o2) {
                            return o1.getTitulo().compareTo(o2.getTitulo());
                        }
                    };
                    System.out.println("Ordenadas por canción: ");
                    listaCanciones.sort(ctTitulo);
                    for (Cancion cancion : listaCanciones){
                        System.out.println(cancion);
                    }
                }
                case 8 -> {
                    Cancion[] arrayCanciones = listaCanciones.toArray(new Cancion[0]);
                    List<Cancion> nuevaLista = new ArrayList<>(List.of(arrayCanciones));
                    for (Cancion c : nuevaLista){
                        System.out.println(c);
                    }
                }
            }
        }
    }

    private static Cancion pedirCancion() {
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Artista: ");
        String artista = sc.nextLine();
        int duracion = pedirNumeroEntero("Duración: ", 0);
        return new Cancion(titulo, artista, duracion);
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
}