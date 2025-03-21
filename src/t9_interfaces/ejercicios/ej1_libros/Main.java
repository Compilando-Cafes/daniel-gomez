package t9_interfaces.ejercicios.ej1_libros;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Libro[] libros = {
                new LibroFisico("El señor de los anillos", 1200,
                        new String[]{"23:No es la cantidad de años en tu vida lo que cuenta, sino la cantidad de vida en tus años.",
                        "344:Las aventuras, como el fuego, son hermosas mientras duran, pero cuando se apagan, dejan solo cenizas.",
                        "456:Un hobbit es, en pocas palabras, un ser que disfruta de las pequeñas cosas de la vida."},
                        326, new double[]{15, 23, 4}, 1500 ),
                new LibroFisico("Juego de tronos", 804,
                        new String[]{"53:El invierno se acerca.",
                                "324:El hombre que no valora su vida no tiene miedo a la muerte.",
                                "765:Cuando se juega al juego de tronos, o ganas o mueres."},
                        560, new double[]{15, 23.5, 4.3}, 750 ),
                new LibroFisico("El Médico", 704,
                        new String[]{"34:El hombre debe morir por lo que ama.",
                                "65:La medicina es la ciencia más humana.",
                                "2:No hay un camino recto para alcanzar la grandeza, pero siempre hay uno para aprender."},
                        24, new double[]{15.5, 23.2, 3}, 800 ),
                new Ebook("Los Pilares de la Tierra", 1080, 4, Ebook.Formato.PDF, 30),
                new Ebook("El Quijote", 1064, 5, Ebook.Formato.EPUB, 50),
                new Ebook("Cien años de soledad", 448, 3, Ebook.Formato.MOBI, 70)
        };
        while (true) {
            System.out.println("""
                    ==============================================
                    BIENVENIDO A LA BIBLIOTECA DE ALEJANDRÍA DIGITAL
                    Elige el formato de libro que quieres:
                    1. Libro físico.
                    2. Digital.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 2);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> librosFisicos(libros);
                case 2 -> librosDigitales(libros);
            }
        }
    }

    public static void librosDigitales(Libro[] libros) {
        while (true) {
            System.out.println("""
                    ================================================
                    LIBROS DIGITALES
                    1. Ver lista completa.
                    2. Ver más detalles de un libro.
                    3. Ver porcentaje de libro leído.
                    4. Cambiar porcentaje de libro leído.
                    5. Transformar formato del libro.
                    0. Salir
                    """);
            int eleccion = pedirNumeroEntero("Elige: ", 0, 5);
            if (eleccion == 0) {
                System.out.println("Regresando al menú anterior.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    // Ver lista completa
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, Ebook.class.getSimpleName()));
                }
                case 2 -> {
                    // Ver más detalles de un libro
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, Ebook.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, Ebook.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres ver: ", 1, numeroLibrosPorTipo(libros, Ebook.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, Ebook.class.getSimpleName(), numeroLibro);
                    libros[posicionLibro].getInformacion();
                }
                case 3 -> {
                    // Ver porcentaje de libro leído.
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, Ebook.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, Ebook.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres ver: ", 1, numeroLibrosPorTipo(libros, Ebook.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, Ebook.class.getSimpleName(), numeroLibro);
                    libros[posicionLibro].getEstatusLeido();
                }
                case 4 -> {
                    // Cambiar porcentaje de libro leído.
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, Ebook.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, Ebook.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres ver: ", 1, numeroLibrosPorTipo(libros, Ebook.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, Ebook.class.getSimpleName(), numeroLibro);
                    int porcentaje = pedirNumeroEntero("Dime cual es el porcentaje que llevas leído: ", 0);
                    ((Ebook) libros[posicionLibro]).setPorcentajeLeido(porcentaje);
                }
                case 5 -> {
                    // Transformar formato del libro.
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, Ebook.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, Ebook.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres ver: ", 1, numeroLibrosPorTipo(libros, Ebook.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, Ebook.class.getSimpleName(), numeroLibro);
                    System.out.println("""
                            ¿A qué formato has transformado el libro?:
                            1. PDF
                            2. EPUB
                            3. MOBI
                            4. AZW
                            """);
                    int numeroFormato = pedirNumeroEntero("Elige: ", 1, 4);
                    String formato = "";
                    switch (numeroFormato){
                        case 1 -> formato = "PDF";
                        case 2 -> formato = "EPUB";
                        case 3 -> formato = "MOBI";
                        case 4 -> formato = "AZW";
                    }
                    double pesoAnterior = ((Ebook) libros[posicionLibro]).getTamano();
                    ((Ebook) libros[posicionLibro]).transformar(formato);
                    System.out.printf("El tamaño del libro ha pasado de %,.2f MB a %,.2f MB\n", pesoAnterior, ((Ebook) libros[posicionLibro]).getTamano());
                }
            }
        }
    }

    public static void librosFisicos(Libro[] libros) {
        while (true) {
            System.out.println("""
                    ================================================
                    LIBROS FÍSICOS
                    1. Ver lista completa.
                    2. Ver más detalles de un libro.
                    3. Modificar número de páginas.
                    4. Ver marca páginas.
                    5. Añadir una nueva frase destacada.
                    6. Eliminar frase destacada.
                    7. Calcular precio.
                    0. Salir
                    """);
            int eleccion = pedirNumeroEntero("Elige: ", 0, 7);
            if (eleccion == 0) {
                System.out.println("Regresando al menú anterior.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    // Ver lista completa
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, LibroFisico.class.getSimpleName()));
                }
                case 2 -> {
                    // Ver más detalles de un libro
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, LibroFisico.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres ver: ", 1, numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, LibroFisico.class.getSimpleName(), numeroLibro);
                    libros[posicionLibro].getInformacion();
                }
                case 3 -> {
                    // Modificar número de páginas.
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, LibroFisico.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres editar: ", 1, numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, LibroFisico.class.getSimpleName(), numeroLibro);
                    ((LibroFisico) libros[posicionLibro]).setMarcaPaginas(pedirNumeroEntero("Dime el número de página por la que vas leyendo: ", 0));
                }
                case 4 -> {
                    // Ver marca páginas.
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, LibroFisico.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres editar: ", 1, numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, LibroFisico.class.getSimpleName(), numeroLibro);
                    libros[posicionLibro].getEstatusLeido();
                }
                case 5 -> {
                    // Añadir una nueva frase destacada.
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, LibroFisico.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres editar: ", 1, numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, LibroFisico.class.getSimpleName(), numeroLibro);
                    int pagina = pedirNumeroEntero("Dime la página donde está la frase destacada: ",0);
                    System.out.print("Dime la frase destacada que quieres añadir: ");
                    String frase = sc.nextLine();
                    ((LibroFisico) libros[posicionLibro]).destacarFrase(pagina, frase);
                }
                case 6 -> {
                    // Eliminar frase destacada.
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, LibroFisico.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres editar: ", 1, numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, LibroFisico.class.getSimpleName(), numeroLibro);
                    int pagina = pedirNumeroEntero("Dime la página donde está la frase destacada: ",0);
                    ((LibroFisico) libros[posicionLibro]).eliminarFrases(pagina);
                }
                case 7 -> {
                    // Calcular precio.
                    System.out.println(mostrarTitulosLibrosSelecionados(libros, LibroFisico.class.getSimpleName()));
                    System.out.println("Número de libros disponibles: " + numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int numeroLibro = pedirNumeroEntero("Elige el número de libro que quieres ver: ", 1, numeroLibrosPorTipo(libros, LibroFisico.class.getSimpleName()));
                    int posicionLibro = posicionLibroElegido(libros, LibroFisico.class.getSimpleName(), numeroLibro);
                    System.out.printf("Precio del libro: %,.2f€\n", ((LibroFisico) libros[posicionLibro]).calcularPrecio());
                }
            }
        }
    }

    public static String mostrarTitulosLibrosSelecionados(Libro[] libros, String tipo){
        String resultado = "";
        int numeroLibro = 0;
        for (Libro libro : libros){
            if (libro.getClass().getSimpleName().equals(tipo)){
                numeroLibro++;
                String numeroL = "Libro número: " + numeroLibro + "\n";
                resultado += numeroL;
                resultado += libro.toString();
            }
        }
        return resultado;
    }

    public static int posicionLibroElegido(Libro[] libros, String tipo, int libroElegido){
        int numeroLibro = 0;
        for (int i = 0; i< libros.length; i++){
            if (libros[i].getClass().getSimpleName().equals(tipo)){
                numeroLibro++;
                if (numeroLibro == libroElegido){
                    return i;
                }
            }
        }
        System.out.println("Libro no encontrado. Mostramos el primero.");
        return 0;
    }

    public static int numeroLibrosPorTipo(Libro[] libros, String tipo){
        int contador = 0;
        for (Libro libro : libros){
            if (libro.getClass().getSimpleName().equals(tipo)){
                contador++;
            }
        }
        return contador;
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