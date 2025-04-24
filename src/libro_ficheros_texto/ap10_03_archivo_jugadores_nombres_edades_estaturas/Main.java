package libro_ficheros_texto.ap10_03_archivo_jugadores_nombres_edades_estaturas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\danig\\Dropbox\\PC\\Downloads\\Jugadores.txt"));
            Scanner s;
            String linea = in.readLine();
            while (linea != null){

            }

        } catch (IOException ex){
            System.out.println(ex);
        }
    }

}