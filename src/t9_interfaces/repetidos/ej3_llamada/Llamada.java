package t9_interfaces.repetidos.ej3_llamada;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Llamada implements Comparable<Llamada>{
    enum Distancia {A, B, C, D}
    private int numeroCliente;
    private int numeroDestino;
    private boolean entranteSaliente;
    private LocalDateTime inicioLlamada;
    private LocalDateTime finLlamada;
    private Distancia distancia;
    private Double[] valorMinuto;

    public Llamada(int numeroCliente, int numeroDestino, boolean entranteSaliente, LocalDateTime inicioLlamada, LocalDateTime finLlamada, Distancia distancia, Double[] valorMinuto) {
        setNumeroCliente(numeroCliente);
        setNumeroDestino(numeroDestino);
        setEntranteSaliente(entranteSaliente);
        setInicioLlamada(inicioLlamada);
        setFinLlamada(finLlamada);
        setDistancia(distancia);
        setValorMinuto(valorMinuto);
    }

    public int getNumeroCliente() {
        return this.numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        if (numeroCliente > 0 && numeroCliente< 999999999) {
            this.numeroCliente = numeroCliente;
        } else {
            this.numeroCliente = 0;
        }
    }

    public int getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(int numeroDestino) {
        if (numeroDestino > 0 && numeroDestino< 999999999) {
            this.numeroDestino = numeroDestino;
        } else {
            this.numeroDestino = 0;
        }
    }

    public boolean isEntranteSaliente() {
        return entranteSaliente;
    }

    public void setEntranteSaliente(boolean entranteSaliente) {
        this.entranteSaliente = entranteSaliente;
    }

    public LocalDateTime getInicioLlamada() {
        return inicioLlamada;
    }

    public void setInicioLlamada(LocalDateTime inicioLlamada) {
        this.inicioLlamada = inicioLlamada;
    }

    public LocalDateTime getFinLlamada() {
        return finLlamada;
    }

    public void setFinLlamada(LocalDateTime finLlamada) {
        this.finLlamada = finLlamada;
    }

    public Distancia getDistancia() {
        return distancia;
    }

    public void setDistancia(Distancia distancia) {
        this.distancia = distancia;
    }

    public Double[] getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(Double[] valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    @Override
    public String toString() {
        // Para dar formato al día
        DateTimeFormatter formatoDia = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        // Para dar formato a la hora
        DateTimeFormatter formatoHora = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        String tipoLlamada = this.entranteSaliente ? "recibido" : "realizado";
        String mismoDistintoDia = inicioLlamada.toLocalDate().isEqual(finLlamada.toLocalDate()) ? "mismo día":"día " + this.finLlamada.format(formatoDia);
        String costeLlamada = entranteSaliente?"":String.format("\n\tHa supuesto un coste de %,.2f €.", calcularCoste());
        return String.format("""
                ______________________________________________________
                Teléfono de la compañía: %s
                \tHa %s una llamada del teléfono %s
                \tFecha llamada: %s
                \tHora inicio llamada: %s
                \tHora fin llamada: %s
                \tDel %s %s
                """,
                formatoTelefono(numeroCliente),
                tipoLlamada, formatoTelefono(numeroDestino),
                inicioLlamada.format(formatoDia),
                inicioLlamada.format(formatoHora),
                finLlamada.format(formatoHora),
                mismoDistintoDia, costeLlamada);
    }

    public String formatoTelefono(int numeroTelefono){
        return String.format("%,09d", numeroTelefono).replace('.', ' ');
    }

    public double calcularCoste(){
        double resultado = 0;
        if (!entranteSaliente) {
            // Calcular valor del minuto
            if (distancia == Distancia.A)
                resultado = valorMinuto[0] * duracionLlamada();
            if (distancia == Distancia.B)
                resultado = valorMinuto[1] * duracionLlamada();
            if (distancia == Distancia.C)
                resultado = valorMinuto[2] * duracionLlamada();
            if (distancia == Distancia.D)
                resultado = valorMinuto[3] * duracionLlamada();
        }
        return resultado;
    }
    public double duracionLlamada(){
        return inicioLlamada.until(finLlamada, ChronoUnit.MINUTES);
    }

    @Override
    public int compareTo(Llamada o) {
        if (numeroCliente == o.numeroCliente){
            return this.inicioLlamada.compareTo(o.inicioLlamada);
        } else {
            return Integer.compare(numeroCliente, o.numeroCliente);
        }
    }
}