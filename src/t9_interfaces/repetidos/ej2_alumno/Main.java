package t9_interfaces.repetidos.ej2_alumno;

import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
        // Crea y muestra la ventana en el hilo de eventos de swing
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}