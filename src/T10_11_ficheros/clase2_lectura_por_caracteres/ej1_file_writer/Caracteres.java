package T10_11_ficheros.clase2_lectura_por_caracteres.ej1_file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Caracteres {
    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase2_lectura_por_caracteres\\ej1_file_writer\\caracteres_prog.txt");
        try {
            escribir(ruta);
        } catch (IOException e) {
            System.out.println("Error en la escritura: " + e.getMessage());
        }
    }
    public static void escribir(File ruta) throws IOException {
            FileWriter escribir = new FileWriter(ruta);
            String c = "Juegos Grecorromanos\n";
            escribir.write(c);
            escribir.close();
    }
}