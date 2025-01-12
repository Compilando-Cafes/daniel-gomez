package t5_arrays.ejercicios_libro;

public class A5_16_Mapa_Juego_Rol {
    public static void main(String[] args) {
        // Creación del mapa
        String [][] mapaSenorAnillos = {
                {"La comarca", "Hobbiton"},
                {"Mordor", "Monte del destino"},
                {"Rivendel", "Casa de Elrond"}
        };
    }
    public static boolean viajarEntreLugares(String[][] tabla, int region, int lugar){
        boolean resultado = true;
        if (region != lugar){
            resultado = false;
        }
        return resultado;
    }
}