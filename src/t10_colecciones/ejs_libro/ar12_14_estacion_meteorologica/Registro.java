package t10_colecciones.ejs_libro.ar12_14_estacion_meteorologica;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Registro implements Serializable {
    LocalTime hora;
    double temperatura;
    public Registro(double temperatura){
        this.temperatura = temperatura;
        this.hora = LocalTime.now();
    }

    @Override
    public boolean equals(Object obj) {
        return hora.equals(((Registro) obj).hora);
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        return "Registro{" + "hora=" + hora.format(f) + ", temperatura=" + temperatura + "ºC}\n";
    }
}