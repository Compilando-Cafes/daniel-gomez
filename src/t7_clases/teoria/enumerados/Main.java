package t7_clases.teoria.enumerados;

public class Main {
    public static void main(String[] args) {
        QueDiaEs fecha1 = new QueDiaEs("MARTES", 3, "FEBRERO");
        System.out.println(fecha1.queDiaEs());
        fecha1.yaEsManyana();
        System.out.println(fecha1.queDiaEs());
    }

    public static String[] transformar(Meses[] leer){
        String[] cadenas = new String[leer.length];
        for (int i = 0; i< leer.length; i++){
            cadenas[i] = leer[i].name();
        }
        return cadenas;
    }
}