package T10_11_ficheros.clase3_ficheros_binarios.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] nombre = {"FERNANDO", "ROCIO", "LOPE", "ROSA", "JOAQUIN", "MARIO", "REY"};
        int[] curso = {1, 2, 1, 1, 3, 3, 2};
        Double[] altura = {1.45, 2.00, 1.70, 1.56, 1.60, 1.87, 2.0};
        // int -> 4, nombre -> 10 * 2, curso -> 4, altura -> 8
        int tamanyo = 4 + 10 * 2 + 4 + 8;
        File fichero = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase3_ficheros_binarios\\ejercicio2\\fichero.dat");
        RandomAccessFile rafile = new RandomAccessFile(fichero, "rw");
        for (int i = 0; i < nombre.length; i++) {
            // Identificador
            rafile.writeInt(i + 1);
            // Nombre
            StringBuffer buffer = new StringBuffer(nombre[i]);
            buffer.setLength(10);
            rafile.writeChars(buffer.toString());
            // Curso
            rafile.writeInt(curso[i]);
            // Altura
            rafile.writeDouble(altura[i]);
        }
        rafile.close();

        // Leer
        RandomAccessFile raReadFile = new RandomAccessFile(fichero, "r");
        int cantidad = (int) fichero.length() / tamanyo;

        for (int i = 0; i < nombre.length; i++) {
            System.out.println("");
            // Colocar en una posición
            // int posicion = i * tamanyo;
            // Identificador
            System.out.println("Identificador: " + raReadFile.readInt());
            // Nombre
            System.out.print("Nombre: ");
            for (int j = 0; j < 10; j++) {
                System.out.print(raReadFile.readChar());
            }
            System.out.println();
            // Curso
            System.out.println("Curso: " + raReadFile.readInt());
            // Altura
            System.out.println("Altura: " + raReadFile.readDouble());
            System.out.println("-----------Fin registro------------");
        }
    }

}