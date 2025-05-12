package T10_11_ficheros.clase2_lectura_por_caracteres.ej2_parrafo;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase2_lectura_por_caracteres\\ej1_file_writer\\caracteres_prog.txt");
        try {
            escribir(ruta);
        } catch (IOException e) {
            System.out.println("Error en la escritura: " + e.getMessage());
        }
        try {
            leer(ruta);
        } catch (IOException e) {
            System.out.println("Error en la lectura: " + e.getMessage());
        }
    }
    public static void escribir(File ruta) throws IOException {
        FileWriter escribir = new FileWriter(ruta);
        String c = "Juegos Grecorromanos\n";
        escribir.write(c);
        escribir.close();
    }
    public static void leer (File ruta_fichero) throws IOException {
        FileReader lector = new FileReader(ruta_fichero);
        String l;
        for (int i = 0; i< ruta_fichero.length(); i++){
            System.out.print((char)lector.read());
        }
        lector.close();
    }
}