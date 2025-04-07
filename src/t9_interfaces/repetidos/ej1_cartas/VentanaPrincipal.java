package t9_interfaces.repetidos.ej1_cartas;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class VentanaPrincipal extends JFrame {
    private Carta[] cartas;
    private JTextArea areaCartas;
    private JTextField campoNumeroCartas;

    public VentanaPrincipal() {
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 18));
        UIManager.put("Button.font", new Font("Segoe UI", Font.PLAIN, 18));
        UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 18));

        setTitle("Baraja");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Primero el panel superior
        JPanel panelSuperior = new JPanel();
        // Segundo el texto
        panelSuperior.add(new JLabel("¿Cuántas cartas quieres crear?"));
        // Tercero el campo de texto
        campoNumeroCartas = new JTextField(5);
        panelSuperior.add(campoNumeroCartas);
        JButton btnMostrar = new JButton("Mostrar");
        panelSuperior.add(btnMostrar);
        add(panelSuperior, BorderLayout.NORTH);

        // Panel izquierdo con botones de ordenación
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        JButton btnOrdenarNumero = new JButton("Ordenar por número");
        JButton btnOrdenarNumeroPalo = new JButton("Ordenar por número y palo");
        panelIzquierdo.add(btnOrdenarNumero);
        panelIzquierdo.add(Box.createVerticalStrut(10));
        panelIzquierdo.add(btnOrdenarNumeroPalo);
        add(panelIzquierdo, BorderLayout.WEST);

        // Área de texto central con scroll
        areaCartas = new JTextArea();
        areaCartas.setFont(new Font("Monospaced", Font.PLAIN, 16));
        areaCartas.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaCartas);
        add(scroll, BorderLayout.CENTER);

        // Acción del botón "Mostrar"
        btnMostrar.addActionListener(e -> generarCartas());

        // Acción del botón "Ordenar por número"
        btnOrdenarNumero.addActionListener(e -> {
            if (cartas != null) {
                Arrays.sort(cartas, Comparator.comparingInt(Carta::getNumero));
                mostrarCartas();
            }
        });

        // Acción del botón "Ordenar por número y palo"
        btnOrdenarNumeroPalo.addActionListener(e -> {
            if (cartas != null) {
                Arrays.sort(cartas, Comparator
                        .comparingInt(Carta::getNumero)
                        .thenComparing(Carta::getPalo));
                mostrarCartas();
            }
        });

        setVisible(true);
    }

    private void generarCartas() {
        try {
            int numero = Integer.parseInt(campoNumeroCartas.getText());
            if (numero > 0) {
                cartas = new Carta[numero];
                for (int i = 0; i < numero; i++) {
                    cartas[i] = Carta.crearCarta();
                }
                mostrarCartas();
            } else {
                JOptionPane.showMessageDialog(this, "El número debe ser mayor que 0.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debes escribir un número válido.");
        }
    }

    private void mostrarCartas() {
        StringBuilder texto = new StringBuilder();
        for (Carta c : cartas) {
            texto.append(c.toString()).append("\n");
        }
        areaCartas.setText(texto.toString());
    }
}
