package libro_ficheros_texto.ar10_04_suma_numeros_archivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        String[] cadena = new String[0];
        Collection<Double> coleccion = new java.util.ArrayList<>(List.of());
        double suma = 0;
        double suma2 = 0;
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\danig\\Dropbox\\PC\\Downloads\\NumerosReales.txt"));
            texto = in.readLine();
            cadena = texto.split(" ");
            for (String numero : texto.split(" ")){
                coleccion.add(Double.parseDouble(numero));
            }
            for (Double numero : coleccion){
                suma2 += numero;
            }
            for (String numero : cadena){
                suma += Double.parseDouble(numero);
            }

        } catch (IOException ex){
            System.out.println(ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex){
                System.out.println(ex);
            }
        }
        System.out.println(texto);
        System.out.println(Arrays.toString(cadena));
        System.out.println(coleccion);
        System.out.println(suma);
        System.out.println(suma2);
    }
}