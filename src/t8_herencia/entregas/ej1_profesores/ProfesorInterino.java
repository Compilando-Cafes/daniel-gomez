package t8_herencia.entregas.ej1_profesores;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProfesorInterino extends Profesor {
    private Fecha fechaFinContrato;
    private Fecha fechaInicioContrato;

    public ProfesorInterino(String nombre, String especialidad, String nombreCentro, int agnosConsolidados, Fecha fechaFinContrato, Fecha fechaInicioContrato) {
        super(nombre, especialidad, nombreCentro, agnosConsolidados);
        this.fechaFinContrato = fechaFinContrato;
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public ProfesorInterino() {
        this.fechaFinContrato = new Fecha(1, 1, 1);
        this.fechaFinContrato = new Fecha(1, 1, 1);
    }

    public Fecha getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Fecha fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public Fecha getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Fecha fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    @Override
    public String obtenerSalarioBase() {
        // Calcular cantidad de meses con LocalDate y ChronoUnit (más exacto)
        LocalDate fecha1 = LocalDate.of(2023, 5, 15);
        LocalDate fecha2 = LocalDate.of(2024, 2, 10);
        long mesesEntreDosFechas = ChronoUnit.MONTHS.between(fecha1, fecha2);

        /*
        // Cálculo sin LocalDate
        int meses = 0;
        int agnos = fechaFinContrato.getAgno() - fechaInicioContrato.getAgno();

        if (agnos > 0) {
            meses = (agnos * 12) + (fechaFinContrato.getMes() - fechaInicioContrato.getMes());
        } else {
            meses = fechaFinContrato.getMes() - fechaInicioContrato.getMes();
        }
        */

        double resultado = 725 + ((double) 725 / mesesEntreDosFechas);
        return String.format("%,.2f€", resultado);
    }

    @Override
    public String toString() {
        return "============================" +
                "\nProfesor/a interino/a: " + nombre +
                "\n\tFecha inicio de contrato: " + fechaInicioContrato +
                "\n\tFecha fin de contrato: " + fechaFinContrato +
                "\n\tCentro: " + nombreCentro +
                "\n\tEspecialidad: " + especialidad +
                "\n\tSalario: " + obtenerSalarioBase();
    }
}