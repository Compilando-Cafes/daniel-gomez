package t7_clases.ejercicios.ejercicio3_paleta_de_colores;

import java.util.Arrays;

public class Colores {
    private String[] coloresCalidos;    private String[] coloresFrios;

    // Contructor
    Colores() {
        coloresCalidos = new String[0];
        coloresFrios = new String[0];
    }

    public String[] getColoresCalidos() {
        return coloresCalidos;
    }

    public String[] getColoresFrios() {
        return coloresFrios;
    }

    public void nuevoColorCalido(String color) {
        coloresCalidos = Arrays.copyOf(coloresCalidos, coloresCalidos.length + 1);
        coloresCalidos[coloresCalidos.length - 1] = color;
    }

    public void nuevoColorFrio(String color) {
        coloresFrios = Arrays.copyOf(coloresFrios, coloresFrios.length + 1);
        coloresFrios[coloresFrios.length - 1] = color;
    }

    public static int pedirNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }

    public String[] obtenPaletaMixta() {
        String[] paletaMixta = new String[4];
        if (this.coloresCalidos.length > 1 && this.coloresFrios.length > 1) {

            // Conseguir dos números aleatorios diferentes
            int pos1 = pedirNumeroAleatorio(0, this.coloresCalidos.length - 1), pos2 = 0;
            boolean repetido = true;
            while (repetido) {
                pos2 = pedirNumeroAleatorio(0, this.coloresCalidos.length - 1);
                if (pos2 != pos1) {
                    repetido = false;
                }
            }
            paletaMixta[0] = this.coloresCalidos[pos1];
            paletaMixta[1] = this.coloresCalidos[pos2];

            // Conseguir otros dos números aleatorios para los colores fríos
            pos1 = pedirNumeroAleatorio(0, this.coloresFrios.length - 1);
            pos2 = 0;
            repetido = true;
            while (repetido) {
                pos2 = pedirNumeroAleatorio(0, this.coloresFrios.length - 1);
                if (pos2 != pos1) {
                    repetido = false;
                }
            }
            paletaMixta[2] = this.coloresFrios[pos1];
            paletaMixta[3] = this.coloresFrios[pos2];

            return paletaMixta;
        } else {
            Arrays.fill(paletaMixta, "");
            return paletaMixta;
        }
    }

    public String[] obtenPaletaMonocromatica(char tipo) {
        String[] paletaMonocromatica = new String[4];
        // Sí se elige la paleta de colores fríos
        if (tipo == 'f' && this.coloresFrios.length>=4) {
            crearArrayNuevo(paletaMonocromatica, this.coloresFrios);
        } else if (tipo == 'c' && this.coloresCalidos.length>=4) {
            crearArrayNuevo(paletaMonocromatica, this.coloresCalidos);
        } else {
            System.out.println("Introduce un tipo válido. (f = colores fríos, c = colores cálidos");
            Arrays.fill(paletaMonocromatica, "");
        }
        return paletaMonocromatica;
    }

    private void crearArrayNuevo(String[] paletaNueva, String[] paletaOrigen) {
        if (paletaOrigen.length <4){
            Arrays.fill(paletaNueva, "");
        } else {
            int pos1 = pedirNumeroAleatorio(0, paletaOrigen.length - 1), pos2 = 0, pos3 = 0, pos4 = 0;
            boolean repetido = true;
            while (repetido) {
                pos2 = pedirNumeroAleatorio(0, paletaOrigen.length - 1);
                if (pos2 != pos1) {
                    pos3 = pedirNumeroAleatorio(0, paletaOrigen.length - 1);
                    if (pos3 != pos1 && pos3 != pos2) {
                        pos4 = pedirNumeroAleatorio(0, paletaOrigen.length - 1);
                        if (pos4 != pos1 && pos4 != pos2 && pos4 != pos3) {
                            repetido = false;
                        }
                    }
                }
            }
            paletaNueva[0] = paletaOrigen[pos1];
            paletaNueva[1] = paletaOrigen[pos2];
            paletaNueva[2] = paletaOrigen[pos3];
            paletaNueva[3] = paletaOrigen[pos4];
        }
    }
}