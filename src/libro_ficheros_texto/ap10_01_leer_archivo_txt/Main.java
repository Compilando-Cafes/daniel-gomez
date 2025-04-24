package libro_ficheros_texto.ap10_01_leer_archivo_txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\danig\\Dropbox\\PC\\Downloads\\prueba.txt"));
            String linea = in.readLine();
            texto = texto + linea + '\n';
        } catch (IOException ex){
            System.out.println(ex);
        } finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException ex){
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}