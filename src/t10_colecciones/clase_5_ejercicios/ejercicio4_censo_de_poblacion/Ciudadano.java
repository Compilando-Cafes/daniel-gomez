package t10_colecciones.clase_5_ejercicios.ejercicio4_censo_de_poblacion;

public class Ciudadano implements Comparable<Ciudadano>{
    private String nombre;
    private int edad;
    private String ciudad;

    public Ciudadano(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        setEdad(edad);
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0)
            this.edad = edad;
        else {
            System.out.println("Edad mínima cero.");
            this.edad = 0;
        }
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return nombre + " de " + edad + " años de edad que vive en " + ciudad;
    }

    @Override
    public int compareTo(Ciudadano o) {
        if (this.nombre.equals(o.nombre)){
            if(this.edad == o.edad){
                return this.ciudad.compareTo(o.ciudad);
            } else {
                return Integer.compare(this.edad, o.edad);
            }
        }else {
            return this.nombre.compareTo(o.nombre);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            Ciudadano otroCiudadano = (Ciudadano) obj;
            if (this.nombre.equals(otroCiudadano.nombre)) {
                if (this.edad == otroCiudadano.edad) {
                    return this.ciudad.equals(otroCiudadano.ciudad);
                } else {
                    return this.edad == otroCiudadano.edad;
                }
            } else {
                return this.nombre.equals(otroCiudadano.nombre);
            }
        } else {
            return false;
        }
    }
}