package t6_cadenas_caracteres.examen;

import java.util.Arrays;

public class vocales_3 {
    public static void main(String[] args) {
        String frase1 = "el murcielago se oculto en la cueva";
        secuenciaDePalabras(frase1);
        String frase2 = "ana hablo sobre la fiesta el martes";
        secuenciaDePalabras(frase2);
        String frase3 = "vi lobos moverse por el bosque";
        secuenciaDePalabras(frase3);
        String frase4 = "esther regalo peluches a todos los estudiantes";
        secuenciaDePalabras(frase4);
    }

    public static void secuenciaDePalabras(String frase) {
        String[] palabras = frase.split(" ");
        int[] contadorVocales = new int[5];

        // Contar cuantas veces se repite cada vocal en la frase
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                switch (letra) {
                    case 'a' -> contadorVocales[0]++;
                    case 'e' -> contadorVocales[1]++;
                    case 'i' -> contadorVocales[2]++;
                    case 'o' -> contadorVocales[3]++;
                    case 'u' -> contadorVocales[4]++;
                }
            }
        }

        // Ver que contador es el mayor
        int mayor = 0;
        for (int i = 0; i < contadorVocales.length; i++) {
            if (contadorVocales[i] > mayor) {
                mayor = contadorVocales[i];
            }
        }

        // Asignar a un String la vocal que más se repite
        String vocal = "";
        for (int i = 0; i < contadorVocales.length; i++) {
            if (contadorVocales[i] == mayor) {
                switch (i) {
                    case 0 -> vocal = "a";
                    case 1 -> vocal = "e";
                    case 2 -> vocal = "i";
                    case 3 -> vocal = "o";
                    case 4 -> vocal = "u";
                }
            }
        }

        // Contar cuantas veces aparece esa vocal en cada palabra y almacenarlo en un array
        int[] contadorVocal = new int[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                if (palabras[i].charAt(j) == vocal.charAt(0)) {
                    contadorVocal[i]++;
                }
            }
        }

        // Mostrar la frase
        System.out.println(frase);

        // Mostrar la letra que mas se repite
        System.out.println("La letra más repetida es la " + vocal + ".");

        // Mostrar el array
        System.out.println("Se repite: " + Arrays.toString(contadorVocal) + " veces en cada palabra respectivamente.");
        System.out.println();
    }

}