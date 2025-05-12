package T10_11_ficheros.clase1_excepciones_ficheros.ej2_listar_ficheros_carpeta;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\danig\\Dropbox\\PC\\Downloads");
        String[] lista = archivo.list();
        for (String elemento : lista){
            System.out.println(elemento);
        }
    }
}