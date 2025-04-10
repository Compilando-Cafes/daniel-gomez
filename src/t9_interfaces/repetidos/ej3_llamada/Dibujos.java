package t9_interfaces.repetidos.ej3_llamada;

import javax.swing.*;
import java.awt.*;

public class Dibujos {
    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
    }

}

class MarcoConDibujos extends JFrame{
    public MarcoConDibujos(){
        setTitle("Prueba de dibujos");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
    }
}

class LaminaConFiguras extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 200,200);
        g.drawLine(100, 100, 30, 30);
        g.drawArc(50, 100, 100, 200, 120, 150);
    }
}