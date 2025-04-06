package t9_interfaces.repetidos.ej2_alumno;

import t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos.Alumno;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class VentanaPrincipal extends JFrame {

    // Tabla para mostrar los datos
    private final JTable tabla;
    private final JScrollPane scrollTabla;

    // Lista de alumnos (puedes modificarla si quieres)
    private final Alumno[] alumnos = {
            new Alumno("Juan", "García", LocalDate.of(2000, 2, 4), 25, 6, 3),
            new Alumno("Juana", "García", LocalDate.of(2000, 2, 4), 25, 6, 4),
            new Alumno("Manolo", "Gómez", LocalDate.of(2002, 12, 5), 30, 3, 9),
            new Alumno("María", "Pérez", LocalDate.of(2006, 7, 16), 19, 9, 2),
            new Alumno("Pepe", "Amor", LocalDate.of(2001, 3, 7), 32, 8, 4),
            new Alumno("Ana", "López", LocalDate.of(2003, 5, 8), 28, 7, 5),
            new Alumno("Luis", "Fernández", LocalDate.of(2004, 8, 9), 22, 5, 6),
            new Alumno("Laura", "Martínez", LocalDate.of(2005, 10, 10), 20, 4, 7),
            new Alumno("Carlos", "Sánchez", LocalDate.of(2007, 11, 11), 18, 2, 8),
            new Alumno("Lucía", "Torres", LocalDate.of(2008, 1, 12), 17, 10, 1),
            new Alumno("Javier", "Ramírez", LocalDate.of(2009, 4, 13), 16, 1, 10),
            new Alumno("Sara", "Hernández", LocalDate.of(2010, 6, 14), 15, 0, 11),
            new Alumno("David", "Jiménez", LocalDate.of(2011, 9, 15), 14, 2, 12),
            new Alumno("Cristina", "Díaz", LocalDate.of(2012, 11, 16), 13, 3, 13),
            new Alumno("Fernando", "Moreno", LocalDate.of(2013, 1, 17), 12, 4, 14),
            new Alumno("Elena", "Muñoz", LocalDate.of(2014, 3, 18), 11, 5, 15),
            new Alumno("Álvaro", "Romero", LocalDate.of(2015, 5, 19), 11, 6, 16),
            new Alumno("Patricia", "Vázquez", LocalDate.of(2016, 7, 20), 9, 7, 17),
            new Alumno("Sergio", "Castro", LocalDate.of(2017, 10, 21), 8, 8, 18),
            new Alumno("Raquel", "Molina", LocalDate.of(2018, 12, 22), 34, 9, 19),
            new Alumno("Diego", "Cano", LocalDate.of(2019, 2, 23), 6, 10, 20),
            new Alumno("Marta", "Cruz", LocalDate.of(2020, 4, 24), 5, 1, 21),
            new Alumno("Antonio", "Salas", LocalDate.of(2021, 6, 25), 12, 2, 22),
            new Alumno("Inés", "Paniagua", LocalDate.of(2022, 8, 26), 3, 3, 23),
            new Alumno("Pablo", "Ceballos", LocalDate.of(2023, 10, 27), 2, 4, 24),
            new Alumno("Clara", "Córdoba", LocalDate.of(2024, 12, 28), 1, 5, 25),
            new Alumno("Jorge", "Córdoba", LocalDate.of(2025, 1, 29), 34, 6, 26),
            new Alumno("Alba", "Córdoba", LocalDate.of(2026, 2, 3), 14, 7, 27),
            new Alumno("Cristian", "Córdoba", LocalDate.of(2027, 3, 3), 56, 8, 28),
            new Alumno("María", "Córdoba", LocalDate.of(2028, 4, 1), 43, 9, 29)
    };

    // Constructor de la ventana
    public VentanaPrincipal() {

        // Establecemos fuente de letra para todos los componentes
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 18));
        UIManager.put("Button.font", new Font("Segoe UI", Font.PLAIN, 18));

        // Título de la ventana
        setTitle("Gestión de los alumnos");
        setSize(1000, 600); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar aplicación al cerrar ventana
        setLocationRelativeTo(null); // Centrar ventana en pantalla

        // Panel para los botones (lado izquierdo)
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(7, 1, 5, 5)); // 5 filas, 1 columna
        panelBotones.setBackground(new Color(240, 240, 240)); // Color de fondo
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espaciado interior

        // Crear botones
        JButton btnOriginal = new JButton("Mostrar lista original");
        JButton btnPorNombre = new JButton("Ordenar por nombre");
        JButton btnPorApellido = new JButton("Ordenar por apellido");
        JButton btnPorEdad = new JButton("Ordenar por edad");
        JButton btnPorFecha = new JButton("Ordenar por fecha de nacimiento");
        JButton btnPorNotaMedia = new JButton("Ordenar por nota media");
        JButton btnPorAsigMatric = new JButton("Ordenar por asignaturas matriculadas");

        // Estilo visual para los botones con hover
        estilizarBoton(btnOriginal);
        estilizarBoton(btnPorNombre);
        estilizarBoton(btnPorApellido);
        estilizarBoton(btnPorEdad);
        estilizarBoton(btnPorFecha);
        estilizarBoton(btnPorNotaMedia);
        estilizarBoton(btnPorAsigMatric);

        // Añadir botones al panel
        panelBotones.add(btnOriginal);
        panelBotones.add(btnPorNombre);
        panelBotones.add(btnPorApellido);
        panelBotones.add(btnPorEdad);
        panelBotones.add(btnPorFecha);
        panelBotones.add(btnPorNotaMedia);
        panelBotones.add(btnPorAsigMatric);

        // Acciones de los botones (mostrar tabla ordenada)
        btnOriginal.addActionListener(e -> {
            mostrarTabla(alumnos); // Mostrar lista original
        });

        btnPorNombre.addActionListener(e -> {
            Alumno[] copia = Arrays.copyOf(alumnos, alumnos.length);
            Arrays.sort(copia, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno a1, Alumno a2) {
                    return a1.getNombre().compareTo(a2.getNombre());
                }
            });
            mostrarTabla(copia);
        });

        btnPorApellido.addActionListener(e -> {
            Alumno[] copia = Arrays.copyOf(alumnos, alumnos.length);
            Arrays.sort(copia, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno a1, Alumno a2) {
                    return a1.getApellido().compareTo(a2.getApellido());
                }
            });
            mostrarTabla(copia);
        });

        btnPorEdad.addActionListener(e -> {
            Alumno[] copia = Arrays.copyOf(alumnos, alumnos.length);
            Arrays.sort(copia, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno o1, Alumno o2) {
                    return Integer.compare(o1.getEdad(), o2.getEdad());
                }
            });
            mostrarTabla(copia);
        });

        btnPorFecha.addActionListener(e -> {
            Alumno[] copia = Arrays.copyOf(alumnos, alumnos.length);
            Arrays.sort(copia, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno o1, Alumno o2) {
                    return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
                }
            });
            mostrarTabla(copia);
        });

        btnPorNotaMedia.addActionListener(e -> {
            Alumno[] copia = Arrays.copyOf(alumnos, alumnos.length);
            Arrays.sort(copia, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno o1, Alumno o2) {
                    return Double.compare(o1.getNotaMedia(), o2.getNotaMedia());
                }
            });
            mostrarTabla(copia);
        });

        btnPorAsigMatric.addActionListener(e -> {
            Alumno[] copia = Arrays.copyOf(alumnos, alumnos.length);
            Arrays.sort(copia, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno o1, Alumno o2) {
                    return Integer.compare(o1.getTotalAsignaturasMatriculado(), o2.getTotalAsignaturasMatriculado());
                }
            });
            mostrarTabla(copia);
        });

        // Crear la tabla vacía (más adelante se llenará con datos)
        tabla = new JTable();
        scrollTabla = new JScrollPane(tabla); // Le ponemos scroll a la tabla por si hay muchos alumnos

        // Añadir paneles a la ventana
        add(panelBotones, BorderLayout.WEST); // Botones a la izquierda
        add(scrollTabla, BorderLayout.CENTER); // Tabla al centro
    }

    /**
     * Estilo visual para los botones, con efecto "hover"
     */
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

    /**
     * Método que muestra los alumnos en la tabla (JTable)
     */
    private void mostrarTabla(Alumno[] lista) {
        // Títulos de las columnas
        String[] columnas = {"Nombre", "Apellido", "Edad", "F. nacimiento", "Nota media", "Asig. matric."};

        // Crear la tabla con los datos
        String[][] datos = new String[lista.length][6];
        for (int i = 0; i < lista.length; i++) {
            Alumno a = lista[i];
            datos[i][0] = a.getNombre();
            datos[i][1] = a.getApellido();
            datos[i][2] = String.valueOf(a.getEdad());
            datos[i][3] = a.getFechaNacimiento().toString(); // Puedes dar formato si quieres
            datos[i][4] = String.format("%,.2f", a.getNotaMedia()); // Formato con 2 decimales
            datos[i][5] = String.valueOf(a.getTotalAsignaturasMatriculado());
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

}
