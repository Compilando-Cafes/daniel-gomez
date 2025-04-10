package t9_interfaces.repetidos.ej3_llamada;

import t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos.Alumno;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaLlamadas().setVisible(true));
    }
}

class VentanaLlamadas extends JFrame {
    private final JTable tabla;
    private final JScrollPane scrollTabla;

    Double[] precioLlamadas = {0.03, 0.1, 0.25, 0.5};
    Llamada[] llamadas = {
            new Llamada(234234234, 632134567, false, LocalDateTime.now(), LocalDateTime.now().plusMinutes(20), Llamada.Distancia.A, precioLlamadas),
            new Llamada(123456789, 987654321, true, LocalDateTime.now(), LocalDateTime.now().plusMinutes(30), Llamada.Distancia.B, precioLlamadas),
            new Llamada(222222222, 333333333, false, LocalDateTime.of(2024, 3, 5, 3, 10), LocalDateTime.of(2024, 3, 5, 3, 15), Llamada.Distancia.C, precioLlamadas),
            new Llamada(949123456, 949123457, true, LocalDateTime.now(), LocalDateTime.now().plusHours(2), Llamada.Distancia.A, precioLlamadas),
            new Llamada(123456771, 223334445, false, LocalDateTime.of(2025, 1, 1, 1, 1), LocalDateTime.of(2026, 1, 1, 1, 1), Llamada.Distancia.B, precioLlamadas),
            new Llamada(661123456, 637123456, true, LocalDateTime.now(), LocalDateTime.now().plusMonths(1), Llamada.Distancia.C, precioLlamadas),
            new Llamada(765623456, 888945678, false, LocalDateTime.now(), LocalDateTime.now().plusHours(1), Llamada.Distancia.D, precioLlamadas),
            new Llamada(333333333, 666666666, true, LocalDateTime.now(), LocalDateTime.now().plusSeconds(60), Llamada.Distancia.A, precioLlamadas),
            new Llamada(122222222, 888888888, false, LocalDateTime.now(), LocalDateTime.now().plusWeeks(1), Llamada.Distancia.B, precioLlamadas),
            new Llamada(123444321, 234523456, true, LocalDateTime.now(), LocalDateTime.now().plusYears(1), Llamada.Distancia.C, precioLlamadas),
    };

    public VentanaLlamadas() {
        // Para poner una imagen en el icono
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/t9_interfaces/repetidos/ej3_llamada/iconoLlamada.jpg");
        setIconImage(miIcono);

        // Los 4 principales: visible, tamaño, cerrar y posición
        setVisible(true);
        setTitle("Llamadas");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Alineado al centro

        // Panel a la izquierda para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 1, 5, 40));
        panelBotones.setBackground(new Color(240, 240, 240));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Crear los botones
        JButton btnMostrarLlamadas = new JButton("Mostrar llamadas");
        JButton btnMostrarLlamadasOrdenadas = new JButton("Orden natural");
        JButton btnMostrarLlamadasOrdenInverso = new JButton("Orden inverso");
        JButton btnMostrarLlamadasOrdenCoste = new JButton("Orden por coste");

        // Estilo de los botones
        estilizarBoton(btnMostrarLlamadas);
        estilizarBoton(btnMostrarLlamadasOrdenadas);
        estilizarBoton(btnMostrarLlamadasOrdenInverso);
        estilizarBoton(btnMostrarLlamadasOrdenCoste);

        // Añadir los botones al panel
        panelBotones.add(btnMostrarLlamadas);
        panelBotones.add(btnMostrarLlamadasOrdenadas);
        panelBotones.add(btnMostrarLlamadasOrdenInverso);
        panelBotones.add(btnMostrarLlamadasOrdenCoste);

        // Configurar lo que hace cada botón
        btnMostrarLlamadas.addActionListener(e -> {
            mostrarTabla(llamadas); // Mostrar lista original
        });

        btnMostrarLlamadasOrdenadas.addActionListener(e -> {
            Llamada[] copia = Arrays.copyOf(llamadas, llamadas.length);
            Arrays.sort(copia);
            mostrarTabla(copia);
        });

        btnMostrarLlamadasOrdenInverso.addActionListener(e -> {
            Llamada[] copia = Arrays.copyOf(llamadas, llamadas.length);
            Arrays.sort(copia, new Comparator<Llamada>() {
                @Override
                public int compare(Llamada o1, Llamada o2) {
                    return o2.compareTo(o1);
                }
            });
            mostrarTabla(copia);
        });

        btnMostrarLlamadasOrdenCoste.addActionListener(e -> {
            Llamada[] copia = Arrays.copyOf(llamadas, llamadas.length);
            ComparatorLlamadasPorCoste clpc = new ComparatorLlamadasPorCoste();
            Arrays.sort(copia, clpc);
            mostrarTabla(copia);
        });

        // Crear la tabla vacía (más adelante se llenará con datos)
        tabla = new JTable();
        scrollTabla = new JScrollPane(tabla); // Le ponemos scroll a la tabla por si hay muchos alumnos

        // Añadir paneles a la ventana
        add(panelBotones, BorderLayout.WEST); // Botones a la izquierda
        add(scrollTabla, BorderLayout.CENTER); // Tabla al centro
    }

    private void estilizarBoton(JButton boton) {
        Color colorBase = new Color(220, 220, 250); // Color normal
        Color colorHover = new Color(200, 200, 240); // Color al pasar el ratón

        boton.setFocusPainted(false); // Quitar borde de selección
        boton.setBackground(colorBase); // Fondo inicial
        boton.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 240), 1)); // Borde
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambiar el cursor al pasar

        // Efecto de cambio de color al pasar el ratón por encima
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setBackground(colorHover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBackground(colorBase);
            }
        });
    }

    private void mostrarTabla(Llamada[] lista) {
        // Títulos de las columnas
        String[] columnas = {"Número Cliente", "Número destino", "Tipo", "Fecha y hora inicio", "Fecha y hora fin", "Distancia", "Coste llamada"};

        // Crear la tabla con los datos
        String[][] datos = new String[lista.length][7];
        for (int i = 0; i < lista.length; i++) {
            Llamada a = lista[i];
            datos[i][0] = String.valueOf(formatoTelefono(a.getNumeroCliente()));
            datos[i][1] = String.valueOf(formatoTelefono(a.getNumeroDestino()));
            datos[i][2] = a.isEntranteSaliente()? "Entrante": "Saliente";
            datos[i][3] = a.getInicioLlamada().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
            datos[i][4] = a.getFinLlamada().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
            datos[i][5] = a.getDistancia().toString();
            datos[i][6] = String.format("%,.2f€", a.calcularCoste());
        }

        // Modelo de tabla no editable
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Aplicar el modelo
        tabla.setModel(modelo);
        // tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Activa scroll horizontal

        // ESTILOS VISUALES
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 16)); // Fuente legible
        tabla.setRowHeight(28); // Altura de las filas
        tabla.setGridColor(new Color(230, 230, 250)); // Color de las líneas
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(false); // Sin líneas verticales

        // Estilo del encabezado
        JTableHeader header = tabla.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 18));
        header.setBackground(new Color(200, 220, 255)); // Fondo del encabezado
        header.setForeground(Color.DARK_GRAY); // Color del texto
        header.setReorderingAllowed(false); // No permitir mover columnas

        // Colores de las filas (alternos y selección)
        tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (isSelected) {
                    c.setBackground(new Color(180, 200, 255)); // Fila seleccionada
                    c.setForeground(Color.BLACK);
                } else {
                    c.setBackground(row % 2 == 0 ? new Color(245, 245, 255) : Color.WHITE); // Fila par/impar
                    c.setForeground(Color.BLACK);
                }
                return c;
            }
        });

        // Mostrar tabla dentro del scroll
        scrollTabla.setViewportView(tabla);
    }

    public String formatoTelefono(int numeroTelefono){
        return String.format("%,09d", numeroTelefono).replace('.', ' ');
    }

}

