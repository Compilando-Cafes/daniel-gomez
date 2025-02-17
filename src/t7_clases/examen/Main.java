package t7_clases.examen;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //CREACIÓN DEL RESTAURANTE
        Restaurante restaurant = new Restaurante();
        restaurant.empleados[0] = new Empleado("Sara", "CAMARERO");
        restaurant.empleados[1] = new Empleado("Daniel","CAMARERO");
        restaurant.empleados[2] = new Empleado("Jesus","CAMARERO");
        restaurant.empleados[3] = new Empleado("Susana", "COCINERO");
        restaurant.empleados[4] = new Empleado("Andres","COCINERO");

        restaurant.platos[0] = new Plato(0,"Hamburguesa basica",4.50,6);
        restaurant.platos[1] = new Plato(1,"Sandwich mixto",2.50,3);
        restaurant.platos[2] = new Plato(2,"Tarta de Chocolate",2.00,1);
        restaurant.platos[3] = new Plato(3,"Bocata de bacon",3.00,2);
        restaurant.platos[4] = new Plato(4,"Patatas bravas",4.00,3);
        restaurant.platos[5] = new Plato(5,"Pimientos fritos",3.00,1);

        // VARIABLE QUE GUARDA LA OPCION
        int op = -1;

        do{
            //MENÚ
            System.out.println();
            System.out.println("Elija su opcion");
            System.out.println("1. Llega un cliente");
            System.out.println("2. Quiero ver la carta y pedir");
            System.out.println("3. Tanda de cocina");
            System.out.println("4. Entrega de pedidos");
            System.out.println("5. La cuenta");
            System.out.println("6. Cierra el restaurante");
            System.out.print("Opción: ");
            //COMPRUEBA QUE TODOS LOS ENTEROS ESTÁN DENTRO DE LOS RANGOS
            op = pedirNumeroEntero();
            if(op == 1) {
                System.out.println("Introduce el nombre: ");
                String nombre = sc.nextLine();
                int num = restaurant.entradaCliente(nombre);
                System.out.println("Su mesa es la "+num+", recuerde ese numero");
            }else if(op == 2) {
                restaurant.mostrarMenu();
                System.out.println("Diga su mesa por favor");
                int mesa = sc.nextInt();
                sc.nextLine();
                System.out.println("Diga el plato que va a pedir por favor");
                int plato = sc.nextInt();
                restaurant.apuntaComanda(plato,mesa);
            }else if(op == 3) {
                restaurant.tandaDeCocina();
            }else if(op == 4) {
                restaurant.entregarComanda();
            }else if(op == 5) {
                System.out.println("Diga su mesa por favor");
                int mesa = sc.nextInt();
                restaurant.salidaCliente(mesa);
            }else if(op == 6) {
                System.out.println("Resumen de trabajadores: ");
                restaurant.resumenDia();
            }
        }while(op != 6);
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
