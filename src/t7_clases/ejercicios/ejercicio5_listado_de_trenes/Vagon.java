package t7_clases.ejercicios.ejercicio5_listado_de_trenes;

public class Vagon {
    enum TipoMercancia {Mineral, Vehiculos, M_Construcción, P_Comercial}

    private int numeroOrden;
    private double cargaMaxima;
    private double cargaActual;
    private TipoMercancia tipoMercancia;

    // Constructor con parámetros
    Vagon(int numeroOrden, double cargaMaxima, double cargaActual, String tipoMercancia) {
        if (numeroOrden > 0)
            this.numeroOrden = numeroOrden;
        else
            this.numeroOrden = 1;

        if (cargaMaxima > 0)
            this.cargaMaxima = cargaMaxima;
        else
            this.cargaMaxima = 1;

        if (cargaActual > 0)
            this.cargaActual = cargaActual;
        else
            this.cargaActual = 1;

        TipoMercancia[] tipoMercanciasPosibles = TipoMercancia.values();
        boolean existe = false;
        for (int i = 0; i < tipoMercanciasPosibles.length && !existe; i++) {
            if (tipoMercancia.equals(tipoMercanciasPosibles[i].name())) {
                this.tipoMercancia = TipoMercancia.valueOf(tipoMercancia);
                existe = true;
            }
        }
        if (!existe) {
            this.tipoMercancia = TipoMercancia.Mineral;
        }
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        if (numeroOrden > 0)
            this.numeroOrden = numeroOrden;
        else
            this.numeroOrden = 1;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        if (cargaMaxima > 0)
            this.cargaMaxima = cargaMaxima;
        else
            this.cargaMaxima = 1;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        if (cargaActual > 0)
            this.cargaActual = cargaActual;
        else
            this.cargaActual = 1;
    }

    public TipoMercancia getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        TipoMercancia[] tipoMercanciasPosibles = TipoMercancia.values();
        boolean existe = false;
        for (int i = 0; i < tipoMercanciasPosibles.length && !existe; i++) {
            if (tipoMercancia.equals(tipoMercanciasPosibles[i].name())) {
                this.tipoMercancia = TipoMercancia.valueOf(tipoMercancia);
                existe = true;
            }
        }
        if (!existe) {
            this.tipoMercancia = TipoMercancia.Mineral;
        }
    }
}