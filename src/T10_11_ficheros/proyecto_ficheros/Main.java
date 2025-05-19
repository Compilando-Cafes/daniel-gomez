package T10_11_ficheros.proyecto_ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("""
                    ==============================================
                    PROYECTO FICHEROS
                    1. LECTURA DE UN FICHERO ALEATORIO
                    2. ESCRITURA DE UN FICHERO BINARIO DE PRIMITIVAS
                    3. ESCRITURA DE UN FICHERO DE TEXTO
                    0. SALIR
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 3);
            switch (eleccion) {
                case 0 -> {
                    System.out.println("Hasta otra.");
                    return;
                }
                case 1 -> lecturaFicheroAleatorio();
                case 2 -> escrituraFicheroBinarioPrimitivas();
                case 3 -> escrituraFicheroTexto();
            }
        }
    }

    public static int obtenerCantidad(File archivo, int tamano) {
        return (int) archivo.length() / tamano;
    }

    public static void lecturaFicheroAleatorio() throws IOException {

        // Como es un rollo estar metiendo la ruta...
        System.out.println("Ruta del archivo (pulsa ENTER para ruta por defecto): ");
        String direccionRuta = sc.nextLine();

        File ruta = direccionRuta.isEmpty()
                ? new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\proyecto_ficheros\\registros_alumnos.dat")
                : new File(direccionRuta);

        int tamano = 4 + 4 + 20 + 24 + 8 + 4 + 24 + 30 + 4;
        alumnos.clear();

        try (RandomAccessFile raReadFile = new RandomAccessFile(ruta, "r")) {
            for (int i = 0; i < obtenerCantidad(ruta, tamano); i++) {
                int id = raReadFile.readInt();
                int identificadorAlumno = raReadFile.readInt();

                String nombre = "";
                for (int j = 0; j < 10; j++) nombre += raReadFile.readChar();
                nombre = nombre.trim();

                String apellido = "";
                for (int j = 0; j < 12; j++) apellido += raReadFile.readChar();
                apellido = apellido.trim();

                double notaMedia = raReadFile.readDouble();
                int edad = raReadFile.readInt();

                String ciudad = "";
                for (int j = 0; j < 12; j++) ciudad += raReadFile.readChar();
                ciudad = ciudad.trim();

                String nombreCalle = "";
                for (int j = 0; j < 15; j++) nombreCalle += raReadFile.readChar();
                nombreCalle = nombreCalle.trim();

                int numeroCalle = raReadFile.readInt();

                alumnos.add(new Alumno(identificadorAlumno, nombre, apellido, notaMedia, edad, ciudad,
                        new Calle(nombreCalle, numeroCalle)));
            }
            System.out.println("Lectura completada. Alumnos cargados: " + alumnos.size());
        }
    }

    public static void escrituraFicheroBinarioPrimitivas() throws IOException {
        File archivo = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\proyecto_ficheros\\primitivas_alumnos.dat");
        try (DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(archivo))) {
            for (Alumno alumno : alumnos) {
                dataOutput.writeInt(alumno.getIdentificador());
                escribirCadenaFija(dataOutput, alumno.getNombre(), 10);
                escribirCadenaFija(dataOutput, alumno.getApellido(), 12);
                dataOutput.writeDouble(alumno.getNotaMedia());
                dataOutput.writeInt(alumno.getEdad());
                escribirCadenaFija(dataOutput, alumno.getCiudad(), 12);
                escribirCadenaFija(dataOutput, alumno.getCalle().getNombreCalle(), 15);
                dataOutput.writeInt(alumno.getCalle().getNumeroCalle());
            }
            System.out.println("Fichero generado correctamente");
        }
    }

    public static void escribirCadenaFija(DataOutputStream dataOutput, String texto, int longitud) throws IOException {
        int i = 0;
        while (i < texto.length() && i < longitud) {
            dataOutput.writeChar(texto.charAt(i));
            i++;
        }
        while (i < longitud) {
            dataOutput.writeChar(' ');
            i++;
        }
    }

    public static void escrituraFicheroTexto() throws IOException {
        if (alumnos.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
            return;
        }
        System.out.println("""
            Elige:
            1. Leer todos los registros de alumnos.
            2. Leer un registro concreto.
            """);
        int opcion = pedirNumeroEntero("Opción: ", 1, 2);

        if (opcion == 1) {
            File archivo = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\proyecto_ficheros\\todos_los_alumnos.txt");
            try (PrintWriter pw = new PrintWriter(archivo)) {
                for (Alumno a : alumnos) {
                    pw.println("-----------------------");
                    pw.println("Identificador de Alumno: " + a.getIdentificador());
                    pw.println("Nombre: " + a.getNombre());
                    pw.println("Apellido: " + a.getApellido());
                    pw.println("Edad: " + a.getEdad());
                    pw.println("Nota media: " + a.getNotaMedia());
                    pw.println("Localización: " + a.getCiudad() + ": " + a.getCalle().getNombreCalle() + " " + a.getCalle().getNumeroCalle());
                    pw.println("-----------------------");
                }
            }

            // Mostrar el archivo en consola
            System.out.println("\nContenido de 'todos_los_alumnos.txt':");
            System.out.println(leerArchivoTexto(archivo));

        } else {
            int id = pedirNumeroEntero("Introduce identificador del alumno: ");
            boolean encontrado = false;

            for (Alumno a : alumnos) {
                if (a.getIdentificador() == id) {
                    String nombreArchivo = "alumno_" + id + ".txt";
                    File archivo = new File(nombreArchivo);
                    try (PrintWriter pw = new PrintWriter(archivo)) {
                        pw.println("-----------------------");
                        pw.println("Identificador de Alumno: " + a.getIdentificador());
                        pw.println("Nombre: " + a.getNombre() + " Apellido: " + a.getApellido());
                        pw.println("Edad: " + a.getEdad() + " Nota media: " + a.getNotaMedia());
                        pw.println("Localización: " + a.getCiudad() + ": " + a.getCalle().getNombreCalle() + " " + a.getCalle().getNumeroCalle());
                        pw.println("-----------------------");
                    }

                    System.out.println("\nContenido de '" + nombreArchivo + "':");
                    System.out.println(leerArchivoTexto(archivo));
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún alumno con ese identificador.");
            }
        }
    }

    public static String leerArchivoTexto(File archivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        String resultado = "";
        while ((linea = br.readLine()) != null) {
            resultado += linea + "\n";
        }
        br.close();
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
}
