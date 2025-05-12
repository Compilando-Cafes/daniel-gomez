package t12_colecciones.ejs_libro.ar12_11_socio;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Socio> socios = new TreeSet<>();
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("socios.dat"))) {
            socios = (TreeSet<Socio>) in.readObject();
        } catch (IOException ex) {
            System.out.println("Lista de socios vacía");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        int opcion;
        do {
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificación");
            System.out.println("4. Listado por DNI");
            System.out.println("5. Listado por antigüedad");
            System.out.println("6. Salir");
            System.out.print("\n Introducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("DNI: ");
                    String dni = new Scanner(System.in).next();
                    alta(socios, dni);
                }
                case 2 -> {
                    System.out.print("DNI socio: ");
                    String dni = new Scanner(System.in).next();
                    socios.remove(new Socio(dni));
                }
                case 3 -> {
                    System.out.print("DNI: ");
                    String dni = new Scanner(System.in).next();
                    socios.remove(new Socio(dni));
                    alta(socios, dni);
                }
                case 4 -> {
                    System.out.println(socios);
                }

                case 5 -> {
                    Comparator<Socio> c = new Comparator<Socio>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            return o2.antiguedad() - o1.antiguedad();
                        }
                    };
                    Set<Socio> s = new TreeSet<>(c);
                    s.addAll(socios);
                    System.out.println(s);
                }
            }
        } while (opcion != 6);
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("socios.dat"))) {
            out.writeObject(socios);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    static boolean alta(Set<Socio> socios, String dni) {
        System.out.print("Nombre: ");
        String nombre = new Scanner(System.in).next();
        System.out.print("Fecha de alta: ");
        String fechaAlta = new Scanner(System.in).next();
        Socio nuevo = new Socio(dni, nombre, fechaAlta);
        return socios.add(nuevo);
    }
}