package t7_clases.ejercicios.examen6_vuelo;

import java.util.Arrays;

public class Vuelo {
    private Tripulante[] tripulantes;
    private Pasajero[] pasajeros;

    public Vuelo() {
        this.tripulantes = new Tripulante[0];
        this.pasajeros = new Pasajero[0];
    }

    public Tripulante[] getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Tripulante[] tripulantes) {
        if (tripulantes == null)
            this.tripulantes = new Tripulante[0];
        else
            this.tripulantes = tripulantes;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        if (pasajeros == null)
            this.pasajeros = new Pasajero[0];
        else
            this.pasajeros = pasajeros;
    }

    public void listaTripulacionPorRol(String rol) {
        boolean existe = false;
        System.out.println("Nombres de todos los tripulantes que tienen el rol de " + rol);
        for (Tripulante tripulante : tripulantes) {
            if (tripulante != null && rol.equalsIgnoreCase(tripulante.getRol().name())) {
                System.out.println(tripulante.getNombre());
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No hay ningún tripulante con ese rol.");
        }
    }

    public void anyadirTripulante(String nombre, String rol) {
        // Agrandar la lista de tripulantes
        if (tripulantes.length < 5) {
            tripulantes = Arrays.copyOf(tripulantes, tripulantes.length + 1);
            tripulantes[tripulantes.length - 1] = new Tripulante(nombre, rol);
            System.out.println("Tripulante añadido.");
        } else {
            System.out.println("No se pueden añadir más de 5 tripulantes.");
        }
    }

    public void eliminarTripulante(String nombre) {
        // Buscar el tripulante
        boolean existe = false;
        for (int i = 0; i < tripulantes.length && !existe; i++) {
            if (tripulantes[i] != null && nombre.equals(tripulantes[i].getNombre())) {
                // Tripulante encontrado. Eliminarlo de la lista
                System.arraycopy(tripulantes, i + 1, tripulantes, i, tripulantes.length - i - 1);
                // Reducir la lista
                tripulantes = Arrays.copyOf(tripulantes, tripulantes.length - 1);
                System.out.println("Tripulante eliminado.");
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("Tripulante no encontrado.");
        }
    }

    public void anyadirPasajero(String nombre, String apellidos, String pasaporte, int asiento, boolean conVentana) {
        // Comprobar que no supera límite máximo de pasajeros
        if (pasajeros.length < 20) {
            // Ampliar la lista de pasajeros
            pasajeros = Arrays.copyOf(pasajeros, pasajeros.length + 1);
            // Añadir el pasajero
            pasajeros[pasajeros.length - 1] = new Pasajero(nombre, apellidos, pasaporte, asiento, conVentana);
            System.out.println("Pasajero añadido.");

        } else {
            System.out.println("No se pueden añadir más pasajeros. El límite es 20.");
        }
    }

    public void eliminarPasajero(String nombre) {
        // Buscar el pasajero
        boolean existe = false;
        for (int i = 0; i < pasajeros.length && !existe; i++) {
            if (pasajeros[i] != null && nombre.equals(pasajeros[i].getNombre())) {
                // Pasajero encontrado. Eliminar el pasajero
                System.arraycopy(pasajeros, i + 1, pasajeros, i, pasajeros.length - i - 1);
                // Eliminar la última posición del array
                pasajeros = Arrays.copyOf(pasajeros, pasajeros.length-1);
                System.out.println("Pasajero eliminado.");
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("Nombre de pasajero no encontrado.");
        }
    }

    public void obtenerPasajeroPorAsiento(int asiento){
        for (Pasajero pasajero : pasajeros) {
            if (pasajero != null && pasajero.getAsiento() == asiento) {
                System.out.println("El pasajero con asiento " + asiento + " es " + pasajero.getNombre() + " " + pasajero.getApellidos());
                return;
            }
        }
        System.out.println("No hay ningún pasajero con ese asiento.");
    }


}