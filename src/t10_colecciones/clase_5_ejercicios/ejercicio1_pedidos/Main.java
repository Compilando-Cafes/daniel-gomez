package t12_colecciones.clase_5_ejercicios.ejercicio1_pedidos;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Pedido, Set<LineaPedido>> pedidos = new TreeMap<>();
        Pedido pedido1 = new Pedido("Marchamalo", "Al menos una casa es muy bonita", 1);
        Pedido pedido2 = new Pedido("Albacete", "Donde nacen los profesores", 2);
        Pedido pedido3 = new Pedido("Gárgoles de Arriba", "Viven 5 habitantes", 3);
        Pedido pedido4 = new Pedido("Cabanillas del Campo", "Aquí al lado", 4);
        Pedido pedido5 = new Pedido("Fontanar", "Al otro lado", 5);

        LineaPedido lineaPedido1 = new LineaPedido("Manzanas", 10, 2.8, 1);
        LineaPedido lineaPedido2 = new LineaPedido("Peras", 8, 1.9, 2);
        LineaPedido lineaPedido3 = new LineaPedido("Naranjas", 5, 3.1, 3);
        LineaPedido lineaPedido4 = new LineaPedido("Plátanos", 12, 1.45, 4);
        LineaPedido lineaPedido5 = new LineaPedido("Fresas", 23, 3.8, 5);

        pedidos.put(pedido1, new TreeSet<>(Set.of(lineaPedido1, lineaPedido2, lineaPedido3, lineaPedido4, lineaPedido5)));
        pedidos.put(pedido2, new TreeSet<>(Set.of(lineaPedido1, lineaPedido3, lineaPedido5)));
        pedidos.put(pedido3, new TreeSet<>(Set.of(lineaPedido2, lineaPedido3, lineaPedido4)));
        pedidos.put(pedido4, new TreeSet<>(Set.of(lineaPedido1, lineaPedido2)));
        pedidos.put(pedido5, new TreeSet<>(Set.of(lineaPedido5)));

        while (true) {
            System.out.println("""
                    ==============================================
                    Pedidos
                    1. Listar los pedidos disponibles
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 1);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            // Mostrar los pedidos
            System.out.println("¿Qué pedido quieres ver?");
            Set<Map.Entry<Pedido, Set<LineaPedido>>> comandas = pedidos.entrySet();
            for (Map.Entry<Pedido, Set<LineaPedido>> comanda : comandas){
                System.out.println(comanda.getKey().getIdentificadorPedido() + ": " + comanda.getKey().getDireccionEnvio());
            }
            int pedidoElegido = pedirNumeroEntero("Elección: ", 1, comandas.size());
            for (Map.Entry<Pedido, Set<LineaPedido>> comanda : comandas){
                if (comanda.getKey().getIdentificadorPedido() == pedidoElegido){
                    System.out.println(comanda);
                }
            }
        }


    }

    public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}