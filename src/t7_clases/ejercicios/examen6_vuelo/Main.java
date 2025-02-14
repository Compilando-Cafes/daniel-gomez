package t7_clases.ejercicios.examen6_vuelo;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO Auto-generated method stub
        Vuelo m_p = new Vuelo();
        m_p.anyadirPasajero("Pedro","García López","X1234567", 5, true);
        m_p.anyadirPasajero("Ana","Fernández Ruiz", "Y9876543", 12, false);
        m_p.anyadirPasajero("María","Martínez Gómez", "Z3456789", 3, true);
        m_p.anyadirPasajero("Sara","Rodríguez Díaz","A7654321", 7, false);
        m_p.anyadirPasajero("José","Sánchez Pérez", "B5678901", 20, true);
        m_p.anyadirPasajero("Jesús","López Torres", "C2345678", 8, false);
        m_p.anyadirPasajero("Ainhoa","Pérez Ramírez", "D8765432", 15, true);
        m_p.anyadirPasajero("Daniel","Gómez Hernández", "E3456789", 10, false);
        m_p.anyadirPasajero("David","Díaz Moreno", "F6543210", 18, true);
        m_p.anyadirPasajero("Mario","Ramírez Castillo", "G7890123", 2, false);
        m_p.anyadirPasajero("Miguel","Moreno Vargas", "H9012345", 6,true);

        m_p.anyadirTripulante("Julia", "PILOTO");
        m_p.anyadirTripulante("Mar", "SERVICIO");
        m_p.anyadirTripulante("Martín", "SERVICIO");
        m_p.anyadirTripulante("Miguel", "SERVICIO");
        m_p.anyadirTripulante("Alma", "CARGAMENTO");
        m_p.anyadirTripulante("Adela", "CARGAMENTO");


        // VARIABLE QUE GUARDA LA OPCION
        int op = -1;

        do{
            //MENÚ
            System.out.println();
            System.out.println("Elija su opcion");
            System.out.println("1. Eliminar un pasajero por su nombre");
            System.out.println("2. Eliminar un tripulante por su nombre");
            System.out.println("3. Listar tripulantes por rol");
            System.out.println("4. Obtener pasajero por asiento");
            System.out.println("5. Salir");

            //COMPRUEBA QUE TODOS LOS ENTEROS ESTÁN DENTRO DE LOS RANGOS
            System.out.print("Opción: ");
            op = pedirNumeroEntero();
            if(op == 1) {
                System.out.println("Introduce el nombre: ");
                String nombre = sc.nextLine();
                m_p.eliminarPasajero(nombre);
            }else if(op == 2) {
                System.out.println("Introduce el nombre: ");
                String nombre = sc.nextLine();
                m_p.eliminarTripulante(nombre);
            }else if(op == 3) {
                System.out.println("Introduce el rol: ");
                String rol = sc.nextLine();
                m_p.listaTripulacionPorRol(rol);
            }else if(op == 4) {
                System.out.println("Introduce el asiento: ");
                int asiento = sc.nextInt();
                m_p.obtenerPasajeroPorAsiento(asiento);
            }
        }while(op != 5);
    }

    public static int pedirNumeroEntero() {
        int numero;
        while (true) {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } else {
                System.out.print("Introduce un número válido: ");
                sc.nextLine();
            }
        }
    }

}

