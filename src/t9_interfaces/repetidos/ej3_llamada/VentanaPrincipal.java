package t9_interfaces.repetidos.ej3_llamada;
import javax.swing.*;

public class VentanaPrincipal extends JFrame{
    VentanaPrincipal(){
        setBounds(500, 300, 800, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Llamadas");

    }
}