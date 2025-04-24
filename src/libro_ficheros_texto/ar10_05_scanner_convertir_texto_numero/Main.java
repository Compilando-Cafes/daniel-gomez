package libro_ficheros_texto.ar10_05_scanner_convertir_texto_numero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\danig\\Dropbox\\PC\\Downloads\\NumerosReales.txt"));
            Scanner s;
            double numero;
            double suma = 0;
            String linea = in.readLine();
            while (linea!= null){
                s = new Scanner(linea).useLocale(Locale.US);
                if (s.hasNextDouble()) {
                    numero = s.nextDouble();
                    suma += numero;
                }
                linea = in.readLine();
            }
            System.out.println("suma: " + suma);
        } catch (IOException ex){
            System.out.println(ex);
        }finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException ex){
                    System.out.println(ex);
                }
            }
        }
    }

}