package t6_cadenas_caracteres.teoria;

public class Ejercicio_String_Participio {
    public static void main(String[] args) {
        System.out.println(esParticipio("empezado"));


    }
    static boolean esParticipio(String verbo){
        boolean com = false;
        verbo = verbo.strip();
        System.out.println(verbo);
        if (!verbo.isBlank() && !verbo.isBlank() && verbo.length()>2){
            com = verbo.endsWith("do");
        }

        return com;
    }
}