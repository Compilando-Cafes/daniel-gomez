package t10_colecciones.ejs_libro.aa12_19palabras_repetidas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Contador de palabras repetidas");
        System.out.print("Introduce a continuación una frase: ");
        String frase = new Scanner(System.in).nextLine();
        frase = frase.replace(".", "").replace(",", "");
        // Crear la lista con las palabras
        List<String> palabras = new ArrayList<>(List.of(frase.split(" ")));
        // Lista para almacenar palabras únicas
        List<String> palabrasUnicas = new ArrayList<>();
        // Lista para almacenar palabras repetidas
        List<String> palabrasRepetidas = new ArrayList<>();

        for (String palabra : palabras) {
            if (palabrasUnicas.contains(palabra)) {
                if (!palabrasRepetidas.contains(palabra)) {
                    palabrasRepetidas.add(palabra);
                }
            } else {
                palabrasUnicas.add(palabra);
            }
        }

        System.out.println("Palabras repetidas: " + palabrasRepetidas);

        palabrasUnicas.removeAll(palabrasRepetidas);
        System.out.println("Palabras no repetidas: " + palabrasUnicas);
    }
}
