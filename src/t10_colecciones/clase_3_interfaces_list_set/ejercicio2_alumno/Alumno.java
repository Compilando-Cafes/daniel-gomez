package t10_colecciones.clase_3_interfaces_list_set.ejercicio2_alumno;

import java.util.*;

public class Alumno implements Comparable<Alumno>{
    private int idAlumno;
    private String nombre;
    private List<NotasAlumno> notasAlumno;

    public Alumno(int idAlumno, String nombre, List<NotasAlumno> notasAlumno) {
        setIdAlumno(idAlumno);
        this.nombre = nombre;
        this.notasAlumno = notasAlumno;
    }

    public Alumno(int idAlumno, String nombre) {
        setIdAlumno(idAlumno);
        this.nombre = nombre;
        this.notasAlumno = new ArrayList<>();
    }

    public Alumno(int idAlumno, List<NotasAlumno> notasAlumno) {
        this.idAlumno = idAlumno;
        this.notasAlumno = notasAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        if (idAlumno > 0)
            this.idAlumno = idAlumno;
        else
            System.out.println("Id incorrecto. Debe ser superior a 0. Id sin actualizar");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<NotasAlumno> getNotasAlumno() {
        return notasAlumno;
    }

    public void setNotasAlumno(List<NotasAlumno> notasAlumno) {
        this.notasAlumno = notasAlumno;
    }

    public int notaAsignatura(Integer as) {
        return notasAlumno.get(as).getNota();
    }

    public void insertaNota(NotasAlumno n) {
        this.notasAlumno.add(n);
    }

    public double notaMedia() {
        double media = 0.0;
        for (NotasAlumno alumno : notasAlumno) {
            media += alumno.getNota();
        }
        if (media > 0) {
            media /= notasAlumno.size();
        }
        return media;
    }

    public String asignaturaMasNota() {
        // Si no lo he entendido mal, para usar el max se le tiene que pasar un comparator para decirle lo que usar para calcularlo
        return Collections.max(notasAlumno, new Comparator<NotasAlumno>() {
            @Override
            public int compare(NotasAlumno o1, NotasAlumno o2) {
                return Integer.compare(o1.getNota(), o2.getNota());
            }
        }).getAsignatura().getNombreAsignatura();
    }

    public String asignaturaMenosNota() {
        return Collections.min(notasAlumno, new Comparator<NotasAlumno>() {
            @Override
            public int compare(NotasAlumno o1, NotasAlumno o2) {
                return Integer.compare(o1.getNota(), o2.getNota());
            }
        }).getAsignatura().getNombreAsignatura();
    }

    public int numeroSuspensos() {
        int suspensos = 0;
        for (NotasAlumno nota : notasAlumno) {
            if (nota.getNota() < 5)
                suspensos++;
        }
        return suspensos;
    }

    public int numeroAprobados() {
        return notasAlumno.size() - numeroSuspensos();
    }

    @Override
    public String toString() {
        String resultado = String.format("id: %d / %s\n", getIdAlumno(), getNombre());
        for (NotasAlumno nota : notasAlumno) {
            resultado += String.format("\t· %s, Nota: %d\n", nota.getAsignatura(), nota.getNota());
        }
        return resultado;
    }

    @Override
    public int compareTo(Alumno o) {
        return Integer.compare(this.idAlumno, o.idAlumno);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Alumno) obj).idAlumno == idAlumno;
    }
}