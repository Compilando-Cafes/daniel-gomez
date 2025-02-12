package t7_clases.ejercicios.examen1;

import java.lang.reflect.Array;
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
        for (Profesor profesor : this.profesores) {
            profesor.setNombre("");
            profesor.setDni("");
            profesor.setAsignaturaImpartida("");
            profesor.setFechaAlta("");
        }

        this.alumnos = new Estudiante[10];
        for (Estudiante alumno : this.alumnos) {
            alumno.setEdad(16);
            alumno.setNombre("");
            double[] notas = new double[10];
            Arrays.fill(notas, 0);
            alumno.setNotas(notas);
        }

        this.nombreCurso = nombreCurso;
    }

    public void anyadirEstudiante(String nombre, int edad) {
        if (alumnos.length < 20) {
            alumnos = Arrays.copyOf(alumnos, alumnos.length + 1);
            Estudiante estudiante = new Estudiante(nombre, edad, alumnos[alumnos.length - 1].getNotas());
            alumnos[alumnos.length - 1] = estudiante;
        }
    }

    public void eliminarEstudiante(String nombreAlumno) {
        boolean existe = false;
        for (int i = 0; i < alumnos.length && !existe; i++) {
            if (alumnos[i].getNombre().equalsIgnoreCase(nombreAlumno)){
                // Eliminar al estudiante
                System.arraycopy(alumnos, i + 1, alumnos, i, alumnos.length - i - 1);
                alumnos = Arrays.copyOf(alumnos, alumnos.length - 1);
                existe = true;
            }
        }
    }
}