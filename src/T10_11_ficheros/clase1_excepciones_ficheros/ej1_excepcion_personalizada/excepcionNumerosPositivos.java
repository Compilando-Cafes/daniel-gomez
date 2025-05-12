package T10_11_ficheros.clase1_excepciones_ficheros.ej1_excepcion_personalizada;

public class excepcionNumerosPositivos extends Exception{
    @Override
    public String toString() {
        return "Número negativo";
    }
}