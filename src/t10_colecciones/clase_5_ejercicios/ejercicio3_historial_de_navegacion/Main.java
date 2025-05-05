package t10_colecciones.clase_5_ejercicios.ejercicio3_historial_de_navegacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> historial = new ArrayList<>();
        int posicionActual = 0;
        while (true) {
            System.out.println("""
                    /\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\
                    \\            HISTORIAL DE BESTCHROME           /
                    /    1. Visitar una nueva página               \\
                    \\    2. Retroceder                             /
                    /    3. Avanzar                                \\
                    \\    4. Mostrar historial completo             /
                    /    5. Mostrar página actual                  \\
                    \\    6. Eliminar URL del historial             /
                    /    7. Buscar si una URL ha sido visitada     \\
                    \\    8. Limpiar el historial                   /
                    /    0. Salir                                  \\
                    \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 8);
            if (eleccion == 0) {
                System.out.println("Nos vemos en el ejercicio del censo de población.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.println("1. Visitar una nueva página");
                    while (true) {
                        System.out.print("URL: ");
                        String url = sc.nextLine();
                        if (verificarURL(url)) {
                            historial.add(url);
                            posicionActual = historial.size();
                            System.out.println("Página añadida al historial. Ahora mismo estás en la posición número " + posicionActual);
                            break;
                        } else
                            System.out.println("Introduce una web válida (todo minúsculas, www., .com, .es...");
                    }
                }
                case 2 -> {
                    System.out.println("2. Retroceder");
                    if (posicionActual == 0) {
                        System.out.println("Aún no hay páginas en el historial");
                    } else if (posicionActual == 1) {
                        System.out.println("Estas en la primera página. No se puede retroceder más.");
                    } else {
                        posicionActual--;
                        System.out.println("Has retrocedido a la página anterior.");
                        System.out.println("Posición actual: " + posicionActual);
                        System.out.println("Web actual: " + historial.get(posicionActual - 1));
                    }
                }
                case 3 -> {
                    System.out.println("3. Avanzar");
                    if (posicionActual == 0) {
                        System.out.println("Aún no hay páginas en el historial");
                    } else if (posicionActual == historial.size()) {
                        System.out.println("Estás en la última página. No se puede avanzar más.");
                    } else {
                        posicionActual++;
                        System.out.println("Has avanzado a la página siguiente.");
                        System.out.println("Posición actual: " + posicionActual);
                        System.out.println("Web actual: " + historial.get(posicionActual - 1));
                    }
                }
                case 4 -> {
                    System.out.println("4. Mostrar historial completo en orden cronológico");
                    if (historial.isEmpty()) {
                        System.out.println("No hay URLs en el historial.");
                    } else {
                        int contador = 0;
                        for (String url : historial) {
                            contador++;
                            System.out.println("Posición: " + contador + ". URL: " + url);
                        }
                    }
                }
                case 5 -> {
                    System.out.println("5. Mostrar página actual");
                    if (posicionActual == 0) {
                        System.out.println("Aún no has visitado ninguna URL");
                    } else
                        System.out.println("Posición: " + posicionActual + ". URL: " + historial.get(posicionActual - 1));
                }
                case 6 -> {
                    System.out.println("6. Eliminar URL del historial");
                    if (historial.isEmpty()) {
                        System.out.println("No hay ninguna URL en el historial.");
                    } else {
                        System.out.print("URL: ");
                        String urlBorrar = sc.nextLine();
                        // Comprobar que está en el historial
                        if (!historial.contains(urlBorrar)) {
                            System.out.println("Esa URL no se encuentra en el historial.");
                        } else {
                            // Comprobar si la url es justo la que está en la posición actual
                            if (urlBorrar.equals(historial.get(posicionActual-1))) {
                                System.out.println("No puedes borrar la URL del historial que estás visitando actualmente.");
                            } else {
                                // Borrar todas las veces que esté la url en el historial
                                // No se puede usar removeAll() ya que afecta a la posición actual
                                // Esta tiene que cambiar solo si va después de la posición borrada
                                int indiceActual = 0;
                                Iterator<String> it = historial.iterator();
                                while (it.hasNext()) {
                                    String url = it.next();
                                    if (url.equals(urlBorrar)) {
                                        if (indiceActual < posicionActual - 1) {
                                            it.remove();
                                            posicionActual--;
                                        } else {
                                            it.remove();
                                        }
                                    } else {
                                        indiceActual++;
                                    }
                                }
                                System.out.println("URL " + urlBorrar + " borrada del historial.");
                            }
                        }
                    }
                }

                case 7 -> {
                    System.out.println("7. Buscar si una URL ha sido visitada");
                    if (historial.isEmpty()){
                        System.out.println("El historial está vació.");
                    } else {
                        System.out.print("URL: ");
                        String urlVisitada = sc.nextLine();
                        if (historial.contains(urlVisitada)){
                            System.out.println("Si. Esa web está en el historial. Ya ha sido visitada.");
                        } else
                            System.out.println("No. " + urlVisitada + " no está en el historial.");
                    }
                }
                case 8 -> {
                    System.out.println("8. Limpiar el historial");
                    if (historial.isEmpty()){
                        System.out.println("El historial ya está vacío.");
                    } else {
                        historial.clear();
                        System.out.println("Historial borrado.");
                    }
                }
            }
        }
    }

    private static boolean verificarURL(String url) {
        // Comprobar si tiene mayúsculas, espacios, si comienza con www. o si termina con .com o .es
        return url.equals(url.toLowerCase()) && !url.contains(" ") && url.startsWith("www.") && (url.endsWith(".com") || url.endsWith(".es"));
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