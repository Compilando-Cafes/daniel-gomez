package t7_clases.ejercicios.examen1_curso;

import java.util.Arrays;

public class Curso {
    private Profesor[] profesores;
    private Estudiante[] alumnos;
    private String nombreCurso;

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        if (profesores.length > 0 && profesores.length <= 10)
            this.profesores = profesores;
        else {
            this.profesores = new Profesor[10];
            for (Profesor profesor : this.profesores) {
                profesor.setNombre("");
                profesor.setDni("");
                profesor.setAsignaturaImpartida("");
                profesor.setFechaAlta("");
            }
        }
    }

    public Estudiante[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Estudiante[] alumnos) {
        if (alumnos.length > 0 && alumnos.length <= 20)
            this.alumnos = alumnos;
        else {
            this.alumnos = new Estudiante[10];
            for (Estudiante alumno : this.alumnos) {
                alumno.setEdad(16);
                alumno.setNombre("");
                double[] notas = new double[10];
                Arrays.fill(notas, 0);
                alumno.setNotas(notas);
            }
        }
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    // Constructor con un parámetro
    Curso(String nombreCurso) {
        this.profesores = new Profesor[10];
        this.alumnos = new Estudiante[10];
        this.nombreCurso = nombreCurso;
    }

    public void anyadirEstudiante(String nombre, int edad) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                double[] notas = new double[10];
                Arrays.fill(notas, 0);
                alumnos[i] = new Estudiante(nombre, edad, notas);
                return;
            }
        }
        System.out.println("No se pueden añadir más alumnos.");
    }

    public void eliminarEstudiante(String nombreAlumno) {
        boolean existe = false;
        for (int i = 0; i < alumnos.length && !existe; i++) {
            if (alumnos[i].getNombre().equalsIgnoreCase(nombreAlumno)) {
                // Eliminar al estudiante
                System.arraycopy(alumnos, i + 1, alumnos, i, alumnos.length - i - 1);
                alumnos = Arrays.copyOf(alumnos, alumnos.length - 1);
                System.out.println("Estudiante eliminado.");
                existe = true;
            }
        }
        if (!existe){
            System.out.println("No se ha encontrado ningún estudiante con ese nombre.");
        }
    }

    public void anyadirProfesor(String nombre, String asignatura, String dni, String fechaAlta) {
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] == null) {
                profesores[i] = new Profesor(nombre, asignatura, dni, fechaAlta);
                return;
            }
        }
        System.out.println("No se pueden añadir más profesores.");
    }

    public void eliminarProfesor(String nombreProfesor) {
        if (profesores.length == 0) {
            System.out.println("No hay profesores aún.");
            return;
        }

        boolean existe = false;
        for (int i = 0; i < profesores.length && !existe; i++) {
            if (profesores[i].getNombre().equalsIgnoreCase(nombreProfesor)) {
                // Eliminar al profesor
                System.arraycopy(profesores, i + 1, profesores, i, profesores.length - i - 1);
                profesores = Arrays.copyOf(profesores, profesores.length - 1);
                System.out.println("Profesor eliminado.");
                existe = true;
            }
        }
        if (!existe){
            System.out.println("No se ha encontrado ningún profesor con ese nombre.");
        }
    }

    public void calcularMediaNotas(){
        double suma = 0;
        for (Estudiante alumno : alumnos) {
            for (double nota : alumno.getNotas()) {
                suma += nota;
            }
        }
        System.out.println("La nota media de los alumnos es: " + suma / (alumnos.length * alumnos[0].getNotas().length));
    }

    public void buscarEstudiante(String nombre) {
        boolean existe = false;
        for (int i = 0; i < alumnos.length && !existe; i++) {
            if (alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Listado de notas del alumno " + alumnos[i].getNombre() + ":");
                for (int j = 0; j < alumnos[i].getNotas().length; j++) {
                    System.out.println("- Asignatura " + (j + 1) + ": " + alumnos[i].getNotas()[j]);
                }
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No se ha encontrado ningún estudiante con ese nombre.");
        }
    }

    public void mostrarListado() {
        System.out.println("Listado de alumnos:");
        for (Estudiante estudiante : alumnos) {
            if (estudiante != null) {
                System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad());
            }
        }

        System.out.println("\nListado de profesores:");
        for (Profesor profesor : profesores) {
            if (profesor != null) {
                System.out.println("Nombre: " + profesor.getNombre() + ", Asignatura: " + profesor.getAsignaturaImpartida());
            }
        }
    }
}