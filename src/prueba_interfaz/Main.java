package prueba_interfaz;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la ventana
        Ventana v = new Ventana();
        // Hacer visible la ventana
        v.setVisible(true);
        // Configurar la operación de cierre de la ventana
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Establecer el tamaño de la ventana
        v.setSize(300, 300);
        // Centrar la ventana en la pantalla
        v.setLocationRelativeTo(null);
        // Establecer el título de la ventana
        v.setTitle("Ventana con botón");
        // Hacer que la ventana no sea redimensionable
        v.setResizable(false);
        // Establecer el mensaje que se mostrará al pulsar el botón
        v.setMensaje("Hola mundo");
    }
}

class Ventana extends JFrame {
    private String mensaje;

    public Ventana() {
        // Crear un panel con GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        // Crear un botón con el texto "Ver mensaje"
        JButton boton = new JButton("Ver mensaje");
        // Establecer el tamaño del botón
        boton.setPreferredSize(new Dimension(150, 50));
        // Añadir un ActionListener al botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje emergente con el texto almacenado en 'mensaje'
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        // Añadir el botón al panel
        panel.add(boton, gbc);
        // Añadir el panel a la ventana
        this.add(panel);
        // Ajustar el tamaño de la ventana para que se ajuste al contenido preferido
        this.pack();
    }
    // Método para establecer el mensaje que se mostrará al pulsar el botón
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}