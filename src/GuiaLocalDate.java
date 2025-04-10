/*
 * Guía rápida de uso de fechas y horas en Java
 * Basado en LocalDate, LocalTime, LocalDateTime y DateTimeFormatter
 */

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class GuiaLocalDate {

    public static void main(String[] args) {
        // --- LocalDate (solo fechas) ---
        LocalDate fecha1 = LocalDate.of(2021, 3, 12); // Crear fecha concreta
        LocalDate fecha2 = LocalDate.parse("2021-03-12"); // Crear desde String
        LocalDate hoy = LocalDate.now(); // Fecha actual

        LocalDate fechaPlus = fecha1.plus(4, ChronoUnit.DAYS); // Sumar días
        LocalDate fechaMinus = hoy.minus(2, ChronoUnit.DAYS); // Restar días

        int dia = fecha1.getDayOfMonth(); // Día del mes
        int mes = fecha1.getMonthValue(); // Mes (número)
        boolean bisiesto = fecha1.isLeapYear(); // Año bisiesto

        boolean despues = fechaPlus.isAfter(fecha1);
        boolean antes = fechaPlus.isBefore(fecha1);

        int comparacion = fechaPlus.compareTo(fecha1); // Comparar fechas

        Period periodo = Period.between(LocalDate.parse("2015-05-12"), LocalDate.parse("2021-08-05"));
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        long mesesEntre = ChronoUnit.MONTHS.between(LocalDate.of(2015, 11, 21), LocalDate.of(2021, 9, 25));

        // Formato personalizado
        DateTimeFormatter formatoEsp = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFormateada = fecha1.format(formatoEsp);

        DateTimeFormatter formatoLocal = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
        String fechaLocal = fecha1.format(formatoLocal);

        LocalDate parseada = LocalDate.parse("04/09/15", formatoLocal);

        // --- LocalTime (solo horas) ---
        LocalTime hora1 = LocalTime.of(14, 32); // Hora sin segundos
        LocalTime hora2 = LocalTime.of(14, 32, 15); // Hora con segundos
        LocalTime ahora = LocalTime.now(); // Hora actual

        int minuto = hora1.getMinute();

        LocalTime horaSumada = hora1.plus(35, ChronoUnit.MINUTES);
        LocalTime horaRestada = hora1.minus(5, ChronoUnit.HOURS);

        boolean horaDespues = hora2.isAfter(hora1);
        boolean horaAntes = hora2.isBefore(hora1);

        Duration duracion = Duration.between(hora2, LocalTime.of(18, 21, 1));
        long minutosDuracion = ChronoUnit.MINUTES.between(hora2, LocalTime.of(18, 21, 1));

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String horaFormateada = ahora.format(formatoHora);

        // --- LocalDateTime (fecha y hora juntas) ---
        LocalDateTime fechaHora1 = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        LocalDateTime actual = LocalDateTime.now();

        int horaExacta = fechaHora1.getHour();
        LocalDate fechaExtraida = fechaHora1.toLocalDate();
        LocalTime horaExtraida = fechaHora1.toLocalTime();

        LocalDateTime futura = actual.plus(1, ChronoUnit.YEARS);

        boolean fechaHoraAntes = fechaHora1.isBefore(actual);
        boolean fechaHoraDespues = fechaHora1.isAfter(actual);

        long horasEntre = fechaHora1.until(LocalDateTime.of(2021, 6, 14, 12, 30, 30), ChronoUnit.HOURS);

        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm:ss.SSSS");
        String fechaHoraFormateada = actual.format(formatoFechaHora);

        DateTimeFormatter formatoLocalCompleto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        String fechaHoraLocal = actual.format(formatoLocalCompleto);
    }
}