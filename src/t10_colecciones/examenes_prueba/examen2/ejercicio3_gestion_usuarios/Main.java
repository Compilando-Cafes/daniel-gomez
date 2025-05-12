package t10_colecciones.examenes_prueba.examen2.ejercicio3_gestion_usuarios;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> usuarios = new HashMap<>();

        while (true) {
            System.out.println("""
                    ==============================================
                    GESTIÓN DE USUARIOS
                    1. Añadir un nuevo usuario con su DNI y su nombre.
                    2. Modificar el nombre de un usuario ya existente.
                    3. Eliminar un usuario.
                    4. Mostrar el nombre de un usuario concreto.
                    5. Mostrar todos los pares dni → nombre.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 3);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    usuarios.put(dni, nombre);
                    System.out.println("Usuario añadido");
                }
                case 2 -> {
                    System.out.println("DNI: ");
                    String dni = sc.nextLine();
                    if (usuarios.containsKey(dni)) {
                        System.out.println("Nuevo nombre: ");
                        String nuevoNombre = sc.nextLine();
                        usuarios.replace(dni, nuevoNombre);
                        usuarios.get(dni);
                        System.out.println("Usuario actualizado.");
                    } else {
                        System.out.println("Usuario no registrado.");
                    }
                }
                case 3 -> {
                    System.out.println("Pendiente");
                }

                case 4 -> {
                    Set<Map.Entry<String, String>> listaUsuarios = usuarios.entrySet();
                    for (Map.Entry<String, String> usuario : listaUsuarios) {
                        System.out.println(usuario.getKey() + " -> " + usuario.getValue());
                    }

                    usuarios.remove("Lo que sea");

                    Iterator<Map.Entry<String, String>> it = listaUsuarios.iterator();
                    while (it.hasNext()) {
                        if (it.next().getKey().equals("Lo que sea")) {
                            it.remove();
                        }
                    }
                }
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