package t7_clases.ejercicios.examen3_banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        nombre: Juan, apellidos: García López, DNI: 12345678A, Usuario: juangarcia, Contraseña: Pass1234, Cuenta:12345671, saldo: 2346,45
        nombre: María, apellidos: Fernández Ruiz, DNI: 23456789B, Usuario: mariafr, Contraseña: 9876maria, Cuenta:12345672, saldo: 1234,56
        nombre: Carlos, apellidos: Martínez Gómez, DNI: 34567890C, Usuario: carlosmg, Contraseña: Carlitos22, Cuenta:12345673, saldo: 6543,23
        nombre: Laura, apellidos: Rodríguez Díaz, DNI: 45678901D, Usuario: laurar, Contraseña: LRod123, Cuenta:12345674, saldo: 6372,23
        */
        Banco bbva = new Banco();
        bbva.crearCuenta(sc);
        bbva.crearCuenta(sc);
        bbva.crearCuenta(sc);
        bbva.crearCuenta(sc);


        // VARIABLE QUE GUARDA LA OPCION
        int op = -1;

        do {
            //MENÚ
            System.out.println();
            System.out.println("Elija su opcion");
            System.out.println("1. Iniciar Sesion");
            System.out.println("2. Revisar sus datos");
            System.out.println("3. Revisar últimos movimientos");
            System.out.println("4. Ingresar dinero");
            System.out.println("5. Retirar Dinero");
            System.out.println("6. Cerrar sesión");
            System.out.println("7. Salir");

            //COMPRUEBA QUE TODOS LOS ENTEROS ESTÁN DENTRO DE LOS RANGOS
            op = sc.nextInt();
            sc.nextLine();
            if (op == 1) {
                System.out.println("Introduce el usuario: ");
                String usuario = sc.nextLine();
                System.out.println("Introduce la contraseña: ");
                String contra = sc.nextLine();
                bbva.iniciarSesion(usuario, contra);
            } else if (op == 2) {
                bbva.revisarDatosCliente();
            } else if (op == 3) {
                bbva.revisarEstadoCuenta();
            } else if (op == 4) {
                System.out.println("Introduce la cantidad a ingresar: ");
                double cantidad = sc.nextDouble();
                bbva.ingresarDinero(cantidad);
            } else if (op == 5) {
                System.out.println("Introduce la cantidad a retirar: ");
                double cantidad = sc.nextDouble();
                bbva.retirarDinero(cantidad);
            } else if (op == 6) {
                bbva.cerrarSesion();
            }
        } while (op != 7);
    }

}