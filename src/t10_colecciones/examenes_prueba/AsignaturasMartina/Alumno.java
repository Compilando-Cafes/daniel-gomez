package t10_colecciones.examenes_prueba.AsignaturasMartina;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Alumno implements Comparable<Alumno> {
    protected int idalumno;
    protected String nombre;
    List<NotasAlumno> notas = new ArrayList<>();

    public Alumno(int idalumno, String nombre, List<NotasAlumno> notas) {
        this.idalumno = idalumno;
        this.nombre = nombre;
        this.notas = (notas != null) ? notas : new ArrayList<>();
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<NotasAlumno> getNotas() {
        return notas;
    }

    public void setNotas(List<NotasAlumno> notas) {
        this.notas = notas;
    }

    public int notaAsignatura(int as) {
        for (NotasAlumno nota : notas) {
            if (nota.getAsignatura().getIdasignatura() == as) {
                return nota.getNota();
            }
        }
        return -1;
    }

    public void insertaNota(NotasAlumno n) {
        notas.add(n);
    }

    public double notaMedia() {
        double resultado = 0.0;
        if (!notas.isEmpty()) {
            for (NotasAlumno alumno : notas) {
                resultado += alumno.getNota();
            }
        } else {
            return 0;
        }
        return resultado / notas.size();
    }

    public String asignaturaMasNota() {
        Comparator<NotasAlumno> compAlumno = new Comparator<NotasAlumno>() {
            @Override
            public int compare(NotasAlumno o1, NotasAlumno o2) {
                return Integer.compare(o1.getNota(), o2.getNota());
            }
        };
        NotasAlumno max = Collections.max(notas, compAlumno);
        return max.getAsignatura().getNombreasig();
    }

    public String asignaturaMenosNota() {
        Comparator<NotasAlumno> compAlumno = new Comparator<NotasAlumno>() {
            @Override
            public int compare(NotasAlumno o1, NotasAlumno o2) {
                return Integer.compare(o1.getNota(), o2.getNota());
            }
        };
        NotasAlumno min = Collections.min(notas, compAlumno);
        return min.getAsignatura().getNombreasig();
    }

    public int numeroSuspensos() {
        int contador = 0;
        for (NotasAlumno alumno : notas) {
            if (alumno.getNota() < 5) {
                contador++;
            }
        }
        return contador;
    }

    public int numeroAprobados() {
        int contador = 0;
        for (NotasAlumno alumno : notas) {
            if (alumno.getNota() >= 5) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        String resultado = "ID: " + idalumno + " / Nombre: " + nombre;
        if (!notas.isEmpty()) {
            for (NotasAlumno alumno : notas) {
                resultado += "\n\t" + alumno.getAsignatura().getNombreasig() + ", Nota: " + alumno.getNota();
            }
        }
        return resultado;
    }

    @Override
    public int compareTo(Alumno otro) {
        return Integer.compare(this.idalumno, otro.idalumno);
    }
}
