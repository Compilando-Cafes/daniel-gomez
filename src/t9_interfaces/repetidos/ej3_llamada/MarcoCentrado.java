package t9_interfaces.repetidos.ej3_llamada;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado extends JFrame {
    public MarcoCentrado() {
        // Para obtener el tamaño de la pantalla donde se ejecute
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();

        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("Llamadas");

        Image miIcono = miPantalla.getImage("src/t9_interfaces/repetidos/ej3_llamada/iconoLlamada.jpg");
        setIconImage(miIcono);
        setVisible(true);
    }
}