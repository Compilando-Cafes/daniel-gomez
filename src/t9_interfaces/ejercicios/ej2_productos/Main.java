package t9_interfaces.ejercicios.ej2_productos;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear un array de productos y almacenar varios de cada tipo
        Producto[] productos = {
                new Ropa(
                        "Camiseta",
                        5,
                        "Camiseta barata",
                        "Plástico barato",
                        new String[]{"Rojo", "Azul", "Verde"},
                        new String[]{"S", "M", "L"},
                        new int[][]{{5, 3, 2}, {4, 0, 1}, {3, 2, 2}}
                ),
                new Ropa(
                        "Pantalón",
                        15.0,
                        "Pantalón de campana",
                        "Pana",
                        new String[]{"Negro", "Azul"},
                        new String[]{"M", "L", "XL"},
                        new int[][]{{2, 4, 0}, {0, 3, 2}}
                ),
                new Ropa(
                        "Chaqueta",
                        50.0,
                        "Chaqueta de motero",
                        "Cuero falso",
                        new String[]{"Crema", "Rosa"},
                        new String[]{"M", "L"},
                        new int[][]{{0, 0}, {0, 0}}
                ),
                new Juguete(
                        "Dominó",
                        5,
                        "Juego de dominó de toda la vida.",
                        5,
                        10,
                        false
                ),
                new Juguete(
                        "Cartas",
                        10,
                        "Baraja de cartas española. Faltan las sotas.",
                        10,
                        25,
                        false
                ),
                new Juguete(
                        "Muñeca",
                        25,
                        "Muñeca que habla y escucha.",
                        18,
                        3,
                        true
                ),
                new Medicamento(
                        "Ibuprofeno",
                        5,
                        "A saber que hace...",
                        235,
                        LocalDate.of(2026, 1, 1),
                        false,
                        new String[]{"Vitamina A", "Vitamina C"}
                ),
                new Medicamento(
                        "Naproxeno",
                        7,
                        "Creo que parecido al Ibuprofeno",
                        543,
                        LocalDate.of(2027, 3, 4),
                        false,
                        new String[]{"Vitamina B", "Vitamina E"}
                ),
                new Medicamento(
                        "Respibien",
                        10,
                        "Pues eso, para respirar bien.",
                        23,
                        LocalDate.of(2027, 3, 4),
                        true,
                        new String[]{"Vitamina F", "Vitamina G"}
                )
        };

        while (true) {
            System.out.println("""
                    ==============================================
                    BAZAR. TENEMOS DE TODO UN POCO.
                    1. Ropa.
                    2. Juguetes.
                    3. Medicamentos.
                    0. Salir.
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 3);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> ropa(productos);
                case 2 -> juguetes(productos);
                case 3 -> medicamentos(productos);
            }
        }
    }

    public static void ropa(Producto[] productos) {
        while (true) {
            System.out.println("""
                    ============================================
                    ROPA BARATA (by Camilo)
                    1. Ver stock.
                    2. Aplicar descuento.
                    3. Reponer.
                    4. Comprobar disponibilidad.
                    0. Salir.
                    """);
            int eleccion = pedirNumeroEntero("Elige: ", 0, 4);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Ropa) {
                            producto.mostrarInformacion();
                        }
                    }
                }
                case 2 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Ropa) {
                            producto.aplicarDescuento(20);
                        }
                    }
                }
                case 3 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Ropa) {
                            int cantidad = pedirNumeroEntero("Elige la cantidad a reponer: ", 0);
                            producto.reponer(cantidad);
                        }
                    }
                }
                case 4 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Ropa) {
                            producto.comprobarDisponibilidad();
                        }
                    }
                }
            }
        }
    }

    public static void juguetes(Producto[] productos) {
        while (true) {
            System.out.println("""
                    ============================================
                    JUGUETES DE TODA LA VIDA
                    1. Ver stock.
                    2. Aplicar descuento.
                    3. Reponer.
                    4. Comprobar disponibilidad.
                    5. Comprar.
                    6. ¿Es seguro para mi edad?
                    0. Salir.
                    """);
            int eleccion = pedirNumeroEntero("Elige: ", 0, 6);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Juguete) {
                            producto.mostrarInformacion();
                        }
                    }
                }
                case 2 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Juguete) {
                            producto.aplicarDescuento(20);
                        }
                    }
                }
                case 3 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Juguete) {
                            int cantidad = pedirNumeroEntero("Elige la cantidad a reponer: ", 0);
                            producto.reponer(cantidad);
                        }
                    }
                }
                case 4 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Juguete) {
                            producto.comprobarDisponibilidad();
                        }
                    }
                }
                case 5 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Juguete) {
                            ((Juguete) producto).comprar();
                        }
                    }
                }
                case 6 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Juguete) {
                            if (((Juguete) producto).esSeguroParaEdad(pedirNumeroEntero("Dime la edad: ", 0)))
                                System.out.println("Es seguro.");
                            else
                                System.out.println("No es seguro.");
                        }
                    }
                }
            }
        }
    }

    public static void medicamentos(Producto[] productos) {
        while (true) {
            System.out.println("""
                    ============================================
                    MEDICAMENTOS ESPECIALES
                    1. Ver stock.
                    2. Aplicar descuento.
                    3. Reponer.
                    4. Comprobar disponibilidad.
                    5. Comprobar si contiene un componente.
                    6. Comprobar si requiere receta.
                    0. Salir.
                    """);
            int eleccion = pedirNumeroEntero("Elige: ", 0, 6);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Medicamento) {
                            producto.mostrarInformacion();
                        }
                    }
                }
                case 2 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Medicamento) {
                            producto.aplicarDescuento(20);
                        }
                    }
                }
                case 3 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Medicamento) {
                            int cantidad = pedirNumeroEntero("Elige la cantidad a reponer: ", 0);
                            producto.reponer(cantidad);
                        }
                    }
                }
                case 4 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Medicamento) {
                            producto.comprobarDisponibilidad();
                        }
                    }
                }
                case 5 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Medicamento) {
                            System.out.print("Introduce el componente: ");
                            if (((Medicamento) producto).contiene(sc.nextLine()))
                                System.out.println("Si tiene ese componente.");
                            else
                                System.out.println("No tiene ese componente");
                        }
                    }
                }
                case 6 -> {
                    for (Producto producto : productos) {
                        if (producto instanceof Medicamento) {
                            if (((Medicamento) producto).comprobarReceta())
                                System.out.println("Si requiere receta.");
                            else
                                System.out.println("No requiere receta.");
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
