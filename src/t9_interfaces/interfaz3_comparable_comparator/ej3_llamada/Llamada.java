package t9_interfaces.interfaz3_comparable_comparator.ej3_llamada;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Llamada implements Comparable<Llamada> {
    enum DistanciaTelefonos {A, B, C, D}

    private int numeroTelefono;
    private int numeroTelefonoSeLlamo;
    private boolean entranteSaliente;
    private LocalDateTime fechaYHoraIncioLlamada;
    private LocalDateTime fechaYHoraFinLlamada;
    private DistanciaTelefonos distanciaTelefonos;
    private double[] euroMinuto;

    public Llamada(int numeroTelefono, int numeroTelefonoSeLlamo, boolean entrante, LocalDateTime fechaYHoraInicioLlamada, LocalDateTime fechaYHoraFinLlamada, DistanciaTelefonos distanciaTelefonos, double[] euroMinuto) {
        if (numeroTelefono > 999999999 || numeroTelefono < 100000000) {
            System.out.println("El número introducido no es válido. Puesto el 100000000 por defecto");
            this.numeroTelefono = 100000000;
        } else
            this.numeroTelefono = numeroTelefono;
        if (numeroTelefonoSeLlamo > 999999999 || numeroTelefonoSeLlamo < 100000000) {
            System.out.println("El número introducido no es válido. Puesto el 100000000 por defecto");
            this.numeroTelefonoSeLlamo = 100000000;
        } else
            this.numeroTelefonoSeLlamo = numeroTelefonoSeLlamo;
        this.entranteSaliente = entrante;
        this.fechaYHoraIncioLlamada = fechaYHoraInicioLlamada;
        this.fechaYHoraFinLlamada = fechaYHoraFinLlamada;
        this.distanciaTelefonos = distanciaTelefonos;
        this.euroMinuto = euroMinuto;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        if (numeroTelefono > 999999999 || numeroTelefono < 100000000) {
            System.out.println("El número introducido no es válido. Puesto el 100000000 por defecto");
            this.numeroTelefono = 100000000;
        } else
            this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroTelefonoSeLlamo() {
        return numeroTelefonoSeLlamo;
    }

    public void setNumeroTelefonoSeLlamo(int numeroTelefonoSeLlamo) {
        if (numeroTelefonoSeLlamo > 999999999 || numeroTelefonoSeLlamo < 100000000) {
            System.out.println("El número introducido no es válido. Puesto el 100000000 por defecto");
            this.numeroTelefonoSeLlamo = 100000000;
        } else
            this.numeroTelefonoSeLlamo = numeroTelefonoSeLlamo;
    }

    public boolean isEntranteSaliente() {
        return entranteSaliente;
    }

    public void setEntranteSaliente(boolean entranteSaliente) {
        this.entranteSaliente = entranteSaliente;
    }

    public LocalDateTime getFechaYHoraIncioLlamada() {
        return fechaYHoraIncioLlamada;
    }

    public void setFechaYHoraIncioLlamada(LocalDateTime fechaYHoraIncioLlamada) {
        this.fechaYHoraIncioLlamada = fechaYHoraIncioLlamada;
    }

    public LocalDateTime getFechaYHoraFinLlamada() {
        return fechaYHoraFinLlamada;
    }

    public void setFechaYHoraFinLlamada(LocalDateTime fechaYHoraFinLlamada) {
        this.fechaYHoraFinLlamada = fechaYHoraFinLlamada;
    }

    public DistanciaTelefonos getDistanciaTelefonos() {
        return distanciaTelefonos;
    }

    public void setDistanciaTelefonos(DistanciaTelefonos distanciaTelefonos) {
        this.distanciaTelefonos = distanciaTelefonos;
    }

    public double[] getEuroMinuto() {
        return euroMinuto;
    }

    public void setEuroMinuto(double[] euroMinuto) {
        this.euroMinuto = euroMinuto;
    }

    public double calcularCoste(){
        double resultado = 0;
        if (!entranteSaliente) {
            // Calcular valor del minuto
            if (distanciaTelefonos == DistanciaTelefonos.A)
                resultado = euroMinuto[0] * duracionLlamada();
            if (distanciaTelefonos == DistanciaTelefonos.B)
                resultado = euroMinuto[1] * duracionLlamada();
            if (distanciaTelefonos == DistanciaTelefonos.C)
                resultado = euroMinuto[2] * duracionLlamada();
            if (distanciaTelefonos == DistanciaTelefonos.D)
                resultado = euroMinuto[3] * duracionLlamada();
        }
        return resultado;
    }

    public double duracionLlamada(){
        return fechaYHoraIncioLlamada.until(fechaYHoraFinLlamada, ChronoUnit.MINUTES);
    }

    @Override
    public String toString() {
        // Para dar formato al día
        DateTimeFormatter formatoDia = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        // Para dar formato a la hora
        DateTimeFormatter formatoHora = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        String tipoLlamada = this.entranteSaliente ? "recibido" : "realizado";
        String mismoDistintoDia = fechaYHoraIncioLlamada.toLocalDate().isEqual(fechaYHoraFinLlamada.toLocalDate()) ? "mismo día":"día " + this.fechaYHoraFinLlamada.format(formatoDia);
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
                formatoTelefono(numeroTelefono),
                tipoLlamada, formatoTelefono(numeroTelefonoSeLlamo),
                fechaYHoraIncioLlamada.format(formatoDia),
                fechaYHoraIncioLlamada.format(formatoHora),
                fechaYHoraFinLlamada.format(formatoHora),
                mismoDistintoDia, costeLlamada);
    }

    public String formatoTelefono(int numeroTelefono){
        return String.format("%,09d", numeroTelefono).replace('.', ' ');
    }

    @Override
    public int compareTo(Llamada o) {
        if (this.numeroTelefono == o.numeroTelefono) {
            return this.fechaYHoraIncioLlamada.compareTo(o.fechaYHoraIncioLlamada);
        } else {
            return Integer.compare(this.numeroTelefono, o.numeroTelefono);
        }
    }
}