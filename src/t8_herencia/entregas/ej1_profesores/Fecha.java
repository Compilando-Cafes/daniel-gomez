package t8_herencia.entregas.ej1_profesores;

import java.time.LocalDate;
import java.time.DateTimeException;

public class Fecha {
    private int dia;
    private int mes;
    private int agno;

    public Fecha(int dia, int mes, int agno) {
        if (esFechaValida(dia, mes, agno)){
            this.dia = dia;
            this.mes = mes;
            this.agno = agno;
        }
        else{
            System.out.println("Fecha incorrecta. Se pone por defecto 01/01/0001");
            this.dia = 1;
            this.mes = 1;
            this.agno = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia<31)
            this.dia = dia;
        else
            System.out.println("Día incorrecto.");
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <=12)
            this.mes = mes;
        else
            System.out.println("Mes incorrecto.");
    }

    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, agno);
    }
    public static boolean esFechaValida(int dia, int mes, int agno) {
        try {
            // Intenta crear una fecha
            LocalDate.of(agno, mes, dia);
            // Si llega aquí es que es correcta y devuelve true
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}