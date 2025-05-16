package T10_11_ficheros.clase3_ficheros_binarios.ejercicio1_crear_escribir;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] nombres = {"Ana", "Luis Miguel", "Alicia", "Pedro", "Manuel", "Andrés", "Julio", "Antonio", "María Jesús"};
        int[] edades = {14, 15, 13, 15, 16, 12, 16, 14, 13};
        // Objeto para la ruta
        File ruta = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase3_ficheros_binarios\\ejercicio1_crear_escribir\\fichero_binario.dat");

        // Objetos escribir
        FileOutputStream fileOS = new FileOutputStream(ruta);
        DataOutputStream dataOS = new DataOutputStream(fileOS);

        // Objetos para leer
        FileInputStream fileIS = new FileInputStream(ruta);
        DataInputStream dataIS = new DataInputStream(fileIS);

        // Escribir en el archivo
        for (int i = 0; i < nombres.length; i++) {
            dataOS.writeUTF(nombres[i]);
            dataOS.writeInt(edades[i]);
        }

        try {
            // Leer el archivo
            while (true) {
                System.out.println(dataIS.readUTF());
                System.out.println(dataIS.readInt());
            }
        } catch (EOFException ex){
            System.out.println(ex);
        } finally {
            dataIS.close();
        }
    }
}