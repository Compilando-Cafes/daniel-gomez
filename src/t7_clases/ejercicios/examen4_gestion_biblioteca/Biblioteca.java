package t7_clases.ejercicios.examen4_gestion_biblioteca;

import java.util.Arrays;

public class Biblioteca {
    private Libro[] listaLibros;
    private Usuario[] listaUsuarios;

    public Libro[] getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(Libro[] listaLibros) {
        if (listaLibros == null)
            this.listaLibros = new Libro[0];
        else
            this.listaLibros = Arrays.copyOf(listaLibros, listaLibros.length);
    }

    public Usuario[] getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(Usuario[] listaUsuarios) {
        if (listaUsuarios == null)
            this.listaUsuarios = new Usuario[0];
        else
            this.listaUsuarios = Arrays.copyOf(listaUsuarios, listaUsuarios.length);
    }

    public Biblioteca(Libro[] listaLibros, Usuario[] listaUsuarios) {
        if (listaLibros == null)
            this.listaLibros = new Libro[0];
        else
            this.listaLibros = Arrays.copyOf(listaLibros, listaLibros.length);

        if (listaUsuarios == null)
            this.listaUsuarios = new Usuario[0];
        else
            this.listaUsuarios = Arrays.copyOf(listaUsuarios, listaUsuarios.length);
    }

    public Biblioteca() {
        this.listaLibros = new Libro[0];
        this.listaUsuarios = new Usuario[0];
    }

    public void agregarLibro(Libro libro) {
        Libro[] listaLibrosAux = Arrays.copyOf(listaLibros, listaLibros.length + 1);
        listaLibrosAux[listaLibros.length] = libro;
        listaLibros = listaLibrosAux;
    }

    public void agregarUsuario(String nombre, String DNI) {
        Usuario[] listaUsuariosAux = Arrays.copyOf(listaUsuarios, listaUsuarios.length + 1);
        listaUsuariosAux[listaUsuarios.length] = new Usuario(nombre, DNI);
        listaUsuarios = listaUsuariosAux;
    }

    public void prestarLibro(String ISBN, String dniUsuario) {
        // Buscar el libro con el ISBN
        int indice = -1;
        for (int i = 0; i < listaLibros.length && indice == -1; i++) {
            if (ISBN.equals(listaLibros[i].getISBN())) {
                indice = i;
            }
        }

        // Buscar el usuario
        int indiceUsuario = -1;
        for (int i = 0; i < listaUsuarios.length && indiceUsuario == -1; i++) {
            if (dniUsuario.equals(listaUsuarios[i].getDNI())) {
                indiceUsuario = i;
            }
        }

        if (indice == -1) {
            System.out.println("Libro no encontrado.");
        }
        if (indiceUsuario == -1) {
            System.out.println("Usuario no encontrado.");
        }
        if (indice > -1 && indiceUsuario > -1) {
            if (listaLibros[indice].getDisponible()) {
                listaLibros[indice].setDisponible(false);
                listaUsuarios[indiceUsuario].setLibrosPrestados(listaLibros);
                System.out.println("Libro prestado.");
            } else {
                System.out.println("Libro no disponible.");
            }
        }

    }

    public void devolverLibro(String ISBN, String dniUsuario){
        // Buscar el libro con el ISBN
        int indice = -1;
        for (int i = 0; i < listaLibros.length && indice == -1; i++) {
            if (ISBN.equals(listaLibros[i].getISBN())) {
                indice = i;
            }
        }

        // Buscar el usuario
        int indiceUsuario = -1;
        for (int i = 0; i < listaUsuarios.length && indiceUsuario == -1; i++) {
            if (dniUsuario.equals(listaUsuarios[i].getDNI())) {
                indiceUsuario = i;
            }
        }

        if (indice == -1) {
            System.out.println("Libro no encontrado.");
        }
        if (indiceUsuario == -1) {
            System.out.println("Usuario no encontrado.");
        }
        if (indice > -1 && indiceUsuario > -1) {
            listaLibros[indice].setDisponible(true);
            listaUsuarios[indiceUsuario].setLibrosPrestados(null);
            System.out.println("Libro devuelto.");
        }
    }

    public void mostrarLibrosDisponibles(){
        for (Libro libro : listaLibros) {
            if (libro.getDisponible()) {
                libro.mostrarDatos();
            }
        }
    }

    public void mostrarUsuarios(){
        for (Usuario usuario : listaUsuarios) {
            usuario.mostrarDatos();
        }
    }
}