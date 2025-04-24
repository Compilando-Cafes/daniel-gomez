package libro_ficheros_texto.ar10_02_leer_un_main;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        FileReader in = null;
        try {
            in = new FileReader("src\\libro_ficheros_texto\\ar10_2_leer_un_main\\Main.java");
            int c = in.read();
            while (c != -1){
                texto = texto + (char) c;
                c = in.read();
            }
        } catch (IOException ex){
            System.out.println(ex);
        } finally {
            if (in != null) {
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