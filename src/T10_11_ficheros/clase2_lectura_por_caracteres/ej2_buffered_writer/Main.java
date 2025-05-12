package T10_11_ficheros.clase2_lectura_por_caracteres.ej2_buffered_writer;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase2_lectura_por_caracteres\\ej1_file_writer\\caracteres_prog.txt");
        String texto = String.format("""
                Hola que tal
                Bien gracias
                Y tu
                Aquí haciendo pruebas...""");
        try {
            escribir(ruta, texto);
        } catch (IOException e) {
            System.out.println("Error en la escritura: " + e.getMessage());
        }

        try {
            System.out.println(leer(ruta));
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }

    public static void escribir(File ruta, String texto) throws IOException {
        FileWriter escribirArchivo = new FileWriter(ruta);
        BufferedWriter buf = new BufferedWriter(escribirArchivo);
        buf.write(texto);
        buf.close();
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
}