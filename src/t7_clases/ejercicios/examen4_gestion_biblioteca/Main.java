package t7_clases.ejercicios.examen4_gestion_biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblio = new Biblioteca();

        // Añadir libros
        biblio.agregarLibro(new Libro("1984", "George Orwell", "1234567890", true));
        biblio.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", "0987654321", true));

        // Añadir usuarios
        biblio.agregarUsuario("Carlos Pérez", "12345678A");
        biblio.agregarUsuario("María López", "87654321B");

        int op;
        do {
            System.out.println("\n1. Prestar libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Mostrar libros disponibles");
            System.out.println("4. Mostrar usuarios");
            System.out.println("5. Salir");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Introduce ISBN del libro:");
                String isbn = sc.nextLine();
                System.out.println("Introduce DNI del usuario:");
                String dni = sc.nextLine();
                biblio.prestarLibro(isbn, dni);
            } else if (op == 2) {
                System.out.println("Introduce ISBN del libro:");
                String isbn = sc.nextLine();
                System.out.println("Introduce DNI del usuario:");
                String dni = sc.nextLine();
                biblio.devolverLibro(isbn, dni);
            } else if (op == 3) {
                biblio.mostrarLibrosDisponibles();
            } else if (op == 4) {
                biblio.mostrarUsuarios();
            }
        } while (op != 5);
    }
}
