package t10_colecciones.clase_5_ejercicios.ejercicio4_censo_de_poblacion;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Ciudadano> censo = new LinkedHashMap<>();
        while (true) {
            System.out.println("""
                    ==============================================
                    CENSO DE POBLACIÓN
                    1. Registrar
                    2. Buscar
                    3. Eliminar
                    4. Actualizar
                    5. Total ciudadanos registrados
                    6. Informes
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 6);
            if (eleccion == 0) {
                System.out.println("Hasta otra");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.println("Registrar un ciudadano.");
                    String dni = pedirDNI();
                    if (censo.containsKey(dni)) {
                        System.out.println("DNI ya en uso.");
                    } else {
                        censo.put(dni, crearCiudadano());
                        System.out.println("Ciudadano añadido.");
                    }
                }
                case 2 -> {
                    System.out.println("Buscar un ciudadano.");
                    if (censo.isEmpty()) {
                        System.out.println("El censo está vacío.");
                    } else {
                        String dni = pedirDNI();
                        if (censo.containsKey(dni)) {
                            System.out.println(censo.get(dni));
                        } else
                            System.out.println("DNI no registrado.");
                    }
                }
                case 3 -> {
                    System.out.println("Eliminar un ciudadano.");
                    if (censo.isEmpty()) {
                        System.out.println("El censo está vacío.");
                    } else {
                        String dni = pedirDNI();
                        if (censo.containsKey(dni)) {
                            censo.remove(dni);
                            System.out.println("Ciudadano eliminado.");
                        } else
                            System.out.println("DNI no registrado en el censo.");
                    }
                }
                case 4 -> {
                    System.out.println("Actualizar información de un ciudadano.");
                    if (censo.isEmpty()) {
                        System.out.println("El censo está vacío.");
                    } else {
                        String dni = pedirDNI();
                        if (censo.containsKey(dni)) {
                            censo.put(dni, crearCiudadano());
                            System.out.println("Ciudadano actualizado correctamente.");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Total ciudadanos registrados.");
                    if (censo.isEmpty()) {
                        System.out.println("El censo está vacío.");
                    } else {
                        Set<Map.Entry<String, Ciudadano>> listaCenso = censo.entrySet();
                        for (Map.Entry<String, Ciudadano> ciudadano : listaCenso) {
                            System.out.println("DNI: " + ciudadano.getKey() + " - " + ciudadano.getValue());
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Informes.");
                    if (censo.isEmpty()) {
                        System.out.println("El censo está vacío.");
                    } else {
                        // Cantidad de ciudadanos por ciudad
                        Map<String, Integer> ciudadYPromedio = obtenerDatos(censo);
                        for (Map.Entry<String, Integer> ciudad : ciudadYPromedio.entrySet()){
                            System.out.println(ciudad.getKey() + ": " + ciudad.getValue() + " habitantes");
                        }

                        // Promedio de edad de ciudadanos registrados
                        int total = 0;
                        Set<Map.Entry<String, Ciudadano>> listaCenso = censo.entrySet();
                        for (Map.Entry<String, Ciudadano> ciudadano : listaCenso) {
                            total += ciudadano.getValue().getEdad();
                        }
                        System.out.println("Promedio de edad de todos los ciudadanos registrados: " + (total / censo.size()));

                        // Persona más joven y más mayor del censo
                        // Crear una lista solo con los ciudadanos del censo
                        List<Ciudadano> ciudadanos = new ArrayList<>();
                        for (Map.Entry<String, Ciudadano> ciudadano : censo.entrySet()) {
                            ciudadanos.add(ciudadano.getValue());
                        }
                        Comparator<Ciudadano> cpEdad = new Comparator<Ciudadano>() {
                            @Override
                            public int compare(Ciudadano o1, Ciudadano o2) {
                                return Integer.compare(o1.getEdad(), o2.getEdad());
                            }
                        };
                        Ciudadano joven = Collections.min(ciudadanos, cpEdad);
                        Ciudadano mayor = Collections.max(ciudadanos, cpEdad);
                        System.out.println("El ciudadano más joven es: " + joven);
                        System.out.println("El ciudadano más mayor es: " + mayor);
                    }
                }
            }
        }
    }

    private static Map<String, Integer> obtenerDatos(Map<String, Ciudadano> censo) {
        Map<String, Integer> contadorCiudades = new TreeMap<>();
        for (Ciudadano ciudadano : censo.values()) {
            String ciudad = ciudadano.getCiudad();
            if (contadorCiudades.containsKey(ciudad)) {
                // Si la ciudad ya está aumentar en uno la cantidad
                int cantidadActual = contadorCiudades.get(ciudad);
                contadorCiudades.put(ciudad, cantidadActual + 1);
            } else {
                // Si la ciudad no está iniciar en 1
                contadorCiudades.put(ciudad, 1);
            }
        }
        return contadorCiudades;
    }

    private static Ciudadano crearCiudadano() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        Integer edad = pedirNumeroEntero("Edad: ", 0);
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        return new Ciudadano(nombre, edad, ciudad);
    }

    private static String pedirDNI() {
        String dni;
        while (true) {
            System.out.print("DNI: ");
            dni = sc.nextLine();
            if (!esValido(dni)) {
                System.out.println("Introduce un DNI válido.");
            } else {
                break;
            }
        }
        return dni;
    }

    private static boolean esValido(String dni) {
        // Formato buscado: 12123456X
        // Debe tener exáctamente 9 dígitos
        if (dni.length() != 9) {
            return false;
        }
        // Comprobar que el último dígito sea una letra
        if (Character.isDigit(dni.charAt(8))) {
            return false;
        }
        // Comprobar los 8 primeros dígitos
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }
        return true;
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