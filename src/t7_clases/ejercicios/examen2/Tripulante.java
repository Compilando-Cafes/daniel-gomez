package t7_clases.ejercicios.examen2;

public class Tripulante {
    enum Rol {PILOTO, SERVICIO, CARGAMENTO}
    private String nombre;
    private Rol rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(String rol) {
        boolean existe = false;
        Rol[] rolesDisponibles = Rol.values();
        for (int i = 0; i < rolesDisponibles.length; i++) {
            if (rol.equalsIgnoreCase(rolesDisponibles[i].name())){
                this.rol = Rol.valueOf(rol);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No se ha encontrado el rol introducido. Se pone el rol por defecto: Piloto.");
            this.rol = Rol.PILOTO;
        }
    }

    Tripulante(String nombre, String rol) {
        this.nombre = nombre;
        boolean existe = false;
        Rol[] rolesDisponibles = Rol.values();
        for (int i = 0; i < rolesDisponibles.length; i++) {
            if (rol.equalsIgnoreCase(rolesDisponibles[i].name())){
                this.rol = Rol.valueOf(rol);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No se ha encontrado el rol introducido. Se pone el rol por defecto: Piloto.");
            this.rol = Rol.PILOTO;
        }
    }

    public void mostrarDatos(){
        System.out.println("El tripulante " + nombre + " está a bordo con el rol " + rol.name() + ".");
    }
}