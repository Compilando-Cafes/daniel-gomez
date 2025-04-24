package t10_colecciones.clase_4_interfaz_map.ejercicio1_agenda;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Set<Integer>> agenda = new HashMap<>();
        while (true) {
            System.out.println("""
                    ==============================================
                    MINI AGENDA
                    1. Añadir nuevo contacto
                    2. Buscar contacto
                    3. Ver todos los contactos
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 3);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.println("1. Añadir nuevo contacto");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    if (agenda.containsKey(nombre)) {
                        System.out.print("Ese nombre ya está en la agenda. ¿Quieres continuar para sobreescribirlo?: ");
                        if (!sc.next().equalsIgnoreCase("si")) {
                            break;
                        }
                    }
                    int telefono = pedirNumeroEntero("Teléfono: ", 100000000, 999999999);
                    Set<Integer> listaTelefonos = new TreeSet<>();
                    listaTelefonos.add(telefono);
                    while (true) {
                        System.out.print("¿Quieres añadir más teléfonos?: ");
                        if (!sc.next().equalsIgnoreCase("si")) {
                            break;
                        }
                        telefono = pedirNumeroEntero("Teléfono: ", 100000000, 999999999);
                        if (listaTelefonos.contains(telefono)) {
                            System.out.println("El teléfono ya estaba añadido.");
                        } else {
                            listaTelefonos.add(telefono);
                        }
                    }
                    agenda.put(nombre, listaTelefonos);
                }
                case 2 -> {
                    System.out.println("2. Buscar contacto");
                    if (agenda.isEmpty()) {
                        System.out.println("La agenda está vacía.");
                    } else {
                        System.out.print("Dime el contacto que quieres buscar: ");
                        String nombre = sc.nextLine();
                        if (agenda.containsKey(nombre)) {
                            Set<Map.Entry<String, Set<Integer>>> contactos = agenda.entrySet();
                            for (Map.Entry<String, Set<Integer>> contacto : contactos) {
                                if (contacto.getKey().equals(nombre)) {
                                    System.out.println("NOMBRE: " + contacto.getKey() + mostrarTelefonos(contacto.getValue()));
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Contacto no encontrado.");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("3. Ver lista de todos los contactos");
                    if (agenda.isEmpty()) {
                        System.out.println("La agenda está vacía.");
                    } else {
                        Set<Map.Entry<String, Set<Integer>>> contactos = agenda.entrySet();
                        for (Map.Entry<String, Set<Integer>> contacto : contactos) {
                            System.out.println("NOMBRE: " + contacto.getKey() + mostrarTelefonos(contacto.getValue()));
                        }
                    }
                }
            }
        }
    }

    private static String mostrarTelefonos(Set<Integer> lista) {
        String resultado = "";
        if (!lista.isEmpty()) {
            int contador = 1;
            for (Iterator<Integer> it = lista.iterator(); it.hasNext(); ) {
                resultado += " TELÉFONO " + contador + ": " + formatoTelefono(it.next()) + " ";
                contador++;
            }
        }
        return resultado;
    }

    private static String formatoTelefono(Integer numero) {
        String textoNumero = String.valueOf(numero);
        String resultado = "";
        for (int i = 0; i < textoNumero.length(); i++) {
            if (i != 0 && i % 3 == 0) {
                resultado += "-";
            }
            resultado += textoNumero.charAt(i);
        }
        return resultado;
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