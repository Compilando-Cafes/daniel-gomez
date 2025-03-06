package t9_interfaces.interfaz2.ej1_gestor_notificaciones;

public class Main {
    public static void main(String[] args) {
        GestorNotificaciones gestorNotificaciones = new GestorNotificaciones();

        // Clase anónima para el correo
        Notificador correo = new Notificador() {
            public boolean enviarMensaje(String destinatario, String mensaje) {
                if (destinatario.isBlank())
                    return false;
                else {
                    System.out.println("Destinatario: " + destinatario);
                    System.out.println("Mensaje: " + mensaje);
                    return true;
                }
            }
        };

        // Clase anónima para el SMS
        Notificador sms = new Notificador() {
            public boolean enviarMensaje(String destinatario, String mensaje) {
                if (destinatario.isBlank())
                    return false;
                else {
                    System.out.println("¡Tienes una notificación!");
                    System.out.println(destinatario + " : " + mensaje);
                    return true;
                }
            }
        };

        gestorNotificaciones.procesarNotificacion(correo, "Putin", "¿Cómo va la guerra?");
        System.out.println();
        gestorNotificaciones.procesarNotificacion(correo, "", "Spam");
        System.out.println();
        gestorNotificaciones.procesarNotificacion(sms, "Trump", "¿Qué guerra?");
        System.out.println();
        gestorNotificaciones.procesarNotificacion(sms, "", "¿Qué guerra?");


    }
}