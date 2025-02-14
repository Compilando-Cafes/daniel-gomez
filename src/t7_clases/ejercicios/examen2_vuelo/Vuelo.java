package t7_clases.ejercicios.examen2_vuelo;

import java.util.Arrays;

public class Vuelo {
    private Tripulante[] tripulantes;
    private Pasajero[] pasajeros;

    public Tripulante[] getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Tripulante[] tripulantes) {
        if (tripulantes.length > 0 && tripulantes.length <= 5)
            this.tripulantes = tripulantes;
        else {
            System.out.println("No se ha podido añadir la lista de tripulantes.\n" +
                    "Introduce una lista que tenga al menos 1 tripulante y 5 como máximo.");
        }
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        if (pasajeros.length > 0 && pasajeros.length <= 20)
            this.pasajeros = pasajeros;
        else
            System.out.println("No se ha podido añadir la lista de pasajeros.\n" +
                    "Introduce una lista que tenga al menos 1 pasajero y 20 como máximo.");
    }

    Vuelo() {
        this.tripulantes = new Tripulante[5];
        this.pasajeros = new Pasajero[20];
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
        for (int i = 0; i < tripulantes.length; i++) {
            if (tripulantes[i] == null) {
                tripulantes[i] = new Tripulante(nombre, rol);
                return;
            }
        }
        System.out.println("No hay espacio para más tripulantes.");
    }

    public void eliminarTripulante(String nombre){
        int index = -1;

        // Buscar el índice del elemento a eliminar
        for (int i = 0; i < tripulantes.length; i++) {
            if (tripulantes[i] != null && nombre.equalsIgnoreCase(tripulantes[i].getNombre())) {
                index = i;
                break;
            }
        }

        // Si no se encuentra el elemento, devolver el array sin cambios
        if (index == -1) {
            return;
        }

        // Mover los elementos una posición atrás
        System.arraycopy(tripulantes, index + 1, tripulantes, index, tripulantes.length - index - 1);

        // Reducir el tamaño del array
        tripulantes = Arrays.copyOf(tripulantes, tripulantes.length - 1);
    }

    public void anyadirPasajero(String nombre, String apellidos, String pasaporte, int asiento, boolean conVentana) {
        int count = 0;
        for (Pasajero p : pasajeros) {
            if (p != null) count++;
        }

        if (count < 20) { // Verifica que haya espacio disponible
            pasajeros = Arrays.copyOf(pasajeros, pasajeros.length + 1);
            pasajeros[pasajeros.length - 1] = new Pasajero(nombre, apellidos, pasaporte, asiento, conVentana);
        } else {
            System.out.println("No hay espacio para más pasajeros.");
        }
    }


    public void eliminarPasajero(String nombre){
        int index = -1;

        // Buscar el índice del elemento a eliminar
        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] != null && nombre.equalsIgnoreCase(pasajeros[i].getNombre())) {
                index = i;
                break;
            }
        }

        // Si no se encuentra el elemento, devolver el array sin cambios
        if (index == -1) {
            return;
        }

        // Mover los elementos una posición atrás
        System.arraycopy(pasajeros, index + 1, pasajeros, index, pasajeros.length - index - 1);

        // Reducir el tamaño del array
        pasajeros = Arrays.copyOf(pasajeros, pasajeros.length - 1);
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