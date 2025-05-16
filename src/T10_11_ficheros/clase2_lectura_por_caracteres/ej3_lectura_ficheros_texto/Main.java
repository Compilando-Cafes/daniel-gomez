package T10_11_ficheros.clase2_lectura_por_caracteres.ej3_lectura_ficheros_texto;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Ruta
        File ruta = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase2_lectura_por_caracteres\\ej3_lectura_ficheros_texto\\libros.txt");
        File ruta2 = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase2_lectura_por_caracteres\\ej3_lectura_ficheros_texto\\libros2.txt");

        String contenido = leer(ruta);

        String resultado = "";
        String[] lineas = contenido.split("\n");

        for (String linea : lineas) {
            String[] partes = linea.split(",");
            String isbn = partes[0];
            String titulo = partes[1];
            String autor = partes[2];
            String editorial = partes[3];
            String agnoPublicacion = partes[4];

            // Dar el formato
            resultado += String.format("""
                            -----------------------------
                            ISBN: %s
                            \t%s (%s)
                            %s, %s
                            -----------------------------
                            """,
                    isbn,
                    titulo, autor,
                    editorial, agnoPublicacion);

        }
        escribir(ruta2, resultado);
        System.out.println(leer(ruta2));
    }

    public static String leer(File ruta) throws IOException {
        FileReader lector = new FileReader(ruta);
        BufferedReader lectorBufer = new BufferedReader(lector);
        String resultado = "";
        String linea = "";
        while ((linea = lectorBufer.readLine()) != null) {
            resultado += linea + "\n";
        }
        lectorBufer.close();
        return resultado;
    }

    public static void escribir(File ruta, String texto) throws IOException {
        FileWriter escribirArchivo = new FileWriter(ruta);
        BufferedWriter buf = new BufferedWriter(escribirArchivo);
        buf.write(texto);
        buf.close();
    }
}