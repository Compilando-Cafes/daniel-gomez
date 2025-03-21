package t9_interfaces.ejercicios.ej4_dispositivo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Crear 3 objetos, uno de cada tipo
        Telefono telefono = new Telefono(30, false, true);
        Ordenador ordenador = new Ordenador(10, true, true);
        Lavadora lavadora = new Lavadora("Sostenible", 2000, true, 5, 9);

        // Probando el teléfono
        System.out.println("========== TELÉFONO ===========");
        telefono.mostrarInformacion();
        System.out.println("Utilizando Whatsapp:");
        telefono.utilizar("Whatsapp");
        System.out.println("Utilizando Instagram:");
        telefono.utilizar("Instagram");
        System.out.println("Utilizando TikTok:");
        telefono.utilizar("TikTok");
        System.out.println("Utilizando Gmail:");
        telefono.utilizar("Gmail");
        System.out.println("Apagando el teléfono:");
        telefono.apagar();
        System.out.println("Reiniciando el teléfono:");
        telefono.reiniciar();
        System.out.println("Cargando la batería del teléfono:");
        telefono.cargarBateria();
        telefono.mostrarInformacion();

        // Utilizando el ordenador
        System.out.println("\n========== ORDENADOR ===========");
        ordenador.mostrarInformacion();
        System.out.println("Utilizando el ordenador con 5 pestañas abiertas:");
        ordenador.utilizar(5);
        System.out.println("Utilizando el ordenador con 10 pestañas abiertas:");
        ordenador.utilizar(10);
        System.out.println("Utilizando el ordenador con 30 pestañas abiertas:");
        ordenador.utilizar(30);
        System.out.println("Apagando el ordenador:");
        ordenador.apagar();
        System.out.println("Encendiendo el ordenador:");
        ordenador.encender();
        System.out.println("Reiniciando el ordenador:");
        ordenador.reiniciar();
        System.out.println("Comprobando la batería del ordenador:");
        ordenador.verificarBateria();
        System.out.println("Cargando la batería del ordenador:");
        ordenador.cargarBateria();

        // Probando la lavadora
        System.out.println("\n========== LAVADORA ===========");
        lavadora.mostrarInformacion();
        System.out.println("Seleccionando el modo a corta duración de la lavadora:");
        lavadora.seleccionarModo("Corta duración");
        System.out.println("Aumentando la capacidad de la lavadora:");
        lavadora.aumentarCapacidad(3);
        System.out.println("Restando la capacidad de la lavadora:");
        lavadora.restarCapacidad(3);
        System.out.println("Apagando la lavadora:");
        lavadora.apagar();
        System.out.println("Encendiendo la lavadora:");
        lavadora.encender();
        System.out.println("Seleccionando potencia de la lavadora a 2000:");
        lavadora.seleccionarPotencia(2000);
        lavadora.mostrarInformacion();

    }

}