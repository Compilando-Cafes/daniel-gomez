package T10_11_ficheros.clase3_ficheros_binarios.ejercicio3_ficheros_aleatorios;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static File rutaArchivo = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase3_ficheros_binarios\\ejercicio3_ficheros_aleatorios\\accesoAleatorio.dat");
    static int tamano = 4 + 10 * 2 + 4 + 8;

    public static void main(String[] args) throws IOException {

        while (true) {
            System.out.println("""
                    ==============================================
                    FICHERO ACCESO ALEATORIO
                    1. Leer todos los registros
                    2. Leer registro concreto
                    3. Modificar datos del registro
                    4. Borrar un registro
                    5. Insertar un registro
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 5);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.println(leer(rutaArchivo));
                }
                case 2 -> {
                    leerRegistroConcreto(rutaArchivo);
                }
                case 3 -> {
                    modificarDatosRegistro(rutaArchivo);
                }
                case 4 -> {
                    borrarRegistro(rutaArchivo);
                }
                case 5 -> {
                    insertarRegistro(rutaArchivo);
                }
            }
        }
    }

    public static int obtenerCantidad() {
        return (int) rutaArchivo.length() / tamano;
    }

    private static void insertarRegistro(File ruta) throws IOException {
        RandomAccessFile raRF = new RandomAccessFile(ruta, "rw");
        int posicion = -1;
        int id = obtenerCantidad();

        // Buscar posición libre que esté en -1
        for (int i = 0; i < obtenerCantidad(); i++) {
            raRF.seek(i * tamano);
            if (raRF.readInt() == -1) {
                posicion = i * tamano;
                id = i;
                break;
            }
        }
        // Si no encuentra ningún -1 lo pone al final
        if (posicion == -1)
            raRF.seek(ruta.length());
        else
            raRF.seek(posicion);

        // Id
        raRF.writeInt(id);

        // Nombre
        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();
        StringBuffer buffer = new StringBuffer(nombre);
        buffer.setLength(10);
        raRF.writeChars(buffer.toString());

        // Curso
        int curso = pedirNumeroEntero("Curso (un número entero): ");
        raRF.writeInt(curso);

        // Altura
        double altura = pedirNumeroDouble("Altura: ");
        raRF.writeDouble(altura);

        System.out.println("Registro añadido");
    }

    private static void borrarRegistro(File ruta) throws IOException {
        int posicion = pedirNumeroEntero("Dime la posición que quieres borrar (1 a " + obtenerCantidad() + "): ", 1, obtenerCantidad());

        // Colocar en una posición
        int posicionReal = (posicion - 1) * tamano;
        RandomAccessFile raRF = new RandomAccessFile(ruta, "rw");
        raRF.seek(posicionReal);
        raRF.writeInt(-1);
        System.out.println("Registro borrado");
    }

    private static void modificarDatosRegistro(File ruta) throws IOException {
        int posicion = pedirNumeroEntero("Dime la posición que quieres modificar (1 a " + obtenerCantidad() + "): ", 1, obtenerCantidad());

        // Colocar en una posición
        int posicionReal = (posicion - 1) * tamano;
        RandomAccessFile raRF = new RandomAccessFile(ruta, "rw");
        raRF.seek(posicionReal);

        // Nombre
        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();
        StringBuffer buffer = new StringBuffer(nombre);
        buffer.setLength(10);
        raRF.writeChars(buffer.toString());

        // Curso
        int curso = pedirNumeroEntero("Curso (un número entero): ");
        raRF.writeInt(curso);

        // Altura
        double altura = pedirNumeroDouble("Altura: ");
        raRF.writeDouble(altura);

        System.out.println("Registro modificado");
    }

    private static void leerRegistroConcreto(File ruta) throws IOException {
        int posicion = pedirNumeroEntero("Dime el número que quieres leer (1 a " + obtenerCantidad() + "): ", 1, obtenerCantidad());
        // Colocar en una posición
        int posicionReal = (posicion - 1) * tamano;
        RandomAccessFile raRF = new RandomAccessFile(ruta, "r");
        raRF.seek(posicionReal);
        // Identificador
        System.out.println("Identificador: " + raRF.readInt());
        // Nombre
        System.out.print("Nombre: ");
        String nombre = "";
        for (int j = 0; j < 10; j++) {
            nombre += raRF.readChar();
        }
        System.out.println(nombre.trim());
        // Curso
        System.out.println("Curso: " + raRF.readInt());
        // Altura
        System.out.println("Altura: " + raRF.readDouble());
        System.out.println("-----------Fin registro------------");
    }

    public static String leer(File ruta) throws IOException {
        String resultado = "";
        RandomAccessFile raReadFile = new RandomAccessFile(ruta, "r");
        try {
            // int posicion = i * tamanyo;
            for (int i = 0; i < obtenerCantidad(); i++) {
                // Identificador
                resultado += "Identificador: " + raReadFile.readInt() + "\n";
                // Nombre
                resultado += "Nombre: ";
                String nombre = "";
                for (int j = 0; j < 10; j++) {
                    nombre += raReadFile.readChar();
                }
                resultado += nombre.trim() + "\n";
                // Curso
                resultado += "Curso: " + raReadFile.readInt() + "\n";
                // Altura
                resultado += "Altura: " + raReadFile.readDouble() + "\n";
                resultado += "-----------Fin registro------------\n";
            }

        } catch (EOFException e) {
            System.out.println("Fin lectura archivo");
        } finally {
            raReadFile.close();
        }
        return resultado;
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

    public static double pedirNumeroDouble(String mensaje) {
        double numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                numero = sc.nextDouble();
                sc.nextLine();
                return numero;
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}