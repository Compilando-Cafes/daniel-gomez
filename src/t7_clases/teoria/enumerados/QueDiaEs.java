package t7_clases.teoria.enumerados;

import java.util.Arrays;

enum DiaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
enum Meses {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}

public class QueDiaEs {
    // Atributos clase
    private int fechaDia;
    DiaSemana diaDeLaSemana;
    Meses fechaMes;

    // Constructor sin parámetros
    QueDiaEs() {
        fechaDia = 1;
        diaDeLaSemana = DiaSemana.LUNES;
        fechaMes = Meses.ENERO;
    }

    // Constructor con parámetros
    QueDiaEs(String diaLetras, int dia, String mesLetras) {
        // Controlar que el día es correcto
        if (dia > 0 && dia < 32) {
            fechaDia = dia;
        } else {
            fechaDia = 1;
        }

        // Controlar que el mes introducido está en el enum
        Meses[] meses_posibles = Meses.values();
        boolean existe = false;
        for(int i = 0; i < meses_posibles.length && !existe; i++){
            if(mesLetras.equals(meses_posibles[i].name())){
                fechaMes = Meses.valueOf(mesLetras);
                // fechaMes = meses_posibles[i]; Otra forma de hacerlo
                existe = true;
            }
        }
        if(!existe){
            fechaMes = Meses.ENERO;
        }

        // Controlar que día letras es uno del enum
        DiaSemana[] dias_posibles = DiaSemana.values();
        existe = false;
        for(int i = 0; i < dias_posibles.length && !existe; i++){
            if(diaLetras.equals(dias_posibles[i].name())){
                diaDeLaSemana = DiaSemana.valueOf(diaLetras);
                existe = true;
            }
        }
        if(!existe){
            diaDeLaSemana = DiaSemana.LUNES;
        }
    }

    public String queDiaEs(){
        return diaDeLaSemana.name() + ", " + fechaDia + " de " + fechaMes.name();
    }
    public void yaEsManyana(){
        if(fechaDia== 31){
            fechaDia = 1;
            Meses[] meses_posibles = Meses.values();
            if(fechaMes == meses_posibles[meses_posibles.length-1]){
                fechaMes = Meses.ENERO;
            } else {
                int pos = Arrays.binarySearch(meses_posibles, fechaMes);
                fechaMes = meses_posibles[pos+1];
            }
        } else {
            fechaDia++;
        }
    }
}