package libro_ficheros_texto.ar10_03_leer_archivo_con_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("src\\libro_ficheros_texto\\ar10_2_leer_un_main\\Main.java"));
            String linea = in.readLine();
            while (linea != null) {
                texto = texto + linea + '\n';
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}