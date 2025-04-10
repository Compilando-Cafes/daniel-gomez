package t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos;

import java.time.LocalDate;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int edad;
    private double notaMedia;
    private int totalAsignaturasMatriculado;

    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, int edad, double notaMedia, int totalAsignaturasMatriculado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.totalAsignaturasMatriculado = totalAsignaturasMatriculado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getTotalAsignaturasMatriculado() {
        return totalAsignaturasMatriculado;
    }

    public void setTotalAsignaturasMatriculado(int totalAsignaturasMatriculado) {
        this.totalAsignaturasMatriculado = totalAsignaturasMatriculado;
    }

    @Override
    public String toString() {
        return String.format("""
                    %s %s.
                    \tNacido en la fecha %s.
                    \tCon la edad de %,d.
                    \tTiene una nota media de %,.2f.
                    \tActualmente está matriculado en %d asignaturas.
                """, nombre, apellido, fechaNacimiento.toString(), edad, notaMedia, totalAsignaturasMatriculado);
    }

//    @Override
//    public int compareTo(Object o) {
//        Alumno alumno = (Alumno) o;
//        // 1. Edad, 2. Fecha nacimiento. 3. apellido. 4. Nombre.
//        // 1. A igualdad de edad
//        if (alumno.edad == (this.edad)) {
//            // A igualdad de fecha de nacimiento
//            if (alumno.fechaNacimiento.equals(this.fechaNacimiento)) {
//                // A igualdad de apellido
//                if (alumno.apellido.equals(this.apellido)) {
//                    // Comprar por nombre
//                    if (alumno.nombre.compareTo(getNombre()) < 0) {
//                        return -1;
//                    } else if (alumno.nombre.compareTo(getNombre()) > 0) {
//                        return 1;
//                    } else {
//                        return 0;
//                    }
//                } else { // Comparar por apellido
//                    if (alumno.apellido.compareTo(this.apellido) < 0) {
//                        return -1;
//                    } else if (alumno.apellido.compareTo(this.apellido) > 0) {
//                        return 1;
//                    } else {
//                        return 0;
//                    }
//                }
//            } else { // Comparar por fecha de nacimiento
//                if (alumno.fechaNacimiento.toString().compareTo(this.fechaNacimiento.toString()) < 0) {
//                    return -1;
//                } else if (alumno.fechaNacimiento.toString().compareTo(this.fechaNacimiento.toString()) > 0) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        } else if (alumno.edad < edad) {
//            return -1;
//        } else if (alumno.edad > edad) {
//            return 1;
//        }
//        return 0;
//    }

    @Override
    public boolean equals(Object obj) {
        Alumno otroAlumno = (Alumno) obj;
        return edad == otroAlumno.edad && fechaNacimiento.toString().equals(otroAlumno.fechaNacimiento.toString()) && apellido.equals(otroAlumno.apellido) && nombre.equals(otroAlumno.nombre);
    }

    @Override
    public int compareTo(Alumno otro) {
        // 1. Edad
        if (this.edad != otro.edad) {
            return Integer.compare(this.edad, otro.edad);
        }

        // 2. Fecha de nacimiento
        int resultado = this.fechaNacimiento.compareTo(otro.fechaNacimiento);
        if (resultado != 0) {
            return resultado;
        }

        // 3. Apellido
        resultado = this.apellido.compareTo(otro.apellido);
        if (resultado != 0) {
            return resultado;
        }

        // 4. Nombre
        return this.nombre.compareTo(otro.nombre);
    }
}