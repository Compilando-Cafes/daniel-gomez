package t9_interfaces.interfaz2.ej1_gestor_notificaciones;

public class GestorNotificaciones {
    public void procesarNotificacion(Notificador notificador, String destinatario, String mensaje){
        System.out.println("Procesando mensaje...");
        if(notificador.enviarMensaje(destinatario, mensaje)) {
            System.out.println("Notificación enviada con éxito");
        } else {
            System.out.println("Error al enviar la notificación");
        }
    }
}