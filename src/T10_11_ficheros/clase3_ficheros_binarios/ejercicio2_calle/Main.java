package T10_11_ficheros.clase3_ficheros_binarios.ejercicio2_calle;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fichero = new File("C:\\Users\\danig\\IdeaProjects\\daniel-gomez\\src\\T10_11_ficheros\\clase3_ficheros_binarios\\ejercicio2_calle\\fichero_objetos.dat");
        FileOutputStream fileOS = new FileOutputStream(fichero);
        ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);

        String[] calles = {"Pinzon","Toledo", "Palencia", "Tejares","Ramon y Cajal", "Zapatero", "Julio", "Mayor", "Echegarai"};
        int[] numeros = {14,85,63,25,46,92,76,13,31};
        int[] piso = {1,5,3,2,4,2,6,3,1};

        for (int i = 0; i < calles.length; i++) {
            Calle calle = new Calle(calles[i], numeros[i], piso[i]);
            objectOS.writeObject(calle);
        }

        FileInputStream fileIS = new FileInputStream(fichero);
        ObjectInputStream objectIS = new ObjectInputStream(fileIS);
        try {
            while (true){
                Calle calle = (Calle) objectIS.readObject();
                System.out.println(calle);
            }
        } catch (EOFException eo){
            System.out.println("Fin de documento");
        } finally {
            objectIS.close();
        }
    }
}