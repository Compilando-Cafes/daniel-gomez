package t7_clases.ejercicios.examen5_gestion_restaurante;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();

        // Añadir platos
        restaurante.agregarPlato(new Plato("Hamburguesa", 8.50, true));
        restaurante.agregarPlato(new Plato("Ensalada", 5.00, true));

        // Añadir clientes
        restaurante.agregarCliente("Pedro", 1);
        restaurante.agregarCliente("Lucía", 2);

        int op;
        do {
            System.out.println("\n1. Tomar pedido");
            System.out.println("2. Mostrar menú");
            System.out.println("3. Mostrar clientes");
            System.out.println("4. Salir");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Introduce el nombre del cliente:");
                String nombreCliente = sc.nextLine();
                System.out.println("Introduce el nombre del plato:");
                String nombrePlato = sc.nextLine();
                restaurante.tomarPedido(nombreCliente, nombrePlato);
            } else if (op == 2) {
                restaurante.mostrarMenu();
            } else if (op == 3) {
                restaurante.mostrarClientes();
            }
        } while (op != 4);
    }
}
