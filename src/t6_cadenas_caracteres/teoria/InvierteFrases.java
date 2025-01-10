package t6_cadenas_caracteres.teoria;

public class InvierteFrases {
    public static void main(String[] args) {
        String frase = "Hola mundo";
        System.out.println("Frase:");
        System.out.println("\t" + frase);
        System.out.println("Frase al revés:");
        System.out.println("\t" + invertirFrase("Hola mundo"));
    }

    public static String invertirFrase(String frase) {
        String fraseInvertida = "";
        for (int i = 0; i < frase.length(); i++) {
            fraseInvertida = frase.charAt(i) + fraseInvertida;
        }
        return fraseInvertida;
    }

}