package t10_colecciones.ejs_libro.aa12_25_map_club_apodo;

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
            System.out.println("1. Alta socio");
            System.out.println("2. Baja socio");
            System.out.println("3. Modificación socio");
            System.out.println("4. Listar socios por apodo");
            System.out.println("5. Listar socios por antigüedad");
            System.out.println("6. Listar los socios con alta anterior a un año determinado");
            System.out.println("7. Salir");
            System.out.print("\n Introducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Apodo socio: ");
                    String apodo = new Scanner(System.in).next();
                    alta(socios, apodo);
                }
                case 2 -> {
                    System.out.print("Apodo socio: ");
                    String apodo = new Scanner(System.in).next();
                    socios.remove(new Socio(apodo));
                }
                case 3 -> {
                    System.out.print("Apodo socio: ");
                    String apodo = new Scanner(System.in).next();
                    socios.remove(new Socio(apodo));
                    alta(socios, apodo);
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
                case 6 ->  {
                    System.out.print("Año de alta: ");
                    int aAlta = new Scanner(System.in).nextInt();
                    for (Socio socio : socios){
                        if (socio.getFechaAlta().getYear()<aAlta){
                            System.out.println(socio);
                        }
                    }
                }
            }
        } while (opcion != 7);
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("socios.dat"))) {
            out.writeObject(socios);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    static boolean alta(Set<Socio> socios, String apodo) {
        System.out.print("Nombre: ");
        String nombre = new Scanner(System.in).next();
        System.out.print("Fecha de alta: ");
        String fechaAlta = new Scanner(System.in).next();
        return socios.add(new Socio(apodo, nombre, fechaAlta));
    }
}