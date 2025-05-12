package t10_colecciones.examenes_prueba.examen1.ej3_censo_personal;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Empleado> listaEmpleados = new LinkedHashMap<>(); // Elijo un map ya que tiene la clave del dni y luego los valores de empleado, y de tipo linkedHashMap ya que no indica que deban ordenarse de ninguna manera. También valdría la hashMap
        while (true) {
            System.out.println("""
                    ==============================================
                    CENSO PERSONAL
                    1. Salir
                    2. Registrar nuevo empleado (sin permitir DNI repetido)
                    3. Actualizar datos de un empleado existente por DNI
                    4. Eliminar un empleado si se jubila (edad >= 65)
                    5. Mostrar los datos de un empleado concreto por DNI
                    6. Listar todos los dnis registrados
                    7. Mostrar cuántos empleados hay censados
                    8. Recorrer cada entrada "dni -> Empleado" para imprimirla formateada
                    9. Reemplazar el nombre de un empleado solo si coincide con un valor dado
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 1, 9);
            if (eleccion == 1) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 2 -> {
                    System.out.println("DNI: ");
                    String dni = sc.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    int edad = pedirNumeroEntero("Edad: ", 0);

                    if (listaEmpleados.containsKey(dni)) {
                        System.out.println("El DNI ya existe");
                    } else {
                        listaEmpleados.put(dni, new Empleado(dni, nombre, edad));
                        System.out.println("Empleado añadido.");
                    }
                }
                case 3 -> {
                    System.out.println("DNI: ");
                    String dni = sc.nextLine();
                    if (listaEmpleados.containsKey(dni)) {
                        System.out.println("Nuevo nombre: ");
                        String nombre = sc.nextLine();
                        int edad = pedirNumeroEntero("Nueva edad: ", 0);
                        listaEmpleados.replace(dni, new Empleado(dni, nombre, edad));
                        System.out.println("Empleado actualizado.");
                    } else {
                        System.out.println("El DNI no figura en la lista de empleados.");
                    }
                }
                case 4 -> {
                    Iterator<Map.Entry<String, Empleado>> it = listaEmpleados.entrySet().iterator();
                    int contador = 0;
                    while (it.hasNext()) {
                        Map.Entry<String, Empleado> entry = it.next();
                        if (entry.getValue().getEdad() >= 65) {
                            System.out.println("Se jubila: " + entry.getValue().getNombre());
                            it.remove();
                            contador++;
                        }
                    }

                    if (contador == 0) {
                        System.out.println("Ningún empleado se jubila.");
                    }
                }
                case 5 -> {
                    System.out.println("DNI: ");
                    String dni = sc.nextLine();
                    if (listaEmpleados.containsKey(dni)) {
                        System.out.println(listaEmpleados.get(dni));
                    } else {
                        System.out.println("El DNI no figura en la lista de empleados.");
                    }
                }
                case 6 -> {
                    Set<String> lista = listaEmpleados.keySet();
                    for (String empleado : lista) {
                        System.out.println(empleado);
                    }
                }
                case 7 -> {
                    System.out.println("Número de empleados censados: " + listaEmpleados.size());
                }
                case 8 -> {
                    Set<Map.Entry<String, Empleado>> lista = listaEmpleados.entrySet();
                    for (Map.Entry<String, Empleado> empleado : lista) {
                        System.out.println(empleado.getKey() + " -> " + empleado.getValue());
                    }
                }
                case 9 -> {
                    System.out.print("Nombre que se desea reemplazar: ");
                    String nombre = sc.nextLine();
                    Collection<Empleado> lista = listaEmpleados.values();
                    boolean encontrado = false;
                    for (Empleado empleado : lista) {
                        if (empleado.getNombre().equals(nombre)) {
                            System.out.print("Nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            empleado.setNombre(nuevoNombre);
                            System.out.println("Nombre de empleado actualizado.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No hay ningún empleado con ese nombre.");
                    }
                }
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