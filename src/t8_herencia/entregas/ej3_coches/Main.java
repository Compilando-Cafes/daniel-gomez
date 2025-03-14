package t8_herencia.entregas.ej3_coches;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Truck truck1 = new Truck(120, 50000, "Verde fosforito", 3000);
        Truck truck2 = new Truck(130, 60000, "Amarillo iridiscente", 1000);
        Ford ford1 = new Ford(150, 15000, "Azul camaleón", 2017, 0.6);
        Ford ford2 = new Ford(170, 20000, "Marrón gamberro", 2024, 0.95);
        Sedan sedan1 = new Sedan(200, 30000, "Naranja butano", 4);
        Sedan sedan2 = new Sedan(220, 35000, "Gris cenizo", 4.5);


        System.out.printf("El truck1 modelo: \"%s\" tiene un precio de: %,.2f€\n", nombreClase(truck1), truck1.precio());
        Thread.sleep(700);
        System.out.printf("El truck2 modelo: \"%s\" tiene un precio de: %,.2f€\n", nombreClase(truck2), truck2.precio());
        Thread.sleep(700);
        System.out.printf("El ford1 modelo: \"%s\" tiene un precio de: %,.2f€\n", nombreClase(ford1), ford1.precio());
        Thread.sleep(700);
        System.out.printf("El ford2 modelo: \"%s\" tiene un precio de: %,.2f€\n", nombreClase(ford2), ford2.precio());
        Thread.sleep(700);
        System.out.printf("El sedan1 modelo: \"%s\" tiene un precio de: %,.2f€\n", nombreClase(sedan1), sedan1.precio());
        Thread.sleep(700);
        System.out.printf("El sedan2 modelo: \"%s\" tiene un precio de: %,.2f€\n", nombreClase(sedan2), sedan2.precio());
        Thread.sleep(700);
    }

    public static String nombreClase(Object clase) {
        int posicionUltimoPunto = clase.getClass().getName().lastIndexOf(".");
        return clase.getClass().getName().substring(posicionUltimoPunto+1);
    }
}