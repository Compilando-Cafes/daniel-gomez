package libro_ficheros_texto.ar10_06_enteros_scanner_con_espacios;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileInputStream flujo = null;
        try {
            flujo = new FileInputStream("C:\\Users\\danig\\Dropbox\\PC\\Downloads\\Enteros.txt");
        } catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        Scanner s = new Scanner(flujo);
        int contador = 0;
        int suma = 0;
        while (s.hasNext()){
            int n = s.nextInt();
            System.out.println(n + " ");
            suma +=n;
            contador++;
        }
        double media = (double) suma /contador;
        System.out.println("\nsuma: " + suma + " media: " + media);
    }

}