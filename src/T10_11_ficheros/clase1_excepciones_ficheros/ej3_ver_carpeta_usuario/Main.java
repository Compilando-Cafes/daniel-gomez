package T10_11_ficheros.clase1_excepciones_ficheros.ej3_ver_carpeta_usuario;

import java.io.File;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Dime la carpeta: ");
        String direccion = sc.next();

        try {
            File archivo = new File(direccion);
            File[] lista = archivo.listFiles();
            for (File elemento : lista) {
                System.out.println(elemento);
            }

            System.out.print("Dime que archivo quieres ver: ");
            String nombreArchivo = sc.next();
            File archivoAbrir = new File(archivo, nombreArchivo);
            if (archivoAbrir.exists()) {
                System.out.println("Nombre del archivo:");
                System.out.println(archivoAbrir.getName());
                System.out.println("Ruta absoluta en formato File");
                System.out.println(archivoAbrir.getAbsoluteFile());
                System.out.println("Ruta absoluta:");
                System.out.println(archivoAbrir.getAbsolutePath());
                System.out.println("Ruta relativa:");
                System.out.println(archivoAbrir.getPath());
                System.out.println("Espacio libre disponible en el disco duro incluyendo el reservado para el sistema operativo:");
                System.out.println(archivoAbrir.getFreeSpace() / 1000000 + " MB");
                System.out.println("Tamaño total del disco duro donde está el archivo:");
                System.out.println(archivoAbrir.getTotalSpace() / 1000000 + " MB");
                System.out.println("Espacio libre disponible realmente:");
                System.out.println(archivoAbrir.getUsableSpace() / 1000000 + " MB");
                System.out.println("Permiso de escritura: " + (archivoAbrir.canWrite()? "Si": "No"));
                System.out.println("Permiso de lectura: " + (archivoAbrir.canRead()? "Si": "No"));
                System.out.println("¿Es un fichero normal? " + (archivoAbrir.isFile()? "Si": "No"));
                System.out.println("¿Es un directorio? " + (archivoAbrir.isDirectory()? "Si": "No"));
                System.out.println("¿Es un archivo oculto? " + (archivoAbrir.isHidden()? "Si": "No"));
                System.out.println("Nombre del directorio padre: ");
                if (archivoAbrir.getParent() == null){
                    System.out.println("No existe.");
                } else {
                    System.out.println(archivoAbrir.getParent());
                }
            } else {
                System.out.println("El archivo indicado no existe.");
            }
        } catch (Exception ex) {
            System.out.println("Fallo: " + ex.getMessage());
        }
    }
}